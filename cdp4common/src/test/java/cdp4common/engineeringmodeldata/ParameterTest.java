/*
 * ParameterTest.java
 *
 * Copyright (c) 2015-2024 Starion Group S.A.
 *
 * Author: Alex Vorobiev, Yevhen Ikonnykov, Sam Gerené
 *
 * This file is part of CDP4-SDKJ Community Edition
 *
 * The CDP4-SDKJ Community Edition is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
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

package cdp4common.engineeringmodeldata;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import cdp4common.exceptions.ContainmentException;
import cdp4common.sitedirectorydata.CompoundParameterType;
import cdp4common.sitedirectorydata.DomainOfExpertise;
import cdp4common.sitedirectorydata.ParameterTypeComponent;
import cdp4common.sitedirectorydata.ScalarParameterType;
import cdp4common.sitedirectorydata.SimpleQuantityKind;
import cdp4common.types.ValueArray;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ParameterTest {
    private String edShortname;

    private ElementDefinition elementDefinition;

    private String scalarParameterTypeShortname;

    private ScalarParameterType scalarParameterType;

    private Parameter scalarParameter;

    private String compoundParameterTypeShortname;

    private CompoundParameterType compoundParameterType;
    private DomainOfExpertise domain;
    private Parameter compoundParameter;
    private Iteration iteration;
    private Option option1;
    private Option option2;
    private PossibleFiniteStateList possibleList;
    private PossibleFiniteState possibleState1;
    private PossibleFiniteState possibleState2;
    private ActualFiniteStateList actualList;
    private ActualFiniteState actualState1;
    private ActualFiniteState actualState2;
    private ParameterTypeComponent component;

    @BeforeEach
    void setup() {
        this.domain = new DomainOfExpertise(UUID.randomUUID(), null, null);
        this.domain.setName("domain");
        this.domain.setShortName("d");

        this.scalarParameterTypeShortname = "m";

        SimpleQuantityKind simpleQuantityKind = new SimpleQuantityKind(UUID.randomUUID(), null, null);
        simpleQuantityKind.setShortName(this.scalarParameterTypeShortname);

        this.scalarParameterType = simpleQuantityKind;

        this.edShortname = "Sat";
        this.elementDefinition = new ElementDefinition(UUID.randomUUID(), null, null);
        this.elementDefinition.setOwner(this.domain);
        this.elementDefinition.setShortName(this.edShortname);

        this.scalarParameter = new Parameter(UUID.randomUUID(), null, null);
        this.scalarParameter.setOwner(this.domain);

        this.scalarParameter.setParameterType(this.scalarParameterType);
        this.elementDefinition.getParameter().add(this.scalarParameter);

        this.compoundParameterTypeShortname = "coord";
        this.compoundParameterType = new CompoundParameterType(UUID.randomUUID(), null, null);
        this.compoundParameterType.setShortName(this.compoundParameterTypeShortname);
        this.component = new ParameterTypeComponent(UUID.randomUUID(), null, null);
        this.component.setParameterType(this.scalarParameterType);
        this.component.setShortName(this.scalarParameterType.getShortName());
        this.compoundParameterType.getComponent().add(this.component);

        this.compoundParameter = new Parameter(UUID.randomUUID(), null, null);
        this.compoundParameter.setOwner(this.domain);
        this.compoundParameter.setParameterType(this.compoundParameterType);
        this.elementDefinition.getParameter().add(this.compoundParameter);

        this.iteration = new Iteration(UUID.randomUUID(), null, null);
        this.option1 = new Option(UUID.randomUUID(), null, null);
        this.option1.setName("option1");
        this.option1.setShortName("o1");
        this.option2 = new Option(UUID.randomUUID(), null, null);
        this.option2.setName("option2");
        this.option2.setShortName("o2");

        this.possibleList = new PossibleFiniteStateList(UUID.randomUUID(), null, null);
        this.possibleList.setName("possible list");
        this.possibleList.setShortName("pl");
        this.possibleState1 = new PossibleFiniteState(UUID.randomUUID(), null, null);
        this.possibleState1.setName("ps1");
        this.possibleState1.setShortName("ps1");
        this.possibleState2 = new PossibleFiniteState(UUID.randomUUID(), null, null);
        this.possibleState2.setName("ps2");
        this.possibleState2.setShortName("ps2");
        this.possibleList.getPossibleState().add(this.possibleState1);
        this.possibleList.getPossibleState().add(this.possibleState2);

        this.actualList = new ActualFiniteStateList(UUID.randomUUID(), null, null);
        this.actualList.getPossibleFiniteStateList().add(this.possibleList);
        this.actualState1 = new ActualFiniteState(UUID.randomUUID(), null, null);
        this.actualState1.getPossibleState().add(this.possibleState1);
        this.actualState2 = new ActualFiniteState(UUID.randomUUID(), null, null);
        this.actualState2.getPossibleState().add(this.possibleState2);
        this.actualList.getActualState().add(this.actualState1);
        this.actualList.getActualState().add(this.actualState2);

        this.iteration.getOption().add(this.option1);
        this.iteration.getOption().add(this.option2);
        this.iteration.getPossibleFiniteStateList().add(this.possibleList);
        this.iteration.getActualFiniteStateList().add(this.actualList);
        this.iteration.getElement().add(this.elementDefinition);
    }

    @Test
    void verifyThatModelCodeReturnsTheExpectedResultForScalar() {
        String modelcode = "Sat.m";
        assertEquals(modelcode, this.scalarParameter.modelCode(null));
    }

    @Test
    void verifyThatModelCodeReturnsTheExpectedResultForCompoundComponent1() {
        String modelcode = "Sat.coord.1_8";
        this.component.setShortName("{{1 -*/;%&@ 8<>}");

        assertEquals(modelcode, this.compoundParameter.modelCode(0));
    }

    @Test
    void verifyThatModelCodeReturnsTheExpectedResultForCompoundComponent2() {
        String modelcode = "Sat.coord.1_8";
        this.component.setShortName("1_8");

        assertEquals(modelcode, this.compoundParameter.modelCode(0));
    }

    @Test
    void verifyThatModelCodeReturnsTheExpectedResultForCompoundComponent3() {
        String modelcode = "Sat.coord.1_8";
        this.component.setShortName("{1;8");

        assertEquals(modelcode, this.compoundParameter.modelCode(0));
    }

    @Test
    void verifyThatModelCodeReturnsTheExpectedResultForCompoundComponent4() {
        String modelcode = "Sat.coord.";
        this.component.setShortName("  ");

        assertEquals(modelcode, this.compoundParameter.modelCode(0));
    }

    @Test
    void verifyThatModelCodeReturnsTheExpectedResultForCompound() {
        String modelcode = "Sat.coord";
        assertEquals(modelcode, this.compoundParameter.modelCode(null));
    }

    @Test
    void verifyThatExpectedExceptionIsThrownWhenComponentIndexIsSuppliedForScalarParameterType() {
        assertThrows(IllegalArgumentException.class, () -> this.scalarParameter.modelCode(1));
    }

    @Test
    void verifyThatWhenContainmentNotSetAContainmentExceptionIsThrown() {
        Parameter parameter = new Parameter(UUID.randomUUID(), null, null);
        assertThrows(ContainmentException.class, () -> parameter.modelCode(null));
    }

    @Test
    void verifyThatParameterHasErrorWhenNoValueSet() {
        // no topion, no state
        this.scalarParameter.validatePojo();
        assertFalse(this.scalarParameter.getValidationErrors().isEmpty());
    }

    @Test
    void verifyThatParameterHasErrorWhenNoValueSet2() {
        // option/State dependent
        this.scalarParameter.setOptionDependent(true);
        this.scalarParameter.setStateDependence(this.actualList);

        this.scalarParameter.validatePojo();
        assertFalse(this.scalarParameter.getValidationErrors().isEmpty());
    }

    @Test
    void verifyThatParameterHasErrorWhenNoValueSet3() {
        // option dependent
        this.scalarParameter.setOptionDependent(true);

        this.scalarParameter.validatePojo();
        assertFalse(this.scalarParameter.getValidationErrors().isEmpty());
    }

    @Test
    void verifyThatParameterHasErrorWhenNoValueSet4() {
        // State dependent
        this.scalarParameter.setStateDependence(this.actualList);

        this.scalarParameter.validatePojo();
        assertFalse(this.scalarParameter.getValidationErrors().isEmpty());
    }

    @Test
    void verifyThatParameterWithEmptyArrayValueSetHasError() {
        ParameterValueSet valueset = new ParameterValueSet(UUID.randomUUID(), null, null);
        this.scalarParameter.getValueSet().add(valueset);
        valueset.validatePojo();
        this.scalarParameter.validatePojo();

        assertFalse(this.scalarParameter.getValidationErrors().isEmpty());
    }

    @Test
    void verifyThatParameterHasNoError() {
        ParameterValueSet valueset = new ParameterValueSet(UUID.randomUUID(), null, null);
        List<String> data = Arrays.asList("-");
        valueset.setManual(new ValueArray<>(data, String.class));
        valueset.setComputed(new ValueArray<>(data, String.class));
        valueset.setReference(new ValueArray<>(data, String.class));
        valueset.setPublished(new ValueArray<>(data, String.class));
        valueset.setFormula(new ValueArray<>(data, String.class));

        this.scalarParameter.getValueSet().add(valueset);
        valueset.validatePojo();
        this.scalarParameter.validatePojo();

        assertTrue(this.scalarParameter.getValidationErrors().isEmpty());
    }

    @Test
    void verifyThatParameterCanBePublishedReturnsExpectedResult() {
        ParameterValueSet valueset = new ParameterValueSet(UUID.randomUUID(), null, null);
        List<String> data = Arrays.asList("-");
        valueset.setValueSwitch(ParameterSwitchKind.MANUAL);
        valueset.setManual(new ValueArray<>(data, String.class));
        valueset.setComputed(new ValueArray<>(data, String.class));
        valueset.setReference(new ValueArray<>(data, String.class));
        valueset.setPublished(new ValueArray<>(data, String.class));
        valueset.setFormula(new ValueArray<>(data, String.class));

        this.scalarParameter.getValueSet().add(valueset);

        assertFalse(this.scalarParameter.canBePublished());

        List<String> updatedData = Arrays.asList("1");
        valueset.setManual(new ValueArray<>(updatedData, String.class));

        assertTrue(this.scalarParameter.canBePublished());
    }

    @Test
    void verifyThatWhenParameterIsNotPublishableGetToBePublishedReturnsFalse() {
        ParameterValueSet valueset = new ParameterValueSet(UUID.randomUUID(), null, null);
        List<String> data = Arrays.asList("-");
        valueset.setValueSwitch(ParameterSwitchKind.MANUAL);
        valueset.setManual(new ValueArray<>(data, String.class));
        valueset.setComputed(new ValueArray<>(data, String.class));
        valueset.setReference(new ValueArray<>(data, String.class));
        valueset.setPublished(new ValueArray<>(data, String.class));
        valueset.setFormula(new ValueArray<>(data, String.class));

        this.scalarParameter.getValueSet().add(valueset);

        this.scalarParameter.setToBePublished(true);

        assertFalse(this.scalarParameter.getToBePublished());
    }

    @Test
    void verifyThatWhenParameterIsPublishableGetToBePublishedReturnsTrue() {
        ParameterValueSet valueset = new ParameterValueSet(UUID.randomUUID(), null, null);
        List<String> data = Arrays.asList("-");
        List<String> manualData = Arrays.asList("1");
        valueset.setValueSwitch(ParameterSwitchKind.MANUAL);
        valueset.setManual(new ValueArray<>(manualData, String.class));
        valueset.setComputed(new ValueArray<>(data, String.class));
        valueset.setReference(new ValueArray<>(data, String.class));
        valueset.setPublished(new ValueArray<>(data, String.class));
        valueset.setFormula(new ValueArray<>(data, String.class));

        this.scalarParameter.getValueSet().add(valueset);

        assertFalse(this.scalarParameter.getToBePublished());

        this.scalarParameter.setToBePublished(true);

        assertTrue(this.scalarParameter.getToBePublished());
    }
}
