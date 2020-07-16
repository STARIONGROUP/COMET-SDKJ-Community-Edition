/**
 */
package CDP4.EngineeringModelData;

import CDP4.CommonData.Thing;
import CDP4.CommonData.TimeStampedThing;

import CDP4.SiteDirectoryData.DomainOfExpertise;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Publication</b></em>'.
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
 * representation of a saved state within an Iteration where all <i>computed</i> values of the ParameterValueSets of a selected set of Parameters and ParameterOverrides are published to (i.e. copied to)&#160;the <i>published</i> values
 *     </p>
 * 
 *     <p>
 * Note:&#160;The purpose of publishing Publications is to isolate all Participants that hold a ParameterSubscription on a particular Parameter or ParameterOverride from continuous (and potential disruptive)&#160;changes to the <i>computed</i> values of those ParameterSubscriptions. The <i>computed</i> values in the ParameterSubscriptionValueSets of ParameterSubscriptions are updated to the latest <i>actualValue</i> in the ParameterValueSets of the corresponding Parameter or ParameterOverride only at the point in time when a Publication takes place. This mechanism allows the owners, i.e. Participant(s) representing the owner DomainOfExpertise, of Parameters and ParameterOverrides to freely experiment with their parameter values without disrupting the other Participants.
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
 *   <li>{@link CDP4.EngineeringModelData.Publication#getDomain <em>Domain</em>}</li>
 *   <li>{@link CDP4.EngineeringModelData.Publication#getPublishedParameter <em>Published Parameter</em>}</li>
 * </ul>
 *
 * @see CDP4.EngineeringModelData.EngineeringModelDataPackage#getPublication()
 * @model
 * @generated
 */
public interface Publication extends Thing, TimeStampedThing {
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
	 * references to the domain(s) of expertise that are the owner(s) of one or more <i>publishedParameter</i>
	 *     </p>
	 * 
	 *     <p>
	 * Note:&#160;When a client is sending data to the server, the presence of a DomainOfExpertise in the set signifies a request to publish all Parameters and ParameterOverrides owned by that DomainOfExpertise. Upon receipt of the result of the actual publication transaction from the server, <i>domain</i> will contain the set of actual DomainOfExpertise that had at least one ParameterValueSet of an owned Parameter or ParameterOverride published.
	 *     </p>
	 * 
	 *     <p>
	 * Note 2:&#160;The server will process the union of Parameters and ParameterOverrides as requested through the <i>domain </i>and <i>publishedParameter</i> properties.
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Domain</em>' reference list.
	 * @see CDP4.EngineeringModelData.EngineeringModelDataPackage#getPublication_Domain()
	 * @model ordered="false"
	 * @generated
	 */
	EList<DomainOfExpertise> getDomain();

	/**
	 * Returns the value of the '<em><b>Published Parameter</b></em>' reference list.
	 * The list contents are of type {@link CDP4.EngineeringModelData.ParameterOrOverrideBase}.
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
	 * references to the Parameters and ParameterOverrides published in this Publication
	 *     </p>
	 * 
	 *     <p>
	 * Note 1:&#160;When a client is sending data to the server, the presence of a Parameter or ParameterOverride in the set signifies a request to publish that Parameter or ParameterOverride. Upon receipt of the result of the actual publication transaction from the server, <i>publishedParameter</i> will contain the set of actual Parameters and ParameterOverrides that had at least one ParameterValueSet published.
	 *     </p>
	 * 
	 *     <p>
	 * Note 2:&#160;The server will process the union of Parameters and ParameterOverrides as requested through the <i>domain </i>and <i>publishedParameter</i> properties.
	 *     </p>
	 * 
	 *     <p>
	 * Note 3:&#160;The server will only publish Parameters and ParameterOverrides that have at least one ParameterValueSet where the <i>actualValue</i> differs from the <i>published</i> value.
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Published Parameter</em>' reference list.
	 * @see CDP4.EngineeringModelData.EngineeringModelDataPackage#getPublication_PublishedParameter()
	 * @model ordered="false"
	 * @generated
	 */
	EList<ParameterOrOverrideBase> getPublishedParameter();

} // Publication
