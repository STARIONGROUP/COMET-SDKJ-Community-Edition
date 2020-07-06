/**
 */
package CDP4.EngineeringModelData.impl;

import CDP4.CommonData.Thing;

import CDP4.EngineeringModelData.EngineeringModelDataPackage;
import CDP4.EngineeringModelData.MultiRelationship;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Multi Relationship</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CDP4.EngineeringModelData.impl.MultiRelationshipImpl#getRelatedThing <em>Related Thing</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MultiRelationshipImpl extends RelationshipImpl implements MultiRelationship {
	/**
	 * The cached value of the '{@link #getRelatedThing() <em>Related Thing</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedThing()
	 * @generated
	 * @ordered
	 */
	protected EList<Thing> relatedThing;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MultiRelationshipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EngineeringModelDataPackage.Literals.MULTI_RELATIONSHIP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Thing> getRelatedThing() {
		if (relatedThing == null) {
			relatedThing = new EObjectResolvingEList<Thing>(Thing.class, this, EngineeringModelDataPackage.MULTI_RELATIONSHIP__RELATED_THING);
		}
		return relatedThing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EngineeringModelDataPackage.MULTI_RELATIONSHIP__RELATED_THING:
				return getRelatedThing();
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
			case EngineeringModelDataPackage.MULTI_RELATIONSHIP__RELATED_THING:
				getRelatedThing().clear();
				getRelatedThing().addAll((Collection<? extends Thing>)newValue);
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
			case EngineeringModelDataPackage.MULTI_RELATIONSHIP__RELATED_THING:
				getRelatedThing().clear();
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
			case EngineeringModelDataPackage.MULTI_RELATIONSHIP__RELATED_THING:
				return relatedThing != null && !relatedThing.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MultiRelationshipImpl
