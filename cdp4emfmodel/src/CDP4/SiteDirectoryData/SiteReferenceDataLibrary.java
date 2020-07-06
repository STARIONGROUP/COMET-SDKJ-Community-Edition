/**
 */
package CDP4.SiteDirectoryData;

import CDP4.CommonData.DeprecatableThing;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Site Reference Data Library</b></em>'.
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
 * ReferenceDataLibrary that can be (re-)used by multiple EngineeringModels / EngineeringModelSetups
 *     </p>
 * 
 *     <p>
 * Note 1:&#160;A&#160;SiteReferenceDataLibrary typically contains more generic concepts that can be used across different concurrent engineering studies and families of studies.
 *     </p>
 * 
 *     <p>
 * Note 2:&#160;As a rule there shall be only one &quot;top&quot;&#160;SiteReferenceDataLibrary, i.e. only one that has <i>requiredRdl</i> unspecified.
 * 
 *     </p>
 * 
 *   </body>
 * </html>
 * 
 * <!-- end-model-doc -->
 *
 *
 * @see CDP4.SiteDirectoryData.SiteDirectoryDataPackage#getSiteReferenceDataLibrary()
 * @model
 * @generated
 */
public interface SiteReferenceDataLibrary extends ReferenceDataLibrary, DeprecatableThing {
} // SiteReferenceDataLibrary
