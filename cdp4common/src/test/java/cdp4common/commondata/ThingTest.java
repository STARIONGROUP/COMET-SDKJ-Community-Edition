/* --------------------------------------------------------------------------------------------------------------------
 *    ThingTest.java
 *    Copyright (c) 2015-2018 RHEA System S.A.
 *
 *    Author: Sam Gerené, Merlin Bieze, Alex Vorobiev, Naron Phou
 *
 *    This file is part of CDP4-SDK Community Edition
 *
 *    The CDP4-SDK Community Edition is free software; you can redistribute it and/or
 *    modify it under the terms of the GNU Lesser General
 *    License as published by the Free Software Foundation; either
 *    version 3 of the License, or (at your option) any later version.
 *
 *    The CDP4-SDK Community Edition is distributed in the hope that it will be useful,
 *    but WITHOUT ANY WARRANTY; without even the implied warranty of
 *    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 *    Lesser General  License for more details.
 *
 *    You should have received a copy of the GNU Lesser General  License
 *    along with this program; if not, write to the Free Software Foundation,
 *    Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 *  --------------------------------------------------------------------------------------------------------------------
 */

package cdp4common.commondata;

import cdp4common.NotThing;
import cdp4common.engineeringmodeldata.*;
import cdp4common.exceptions.ContainmentException;
import cdp4common.sitedirectorydata.*;
import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import org.junit.jupiter.api.Test;

import java.net.URI;
import java.util.List;
import java.util.UUID;
import java.util.function.Predicate;

import static org.junit.jupiter.api.Assertions.*;

class ThingTest {
    @Test
    void verifyRoutePropertyOfSiteDirectory() {
        SiteDirectory siteDirectory = new SiteDirectory();
        assertEquals("/SiteDirectory/*", siteDirectory.getRoute());

        UUID siteDirectoryiid = UUID.randomUUID();
        siteDirectory.setIid(siteDirectoryiid);
        assertEquals("/SiteDirectory/" + siteDirectoryiid, siteDirectory.getRoute());
    }

    @Test
    void verifyRouteOfEngineeringModel() {
        EngineeringModel engineeringModel = new EngineeringModel();
        assertEquals("/EngineeringModel/" + new UUID(0L, 0L), engineeringModel.getRoute());

        UUID engineeringModelIid = UUID.randomUUID();
        engineeringModel.setIid(engineeringModelIid);

        assertEquals("/EngineeringModel/" + engineeringModelIid, engineeringModel.getRoute());
    }

    @Test
    void verifyRouteOnNonTopContainerClass() {
        UUID persionIid = UUID.fromString("5F09276B-25A1-4B48-BE0E-B681070D8C64");

        SiteDirectory siteDirectory = new SiteDirectory();

        Person person = new Person();
        person.setIid(persionIid);
        person.setContainer(siteDirectory);

        assertEquals("/SiteDirectory/*/person/" + persionIid, person.getRoute());

        UUID emailIid = UUID.randomUUID();
        EmailAddress email = new EmailAddress();
        email.setIid(emailIid);
        email.setContainer(person);
        person.getEmailAddress().add(email);

        assertEquals("/SiteDirectory/*/person/" + persionIid + "/emailAddress/" + emailIid, email.getRoute());
    }

    @Test
    void verifyThatExceptionIsThrowWhenContainmentNotSet() {
        Person person = new Person();
        assertThrows(ContainmentException.class, person::getRoute);

    }

    @Test
    void verifyTopContainerOfEmailOfPerson() {
        SiteDirectory siteDirectory = new SiteDirectory();

        Person person = new Person();
        siteDirectory.getPerson().add(person);
        person.setContainer(siteDirectory);

        EmailAddress email = new EmailAddress();
        person.getEmailAddress().add(email);
        email.setContainer(person);

        assertEquals(siteDirectory, email.getTopContainer());
    }

    @Test
    void verifyThatExceptionIsThrowWhenClassIsTopContainer() {
        SiteDirectory siteDirectory = new SiteDirectory();
        TopContainer topcontainer = siteDirectory.getTopContainer();

        assertEquals(siteDirectory, topcontainer);
    }

    @Test
    void verifyThatExceptionIsThrowWhenContainmentTreeIsBroken() {
        SiteDirectory siteDirectory = new SiteDirectory();

        Person person = new Person();
        siteDirectory.getPerson().add(person);
        siteDirectory.getPerson().get(0).setContainer(null);

        EmailAddress email = new EmailAddress();
        person.getEmailAddress().add(email);

        assertThrows(ContainmentException.class, email::getTopContainer);

    }

    @Test
    void verifyThatConstructorSetsProperties() {
        UUID iid = UUID.randomUUID();
        int revisionNumber = 1;
        URI uri = URI.create("http://someuri");
        Cache cache = CacheBuilder.newBuilder().build();

        SiteDirectory siteDirectory = new SiteDirectory(iid, cache, uri);
        siteDirectory.setRevisionNumber(revisionNumber);

        assertEquals(iid, siteDirectory.getIid());
        assertEquals(revisionNumber, siteDirectory.getRevisionNumber());
        assertEquals(uri, siteDirectory.getIDalUri());
        assertEquals(cache, siteDirectory.getCache());
        assertEquals(ClassKind.SITE_DIRECTORY, siteDirectory.getClassKind());
    }

    @Test
    void verifyThatDisposeSetsCacheToNull() {
        UUID iid = UUID.randomUUID();
        URI uri = URI.create("http://someuri");
        Cache cache = CacheBuilder.newBuilder().build();

        SiteDirectory siteDirectory = new SiteDirectory(iid, cache, uri);
        assertNotNull(siteDirectory.getCache());
        siteDirectory.close();

        assertNull(siteDirectory.getCache());
    }

    @Test
    void verifyThatCloneListIsDifferent() {
        Person testThing = new Person(UUID.randomUUID(), null, null);
        TelephoneNumber tel = new TelephoneNumber(UUID.randomUUID(), null, null);
        EmailAddress email = new EmailAddress(UUID.randomUUID(), null, null);

        testThing.getTelephoneNumber().add(tel);
        testThing.getEmailAddress().add(email);

        Person clone = testThing.clone(false);

        assertNotSame(testThing.getTelephoneNumber(), clone.getTelephoneNumber());
        assertEquals(testThing.getTelephoneNumber().size(), clone.getTelephoneNumber().size());
    }

    @Test
    void verifyThatCloneListIsDifferent2() {
        RequirementsSpecification testThing = new RequirementsSpecification(UUID.randomUUID(), null, null);
        Requirement req = new Requirement(UUID.randomUUID(), null, null);

        testThing.getRequirement().add(req);

        RequirementsSpecification clone = testThing.clone(false);
        assertNotSame(testThing.getGroup(), clone.getGroup());
        assertEquals(testThing.getGroup().size(), clone.getGroup().size());
    }

    @Test
    void verifyThatCloneOrderedItemListIsDifferent() {
        Iteration iteration = new Iteration(UUID.randomUUID(), null, null);
        Option option = new Option(UUID.randomUUID(), null, null);
        iteration.getOption().add(option);

        Iteration clone = iteration.clone(false);
        assertNotSame(iteration.getOption(), clone.getOption());
        assertEquals(iteration.getOption().size(), clone.getOption().size());
    }

    @Test
    void verifyThatClonedThingHasReferenceToOriginal() {
        Iteration iteration = new Iteration(UUID.randomUUID(), null, null);
        assertNull(iteration.getOriginal());

        Iteration clone = iteration.clone(false);

        assertNotSame(iteration, clone);
        assertSame(iteration, clone.getOriginal());
    }

    @Test
    void verifyIsContainedByWorks() {
        EngineeringModel model = new EngineeringModel(UUID.randomUUID(), null, null);
        SiteDirectory sitedir = new SiteDirectory(UUID.randomUUID(), null, null);
        SiteReferenceDataLibrary rdl = new SiteReferenceDataLibrary(UUID.randomUUID(), null, null);

        DerivedUnit unit = new DerivedUnit(UUID.randomUUID(), null, null);
        UnitFactor factor = new UnitFactor(UUID.randomUUID(), null, null);

        sitedir.getSiteReferenceDataLibrary().add(rdl);
        rdl.getUnit().add(unit);
        unit.getUnitFactor().add(factor);

        assertTrue(factor.isContainedBy(x -> x.getIid() == sitedir.getIid()));
        assertTrue(factor.isContainedBy(x -> x.getIid() == rdl.getIid()));
        assertTrue(factor.isContainedBy(x -> x.getIid() == unit.getIid()));
        assertFalse(factor.isContainedBy(x -> x.getIid() == model.getIid()));

        assertFalse(sitedir.isContainedBy(x -> x.getIid() == sitedir.getIid()));
        Predicate<Thing> predicate = null;
        assertThrows(IllegalArgumentException.class, () -> factor.isContainedBy(predicate));
    }

    @Test
    void verifyThatExceptionIsThrownWhenNoContainerIsProvidedToIsContainedBy() {
        SiteDirectory sitedir = null;
        SiteReferenceDataLibrary rdl = new SiteReferenceDataLibrary(UUID.randomUUID(), null, null);

        assertThrows(IllegalArgumentException.class, () -> rdl.isContainedBy(sitedir));
    }

    @Test
    void verifyIsContainedByIidWorks() {
        EngineeringModel model = new EngineeringModel(UUID.randomUUID(), null, null);
        SiteDirectory sitedir = new SiteDirectory(UUID.randomUUID(), null, null);
        SiteReferenceDataLibrary rdl = new SiteReferenceDataLibrary(UUID.randomUUID(), null, null);

        DerivedUnit unit = new DerivedUnit(UUID.randomUUID(), null, null);
        UnitFactor factor = new UnitFactor(UUID.randomUUID(), null, null);

        sitedir.getSiteReferenceDataLibrary().add(rdl);
        rdl.getUnit().add(unit);
        unit.getUnitFactor().add(factor);

        assertTrue(factor.isContainedBy(sitedir.getIid()));
        assertTrue(factor.isContainedBy(rdl.getIid()));
        assertTrue(factor.isContainedBy(unit.getIid()));
        assertFalse(factor.isContainedBy(model.getIid()));

        assertFalse(sitedir.isContainedBy(sitedir.getIid()));

        assertThrows(NullPointerException.class, () -> factor.isContainedBy(new UUID(0L, 0L)));
    }

    @Test
    void verifyContainedItemReferencesOriginal() {
        Person person = new Person(UUID.randomUUID(), null, null);
        TelephoneNumber phone = new TelephoneNumber(UUID.randomUUID(), null, null);
        person.getTelephoneNumber().add(phone);

        Person clone = person.clone(false);

        assertSame(phone.getContainer(), person);
        assertNotSame(phone.getContainer(), clone);

        assertTrue(person.getTelephoneNumber().contains(phone));
        assertTrue(clone.getTelephoneNumber().contains(phone));
    }

    @Test
    void verifyThatGetContainerOfTypeWorks() {
        SiteDirectory sitedir = new SiteDirectory(UUID.randomUUID(), null, null);
        SiteReferenceDataLibrary siterdl = new SiteReferenceDataLibrary(UUID.randomUUID(), null, null);
        DerivedUnit unit = new DerivedUnit(UUID.randomUUID(), null, null);

        sitedir.getSiteReferenceDataLibrary().add(siterdl);
        siterdl.getUnit().add(unit);

        assertSame(siterdl, unit.getContainerOfType(ReferenceDataLibrary.class));
        assertSame(siterdl, unit.getContainerOfType(SiteReferenceDataLibrary.class));
        assertSame(siterdl, unit.getContainerOfType(ModelReferenceDataLibrary.class));
        assertSame(sitedir, unit.getContainerOfType(SiteDirectory.class));
        assertNull(unit.getContainerOfType(Iteration.class));

        RequirementsGroup requirementsgroup1 = new RequirementsGroup(UUID.randomUUID(), null, null);
        RequirementsGroup requirementsgroup2 = new RequirementsGroup(UUID.randomUUID(), null, null);
        requirementsgroup1.getGroup().add(requirementsgroup2);

        assertEquals(requirementsgroup1, requirementsgroup2.getContainerOfType(RequirementsGroup.class));
    }

    @Test
    void verifyThatRouteOfNothingReturnsExpectedString() {
        NotThing nothing = new NotThing("nothing");
        assertEquals("No thing, no route", nothing.getRoute());
    }

    @Test
    void verifyThatNameOfNothingReturnsExpectedString() {
        NotThing nothing = new NotThing("nothing");
        assertEquals("nothing", nothing.getName());
    }

    @Test
    void verifyThatUnsupportedOperationsOfNothingThrow() {
        NotThing nothing = new NotThing("nothing");
        assertThrows(UnsupportedOperationException.class, () -> nothing.resolveProperties(null));
        assertThrows(UnsupportedOperationException.class, () -> nothing.toDto());
    }

    @Test
    void verifyThatTopContainerOfNotThingIsNull() {
        NotThing nothing = new NotThing("nothing");
        assertNull(nothing.getTopContainer());
    }

    @Test
    void verifyThatContainedThingsDeepReturnsExceptedResult() {
        Iteration iteration = new Iteration();
        ElementDefinition elementDefinition1 = new ElementDefinition();
        ElementDefinition elementDefinition2 = new ElementDefinition();
        Alias alias1 = new Alias();
        Alias alias2 = new Alias();
        PossibleFiniteStateList possibleFiniteStateList1 = new PossibleFiniteStateList();
        PossibleFiniteStateList possibleFiniteStateList2 = new PossibleFiniteStateList();
        PossibleFiniteState possibleFiniteState1_1 = new PossibleFiniteState();
        PossibleFiniteState possibleFiniteState1_2 = new PossibleFiniteState();
        PossibleFiniteState possibleFiniteState2_1 = new PossibleFiniteState();
        PossibleFiniteState possibleFiniteState2_2 = new PossibleFiniteState();

        iteration.getElement().add(elementDefinition1);
        iteration.getElement().add(elementDefinition2);

        elementDefinition1.getAlias().add(alias1);
        elementDefinition1.getAlias().add(alias2);

        iteration.getPossibleFiniteStateList().add(possibleFiniteStateList1);
        iteration.getPossibleFiniteStateList().add(possibleFiniteStateList2);

        possibleFiniteStateList1.getPossibleState().add(possibleFiniteState1_1);
        possibleFiniteStateList1.getPossibleState().add(possibleFiniteState1_2);

        possibleFiniteStateList2.getPossibleState().add(possibleFiniteState2_1);
        possibleFiniteStateList2.getPossibleState().add(possibleFiniteState2_2);

        List<Thing> things = iteration.queryContainedThingsDeep();

        assertEquals(11, things.size());

        assertTrue(things.contains(iteration));
        assertTrue(things.contains(elementDefinition1));
        assertTrue(things.contains(elementDefinition2));
        assertTrue(things.contains(alias1));
        assertTrue(things.contains(alias2));

        assertTrue(things.contains(possibleFiniteStateList1));
        assertTrue(things.contains(possibleFiniteStateList2));
        assertTrue(things.contains(possibleFiniteState1_1));
        assertTrue(things.contains(possibleFiniteState1_2));
        assertTrue(things.contains(possibleFiniteState2_1));
        assertTrue(things.contains(possibleFiniteState2_2));
    }
}
