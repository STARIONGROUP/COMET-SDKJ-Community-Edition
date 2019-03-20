/* --------------------------------------------------------------------------------------------------------------------
 *    ElementDefinitionTest.java
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

package cdp4common.engineeringmodeldata;

import cdp4common.commondata.Thing;
import cdp4common.exceptions.ContainmentException;
import cdp4common.sitedirectorydata.Category;
import cdp4common.sitedirectorydata.SiteReferenceDataLibrary;
import cdp4common.types.CacheKey;
import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import org.apache.commons.lang3.tuple.Pair;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.net.URI;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

class ElementDefinitionTest {
    private UUID iterationIid;
    private Iteration iteration;
    private Cache<CacheKey, Thing> cache;
    private URI uri;

    @BeforeEach
    void setup() {
        this.uri = URI.create("http://www.rheagroup.com");
        this.cache = CacheBuilder.newBuilder().build();

        this.iterationIid = UUID.randomUUID();
        this.iteration = new Iteration(this.iterationIid, this.cache, this.uri);
        this.cache.put(new CacheKey(this.iterationIid, null), this.iteration);
    }

    @Test
    void verifyThatContainedGroupsReturnsGroupsThatAreContained() {
        ElementDefinition elementDefinition = new ElementDefinition(UUID.randomUUID(), null, null);

        ParameterGroup parameterGroup_1 = new ParameterGroup(UUID.randomUUID(), null, null);
        elementDefinition.getParameterGroup().add(parameterGroup_1);
        ParameterGroup parameterGroup_2 = new ParameterGroup(UUID.randomUUID(), null, null);
        elementDefinition.getParameterGroup().add(parameterGroup_2);

        ParameterGroup parameterGroup_1_1 = new ParameterGroup(UUID.randomUUID(), null, null);
        elementDefinition.getParameterGroup().add(parameterGroup_1_1);
        parameterGroup_1_1.setContainingGroup(parameterGroup_1);

        ParameterGroup parameterGroup_1_2 = new ParameterGroup(UUID.randomUUID(), null, null);
        elementDefinition.getParameterGroup().add(parameterGroup_1_2);
        parameterGroup_1_2.setContainingGroup(parameterGroup_1);

        assertTrue(elementDefinition.getContainedGroup().contains(parameterGroup_1));
        assertTrue(elementDefinition.getContainedGroup().contains(parameterGroup_2));
    }

    @Test
    void verifyThatParameterGroupReturnsContainedParameters() {
        ElementDefinition elementDefinition = new ElementDefinition(UUID.randomUUID(), null, null);

        ParameterGroup parameterGroup_1 = new ParameterGroup(UUID.randomUUID(), null, null);
        elementDefinition.getContainedGroup().add(parameterGroup_1);

        Parameter parameter_0 = new Parameter(UUID.randomUUID(), null, null);
        elementDefinition.getParameter().add(parameter_0);

        Parameter parameter_1_1 = new Parameter(UUID.randomUUID(), null, null);
        elementDefinition.getParameter().add(parameter_1_1);
        parameter_1_1.setGroup(parameterGroup_1);

        Parameter parameter_1_2 = new Parameter(UUID.randomUUID(), null, null);
        elementDefinition.getParameter().add(parameter_1_2);
        parameter_1_2.setGroup(parameterGroup_1);

        assertFalse(elementDefinition.getContainedParameter().contains(parameter_1_1));
        assertFalse(elementDefinition.getContainedParameter().contains(parameter_1_2));
        assertTrue(elementDefinition.getContainedParameter().contains(parameter_0));
    }

    @Test
    void verifyThatHasUsageOfWorks() {
        ElementDefinition def1 = new ElementDefinition();
        ElementDefinition def11 = new ElementDefinition();
        ElementDefinition def12 = new ElementDefinition();
        ElementDefinition def111 = new ElementDefinition();
        ElementDefinition def1111 = new ElementDefinition();
        ElementDefinition def121 = new ElementDefinition();

        ElementUsage eu1 = new ElementUsage();
        eu1.setElementDefinition(def11);
        def1.getContainedElement().add(eu1);

        ElementUsage eu2 = new ElementUsage();
        eu2.setElementDefinition(def12);
        def1.getContainedElement().add(eu2);

        ElementUsage eu3 = new ElementUsage();
        eu3.setElementDefinition(def111);
        def11.getContainedElement().add(eu3);
        ElementUsage eu4 = new ElementUsage();
        eu4.setElementDefinition(def1111);
        def111.getContainedElement().add(eu4);

        ElementUsage eu5 = new ElementUsage();
        eu5.setElementDefinition(def121);
        def12.getContainedElement().add(eu5);

        assertTrue(def1.hasUsageOf(def1));
        assertTrue(def1.hasUsageOf(def11));
        assertTrue(def1.hasUsageOf(def111));
        assertTrue(def1.hasUsageOf(def1111));
        assertTrue(def1.hasUsageOf(def12));
        assertTrue(def1.hasUsageOf(def121));

        assertTrue(def11.hasUsageOf(def11));
        assertTrue(def11.hasUsageOf(def111));
        assertTrue(def11.hasUsageOf(def1111));
        assertFalse(def11.hasUsageOf(def1));
        assertFalse(def11.hasUsageOf(def12));
        assertFalse(def11.hasUsageOf(def121));
    }

    @Test
    void verifyThatHasUsageOfThrowsException() {
        ElementDefinition def1 = new ElementDefinition();

        assertThrows(IllegalArgumentException.class, () -> def1.hasUsageOf(null));
    }

    @Test
    void verifyThatModelCodeReturnsTheExpectedResult() {
        ElementDefinition elementDefinition = new ElementDefinition();
        String shortname = "Bat";

        elementDefinition.setShortName(shortname);

        assertEquals(shortname, elementDefinition.modelCode(null));
    }

    @Test
    void verifyThatModelCodeThrowsExceptionWhenComponentIndexNotZero() {
        ElementDefinition elementDefinition = new ElementDefinition();
        assertThrows(IllegalArgumentException.class, () -> elementDefinition.modelCode(1));
    }

    @Test
    void verifyThatGetRequiredRdlsWorks() {
        SiteReferenceDataLibrary srdl1 = new SiteReferenceDataLibrary(UUID.randomUUID(), null, null);
        SiteReferenceDataLibrary mrdl = new SiteReferenceDataLibrary(UUID.randomUUID(), null, null);
        SiteReferenceDataLibrary srdl2 = new SiteReferenceDataLibrary(UUID.randomUUID(), null, null);

        Category cat1 = new Category(UUID.randomUUID(), null, null);
        Category cat2 = new Category(UUID.randomUUID(), null, null);

        mrdl.setRequiredRdl(srdl1);
        srdl2.setRequiredRdl(srdl1);

        mrdl.getDefinedCategory().add(cat1);
        srdl1.getDefinedCategory().add(cat2);

        ElementDefinition def = new ElementDefinition(UUID.randomUUID(), null, null);
        def.getCategory().add(cat1);
        def.getCategory().add(cat2);

        assertEquals(2, def.getRequiredRdls().size());
        assertTrue(def.getRequiredRdls().contains(srdl1));
        assertTrue(def.getRequiredRdls().contains(mrdl));
        assertFalse(def.getRequiredRdls().contains(srdl2));
    }

    @Test
    void verifyThatReferencedByUsagesReturnsTheExpectedResult() {
        ElementDefinition def1 = new ElementDefinition(UUID.randomUUID(), this.cache, this.uri);
        this.iteration.getElement().add(def1);

        ElementDefinition def2 = new ElementDefinition(UUID.randomUUID(), this.cache, this.uri);
        this.iteration.getElement().add(def2);

        ElementUsage usage1_1 = new ElementUsage(UUID.randomUUID(), this.cache, this.uri);
        usage1_1.setElementDefinition(def1);

        ElementUsage usage1_2 = new ElementUsage(UUID.randomUUID(), this.cache, this.uri);
        usage1_2.setElementDefinition(def1);

        ElementUsage usage2_1 = new ElementUsage(UUID.randomUUID(), this.cache, this.uri);
        usage2_1.setElementDefinition(def2);

        ElementUsage usage2_2 = new ElementUsage(UUID.randomUUID(), this.cache, this.uri);
        usage2_2.setElementDefinition(def2);

        def1.getContainedElement().add(usage2_1);
        def1.getContainedElement().add(usage2_2);

        def2.getContainedElement().add(usage1_1);
        def2.getContainedElement().add(usage1_2);

        assertEquals(2, def1.referencingElementUsages().size());
        assertTrue(def1.referencingElementUsages().contains(usage1_1));
        assertTrue(def1.referencingElementUsages().contains(usage1_2));
    }

    @Test
    void verifyThatContainmentExceptionIsThrownWhenElementDefinitionIsNotContainedByIteration() {
        ElementDefinition def1 = new ElementDefinition(UUID.randomUUID(), this.cache, this.uri);

        assertThrows(ContainmentException.class, def1::referencingElementUsages);
    }
}
