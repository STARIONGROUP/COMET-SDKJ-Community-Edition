/*
 * ThingExtensionTest.java
 *
 * Copyright (c) 2015-2019 RHEA System S.A.
 *
 * Author: Alex Vorobiev, Yevhen Ikonnykov, Sam Gerené
 *
 * This file is part of CDP4-SDKJ Community Edition
 *
 * The CDP4-SDKJ Community Edition is free software; you can redistribute it and/or
 *  modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * The CDP4-SDKJ Community Edition is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 */

package cdp4common;

import cdp4common.commondata.Alias;
import cdp4common.commondata.DefinedThing;
import cdp4common.commondata.HyperLink;
import cdp4common.commondata.Thing;
import cdp4common.engineeringmodeldata.ElementDefinition;
import cdp4common.engineeringmodeldata.EngineeringModel;
import cdp4common.engineeringmodeldata.Iteration;
import cdp4common.sitedirectorydata.*;
import cdp4common.types.ValueArray;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.net.URI;
import java.util.List;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

class ThingExtensionTest {
    private Alias alias;
    private SiteDirectory siteDir;
    private DefinedThing definedThing;
    private SiteReferenceDataLibrary srdl;

    @BeforeEach
    void setup() {
        this.siteDir = new SiteDirectory(UUID.randomUUID(), null, null);
        this.definedThing = new DomainOfExpertise(UUID.randomUUID(), null, null);
        this.definedThing.setContainer(this.siteDir);
        this.alias = new Alias();
        this.alias.setIid(UUID.randomUUID());
        this.alias.setSynonym(true);
        this.alias.setContent("test");
        this.alias.setLanguageCode("test2");
        this.alias.setContainer(this.definedThing);

        this.srdl = new SiteReferenceDataLibrary(UUID.randomUUID(), null, null);
        this.srdl.setContainer(this.siteDir);
    }

    /**
     * the objective of this test is to verify the method with ValueType properties
     */
    @Test
    void verifyToDtoMethodWithValueType() {
        cdp4common.dto.Alias aliasDto = (cdp4common.dto.Alias) this.alias.toDto();

        assertEquals(this.alias.getIid(), aliasDto.getIid());
        assertEquals(this.alias.isSynonym(), aliasDto.isSynonym());
        assertEquals(this.alias.getContent(), aliasDto.getContent());
        assertEquals(this.alias.getLanguageCode(), aliasDto.getLanguageCode());
        assertEquals(this.alias.getRoute(), aliasDto.getRoute());

        assertEquals(this.alias, aliasDto.querySourceThing());
    }

    /**
     * Objective : Test with a List{Thing}
     */
    @Test
    void verifyToDtoMethodWithListThing() {
        DateParameterType dateParameterType = new DateParameterType();
        dateParameterType.setIid(UUID.randomUUID());
        dateParameterType.setContainer(this.srdl);

        HyperLink hyperlink = new HyperLink(UUID.randomUUID(), null, null);
        HyperLink hyperlink2 = new HyperLink(UUID.randomUUID(), null, null);

        dateParameterType.getHyperLink().add(hyperlink);
        dateParameterType.getHyperLink().add(hyperlink2);

        cdp4common.dto.DateParameterType dto = (cdp4common.dto.DateParameterType) dateParameterType.toDto();

        assertEquals(2, dto.getHyperLink().size());
        assertEquals(dateParameterType.getHyperLink().get(1).getIid(), dto.getHyperLink().get(1));
        assertEquals(dateParameterType.getHyperLink().get(0).getIid(), dto.getHyperLink().get(0));
        assertEquals(dateParameterType.getRoute(), dto.getRoute());

        assertEquals(dateParameterType, dto.querySourceThing());
    }

    /**
     * Objective: test with a single Thing
     */
    @Test
    void verifyToDtoMethodWithSingleThing() {
        Person person = new Person();
        person.setIid(UUID.randomUUID());
        Organization organization = new Organization(UUID.randomUUID(), null, null);
        person.setOrganization(organization);
        person.setContainer(this.siteDir);

        cdp4common.dto.Person dto = (cdp4common.dto.Person) person.toDto();

        assertEquals(dto.getOrganization(), organization.getIid());
        assertEquals(person.getRoute(), dto.getRoute());

        assertEquals(person, dto.querySourceThing());
    }

    /**
     * Objective: test with a orderedItem
     */
    @Test
    void verifyToDtoMethodWithOrderedItem() {
        CompoundParameterType compoundParameterType = new CompoundParameterType();
        compoundParameterType.setIid(UUID.randomUUID());
        compoundParameterType.setContainer(this.srdl);

        ParameterTypeComponent parameterTypeComponent1 = new ParameterTypeComponent(UUID.randomUUID(), null, null);
        parameterTypeComponent1.setShortName("test1");
        ParameterTypeComponent parameterTypeComponent2 = new ParameterTypeComponent(UUID.randomUUID(), null, null);
        parameterTypeComponent2.setShortName("test2");
        compoundParameterType.getComponent().add(parameterTypeComponent1);
        compoundParameterType.getComponent().add(parameterTypeComponent2);

        cdp4common.dto.CompoundParameterType dto = (cdp4common.dto.CompoundParameterType) compoundParameterType.toDto();

        assertEquals(dto.getComponent().get(0).getK(), (long) compoundParameterType.getComponent().getSortedItems().firstKey());
        assertEquals(dto.getComponent().get(0).getV(), ((Thing)compoundParameterType.getComponent().getSortedItems().values().toArray()[0]).getIid());

        assertEquals(dto.getComponent().get(dto.getComponent().size() - 1).getK(), (long) compoundParameterType.getComponent().getSortedItems().lastKey());
        assertEquals(dto.getComponent().get(dto.getComponent().size() - 1).getV(), ((Thing)compoundParameterType.getComponent().getSortedItems().values().toArray()[compoundParameterType.getComponent().getSortedItems().values().size() - 1]).getIid());

        assertEquals(compoundParameterType.getRoute(), dto.getRoute());

        assertEquals(compoundParameterType, dto.querySourceThing());
    }

    @Test
    void verifyToDtoMethodWithValueArrayType() {
        Constant constant = new Constant(UUID.randomUUID(), null, URI.create("http://test.be"));

        List<String> valuestrings = List.of("test1", "test2");
        constant.setValue(new ValueArray<>(valuestrings, String.class));

        constant.setContainer(this.siteDir);

        cdp4common.dto.Constant dto = (cdp4common.dto.Constant) constant.toDto();
        assertEquals(2, dto.getValue().size());
    }

    @Test
    void verifyNullableToNullable() {
        SiteDirectory siteDirectory = new SiteDirectory(UUID.randomUUID(), null, null);

        EngineeringModelSetup modelSetup = new EngineeringModelSetup(UUID.randomUUID(), null, null);
        modelSetup.setSourceEngineeringModelSetupIid(UUID.randomUUID());
        siteDirectory.getModel().add(modelSetup);

        cdp4common.dto.EngineeringModelSetup dto = (cdp4common.dto.EngineeringModelSetup) modelSetup.toDto();
        assertEquals(modelSetup.getSourceEngineeringModelSetupIid(), dto.getSourceEngineeringModelSetupIid());

        assertEquals(modelSetup, dto.querySourceThing());
    }

    @Test
    void verifyThingToNullableGuid() {
        SiteDirectory siteDirectory = new SiteDirectory(UUID.randomUUID(), null, null);
        PersonRole role = new PersonRole(UUID.randomUUID(), null, null);

        siteDirectory.getPersonRole().add(role);
        siteDirectory.setDefaultPersonRole(role);

        cdp4common.dto.SiteDirectory dto = (cdp4common.dto.SiteDirectory) siteDirectory.toDto();

        assertTrue(dto.getDefaultPersonRole() != null);
        assertEquals(role.getIid(), dto.getDefaultPersonRole());

        assertEquals(siteDirectory, dto.querySourceThing());
    }

    @Test
    void verifyThatIterationDataToDtoWork() {
        EngineeringModel model = new EngineeringModel(UUID.randomUUID(), null, null);
        Iteration iteration = new Iteration(UUID.randomUUID(), null, null);
        ElementDefinition elementdef = new ElementDefinition(UUID.randomUUID(), null, null);

        model.getIteration().add(iteration);
        iteration.getElement().add(elementdef);

        cdp4common.dto.Thing iterationDto = iteration.toDto();
        cdp4common.dto.Thing defDto = elementdef.toDto();

        assertNull(iterationDto.getIterationContainerId());
        assertEquals(iteration.getIid(), defDto.getIterationContainerId());
    }
}
