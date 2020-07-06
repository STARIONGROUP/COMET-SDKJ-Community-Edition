/**
 */
package CDP4.ReportingData;

import CDP4.CommonData.ShortNamedThing;

import CDP4.EngineeringModelData.OwnedThing;

import CDP4.SiteDirectoryData.CategorizableThing;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Modelling Annotation Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CDP4.ReportingData.ModellingAnnotationItem#getStatus <em>Status</em>}</li>
 *   <li>{@link CDP4.ReportingData.ModellingAnnotationItem#getTitle <em>Title</em>}</li>
 *   <li>{@link CDP4.ReportingData.ModellingAnnotationItem#getClassification <em>Classification</em>}</li>
 *   <li>{@link CDP4.ReportingData.ModellingAnnotationItem#getApprovedBy <em>Approved By</em>}</li>
 *   <li>{@link CDP4.ReportingData.ModellingAnnotationItem#getSourceAnnotation <em>Source Annotation</em>}</li>
 * </ul>
 *
 * @see CDP4.ReportingData.ReportingDataPackage#getModellingAnnotationItem()
 * @model abstract="true"
 * @generated
 */
public interface ModellingAnnotationItem extends EngineeringModelDataAnnotation, CategorizableThing, OwnedThing, ShortNamedThing {
	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The literals are from the enumeration {@link CDP4.ReportingData.AnnotationStatusKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see CDP4.ReportingData.AnnotationStatusKind
	 * @see #setStatus(AnnotationStatusKind)
	 * @see CDP4.ReportingData.ReportingDataPackage#getModellingAnnotationItem_Status()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	AnnotationStatusKind getStatus();

	/**
	 * Sets the value of the '{@link CDP4.ReportingData.ModellingAnnotationItem#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see CDP4.ReportingData.AnnotationStatusKind
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(AnnotationStatusKind value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see CDP4.ReportingData.ReportingDataPackage#getModellingAnnotationItem_Title()
	 * @model dataType="CDP4.CommonData.String" required="true" ordered="false"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link CDP4.ReportingData.ModellingAnnotationItem#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Classification</b></em>' attribute.
	 * The literals are from the enumeration {@link CDP4.ReportingData.AnnotationClassificationKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classification</em>' attribute.
	 * @see CDP4.ReportingData.AnnotationClassificationKind
	 * @see #setClassification(AnnotationClassificationKind)
	 * @see CDP4.ReportingData.ReportingDataPackage#getModellingAnnotationItem_Classification()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	AnnotationClassificationKind getClassification();

	/**
	 * Sets the value of the '{@link CDP4.ReportingData.ModellingAnnotationItem#getClassification <em>Classification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classification</em>' attribute.
	 * @see CDP4.ReportingData.AnnotationClassificationKind
	 * @see #getClassification()
	 * @generated
	 */
	void setClassification(AnnotationClassificationKind value);

	/**
	 * Returns the value of the '<em><b>Approved By</b></em>' containment reference list.
	 * The list contents are of type {@link CDP4.ReportingData.Approval}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Approved By</em>' containment reference list.
	 * @see CDP4.ReportingData.ReportingDataPackage#getModellingAnnotationItem_ApprovedBy()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Approval> getApprovedBy();

	/**
	 * Returns the value of the '<em><b>Source Annotation</b></em>' reference list.
	 * The list contents are of type {@link CDP4.ReportingData.ModellingAnnotationItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Annotation</em>' reference list.
	 * @see CDP4.ReportingData.ReportingDataPackage#getModellingAnnotationItem_SourceAnnotation()
	 * @model ordered="false"
	 * @generated
	 */
	EList<ModellingAnnotationItem> getSourceAnnotation();

} // ModellingAnnotationItem
