/**
 */
package CDP4.SiteDirectoryData;

import CDP4.CommonData.DefinedThing;
import CDP4.CommonData.DeprecatableThing;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domain Of Expertise Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <html>
 *   <head>
 * 		<style>
 * 			p {padding:0px; margin:0px;}
 * 		</style>
 * 	</head>
 *   <body>
 *     <p>
 * representation of a group of domains of expertise (DomainOfExpertise)&#160;defined for this SiteDirectory
 *     </p>
 * 
 *     <p>
 * Note:&#160;The purpose of DomainOfExpertiseGroup is to organize related domains of expertise in convenient ways in order to assist setting up and managing domains for EngineeringModelSetups as well as mapping domains when datasets are exchanged between partnering concurrent engineering organizations.
 * 
 *     </p>
 * 
 *   </body>
 * </html>
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CDP4.SiteDirectoryData.DomainOfExpertiseGroup#getDomain <em>Domain</em>}</li>
 * </ul>
 *
 * @see CDP4.SiteDirectoryData.SiteDirectoryDataPackage#getDomainOfExpertiseGroup()
 * @model
 * @generated
 */
public interface DomainOfExpertiseGroup extends DefinedThing, DeprecatableThing {
	/**
	 * Returns the value of the '<em><b>Domain</b></em>' reference list.
	 * The list contents are of type {@link CDP4.SiteDirectoryData.DomainOfExpertise}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <html>
	 *   <head>
	 * 		<style>
	 * 			p {padding:0px; margin:0px;}
	 * 		</style>
	 * 	</head>
	 *   <body>
	 *     <p>
	 * collection of domains of expertise (DomainOfExpertise)&#160;in this DomainOfExpertiseGroup
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Domain</em>' reference list.
	 * @see CDP4.SiteDirectoryData.SiteDirectoryDataPackage#getDomainOfExpertiseGroup_Domain()
	 * @model ordered="false"
	 * @generated
	 */
	EList<DomainOfExpertise> getDomain();

} // DomainOfExpertiseGroup
