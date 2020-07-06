package cdp4emfconnector;

import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.Arrays;
import java.util.UUID;

import org.junit.jupiter.api.Test;

public class PersonTest {

	 @Test
	    void verifyConversion() {

			var person = new cdp4common.sitedirectorydata.Person();
			var personIid = UUID.fromString("b3e2edac-3fea-4b7a-964f-c129b6dd63b2");	
			var personExcluded = new cdp4common.sitedirectorydata.Person();
			
			personExcluded.setIid(UUID.fromString("e163c5ad-f32b-4387-b805-f4b34600bc2c"));	
			personExcluded.setModifiedOn(OffsetDateTime.of(2019, 8, 2, 14, 11, 56, 580_000_000, ZoneOffset.UTC));
		    var domainOfExpertise = new cdp4common.sitedirectorydata.DomainOfExpertise();
		    domainOfExpertise.setIid(UUID.fromString("da7dddaa-02aa-4897-9935-e8d66c811a96"));		
		    var domainOfExpertiseExcluded = new cdp4common.sitedirectorydata.DomainOfExpertise();
		    domainOfExpertiseExcluded.setIid(UUID.fromString("e163c5ad-f32b-4387-b805-f4b34600bc2c"));	
		    domainOfExpertiseExcluded.setModifiedOn(OffsetDateTime.of(2019, 8, 2, 14, 11, 56, 580_000_000, ZoneOffset.UTC));
		    var emailAddress = new cdp4common.sitedirectorydata.EmailAddress();
		    emailAddress.setIid(UUID.fromString("9ec982e4-ef72-4953-aa85-b158a95d8d56"));
		    var telephoneNumber = new cdp4common.sitedirectorydata.TelephoneNumber();
		    telephoneNumber.setIid(UUID.fromString("e163c5ad-f32b-4387-b805-f4b34600bc2c"));	    
		    var givenName = "KamilGivenName";
		    var isActive = true;
		    var isDeprecated = true;
		    var organization = new cdp4common.sitedirectorydata.Organization();
		    organization.setIid(UUID.fromString("e163c5ad-f32b-4387-b805-f4b34600bc2c"));	    
		    var password = "password";	    
		    var role = new cdp4common.sitedirectorydata.PersonRole();
		    role.setIid(UUID.fromString("e163c5ad-f32b-4387-b805-f4b34600bc2c"));
		    var shortName = "KamilShortName";
		    var surname = "KamilSurname";	    
		    var userPreference = new cdp4common.sitedirectorydata.UserPreference();
		    userPreference.setIid(UUID.fromString("e163c5ad-f32b-4387-b805-f4b34600bc2c"));
		    
		    person.setIid(personIid);	    
		    person.setDefaultDomain(domainOfExpertise);
		    person.setDefaultEmailAddress(emailAddress);
		    person.setDefaultTelephoneNumber(telephoneNumber);
		    person.getEmailAddress().addAll(Arrays.asList(emailAddress));
		    person.getExcludedDomain().addAll(Arrays.asList(domainOfExpertiseExcluded));
		    person.getExcludedPerson().addAll(Arrays.asList(personExcluded));
		    person.setGivenName(givenName);
		    person.setActive(isActive);
		    person.setDeprecated(isDeprecated);
		    person.setModifiedOn(OffsetDateTime.of(2019, 8, 2, 14, 11, 56, 580_000_000, ZoneOffset.UTC));
		    person.setOrganization(organization);
		    person.setOrganizationalUnit(organization.getIid().toString());
		    person.setPassword(password);
		    person.setRevisionNumber(1);
		    person.setRole(role);
		    person.setShortName(shortName);
		    person.setSurname(surname);
		    person.getTelephoneNumber().addAll(Arrays.asList(telephoneNumber));
		    person.getUserPreference().addAll(Arrays.asList(userPreference));
			
			/*
			 * var test = cdp4emfconnector.Person.toEmf(person); var test2 =
			 * cdp4emfconnector.Person.toPojo(test); var test3 = test2.toDto();
			 */
		    
		    var end = "";
	    }
	
}
