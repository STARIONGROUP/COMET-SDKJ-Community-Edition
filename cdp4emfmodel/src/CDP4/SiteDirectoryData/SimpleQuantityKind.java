/**
 */
package CDP4.SiteDirectoryData;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Quantity Kind</b></em>'.
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
 * specialization of QuantityKind that represents a kind of quantity that does not depend on any other QuantityKind
 *     </p>
 * 
 *     <p>
 * Note 1: Typically a base kind of quantity such as &quot;length&quot; or &quot;mass&quot; would be specified as a SimpleQuantityKind, but it is not mandatory that base kinds of quantity as specified as SimpleQuantityKind.
 *     </p>
 * 
 *     <p>
 * Note 2:&#160;A SimpleQuantityKind must define at least one <i>possibleScale</i>.
 * 
 *     </p>
 * 
 *   </body>
 * </html>
 * 
 * <!-- end-model-doc -->
 *
 *
 * @see CDP4.SiteDirectoryData.SiteDirectoryDataPackage#getSimpleQuantityKind()
 * @model
 * @generated
 */
public interface SimpleQuantityKind extends QuantityKind {
} // SimpleQuantityKind
