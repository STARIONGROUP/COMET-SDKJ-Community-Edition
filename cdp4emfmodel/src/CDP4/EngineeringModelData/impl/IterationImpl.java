/**
 */
package CDP4.EngineeringModelData.impl;

import CDP4.CommonData.impl.ThingImpl;

import CDP4.DiagramData.DiagramCanvas;
import CDP4.DiagramData.SharedStyle;

import CDP4.EngineeringModelData.ActualFiniteStateList;
import CDP4.EngineeringModelData.DomainFileStore;
import CDP4.EngineeringModelData.ElementDefinition;
import CDP4.EngineeringModelData.EngineeringModelDataPackage;
import CDP4.EngineeringModelData.ExternalIdentifierMap;
import CDP4.EngineeringModelData.Goal;
import CDP4.EngineeringModelData.Iteration;
import CDP4.EngineeringModelData.Option;
import CDP4.EngineeringModelData.PossibleFiniteStateList;
import CDP4.EngineeringModelData.Publication;
import CDP4.EngineeringModelData.Relationship;
import CDP4.EngineeringModelData.RequirementsSpecification;
import CDP4.EngineeringModelData.RuleVerificationList;
import CDP4.EngineeringModelData.StakeHolderValueMap;
import CDP4.EngineeringModelData.Stakeholder;
import CDP4.EngineeringModelData.StakeholderValue;
import CDP4.EngineeringModelData.ValueGroup;

import CDP4.SiteDirectoryData.IterationSetup;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Iteration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CDP4.EngineeringModelData.impl.IterationImpl#getIterationSetup <em>Iteration Setup</em>}</li>
 *   <li>{@link CDP4.EngineeringModelData.impl.IterationImpl#getSourceIterationIid <em>Source Iteration Iid</em>}</li>
 *   <li>{@link CDP4.EngineeringModelData.impl.IterationImpl#getOption <em>Option</em>}</li>
 *   <li>{@link CDP4.EngineeringModelData.impl.IterationImpl#getPublication <em>Publication</em>}</li>
 *   <li>{@link CDP4.EngineeringModelData.impl.IterationImpl#getPossibleFiniteStateList <em>Possible Finite State List</em>}</li>
 *   <li>{@link CDP4.EngineeringModelData.impl.IterationImpl#getTopElement <em>Top Element</em>}</li>
 *   <li>{@link CDP4.EngineeringModelData.impl.IterationImpl#getElement <em>Element</em>}</li>
 *   <li>{@link CDP4.EngineeringModelData.impl.IterationImpl#getRelationship <em>Relationship</em>}</li>
 *   <li>{@link CDP4.EngineeringModelData.impl.IterationImpl#getExternalIdentifierMap <em>External Identifier Map</em>}</li>
 *   <li>{@link CDP4.EngineeringModelData.impl.IterationImpl#getRequirementsSpecification <em>Requirements Specification</em>}</li>
 *   <li>{@link CDP4.EngineeringModelData.impl.IterationImpl#getDomainFileStore <em>Domain File Store</em>}</li>
 *   <li>{@link CDP4.EngineeringModelData.impl.IterationImpl#getActualFiniteStateList <em>Actual Finite State List</em>}</li>
 *   <li>{@link CDP4.EngineeringModelData.impl.IterationImpl#getDefaultOption <em>Default Option</em>}</li>
 *   <li>{@link CDP4.EngineeringModelData.impl.IterationImpl#getRuleVerificationList <em>Rule Verification List</em>}</li>
 *   <li>{@link CDP4.EngineeringModelData.impl.IterationImpl#getStakeholder <em>Stakeholder</em>}</li>
 *   <li>{@link CDP4.EngineeringModelData.impl.IterationImpl#getGoal <em>Goal</em>}</li>
 *   <li>{@link CDP4.EngineeringModelData.impl.IterationImpl#getValueGroup <em>Value Group</em>}</li>
 *   <li>{@link CDP4.EngineeringModelData.impl.IterationImpl#getStakeholderValue <em>Stakeholder Value</em>}</li>
 *   <li>{@link CDP4.EngineeringModelData.impl.IterationImpl#getStakeholderValueMap <em>Stakeholder Value Map</em>}</li>
 *   <li>{@link CDP4.EngineeringModelData.impl.IterationImpl#getSharedDiagramStyle <em>Shared Diagram Style</em>}</li>
 *   <li>{@link CDP4.EngineeringModelData.impl.IterationImpl#getDiagramCanvas <em>Diagram Canvas</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IterationImpl extends ThingImpl implements Iteration {
	/**
	 * The cached value of the '{@link #getIterationSetup() <em>Iteration Setup</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIterationSetup()
	 * @generated
	 * @ordered
	 */
	protected IterationSetup iterationSetup;

	/**
	 * The default value of the '{@link #getSourceIterationIid() <em>Source Iteration Iid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceIterationIid()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_ITERATION_IID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSourceIterationIid() <em>Source Iteration Iid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceIterationIid()
	 * @generated
	 * @ordered
	 */
	protected String sourceIterationIid = SOURCE_ITERATION_IID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOption() <em>Option</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOption()
	 * @generated
	 * @ordered
	 */
	protected EList<Option> option;

	/**
	 * The cached value of the '{@link #getPublication() <em>Publication</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublication()
	 * @generated
	 * @ordered
	 */
	protected EList<Publication> publication;

	/**
	 * The cached value of the '{@link #getPossibleFiniteStateList() <em>Possible Finite State List</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPossibleFiniteStateList()
	 * @generated
	 * @ordered
	 */
	protected EList<PossibleFiniteStateList> possibleFiniteStateList;

	/**
	 * The cached value of the '{@link #getTopElement() <em>Top Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopElement()
	 * @generated
	 * @ordered
	 */
	protected ElementDefinition topElement;

	/**
	 * The cached value of the '{@link #getElement() <em>Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElement()
	 * @generated
	 * @ordered
	 */
	protected EList<ElementDefinition> element;

	/**
	 * The cached value of the '{@link #getRelationship() <em>Relationship</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationship()
	 * @generated
	 * @ordered
	 */
	protected EList<Relationship> relationship;

	/**
	 * The cached value of the '{@link #getExternalIdentifierMap() <em>External Identifier Map</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalIdentifierMap()
	 * @generated
	 * @ordered
	 */
	protected EList<ExternalIdentifierMap> externalIdentifierMap;

	/**
	 * The cached value of the '{@link #getRequirementsSpecification() <em>Requirements Specification</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequirementsSpecification()
	 * @generated
	 * @ordered
	 */
	protected EList<RequirementsSpecification> requirementsSpecification;

	/**
	 * The cached value of the '{@link #getDomainFileStore() <em>Domain File Store</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainFileStore()
	 * @generated
	 * @ordered
	 */
	protected EList<DomainFileStore> domainFileStore;

	/**
	 * The cached value of the '{@link #getActualFiniteStateList() <em>Actual Finite State List</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActualFiniteStateList()
	 * @generated
	 * @ordered
	 */
	protected EList<ActualFiniteStateList> actualFiniteStateList;

	/**
	 * The cached value of the '{@link #getDefaultOption() <em>Default Option</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultOption()
	 * @generated
	 * @ordered
	 */
	protected Option defaultOption;

	/**
	 * The cached value of the '{@link #getRuleVerificationList() <em>Rule Verification List</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuleVerificationList()
	 * @generated
	 * @ordered
	 */
	protected EList<RuleVerificationList> ruleVerificationList;

	/**
	 * The cached value of the '{@link #getStakeholder() <em>Stakeholder</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStakeholder()
	 * @generated
	 * @ordered
	 */
	protected EList<Stakeholder> stakeholder;

	/**
	 * The cached value of the '{@link #getGoal() <em>Goal</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGoal()
	 * @generated
	 * @ordered
	 */
	protected EList<Goal> goal;

	/**
	 * The cached value of the '{@link #getValueGroup() <em>Value Group</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueGroup()
	 * @generated
	 * @ordered
	 */
	protected EList<ValueGroup> valueGroup;

	/**
	 * The cached value of the '{@link #getStakeholderValue() <em>Stakeholder Value</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStakeholderValue()
	 * @generated
	 * @ordered
	 */
	protected EList<StakeholderValue> stakeholderValue;

	/**
	 * The cached value of the '{@link #getStakeholderValueMap() <em>Stakeholder Value Map</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStakeholderValueMap()
	 * @generated
	 * @ordered
	 */
	protected EList<StakeHolderValueMap> stakeholderValueMap;

	/**
	 * The cached value of the '{@link #getSharedDiagramStyle() <em>Shared Diagram Style</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSharedDiagramStyle()
	 * @generated
	 * @ordered
	 */
	protected EList<SharedStyle> sharedDiagramStyle;

	/**
	 * The cached value of the '{@link #getDiagramCanvas() <em>Diagram Canvas</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiagramCanvas()
	 * @generated
	 * @ordered
	 */
	protected EList<DiagramCanvas> diagramCanvas;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IterationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EngineeringModelDataPackage.Literals.ITERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IterationSetup getIterationSetup() {
		if (iterationSetup != null && iterationSetup.eIsProxy()) {
			InternalEObject oldIterationSetup = (InternalEObject)iterationSetup;
			iterationSetup = (IterationSetup)eResolveProxy(oldIterationSetup);
			if (iterationSetup != oldIterationSetup) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EngineeringModelDataPackage.ITERATION__ITERATION_SETUP, oldIterationSetup, iterationSetup));
			}
		}
		return iterationSetup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IterationSetup basicGetIterationSetup() {
		return iterationSetup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIterationSetup(IterationSetup newIterationSetup) {
		IterationSetup oldIterationSetup = iterationSetup;
		iterationSetup = newIterationSetup;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EngineeringModelDataPackage.ITERATION__ITERATION_SETUP, oldIterationSetup, iterationSetup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSourceIterationIid() {
		return sourceIterationIid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceIterationIid(String newSourceIterationIid) {
		String oldSourceIterationIid = sourceIterationIid;
		sourceIterationIid = newSourceIterationIid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EngineeringModelDataPackage.ITERATION__SOURCE_ITERATION_IID, oldSourceIterationIid, sourceIterationIid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Option> getOption() {
		if (option == null) {
			option = new EObjectContainmentEList<Option>(Option.class, this, EngineeringModelDataPackage.ITERATION__OPTION);
		}
		return option;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Publication> getPublication() {
		if (publication == null) {
			publication = new EObjectContainmentEList<Publication>(Publication.class, this, EngineeringModelDataPackage.ITERATION__PUBLICATION);
		}
		return publication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PossibleFiniteStateList> getPossibleFiniteStateList() {
		if (possibleFiniteStateList == null) {
			possibleFiniteStateList = new EObjectContainmentEList<PossibleFiniteStateList>(PossibleFiniteStateList.class, this, EngineeringModelDataPackage.ITERATION__POSSIBLE_FINITE_STATE_LIST);
		}
		return possibleFiniteStateList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementDefinition getTopElement() {
		if (topElement != null && topElement.eIsProxy()) {
			InternalEObject oldTopElement = (InternalEObject)topElement;
			topElement = (ElementDefinition)eResolveProxy(oldTopElement);
			if (topElement != oldTopElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EngineeringModelDataPackage.ITERATION__TOP_ELEMENT, oldTopElement, topElement));
			}
		}
		return topElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementDefinition basicGetTopElement() {
		return topElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTopElement(ElementDefinition newTopElement) {
		ElementDefinition oldTopElement = topElement;
		topElement = newTopElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EngineeringModelDataPackage.ITERATION__TOP_ELEMENT, oldTopElement, topElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ElementDefinition> getElement() {
		if (element == null) {
			element = new EObjectContainmentEList<ElementDefinition>(ElementDefinition.class, this, EngineeringModelDataPackage.ITERATION__ELEMENT);
		}
		return element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Relationship> getRelationship() {
		if (relationship == null) {
			relationship = new EObjectContainmentEList<Relationship>(Relationship.class, this, EngineeringModelDataPackage.ITERATION__RELATIONSHIP);
		}
		return relationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExternalIdentifierMap> getExternalIdentifierMap() {
		if (externalIdentifierMap == null) {
			externalIdentifierMap = new EObjectContainmentEList<ExternalIdentifierMap>(ExternalIdentifierMap.class, this, EngineeringModelDataPackage.ITERATION__EXTERNAL_IDENTIFIER_MAP);
		}
		return externalIdentifierMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RequirementsSpecification> getRequirementsSpecification() {
		if (requirementsSpecification == null) {
			requirementsSpecification = new EObjectContainmentEList<RequirementsSpecification>(RequirementsSpecification.class, this, EngineeringModelDataPackage.ITERATION__REQUIREMENTS_SPECIFICATION);
		}
		return requirementsSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DomainFileStore> getDomainFileStore() {
		if (domainFileStore == null) {
			domainFileStore = new EObjectContainmentEList<DomainFileStore>(DomainFileStore.class, this, EngineeringModelDataPackage.ITERATION__DOMAIN_FILE_STORE);
		}
		return domainFileStore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActualFiniteStateList> getActualFiniteStateList() {
		if (actualFiniteStateList == null) {
			actualFiniteStateList = new EObjectContainmentEList<ActualFiniteStateList>(ActualFiniteStateList.class, this, EngineeringModelDataPackage.ITERATION__ACTUAL_FINITE_STATE_LIST);
		}
		return actualFiniteStateList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Option getDefaultOption() {
		if (defaultOption != null && defaultOption.eIsProxy()) {
			InternalEObject oldDefaultOption = (InternalEObject)defaultOption;
			defaultOption = (Option)eResolveProxy(oldDefaultOption);
			if (defaultOption != oldDefaultOption) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EngineeringModelDataPackage.ITERATION__DEFAULT_OPTION, oldDefaultOption, defaultOption));
			}
		}
		return defaultOption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Option basicGetDefaultOption() {
		return defaultOption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultOption(Option newDefaultOption) {
		Option oldDefaultOption = defaultOption;
		defaultOption = newDefaultOption;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EngineeringModelDataPackage.ITERATION__DEFAULT_OPTION, oldDefaultOption, defaultOption));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RuleVerificationList> getRuleVerificationList() {
		if (ruleVerificationList == null) {
			ruleVerificationList = new EObjectContainmentEList<RuleVerificationList>(RuleVerificationList.class, this, EngineeringModelDataPackage.ITERATION__RULE_VERIFICATION_LIST);
		}
		return ruleVerificationList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Stakeholder> getStakeholder() {
		if (stakeholder == null) {
			stakeholder = new EObjectContainmentEList<Stakeholder>(Stakeholder.class, this, EngineeringModelDataPackage.ITERATION__STAKEHOLDER);
		}
		return stakeholder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Goal> getGoal() {
		if (goal == null) {
			goal = new EObjectContainmentEList<Goal>(Goal.class, this, EngineeringModelDataPackage.ITERATION__GOAL);
		}
		return goal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ValueGroup> getValueGroup() {
		if (valueGroup == null) {
			valueGroup = new EObjectContainmentEList<ValueGroup>(ValueGroup.class, this, EngineeringModelDataPackage.ITERATION__VALUE_GROUP);
		}
		return valueGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StakeholderValue> getStakeholderValue() {
		if (stakeholderValue == null) {
			stakeholderValue = new EObjectContainmentEList<StakeholderValue>(StakeholderValue.class, this, EngineeringModelDataPackage.ITERATION__STAKEHOLDER_VALUE);
		}
		return stakeholderValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StakeHolderValueMap> getStakeholderValueMap() {
		if (stakeholderValueMap == null) {
			stakeholderValueMap = new EObjectContainmentEList<StakeHolderValueMap>(StakeHolderValueMap.class, this, EngineeringModelDataPackage.ITERATION__STAKEHOLDER_VALUE_MAP);
		}
		return stakeholderValueMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SharedStyle> getSharedDiagramStyle() {
		if (sharedDiagramStyle == null) {
			sharedDiagramStyle = new EObjectContainmentEList<SharedStyle>(SharedStyle.class, this, EngineeringModelDataPackage.ITERATION__SHARED_DIAGRAM_STYLE);
		}
		return sharedDiagramStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DiagramCanvas> getDiagramCanvas() {
		if (diagramCanvas == null) {
			diagramCanvas = new EObjectContainmentEList<DiagramCanvas>(DiagramCanvas.class, this, EngineeringModelDataPackage.ITERATION__DIAGRAM_CANVAS);
		}
		return diagramCanvas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EngineeringModelDataPackage.ITERATION__OPTION:
				return ((InternalEList<?>)getOption()).basicRemove(otherEnd, msgs);
			case EngineeringModelDataPackage.ITERATION__PUBLICATION:
				return ((InternalEList<?>)getPublication()).basicRemove(otherEnd, msgs);
			case EngineeringModelDataPackage.ITERATION__POSSIBLE_FINITE_STATE_LIST:
				return ((InternalEList<?>)getPossibleFiniteStateList()).basicRemove(otherEnd, msgs);
			case EngineeringModelDataPackage.ITERATION__ELEMENT:
				return ((InternalEList<?>)getElement()).basicRemove(otherEnd, msgs);
			case EngineeringModelDataPackage.ITERATION__RELATIONSHIP:
				return ((InternalEList<?>)getRelationship()).basicRemove(otherEnd, msgs);
			case EngineeringModelDataPackage.ITERATION__EXTERNAL_IDENTIFIER_MAP:
				return ((InternalEList<?>)getExternalIdentifierMap()).basicRemove(otherEnd, msgs);
			case EngineeringModelDataPackage.ITERATION__REQUIREMENTS_SPECIFICATION:
				return ((InternalEList<?>)getRequirementsSpecification()).basicRemove(otherEnd, msgs);
			case EngineeringModelDataPackage.ITERATION__DOMAIN_FILE_STORE:
				return ((InternalEList<?>)getDomainFileStore()).basicRemove(otherEnd, msgs);
			case EngineeringModelDataPackage.ITERATION__ACTUAL_FINITE_STATE_LIST:
				return ((InternalEList<?>)getActualFiniteStateList()).basicRemove(otherEnd, msgs);
			case EngineeringModelDataPackage.ITERATION__RULE_VERIFICATION_LIST:
				return ((InternalEList<?>)getRuleVerificationList()).basicRemove(otherEnd, msgs);
			case EngineeringModelDataPackage.ITERATION__STAKEHOLDER:
				return ((InternalEList<?>)getStakeholder()).basicRemove(otherEnd, msgs);
			case EngineeringModelDataPackage.ITERATION__GOAL:
				return ((InternalEList<?>)getGoal()).basicRemove(otherEnd, msgs);
			case EngineeringModelDataPackage.ITERATION__VALUE_GROUP:
				return ((InternalEList<?>)getValueGroup()).basicRemove(otherEnd, msgs);
			case EngineeringModelDataPackage.ITERATION__STAKEHOLDER_VALUE:
				return ((InternalEList<?>)getStakeholderValue()).basicRemove(otherEnd, msgs);
			case EngineeringModelDataPackage.ITERATION__STAKEHOLDER_VALUE_MAP:
				return ((InternalEList<?>)getStakeholderValueMap()).basicRemove(otherEnd, msgs);
			case EngineeringModelDataPackage.ITERATION__SHARED_DIAGRAM_STYLE:
				return ((InternalEList<?>)getSharedDiagramStyle()).basicRemove(otherEnd, msgs);
			case EngineeringModelDataPackage.ITERATION__DIAGRAM_CANVAS:
				return ((InternalEList<?>)getDiagramCanvas()).basicRemove(otherEnd, msgs);
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
			case EngineeringModelDataPackage.ITERATION__ITERATION_SETUP:
				if (resolve) return getIterationSetup();
				return basicGetIterationSetup();
			case EngineeringModelDataPackage.ITERATION__SOURCE_ITERATION_IID:
				return getSourceIterationIid();
			case EngineeringModelDataPackage.ITERATION__OPTION:
				return getOption();
			case EngineeringModelDataPackage.ITERATION__PUBLICATION:
				return getPublication();
			case EngineeringModelDataPackage.ITERATION__POSSIBLE_FINITE_STATE_LIST:
				return getPossibleFiniteStateList();
			case EngineeringModelDataPackage.ITERATION__TOP_ELEMENT:
				if (resolve) return getTopElement();
				return basicGetTopElement();
			case EngineeringModelDataPackage.ITERATION__ELEMENT:
				return getElement();
			case EngineeringModelDataPackage.ITERATION__RELATIONSHIP:
				return getRelationship();
			case EngineeringModelDataPackage.ITERATION__EXTERNAL_IDENTIFIER_MAP:
				return getExternalIdentifierMap();
			case EngineeringModelDataPackage.ITERATION__REQUIREMENTS_SPECIFICATION:
				return getRequirementsSpecification();
			case EngineeringModelDataPackage.ITERATION__DOMAIN_FILE_STORE:
				return getDomainFileStore();
			case EngineeringModelDataPackage.ITERATION__ACTUAL_FINITE_STATE_LIST:
				return getActualFiniteStateList();
			case EngineeringModelDataPackage.ITERATION__DEFAULT_OPTION:
				if (resolve) return getDefaultOption();
				return basicGetDefaultOption();
			case EngineeringModelDataPackage.ITERATION__RULE_VERIFICATION_LIST:
				return getRuleVerificationList();
			case EngineeringModelDataPackage.ITERATION__STAKEHOLDER:
				return getStakeholder();
			case EngineeringModelDataPackage.ITERATION__GOAL:
				return getGoal();
			case EngineeringModelDataPackage.ITERATION__VALUE_GROUP:
				return getValueGroup();
			case EngineeringModelDataPackage.ITERATION__STAKEHOLDER_VALUE:
				return getStakeholderValue();
			case EngineeringModelDataPackage.ITERATION__STAKEHOLDER_VALUE_MAP:
				return getStakeholderValueMap();
			case EngineeringModelDataPackage.ITERATION__SHARED_DIAGRAM_STYLE:
				return getSharedDiagramStyle();
			case EngineeringModelDataPackage.ITERATION__DIAGRAM_CANVAS:
				return getDiagramCanvas();
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
			case EngineeringModelDataPackage.ITERATION__ITERATION_SETUP:
				setIterationSetup((IterationSetup)newValue);
				return;
			case EngineeringModelDataPackage.ITERATION__SOURCE_ITERATION_IID:
				setSourceIterationIid((String)newValue);
				return;
			case EngineeringModelDataPackage.ITERATION__OPTION:
				getOption().clear();
				getOption().addAll((Collection<? extends Option>)newValue);
				return;
			case EngineeringModelDataPackage.ITERATION__PUBLICATION:
				getPublication().clear();
				getPublication().addAll((Collection<? extends Publication>)newValue);
				return;
			case EngineeringModelDataPackage.ITERATION__POSSIBLE_FINITE_STATE_LIST:
				getPossibleFiniteStateList().clear();
				getPossibleFiniteStateList().addAll((Collection<? extends PossibleFiniteStateList>)newValue);
				return;
			case EngineeringModelDataPackage.ITERATION__TOP_ELEMENT:
				setTopElement((ElementDefinition)newValue);
				return;
			case EngineeringModelDataPackage.ITERATION__ELEMENT:
				getElement().clear();
				getElement().addAll((Collection<? extends ElementDefinition>)newValue);
				return;
			case EngineeringModelDataPackage.ITERATION__RELATIONSHIP:
				getRelationship().clear();
				getRelationship().addAll((Collection<? extends Relationship>)newValue);
				return;
			case EngineeringModelDataPackage.ITERATION__EXTERNAL_IDENTIFIER_MAP:
				getExternalIdentifierMap().clear();
				getExternalIdentifierMap().addAll((Collection<? extends ExternalIdentifierMap>)newValue);
				return;
			case EngineeringModelDataPackage.ITERATION__REQUIREMENTS_SPECIFICATION:
				getRequirementsSpecification().clear();
				getRequirementsSpecification().addAll((Collection<? extends RequirementsSpecification>)newValue);
				return;
			case EngineeringModelDataPackage.ITERATION__DOMAIN_FILE_STORE:
				getDomainFileStore().clear();
				getDomainFileStore().addAll((Collection<? extends DomainFileStore>)newValue);
				return;
			case EngineeringModelDataPackage.ITERATION__ACTUAL_FINITE_STATE_LIST:
				getActualFiniteStateList().clear();
				getActualFiniteStateList().addAll((Collection<? extends ActualFiniteStateList>)newValue);
				return;
			case EngineeringModelDataPackage.ITERATION__DEFAULT_OPTION:
				setDefaultOption((Option)newValue);
				return;
			case EngineeringModelDataPackage.ITERATION__RULE_VERIFICATION_LIST:
				getRuleVerificationList().clear();
				getRuleVerificationList().addAll((Collection<? extends RuleVerificationList>)newValue);
				return;
			case EngineeringModelDataPackage.ITERATION__STAKEHOLDER:
				getStakeholder().clear();
				getStakeholder().addAll((Collection<? extends Stakeholder>)newValue);
				return;
			case EngineeringModelDataPackage.ITERATION__GOAL:
				getGoal().clear();
				getGoal().addAll((Collection<? extends Goal>)newValue);
				return;
			case EngineeringModelDataPackage.ITERATION__VALUE_GROUP:
				getValueGroup().clear();
				getValueGroup().addAll((Collection<? extends ValueGroup>)newValue);
				return;
			case EngineeringModelDataPackage.ITERATION__STAKEHOLDER_VALUE:
				getStakeholderValue().clear();
				getStakeholderValue().addAll((Collection<? extends StakeholderValue>)newValue);
				return;
			case EngineeringModelDataPackage.ITERATION__STAKEHOLDER_VALUE_MAP:
				getStakeholderValueMap().clear();
				getStakeholderValueMap().addAll((Collection<? extends StakeHolderValueMap>)newValue);
				return;
			case EngineeringModelDataPackage.ITERATION__SHARED_DIAGRAM_STYLE:
				getSharedDiagramStyle().clear();
				getSharedDiagramStyle().addAll((Collection<? extends SharedStyle>)newValue);
				return;
			case EngineeringModelDataPackage.ITERATION__DIAGRAM_CANVAS:
				getDiagramCanvas().clear();
				getDiagramCanvas().addAll((Collection<? extends DiagramCanvas>)newValue);
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
			case EngineeringModelDataPackage.ITERATION__ITERATION_SETUP:
				setIterationSetup((IterationSetup)null);
				return;
			case EngineeringModelDataPackage.ITERATION__SOURCE_ITERATION_IID:
				setSourceIterationIid(SOURCE_ITERATION_IID_EDEFAULT);
				return;
			case EngineeringModelDataPackage.ITERATION__OPTION:
				getOption().clear();
				return;
			case EngineeringModelDataPackage.ITERATION__PUBLICATION:
				getPublication().clear();
				return;
			case EngineeringModelDataPackage.ITERATION__POSSIBLE_FINITE_STATE_LIST:
				getPossibleFiniteStateList().clear();
				return;
			case EngineeringModelDataPackage.ITERATION__TOP_ELEMENT:
				setTopElement((ElementDefinition)null);
				return;
			case EngineeringModelDataPackage.ITERATION__ELEMENT:
				getElement().clear();
				return;
			case EngineeringModelDataPackage.ITERATION__RELATIONSHIP:
				getRelationship().clear();
				return;
			case EngineeringModelDataPackage.ITERATION__EXTERNAL_IDENTIFIER_MAP:
				getExternalIdentifierMap().clear();
				return;
			case EngineeringModelDataPackage.ITERATION__REQUIREMENTS_SPECIFICATION:
				getRequirementsSpecification().clear();
				return;
			case EngineeringModelDataPackage.ITERATION__DOMAIN_FILE_STORE:
				getDomainFileStore().clear();
				return;
			case EngineeringModelDataPackage.ITERATION__ACTUAL_FINITE_STATE_LIST:
				getActualFiniteStateList().clear();
				return;
			case EngineeringModelDataPackage.ITERATION__DEFAULT_OPTION:
				setDefaultOption((Option)null);
				return;
			case EngineeringModelDataPackage.ITERATION__RULE_VERIFICATION_LIST:
				getRuleVerificationList().clear();
				return;
			case EngineeringModelDataPackage.ITERATION__STAKEHOLDER:
				getStakeholder().clear();
				return;
			case EngineeringModelDataPackage.ITERATION__GOAL:
				getGoal().clear();
				return;
			case EngineeringModelDataPackage.ITERATION__VALUE_GROUP:
				getValueGroup().clear();
				return;
			case EngineeringModelDataPackage.ITERATION__STAKEHOLDER_VALUE:
				getStakeholderValue().clear();
				return;
			case EngineeringModelDataPackage.ITERATION__STAKEHOLDER_VALUE_MAP:
				getStakeholderValueMap().clear();
				return;
			case EngineeringModelDataPackage.ITERATION__SHARED_DIAGRAM_STYLE:
				getSharedDiagramStyle().clear();
				return;
			case EngineeringModelDataPackage.ITERATION__DIAGRAM_CANVAS:
				getDiagramCanvas().clear();
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
			case EngineeringModelDataPackage.ITERATION__ITERATION_SETUP:
				return iterationSetup != null;
			case EngineeringModelDataPackage.ITERATION__SOURCE_ITERATION_IID:
				return SOURCE_ITERATION_IID_EDEFAULT == null ? sourceIterationIid != null : !SOURCE_ITERATION_IID_EDEFAULT.equals(sourceIterationIid);
			case EngineeringModelDataPackage.ITERATION__OPTION:
				return option != null && !option.isEmpty();
			case EngineeringModelDataPackage.ITERATION__PUBLICATION:
				return publication != null && !publication.isEmpty();
			case EngineeringModelDataPackage.ITERATION__POSSIBLE_FINITE_STATE_LIST:
				return possibleFiniteStateList != null && !possibleFiniteStateList.isEmpty();
			case EngineeringModelDataPackage.ITERATION__TOP_ELEMENT:
				return topElement != null;
			case EngineeringModelDataPackage.ITERATION__ELEMENT:
				return element != null && !element.isEmpty();
			case EngineeringModelDataPackage.ITERATION__RELATIONSHIP:
				return relationship != null && !relationship.isEmpty();
			case EngineeringModelDataPackage.ITERATION__EXTERNAL_IDENTIFIER_MAP:
				return externalIdentifierMap != null && !externalIdentifierMap.isEmpty();
			case EngineeringModelDataPackage.ITERATION__REQUIREMENTS_SPECIFICATION:
				return requirementsSpecification != null && !requirementsSpecification.isEmpty();
			case EngineeringModelDataPackage.ITERATION__DOMAIN_FILE_STORE:
				return domainFileStore != null && !domainFileStore.isEmpty();
			case EngineeringModelDataPackage.ITERATION__ACTUAL_FINITE_STATE_LIST:
				return actualFiniteStateList != null && !actualFiniteStateList.isEmpty();
			case EngineeringModelDataPackage.ITERATION__DEFAULT_OPTION:
				return defaultOption != null;
			case EngineeringModelDataPackage.ITERATION__RULE_VERIFICATION_LIST:
				return ruleVerificationList != null && !ruleVerificationList.isEmpty();
			case EngineeringModelDataPackage.ITERATION__STAKEHOLDER:
				return stakeholder != null && !stakeholder.isEmpty();
			case EngineeringModelDataPackage.ITERATION__GOAL:
				return goal != null && !goal.isEmpty();
			case EngineeringModelDataPackage.ITERATION__VALUE_GROUP:
				return valueGroup != null && !valueGroup.isEmpty();
			case EngineeringModelDataPackage.ITERATION__STAKEHOLDER_VALUE:
				return stakeholderValue != null && !stakeholderValue.isEmpty();
			case EngineeringModelDataPackage.ITERATION__STAKEHOLDER_VALUE_MAP:
				return stakeholderValueMap != null && !stakeholderValueMap.isEmpty();
			case EngineeringModelDataPackage.ITERATION__SHARED_DIAGRAM_STYLE:
				return sharedDiagramStyle != null && !sharedDiagramStyle.isEmpty();
			case EngineeringModelDataPackage.ITERATION__DIAGRAM_CANVAS:
				return diagramCanvas != null && !diagramCanvas.isEmpty();
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
		result.append(" (sourceIterationIid: ");
		result.append(sourceIterationIid);
		result.append(')');
		return result.toString();
	}

} //IterationImpl
