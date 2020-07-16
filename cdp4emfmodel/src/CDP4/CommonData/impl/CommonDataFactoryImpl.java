/**
 */
package CDP4.CommonData.impl;

import CDP4.CommonData.*;

import java.time.OffsetDateTime;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CommonDataFactoryImpl extends EFactoryImpl implements CommonDataFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CommonDataFactory init() {
		try {
			CommonDataFactory theCommonDataFactory = (CommonDataFactory)EPackage.Registry.INSTANCE.getEFactory(CommonDataPackage.eNS_URI);
			if (theCommonDataFactory != null) {
				return theCommonDataFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CommonDataFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommonDataFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case CommonDataPackage.FILE_CONTENT_TYPE: return createFileContentType();
			case CommonDataPackage.ALIAS: return createAlias();
			case CommonDataPackage.DEFINITION: return createDefinition();
			case CommonDataPackage.CITATION: return createCitation();
			case CommonDataPackage.HYPER_LINK: return createHyperLink();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case CommonDataPackage.PERSON_ACCESS_RIGHT_KIND:
				return createPersonAccessRightKindFromString(eDataType, initialValue);
			case CommonDataPackage.LOG_LEVEL_KIND:
				return createLogLevelKindFromString(eDataType, initialValue);
			case CommonDataPackage.PARTICIPANT_ACCESS_RIGHT_KIND:
				return createParticipantAccessRightKindFromString(eDataType, initialValue);
			case CommonDataPackage.DATE:
				return createDateFromString(eDataType, initialValue);
			case CommonDataPackage.STRING:
				return createStringFromString(eDataType, initialValue);
			case CommonDataPackage.URI:
				return createUriFromString(eDataType, initialValue);
			case CommonDataPackage.LANGUAGE_CODE:
				return createLanguageCodeFromString(eDataType, initialValue);
			case CommonDataPackage.BOOLEAN:
				return createBooleanFromString(eDataType, initialValue);
			case CommonDataPackage.CLASS_KIND:
				return createClassKindFromString(eDataType, initialValue);
			case CommonDataPackage.INTEGER:
				return createIntegerFromString(eDataType, initialValue);
			case CommonDataPackage.FLOAT:
				return createFloatFromString(eDataType, initialValue);
			case CommonDataPackage.TIME_OF_DAY:
				return createTimeOfDayFromString(eDataType, initialValue);
			case CommonDataPackage.DATE_TIME:
				return createDateTimeFromString(eDataType, initialValue);
			case CommonDataPackage.UUID:
				return createUuidFromString(eDataType, initialValue);
			case CommonDataPackage.PARAMETER_FORMULA_TYPE:
				return createParameterFormulaTypeFromString(eDataType, initialValue);
			case CommonDataPackage.PARAMETER_VALUE_TYPE:
				return createParameterValueTypeFromString(eDataType, initialValue);
			case CommonDataPackage.SHA1_HASH_TYPE:
				return createSha1HashTypeFromString(eDataType, initialValue);
			case CommonDataPackage.LONG_INTEGER:
				return createLongIntegerFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case CommonDataPackage.PERSON_ACCESS_RIGHT_KIND:
				return convertPersonAccessRightKindToString(eDataType, instanceValue);
			case CommonDataPackage.LOG_LEVEL_KIND:
				return convertLogLevelKindToString(eDataType, instanceValue);
			case CommonDataPackage.PARTICIPANT_ACCESS_RIGHT_KIND:
				return convertParticipantAccessRightKindToString(eDataType, instanceValue);
			case CommonDataPackage.DATE:
				return convertDateToString(eDataType, instanceValue);
			case CommonDataPackage.STRING:
				return convertStringToString(eDataType, instanceValue);
			case CommonDataPackage.URI:
				return convertUriToString(eDataType, instanceValue);
			case CommonDataPackage.LANGUAGE_CODE:
				return convertLanguageCodeToString(eDataType, instanceValue);
			case CommonDataPackage.BOOLEAN:
				return convertBooleanToString(eDataType, instanceValue);
			case CommonDataPackage.CLASS_KIND:
				return convertClassKindToString(eDataType, instanceValue);
			case CommonDataPackage.INTEGER:
				return convertIntegerToString(eDataType, instanceValue);
			case CommonDataPackage.FLOAT:
				return convertFloatToString(eDataType, instanceValue);
			case CommonDataPackage.TIME_OF_DAY:
				return convertTimeOfDayToString(eDataType, instanceValue);
			case CommonDataPackage.DATE_TIME:
				return convertDateTimeToString(eDataType, instanceValue);
			case CommonDataPackage.UUID:
				return convertUuidToString(eDataType, instanceValue);
			case CommonDataPackage.PARAMETER_FORMULA_TYPE:
				return convertParameterFormulaTypeToString(eDataType, instanceValue);
			case CommonDataPackage.PARAMETER_VALUE_TYPE:
				return convertParameterValueTypeToString(eDataType, instanceValue);
			case CommonDataPackage.SHA1_HASH_TYPE:
				return convertSha1HashTypeToString(eDataType, instanceValue);
			case CommonDataPackage.LONG_INTEGER:
				return convertLongIntegerToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileContentType createFileContentType() {
		FileContentTypeImpl fileContentType = new FileContentTypeImpl();
		return fileContentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Alias createAlias() {
		AliasImpl alias = new AliasImpl();
		return alias;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Definition createDefinition() {
		DefinitionImpl definition = new DefinitionImpl();
		return definition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Citation createCitation() {
		CitationImpl citation = new CitationImpl();
		return citation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HyperLink createHyperLink() {
		HyperLinkImpl hyperLink = new HyperLinkImpl();
		return hyperLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersonAccessRightKind createPersonAccessRightKindFromString(EDataType eDataType, String initialValue) {
		PersonAccessRightKind result = PersonAccessRightKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPersonAccessRightKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogLevelKind createLogLevelKindFromString(EDataType eDataType, String initialValue) {
		LogLevelKind result = LogLevelKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLogLevelKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParticipantAccessRightKind createParticipantAccessRightKindFromString(EDataType eDataType, String initialValue) {
		ParticipantAccessRightKind result = ParticipantAccessRightKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertParticipantAccessRightKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OffsetDateTime createDateFromString(EDataType eDataType, String initialValue) {
		return (OffsetDateTime)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDateToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createStringFromString(EDataType eDataType, String initialValue) {
		return (String)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStringToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createUriFromString(EDataType eDataType, String initialValue) {
		return (String)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUriToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createLanguageCodeFromString(EDataType eDataType, String initialValue) {
		return (String)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLanguageCodeToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean createBooleanFromString(EDataType eDataType, String initialValue) {
		return (Boolean)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBooleanToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createClassKindFromString(EDataType eDataType, String initialValue) {
		return (String)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertClassKindToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer createIntegerFromString(EDataType eDataType, String initialValue) {
		return (Integer)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIntegerToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Float createFloatFromString(EDataType eDataType, String initialValue) {
		return (Float)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFloatToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createTimeOfDayFromString(EDataType eDataType, String initialValue) {
		return (String)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTimeOfDayToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OffsetDateTime createDateTimeFromString(EDataType eDataType, String initialValue) {
		return (OffsetDateTime)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDateTimeToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createUuidFromString(EDataType eDataType, String initialValue) {
		return (String)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUuidToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createParameterFormulaTypeFromString(EDataType eDataType, String initialValue) {
		return (String)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertParameterFormulaTypeToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createParameterValueTypeFromString(EDataType eDataType, String initialValue) {
		return (String)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertParameterValueTypeToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createSha1HashTypeFromString(EDataType eDataType, String initialValue) {
		return (String)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSha1HashTypeToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long createLongIntegerFromString(EDataType eDataType, String initialValue) {
		return (Long)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLongIntegerToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommonDataPackage getCommonDataPackage() {
		return (CommonDataPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CommonDataPackage getPackage() {
		return CommonDataPackage.eINSTANCE;
	}

} //CommonDataFactoryImpl
