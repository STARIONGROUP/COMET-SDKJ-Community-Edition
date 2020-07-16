/**
 */
package CDP4.SiteDirectoryData;

import CDP4.CommonData.DefinedThing;
import CDP4.CommonData.DeprecatableThing;

import java.time.OffsetDateTime;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reference Source</b></em>'.
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
 * representation of an information source that can be referenced
 *     </p>
 * 
 *     <p>
 * Note 1:&#160;The <i>name</i> property should be used to provide a descriptive human readable name of this ReferenceSource, e.g. the title of a book, a standard or an article. The <i>shortName</i> property should be used to provide a concise human readable identifier of this ReferenceSource, e.g. a standard identification code, an abbreviated reference such as in a paper or report.
 *     </p>
 * 
 *     <p>
 * Note 2: A description of the information source may be given in the <i>content</i> property of an associated Definition. Alternative names may be given in associated Aliases. On-line references may be given in associated HyperLinks.
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
 *   <li>{@link CDP4.SiteDirectoryData.ReferenceSource#getVersionIdentifier <em>Version Identifier</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.ReferenceSource#getVersionDate <em>Version Date</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.ReferenceSource#getAuthor <em>Author</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.ReferenceSource#getPublicationYear <em>Publication Year</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.ReferenceSource#getPublisher <em>Publisher</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.ReferenceSource#getPublishedIn <em>Published In</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.ReferenceSource#getLanguage <em>Language</em>}</li>
 * </ul>
 *
 * @see CDP4.SiteDirectoryData.SiteDirectoryDataPackage#getReferenceSource()
 * @model
 * @generated
 */
public interface ReferenceSource extends DefinedThing, CategorizableThing, DeprecatableThing {
	/**
	 * Returns the value of the '<em><b>Version Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <html>
	 *   <head>
	 * 		<style>
	 * 			p {padding:0px; margin:0px;}
	 * 		</style>
	 * 	</head>
	 * 
	 *   <body>
	 *     optional identifier denoting the version of this ReferenceSource
	 *   </body>
	 * 
	 * </html>
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Version Identifier</em>' attribute.
	 * @see #setVersionIdentifier(String)
	 * @see CDP4.SiteDirectoryData.SiteDirectoryDataPackage#getReferenceSource_VersionIdentifier()
	 * @model dataType="CDP4.CommonData.String" ordered="false"
	 * @generated
	 */
	String getVersionIdentifier();

	/**
	 * Sets the value of the '{@link CDP4.SiteDirectoryData.ReferenceSource#getVersionIdentifier <em>Version Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version Identifier</em>' attribute.
	 * @see #getVersionIdentifier()
	 * @generated
	 */
	void setVersionIdentifier(String value);

	/**
	 * Returns the value of the '<em><b>Version Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <html>
	 *   <head>
	 * 		<style>
	 * 			p {padding:0px; margin:0px;}
	 * 		</style>
	 * 	</head>
	 * 
	 *   <body>
	 *     optional date of release of this version of this ReferenceSource
	 *   </body>
	 * 
	 * </html>
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Version Date</em>' attribute.
	 * @see #setVersionDate(OffsetDateTime)
	 * @see CDP4.SiteDirectoryData.SiteDirectoryDataPackage#getReferenceSource_VersionDate()
	 * @model dataType="CDP4.CommonData.Date" ordered="false"
	 * @generated
	 */
	OffsetDateTime getVersionDate();

	/**
	 * Sets the value of the '{@link CDP4.SiteDirectoryData.ReferenceSource#getVersionDate <em>Version Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version Date</em>' attribute.
	 * @see #getVersionDate()
	 * @generated
	 */
	void setVersionDate(OffsetDateTime value);

	/**
	 * Returns the value of the '<em><b>Author</b></em>' attribute.
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
	 * optional specification of the author or authors of this ReferenceSource
	 *     </p>
	 * 
	 *     <p>
	 * Note:&#160;If there are multiple authors, the author names should be separated by commas.
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Author</em>' attribute.
	 * @see #setAuthor(String)
	 * @see CDP4.SiteDirectoryData.SiteDirectoryDataPackage#getReferenceSource_Author()
	 * @model dataType="CDP4.CommonData.String" ordered="false"
	 * @generated
	 */
	String getAuthor();

	/**
	 * Sets the value of the '{@link CDP4.SiteDirectoryData.ReferenceSource#getAuthor <em>Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Author</em>' attribute.
	 * @see #getAuthor()
	 * @generated
	 */
	void setAuthor(String value);

	/**
	 * Returns the value of the '<em><b>Publication Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <html>
	 *   <head>
	 * 		<style>
	 * 			p {padding:0px; margin:0px;}
	 * 		</style>
	 * 	</head>
	 * 
	 *   <body>
	 *     optional year of publication of this ReferenceSource
	 *   </body>
	 * 
	 * </html>
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Publication Year</em>' attribute.
	 * @see #setPublicationYear(Integer)
	 * @see CDP4.SiteDirectoryData.SiteDirectoryDataPackage#getReferenceSource_PublicationYear()
	 * @model dataType="CDP4.CommonData.Integer" ordered="false"
	 * @generated
	 */
	Integer getPublicationYear();

	/**
	 * Sets the value of the '{@link CDP4.SiteDirectoryData.ReferenceSource#getPublicationYear <em>Publication Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Publication Year</em>' attribute.
	 * @see #getPublicationYear()
	 * @generated
	 */
	void setPublicationYear(Integer value);

	/**
	 * Returns the value of the '<em><b>Publisher</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <html>
	 *   <head>
	 * 		<style>
	 * 			p {padding:0px; margin:0px;}
	 * 		</style>
	 * 	</head>
	 * 
	 *   <body>
	 *     optional reference to the Organization that is the publisher of this     ReferenceSource
	 *   </body>
	 * 
	 * </html>
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Publisher</em>' reference.
	 * @see #setPublisher(Organization)
	 * @see CDP4.SiteDirectoryData.SiteDirectoryDataPackage#getReferenceSource_Publisher()
	 * @model ordered="false"
	 * @generated
	 */
	Organization getPublisher();

	/**
	 * Sets the value of the '{@link CDP4.SiteDirectoryData.ReferenceSource#getPublisher <em>Publisher</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Publisher</em>' reference.
	 * @see #getPublisher()
	 * @generated
	 */
	void setPublisher(Organization value);

	/**
	 * Returns the value of the '<em><b>Published In</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <html>
	 *   <head>
	 * 		<style>
	 * 			p {padding:0px; margin:0px;}
	 * 		</style>
	 * 	</head>
	 * 
	 *   <body>
	 *     optional reference to another ReferenceSource than this ReferenceSource,     in     which     this     ReferenceSource     is     published
	 *   </body>
	 * 
	 * </html>
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Published In</em>' reference.
	 * @see #setPublishedIn(ReferenceSource)
	 * @see CDP4.SiteDirectoryData.SiteDirectoryDataPackage#getReferenceSource_PublishedIn()
	 * @model ordered="false"
	 * @generated
	 */
	ReferenceSource getPublishedIn();

	/**
	 * Sets the value of the '{@link CDP4.SiteDirectoryData.ReferenceSource#getPublishedIn <em>Published In</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Published In</em>' reference.
	 * @see #getPublishedIn()
	 * @generated
	 */
	void setPublishedIn(ReferenceSource value);

	/**
	 * Returns the value of the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <html>
	 *   <head>
	 * 		<style>
	 * 			p {padding:0px; margin:0px;}
	 * 		</style>
	 * 	</head>
	 * 
	 *   <body>
	 *     optional specification of the natural language code that this     ReferenceSource     is     written     in
	 *   </body>
	 * 
	 * </html>
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Language</em>' attribute.
	 * @see #setLanguage(String)
	 * @see CDP4.SiteDirectoryData.SiteDirectoryDataPackage#getReferenceSource_Language()
	 * @model dataType="CDP4.CommonData.LanguageCode" ordered="false"
	 * @generated
	 */
	String getLanguage();

	/**
	 * Sets the value of the '{@link CDP4.SiteDirectoryData.ReferenceSource#getLanguage <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language</em>' attribute.
	 * @see #getLanguage()
	 * @generated
	 */
	void setLanguage(String value);

} // ReferenceSource
