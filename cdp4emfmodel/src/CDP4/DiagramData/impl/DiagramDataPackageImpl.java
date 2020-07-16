/**
 */
package CDP4.DiagramData.impl;

import CDP4.CommonData.CommonDataPackage;

import CDP4.CommonData.impl.CommonDataPackageImpl;

import CDP4.DeploymentDatabase.DeploymentDatabasePackage;

import CDP4.DeploymentDatabase.impl.DeploymentDatabasePackageImpl;

import CDP4.DeploymentDistributedSession.DeploymentDistributedSessionPackage;

import CDP4.DeploymentDistributedSession.impl.DeploymentDistributedSessionPackageImpl;

import CDP4.DiagramData.Bounds;
import CDP4.DiagramData.Color;
import CDP4.DiagramData.DiagramCanvas;
import CDP4.DiagramData.DiagramDataFactory;
import CDP4.DiagramData.DiagramDataPackage;
import CDP4.DiagramData.DiagramEdge;
import CDP4.DiagramData.DiagramElementContainer;
import CDP4.DiagramData.DiagramElementThing;
import CDP4.DiagramData.DiagramObject;
import CDP4.DiagramData.DiagramShape;
import CDP4.DiagramData.DiagramThingBase;
import CDP4.DiagramData.DiagrammingStyle;
import CDP4.DiagramData.OwnedStyle;
import CDP4.DiagramData.Point;
import CDP4.DiagramData.SharedStyle;

import CDP4.EngineeringModelData.EngineeringModelDataPackage;

import CDP4.EngineeringModelData.impl.EngineeringModelDataPackageImpl;

import CDP4.ReportingData.ReportingDataPackage;

import CDP4.ReportingData.impl.ReportingDataPackageImpl;

import CDP4.SiteDirectoryData.SiteDirectoryDataPackage;

import CDP4.SiteDirectoryData.impl.SiteDirectoryDataPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DiagramDataPackageImpl extends EPackageImpl implements DiagramDataPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diagramElementThingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diagramElementContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diagramThingBaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass boundsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ownedStyleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diagrammingStyleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass colorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diagramEdgeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diagramShapeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diagramObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diagramCanvasEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sharedStyleEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see CDP4.DiagramData.DiagramDataPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DiagramDataPackageImpl() {
		super(eNS_URI, DiagramDataFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link DiagramDataPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DiagramDataPackage init() {
		if (isInited) return (DiagramDataPackage)EPackage.Registry.INSTANCE.getEPackage(DiagramDataPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredDiagramDataPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		DiagramDataPackageImpl theDiagramDataPackage = registeredDiagramDataPackage instanceof DiagramDataPackageImpl ? (DiagramDataPackageImpl)registeredDiagramDataPackage : new DiagramDataPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(DeploymentDatabasePackage.eNS_URI);
		DeploymentDatabasePackageImpl theDeploymentDatabasePackage = (DeploymentDatabasePackageImpl)(registeredPackage instanceof DeploymentDatabasePackageImpl ? registeredPackage : DeploymentDatabasePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(SiteDirectoryDataPackage.eNS_URI);
		SiteDirectoryDataPackageImpl theSiteDirectoryDataPackage = (SiteDirectoryDataPackageImpl)(registeredPackage instanceof SiteDirectoryDataPackageImpl ? registeredPackage : SiteDirectoryDataPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(CommonDataPackage.eNS_URI);
		CommonDataPackageImpl theCommonDataPackage = (CommonDataPackageImpl)(registeredPackage instanceof CommonDataPackageImpl ? registeredPackage : CommonDataPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ReportingDataPackage.eNS_URI);
		ReportingDataPackageImpl theReportingDataPackage = (ReportingDataPackageImpl)(registeredPackage instanceof ReportingDataPackageImpl ? registeredPackage : ReportingDataPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(EngineeringModelDataPackage.eNS_URI);
		EngineeringModelDataPackageImpl theEngineeringModelDataPackage = (EngineeringModelDataPackageImpl)(registeredPackage instanceof EngineeringModelDataPackageImpl ? registeredPackage : EngineeringModelDataPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(DeploymentDistributedSessionPackage.eNS_URI);
		DeploymentDistributedSessionPackageImpl theDeploymentDistributedSessionPackage = (DeploymentDistributedSessionPackageImpl)(registeredPackage instanceof DeploymentDistributedSessionPackageImpl ? registeredPackage : DeploymentDistributedSessionPackage.eINSTANCE);

		// Create package meta-data objects
		theDiagramDataPackage.createPackageContents();
		theDeploymentDatabasePackage.createPackageContents();
		theSiteDirectoryDataPackage.createPackageContents();
		theCommonDataPackage.createPackageContents();
		theReportingDataPackage.createPackageContents();
		theEngineeringModelDataPackage.createPackageContents();
		theDeploymentDistributedSessionPackage.createPackageContents();

		// Initialize created meta-data
		theDiagramDataPackage.initializePackageContents();
		theDeploymentDatabasePackage.initializePackageContents();
		theSiteDirectoryDataPackage.initializePackageContents();
		theCommonDataPackage.initializePackageContents();
		theReportingDataPackage.initializePackageContents();
		theEngineeringModelDataPackage.initializePackageContents();
		theDeploymentDistributedSessionPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDiagramDataPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DiagramDataPackage.eNS_URI, theDiagramDataPackage);
		return theDiagramDataPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiagramElementThing() {
		return diagramElementThingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagramElementThing_DepictedThing() {
		return (EReference)diagramElementThingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagramElementThing_LocalStyle() {
		return (EReference)diagramElementThingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagramElementThing_SharedStyle() {
		return (EReference)diagramElementThingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiagramElementContainer() {
		return diagramElementContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagramElementContainer_DiagramElement() {
		return (EReference)diagramElementContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagramElementContainer_Bounds() {
		return (EReference)diagramElementContainerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiagramThingBase() {
		return diagramThingBaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBounds() {
		return boundsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBounds_X() {
		return (EAttribute)boundsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBounds_Y() {
		return (EAttribute)boundsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBounds_Width() {
		return (EAttribute)boundsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBounds_Height() {
		return (EAttribute)boundsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOwnedStyle() {
		return ownedStyleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiagrammingStyle() {
		return diagrammingStyleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagrammingStyle_FillColor() {
		return (EReference)diagrammingStyleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiagrammingStyle_FillOpacity() {
		return (EAttribute)diagrammingStyleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiagrammingStyle_StrokeWidth() {
		return (EAttribute)diagrammingStyleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiagrammingStyle_StrokeOpacity() {
		return (EAttribute)diagrammingStyleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagrammingStyle_StrokeColor() {
		return (EReference)diagrammingStyleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiagrammingStyle_FontSize() {
		return (EAttribute)diagrammingStyleEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiagrammingStyle_FontName() {
		return (EAttribute)diagrammingStyleEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagrammingStyle_FontColor() {
		return (EReference)diagrammingStyleEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiagrammingStyle_FontItalic() {
		return (EAttribute)diagrammingStyleEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiagrammingStyle_FontBold() {
		return (EAttribute)diagrammingStyleEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiagrammingStyle_FontUnderline() {
		return (EAttribute)diagrammingStyleEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiagrammingStyle_FontStrokeThrough() {
		return (EAttribute)diagrammingStyleEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagrammingStyle_UsedColor() {
		return (EReference)diagrammingStyleEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getColor() {
		return colorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColor_Red() {
		return (EAttribute)colorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColor_Green() {
		return (EAttribute)colorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColor_Blue() {
		return (EAttribute)colorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPoint() {
		return pointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPoint_X() {
		return (EAttribute)pointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPoint_Y() {
		return (EAttribute)pointEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiagramEdge() {
		return diagramEdgeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagramEdge_Source() {
		return (EReference)diagramEdgeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagramEdge_Target() {
		return (EReference)diagramEdgeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagramEdge_Point() {
		return (EReference)diagramEdgeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiagramShape() {
		return diagramShapeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiagramObject() {
		return diagramObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiagramObject_Resolution() {
		return (EAttribute)diagramObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiagramObject_Documentation() {
		return (EAttribute)diagramObjectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiagramCanvas() {
		return diagramCanvasEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSharedStyle() {
		return sharedStyleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagramDataFactory getDiagramDataFactory() {
		return (DiagramDataFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		diagramElementThingEClass = createEClass(DIAGRAM_ELEMENT_THING);
		createEReference(diagramElementThingEClass, DIAGRAM_ELEMENT_THING__DEPICTED_THING);
		createEReference(diagramElementThingEClass, DIAGRAM_ELEMENT_THING__LOCAL_STYLE);
		createEReference(diagramElementThingEClass, DIAGRAM_ELEMENT_THING__SHARED_STYLE);

		diagramElementContainerEClass = createEClass(DIAGRAM_ELEMENT_CONTAINER);
		createEReference(diagramElementContainerEClass, DIAGRAM_ELEMENT_CONTAINER__DIAGRAM_ELEMENT);
		createEReference(diagramElementContainerEClass, DIAGRAM_ELEMENT_CONTAINER__BOUNDS);

		diagramThingBaseEClass = createEClass(DIAGRAM_THING_BASE);

		boundsEClass = createEClass(BOUNDS);
		createEAttribute(boundsEClass, BOUNDS__X);
		createEAttribute(boundsEClass, BOUNDS__Y);
		createEAttribute(boundsEClass, BOUNDS__WIDTH);
		createEAttribute(boundsEClass, BOUNDS__HEIGHT);

		ownedStyleEClass = createEClass(OWNED_STYLE);

		diagrammingStyleEClass = createEClass(DIAGRAMMING_STYLE);
		createEReference(diagrammingStyleEClass, DIAGRAMMING_STYLE__FILL_COLOR);
		createEAttribute(diagrammingStyleEClass, DIAGRAMMING_STYLE__FILL_OPACITY);
		createEAttribute(diagrammingStyleEClass, DIAGRAMMING_STYLE__STROKE_WIDTH);
		createEAttribute(diagrammingStyleEClass, DIAGRAMMING_STYLE__STROKE_OPACITY);
		createEReference(diagrammingStyleEClass, DIAGRAMMING_STYLE__STROKE_COLOR);
		createEAttribute(diagrammingStyleEClass, DIAGRAMMING_STYLE__FONT_SIZE);
		createEAttribute(diagrammingStyleEClass, DIAGRAMMING_STYLE__FONT_NAME);
		createEReference(diagrammingStyleEClass, DIAGRAMMING_STYLE__FONT_COLOR);
		createEAttribute(diagrammingStyleEClass, DIAGRAMMING_STYLE__FONT_ITALIC);
		createEAttribute(diagrammingStyleEClass, DIAGRAMMING_STYLE__FONT_BOLD);
		createEAttribute(diagrammingStyleEClass, DIAGRAMMING_STYLE__FONT_UNDERLINE);
		createEAttribute(diagrammingStyleEClass, DIAGRAMMING_STYLE__FONT_STROKE_THROUGH);
		createEReference(diagrammingStyleEClass, DIAGRAMMING_STYLE__USED_COLOR);

		colorEClass = createEClass(COLOR);
		createEAttribute(colorEClass, COLOR__RED);
		createEAttribute(colorEClass, COLOR__GREEN);
		createEAttribute(colorEClass, COLOR__BLUE);

		pointEClass = createEClass(POINT);
		createEAttribute(pointEClass, POINT__X);
		createEAttribute(pointEClass, POINT__Y);

		diagramEdgeEClass = createEClass(DIAGRAM_EDGE);
		createEReference(diagramEdgeEClass, DIAGRAM_EDGE__SOURCE);
		createEReference(diagramEdgeEClass, DIAGRAM_EDGE__TARGET);
		createEReference(diagramEdgeEClass, DIAGRAM_EDGE__POINT);

		diagramShapeEClass = createEClass(DIAGRAM_SHAPE);

		diagramObjectEClass = createEClass(DIAGRAM_OBJECT);
		createEAttribute(diagramObjectEClass, DIAGRAM_OBJECT__RESOLUTION);
		createEAttribute(diagramObjectEClass, DIAGRAM_OBJECT__DOCUMENTATION);

		diagramCanvasEClass = createEClass(DIAGRAM_CANVAS);

		sharedStyleEClass = createEClass(SHARED_STYLE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		CommonDataPackage theCommonDataPackage = (CommonDataPackage)EPackage.Registry.INSTANCE.getEPackage(CommonDataPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		diagramElementThingEClass.getESuperTypes().add(this.getDiagramElementContainer());
		diagramElementContainerEClass.getESuperTypes().add(this.getDiagramThingBase());
		diagramThingBaseEClass.getESuperTypes().add(theCommonDataPackage.getThing());
		diagramThingBaseEClass.getESuperTypes().add(theCommonDataPackage.getNamedThing());
		boundsEClass.getESuperTypes().add(this.getDiagramThingBase());
		ownedStyleEClass.getESuperTypes().add(this.getDiagrammingStyle());
		diagrammingStyleEClass.getESuperTypes().add(this.getDiagramThingBase());
		colorEClass.getESuperTypes().add(this.getDiagramThingBase());
		pointEClass.getESuperTypes().add(this.getDiagramThingBase());
		diagramEdgeEClass.getESuperTypes().add(this.getDiagramElementThing());
		diagramShapeEClass.getESuperTypes().add(this.getDiagramElementThing());
		diagramObjectEClass.getESuperTypes().add(this.getDiagramShape());
		diagramCanvasEClass.getESuperTypes().add(this.getDiagramElementContainer());
		diagramCanvasEClass.getESuperTypes().add(theCommonDataPackage.getTimeStampedThing());
		sharedStyleEClass.getESuperTypes().add(this.getDiagrammingStyle());

		// Initialize classes, features, and operations; add parameters
		initEClass(diagramElementThingEClass, DiagramElementThing.class, "DiagramElementThing", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDiagramElementThing_DepictedThing(), theCommonDataPackage.getThing(), null, "depictedThing", null, 0, 1, DiagramElementThing.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDiagramElementThing_LocalStyle(), this.getOwnedStyle(), null, "localStyle", null, 0, 1, DiagramElementThing.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDiagramElementThing_SharedStyle(), this.getSharedStyle(), null, "sharedStyle", null, 0, 1, DiagramElementThing.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(diagramElementContainerEClass, DiagramElementContainer.class, "DiagramElementContainer", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDiagramElementContainer_DiagramElement(), this.getDiagramElementThing(), null, "diagramElement", null, 0, -1, DiagramElementContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDiagramElementContainer_Bounds(), this.getBounds(), null, "bounds", null, 0, 1, DiagramElementContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(diagramThingBaseEClass, DiagramThingBase.class, "DiagramThingBase", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(boundsEClass, Bounds.class, "Bounds", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBounds_X(), theCommonDataPackage.getFloat(), "x", null, 1, 1, Bounds.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBounds_Y(), theCommonDataPackage.getFloat(), "y", null, 1, 1, Bounds.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBounds_Width(), theCommonDataPackage.getFloat(), "width", null, 1, 1, Bounds.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBounds_Height(), theCommonDataPackage.getFloat(), "height", null, 1, 1, Bounds.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(ownedStyleEClass, OwnedStyle.class, "OwnedStyle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(diagrammingStyleEClass, DiagrammingStyle.class, "DiagrammingStyle", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDiagrammingStyle_FillColor(), this.getColor(), null, "fillColor", null, 0, 1, DiagrammingStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDiagrammingStyle_FillOpacity(), theCommonDataPackage.getFloat(), "fillOpacity", null, 0, 1, DiagrammingStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDiagrammingStyle_StrokeWidth(), theCommonDataPackage.getFloat(), "strokeWidth", null, 0, 1, DiagrammingStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDiagrammingStyle_StrokeOpacity(), theCommonDataPackage.getFloat(), "strokeOpacity", null, 0, 1, DiagrammingStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDiagrammingStyle_StrokeColor(), this.getColor(), null, "strokeColor", null, 0, 1, DiagrammingStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDiagrammingStyle_FontSize(), theCommonDataPackage.getFloat(), "fontSize", null, 0, 1, DiagrammingStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDiagrammingStyle_FontName(), theCommonDataPackage.getString(), "fontName", null, 0, 1, DiagrammingStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDiagrammingStyle_FontColor(), this.getColor(), null, "fontColor", null, 0, 1, DiagrammingStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDiagrammingStyle_FontItalic(), theCommonDataPackage.getBoolean(), "fontItalic", null, 0, 1, DiagrammingStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDiagrammingStyle_FontBold(), theCommonDataPackage.getBoolean(), "fontBold", null, 0, 1, DiagrammingStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDiagrammingStyle_FontUnderline(), theCommonDataPackage.getBoolean(), "fontUnderline", null, 0, 1, DiagrammingStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDiagrammingStyle_FontStrokeThrough(), theCommonDataPackage.getBoolean(), "fontStrokeThrough", null, 0, 1, DiagrammingStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDiagrammingStyle_UsedColor(), this.getColor(), null, "usedColor", null, 0, -1, DiagrammingStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(colorEClass, Color.class, "Color", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getColor_Red(), theCommonDataPackage.getInteger(), "red", null, 1, 1, Color.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getColor_Green(), theCommonDataPackage.getInteger(), "green", null, 1, 1, Color.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getColor_Blue(), theCommonDataPackage.getInteger(), "blue", null, 1, 1, Color.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(pointEClass, Point.class, "Point", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPoint_X(), theCommonDataPackage.getFloat(), "x", null, 1, 1, Point.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getPoint_Y(), theCommonDataPackage.getFloat(), "y", null, 1, 1, Point.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(diagramEdgeEClass, DiagramEdge.class, "DiagramEdge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDiagramEdge_Source(), this.getDiagramElementThing(), null, "source", null, 1, 1, DiagramEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDiagramEdge_Target(), this.getDiagramElementThing(), null, "target", null, 1, 1, DiagramEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDiagramEdge_Point(), this.getPoint(), null, "point", null, 0, -1, DiagramEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diagramShapeEClass, DiagramShape.class, "DiagramShape", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(diagramObjectEClass, DiagramObject.class, "DiagramObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiagramObject_Resolution(), theCommonDataPackage.getFloat(), "resolution", null, 1, 1, DiagramObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDiagramObject_Documentation(), theCommonDataPackage.getString(), "documentation", null, 1, 1, DiagramObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(diagramCanvasEClass, DiagramCanvas.class, "DiagramCanvas", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sharedStyleEClass, SharedStyle.class, "SharedStyle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //DiagramDataPackageImpl
