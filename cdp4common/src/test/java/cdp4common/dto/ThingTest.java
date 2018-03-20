/* --------------------------------------------------------------------------------------------------------------------
 *    ThingTest.java
 *    Copyright (c) 2015-2018 RHEA System S.A.
 *
 *    Author: Sam Gerené, Merlin Bieze, Alex Vorobiev, Naron Phou
 *
 *    This file is part of CDP4-SDK Community Edition
 *
 *    The CDP4-SDK Community Edition is free software; you can redistribute it and/or
 *    modify it under the terms of the GNU Lesser General Public
 *    License as published by the Free Software Foundation; either
 *    version 3 of the License, or (at your option) any later version.
 *
 *    The CDP4-SDK Community Edition is distributed in the hope that it will be useful,
 *    but WITHOUT ANY WARRANTY; without even the implied warranty of
 *    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 *    Lesser General Public License for more details.
 *
 *    You should have received a copy of the GNU Lesser General Public License
 *    along with this program; if not, write to the Free Software Foundation,
 *    Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 *  --------------------------------------------------------------------------------------------------------------------
 */

package cdp4common.dto;

import cdp4common.commondata.ClassKind;
import cdp4common.types.OrderedItem;
import cdp4common.types.ValueArray;
import com.google.common.cache.Cache;
import com.google.common.collect.Iterables;
import org.apache.commons.lang3.NotImplementedException;
import org.apache.commons.lang3.tuple.Pair;
import org.junit.jupiter.api.Test;

import java.net.URI;
import java.util.List;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

class ThingTest {
    @Test
    void verifyThatContainersCanBeAddedAndTheRouteIsGenerated() {
        BooleanParameterType booleanParameterType;
        String expectedRoute;
        String computedRoute;

        UUID booleanParameterTypeId = UUID.randomUUID();
        UUID siteReferenceDataLibraryId = UUID.randomUUID();
        UUID siteDirectoryId = UUID.randomUUID();

        UUID modelReferenceDataLibraryId = UUID.randomUUID();
        UUID engineeringModelSetupId = UUID.randomUUID();

        // test that it works for a parameter type contained in SiteReferenceDataLibrary
        booleanParameterType = new BooleanParameterType(booleanParameterTypeId, 1);
        booleanParameterType.addContainer(ClassKind.SITE_REFERENCE_DATA_LIBRARY, siteReferenceDataLibraryId);
        booleanParameterType.addContainer(ClassKind.SITE_DIRECTORY, siteDirectoryId);

        expectedRoute = String.format("/SiteDirectory/%s/siteReferenceDataLibrary/%s/parameterType/%s", siteDirectoryId, siteReferenceDataLibraryId, booleanParameterTypeId);
        computedRoute = booleanParameterType.getRoute();
        assertEquals(expectedRoute, computedRoute);

        // test that it works for a parameter type contained in ModelReferenceDataLibrary
        booleanParameterType = new BooleanParameterType(booleanParameterTypeId, 1);
        booleanParameterType.addContainer(ClassKind.MODEL_REFERENCE_DATA_LIBRARY, modelReferenceDataLibraryId);
        booleanParameterType.addContainer(ClassKind.ENGINEERING_MODEL_SETUP, engineeringModelSetupId);
        booleanParameterType.addContainer(ClassKind.SITE_DIRECTORY, siteDirectoryId);

        expectedRoute = String.format("/SiteDirectory/%s/model/%s/requiredRdl/%s/parameterType/%s", siteDirectoryId, engineeringModelSetupId, modelReferenceDataLibraryId, booleanParameterTypeId);
        computedRoute = booleanParameterType.getRoute();
        assertEquals(expectedRoute, computedRoute);
    }

    @Test
    void verifyThatContainersCantBeAddedAfterSiteDirectory() {
        BooleanParameterType booleanParameterType;

        UUID booleanParameterTypeId = UUID.randomUUID();
        UUID siteReferenceDataLibraryId = UUID.randomUUID();
        UUID siteDirectoryId = UUID.randomUUID();

        booleanParameterType = new BooleanParameterType(booleanParameterTypeId, 1);
        booleanParameterType.addContainer(ClassKind.SITE_REFERENCE_DATA_LIBRARY, siteReferenceDataLibraryId);
        booleanParameterType.addContainer(ClassKind.SITE_DIRECTORY, siteDirectoryId);

        assertThrows(UnsupportedOperationException.class, () -> booleanParameterType.addContainer(ClassKind.ENGINEERING_MODEL, UUID.randomUUID()));
    }

    @Test
    void verifyThatContainersCantBeAddedAfterEngineeringModel() {
        ElementDefinition elementDefinition;

        UUID elementDefinitionId = UUID.randomUUID();
        UUID iterationId = UUID.randomUUID();
        UUID engineeringModelId = UUID.randomUUID();

        elementDefinition = new ElementDefinition(elementDefinitionId, 1);
        elementDefinition.addContainer(ClassKind.ITERATION, iterationId);
        elementDefinition.addContainer(ClassKind.ENGINEERING_MODEL, engineeringModelId);

        assertThrows(UnsupportedOperationException.class, () -> elementDefinition.addContainer(ClassKind.PERSON, UUID.randomUUID()));
    }

    @Test
    void verifyThatContainmentCanBeResolved() {
        ElementDefinition elementDefenition;
        ElementDefinition elementDefenition2;
        Iteration iteration;

        UUID elementDefinitionId = UUID.randomUUID();
        UUID elementDefinitionId2 = UUID.randomUUID();
        UUID iterationId = UUID.randomUUID();

        elementDefenition = new ElementDefinition(elementDefinitionId, 1);
        elementDefenition2 = new ElementDefinition(elementDefinitionId2, 1);
        iteration = new Iteration(iterationId, 1);
        iteration.getElement().add(elementDefinitionId);

        assertTrue(iteration.contains(elementDefenition));
        assertFalse(iteration.contains(elementDefenition2));

        // check ordered items
        PossibleFiniteState state1 = new PossibleFiniteState(UUID.randomUUID(), 1);
        PossibleFiniteState state2 = new PossibleFiniteState(UUID.randomUUID(), 1);
        PossibleFiniteState state3 = new PossibleFiniteState(UUID.randomUUID(), 1);

        PossibleFiniteStateList list = new PossibleFiniteStateList(UUID.randomUUID(), 1);
        OrderedItem orderedItem1 = new OrderedItem();
        orderedItem1.setK(1);
        orderedItem1.setV(state1.getIid());
        list.getPossibleState().add(orderedItem1);
        OrderedItem orderedItem2 = new OrderedItem();
        orderedItem2.setK(100);
        orderedItem2.setV(state2.getIid());
        list.getPossibleState().add(orderedItem2);

        assertTrue(list.contains(state1));
        assertTrue(list.contains(state2));
        assertFalse(list.contains(state3));
    }

    @Test
    void verifyThatTopContainerRouteIsCorrect() {
        // iteration thing
        ElementDefinition elementDefinition;

        UUID elementDefinitionId = UUID.randomUUID();
        UUID iterationId = UUID.randomUUID();
        UUID engineeringModelId = UUID.randomUUID();

        elementDefinition = new ElementDefinition(elementDefinitionId, 1);
        elementDefinition.addContainer(ClassKind.ITERATION, iterationId);
        elementDefinition.addContainer(ClassKind.ENGINEERING_MODEL, engineeringModelId);

        assertEquals(String.format("/EngineeringModel/%s/iteration/%s", engineeringModelId, iterationId), elementDefinition.getTopContainerRoute());

        // engineering model thing
        Book book;
        Section section;

        book = new Book(UUID.randomUUID(), 1);
        book.addContainer(ClassKind.ENGINEERING_MODEL, engineeringModelId);
        section = new Section(UUID.randomUUID(), 1);
        section.addContainer(ClassKind.BOOK, book.getIid());
        section.addContainer(ClassKind.ENGINEERING_MODEL, engineeringModelId);

        assertEquals(String.format("/EngineeringModel/%s", engineeringModelId), book.getTopContainerRoute());
        assertEquals(String.format("/EngineeringModel/%s", engineeringModelId), section.getTopContainerRoute());


        EngineeringModel enModel;
        enModel = new EngineeringModel(UUID.randomUUID(), 1);

        assertEquals(String.format("/EngineeringModel/%s", enModel.getIid()), enModel.getTopContainerRoute());

        // site directory thing
        BooleanParameterType booleanParameterType;

        UUID booleanParameterTypeId = UUID.randomUUID();
        UUID siteReferenceDataLibraryId = UUID.randomUUID();
        UUID siteDirectoryId = UUID.randomUUID();
        SiteDirectory siteDirectory = new SiteDirectory(siteDirectoryId, 1);

        booleanParameterType = new BooleanParameterType(booleanParameterTypeId, 1);
        booleanParameterType.addContainer(ClassKind.SITE_REFERENCE_DATA_LIBRARY, siteReferenceDataLibraryId);
        booleanParameterType.addContainer(ClassKind.SITE_DIRECTORY, siteDirectoryId);

        assertEquals(String.format("/SiteDirectory/%s", siteDirectoryId), booleanParameterType.getTopContainerRoute());
        assertEquals(String.format("/SiteDirectory/%s", siteDirectoryId), siteDirectory.getTopContainerRoute());
    }

    @Test
    void verifyThatWrongContainerCantBeAdded() {
        BooleanParameterType booleanParameterType;

        UUID booleanParameterTypeId = UUID.randomUUID();
        UUID siteReferenceDataLibraryId = UUID.randomUUID();

        booleanParameterType = new BooleanParameterType(booleanParameterTypeId, 1);
        booleanParameterType.addContainer(ClassKind.SITE_REFERENCE_DATA_LIBRARY, siteReferenceDataLibraryId);

        assertThrows(UnsupportedOperationException.class, () -> booleanParameterType.addContainer(ClassKind.PERSON, UUID.randomUUID()));
    }

    @Test
    void verifyClassKindIsCorrect() {
        cdp4common.commondata.Thing alias = new cdp4common.commondata.Alias();
        assertEquals(ClassKind.ALIAS, alias.getClassKind());

        cdp4common.dto.Thing aliasdto = new cdp4common.dto.Alias();
        assertEquals(ClassKind.ALIAS, aliasdto.CLASS_KIND);
    }

    @Test
    void verifyThatExceptionIsRaisedWhenNoClassKindExistsForDTO() {
        TestDto thing = new TestDto();

        assertThrows(UnsupportedOperationException.class, thing::getRoute);
    }

    @Test
    void verifyThatDeepCloneWorksWithParameterValueSet() {
        ParameterValueSet valueset = new ParameterValueSet(UUID.randomUUID(), 0);
        List<String> manual = List.of("a", "b", "c");
        valueset.setManual(new ValueArray<>(manual, String.class));

        ParameterValueSet clone = valueset.deepClone(ParameterValueSet.class);
        assertEquals(valueset.getIid(), clone.getIid());

        clone.setManual(new ValueArray<>(String.class));
        assertEquals(3, valueset.getManual().size());
        assertEquals(0, clone.getManual().size());
    }

    @Test
    void verifyThatDeepCloneWorksWithActualFiniteStateList() {
        ActualFiniteStateList actualList = new ActualFiniteStateList(UUID.randomUUID(), 0);
        OrderedItem item = new OrderedItem();
        item.setK(1);
        item.setV(UUID.randomUUID());

        actualList.getPossibleFiniteStateList().add(item);
        actualList.getActualState().add(UUID.randomUUID());

        ActualFiniteStateList clone = actualList.deepClone(ActualFiniteStateList.class);
        assertEquals(1, clone.getPossibleFiniteStateList().size());
        assertEquals(1, clone.getActualState().size());

        clone.getActualState().add(UUID.randomUUID());
        assertEquals(1, actualList.getActualState().size());

        OrderedItem ordereditem = Iterables.getOnlyElement(clone.getPossibleFiniteStateList());
        assertEquals(ordereditem.getK(), 1);
        assertEquals(ordereditem.getV(), item.getV());
    }

    /**
     * Test Thing class
     */
    private class TestDto extends cdp4common.dto.Thing {
        @Override
        public cdp4common.commondata.Thing instantiatePojo(Cache<Pair<UUID, UUID>, cdp4common.commondata.Thing> cache, URI uri) {
            throw new NotImplementedException("Not implemented.");
        }

        @Override
        protected ClassKind computeCurrentClassKind() {
            return ClassKind.THING;
        }
    }
}
