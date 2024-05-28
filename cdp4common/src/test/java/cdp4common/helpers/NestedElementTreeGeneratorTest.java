/*
 * NestedElementTreeGeneratorTest.java
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

package cdp4common.helpers;

import cdp4common.commondata.Thing;
import cdp4common.engineeringmodeldata.*;
import cdp4common.sitedirectorydata.DomainOfExpertise;
import cdp4common.sitedirectorydata.SimpleQuantityKind;
import cdp4common.types.CacheKey;
import cdp4common.types.ValueArray;
import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import com.google.common.collect.Iterables;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.net.URI;
import java.util.Arrays;
import java.util.Collection;
import java.util.UUID;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class NestedElementTreeGeneratorTest {
    private NestedElementTreeGenerator nestedElementTreeGenerator;
    private URI uri;
    private Cache<CacheKey, Thing> cache;
    private Iteration iteration;
    private DomainOfExpertise domainOfExpertise;


    @BeforeEach
    void setup() {
        this.nestedElementTreeGenerator = new NestedElementTreeGenerator();

        this.uri = URI.create("http://www.stariongroup.eu");
        this.cache = CacheBuilder.newBuilder().build();

        this.domainOfExpertise = new DomainOfExpertise(UUID.randomUUID(), this.cache, this.uri);
        this.domainOfExpertise.setShortName("SYS");
        this.domainOfExpertise.setName("System");

        this.iteration = new Iteration(UUID.randomUUID(), this.cache, this.uri);

        Option option_A = new Option(UUID.randomUUID(), this.cache, this.uri);
        option_A.setShortName("OPT_A");
        option_A.setName("Option A");

        Option option_B = new Option(UUID.randomUUID(), this.cache, this.uri);
        option_B.setShortName("OPT_B");
        option_B.setName("Option B");

        ElementDefinition elementDefinition_1 = new ElementDefinition(UUID.randomUUID(), this.cache, this.uri);
        elementDefinition_1.setShortName("Sat");
        elementDefinition_1.setName("Satellite");

        ElementDefinition elementDefinition_2 = new ElementDefinition(UUID.randomUUID(), this.cache, this.uri);
        elementDefinition_2.setShortName("Bat");
        elementDefinition_2.setName("Battery");

        ElementUsage elementUsage_1 = new ElementUsage(UUID.randomUUID(), this.cache, this.uri);
        elementUsage_1.setElementDefinition(elementDefinition_2);
        elementUsage_1.setShortName("bat_a");
        elementUsage_1.setName("battery a");

        ElementUsage elementUsage_2 = new ElementUsage(UUID.randomUUID(), this.cache, this.uri);
        elementUsage_2.setElementDefinition(elementDefinition_2);
        elementUsage_2.setShortName("bat_b");
        elementUsage_2.setName("battery b");

        SimpleQuantityKind simpleQuantityKind = new SimpleQuantityKind(UUID.randomUUID(), null, null);
        simpleQuantityKind.setShortName("m");

        Parameter parameter = new Parameter(UUID.randomUUID(), this.cache, this.uri);
        parameter.setOwner(this.domainOfExpertise);
        parameter.setParameterType(simpleQuantityKind);

        ParameterOverride parameterOverride = new ParameterOverride(UUID.randomUUID(), this.cache, this.uri);
        parameterOverride.setOwner(this.domainOfExpertise);
        parameterOverride.setParameter(parameter);

        ParameterValueSet parameterValueSet_1 = new ParameterValueSet();
        parameterValueSet_1.setActualOption(option_B);
        parameterValueSet_1.setIid(UUID.randomUUID());

        ParameterValueSet parameterValueSet_2 = new ParameterValueSet();
        parameterValueSet_2.setActualOption(option_A);
        parameterValueSet_2.setIid(UUID.randomUUID());

        List<String> values_1 = Arrays.asList("2");
        List<String> values_2 = Arrays.asList("3");

        ParameterOverrideValueSet overrideValueSet = new ParameterOverrideValueSet();
        overrideValueSet.setParameterValueSet(parameterValueSet_1);
        overrideValueSet.setIid(UUID.randomUUID());

        this.iteration.getOption().add(option_A);
        this.iteration.getOption().add(option_B);
        this.iteration.setDefaultOption(option_A);

        parameterValueSet_1.setManual(new ValueArray<String>(values_1, String.class));
        parameterValueSet_1.setReference(new ValueArray<String>(values_1, String.class));
        parameterValueSet_1.setComputed(new ValueArray<String>(values_1, String.class));
        parameterValueSet_1.setFormula(new ValueArray<String>(values_1, String.class));
        parameterValueSet_1.setValueSwitch(ParameterSwitchKind.MANUAL);

        parameterValueSet_2.setManual(new ValueArray<String>(values_2, String.class));
        parameterValueSet_2.setReference(new ValueArray<String>(values_2, String.class));
        parameterValueSet_2.setComputed(new ValueArray<String>(values_2, String.class));
        parameterValueSet_2.setFormula(new ValueArray<String>(values_2, String.class));
        parameterValueSet_2.setValueSwitch(ParameterSwitchKind.MANUAL);

        overrideValueSet.setManual(new ValueArray<String>(values_1, String.class));
        overrideValueSet.setReference(new ValueArray<String>(values_1, String.class));
        overrideValueSet.setComputed(new ValueArray<String>(values_1, String.class));
        overrideValueSet.setFormula(new ValueArray<String>(values_1, String.class));
        overrideValueSet.setValueSwitch(ParameterSwitchKind.MANUAL);

        parameter.getValueSet().add(parameterValueSet_1);
        parameter.getValueSet().add(parameterValueSet_2);
        parameterOverride.getValueSet().add(overrideValueSet);

        elementUsage_1.getExcludeOption().add(option_A);
        elementUsage_1.getParameterOverride().add(parameterOverride);

        elementDefinition_1.getParameter().add(parameter);
        elementDefinition_1.getContainedElement().add(elementUsage_1);
        elementDefinition_1.getContainedElement().add(elementUsage_2);
        elementDefinition_2.getParameter().add(parameter);

        this.iteration.getElement().add(elementDefinition_1);
        this.iteration.getElement().add(elementDefinition_2);
        this.iteration.setTopElement(elementDefinition_1);
    }

    @Test
    void verify_that_null_arguments_throws_exception() {
        Option option = this.iteration.getOption().get(0);
        assertThrows(NullPointerException.class, () -> this.nestedElementTreeGenerator.generate(null, null, false));
        assertThrows(NullPointerException.class, () -> this.nestedElementTreeGenerator.generate(option, null, false));
        assertThrows(NullPointerException.class, () -> this.nestedElementTreeGenerator.getNestedParameters(option, null, false));
        assertThrows(NullPointerException.class, () -> this.nestedElementTreeGenerator.getNestedParameters(null, null, false));
        assertThrows(NullPointerException.class, () -> this.nestedElementTreeGenerator.getNestedParameters(null, this.domainOfExpertise, false));
    }

    @Test
    void verify_that_excluded_usage_option_a_does_not_get_generated_as_nested_element() {
        Option option = Iterables.getOnlyElement(this.iteration.getOption().stream().filter(x -> x.getShortName().equals("OPT_A")).collect(Collectors.toList()));

        Collection<NestedElement> nestedElements = this.nestedElementTreeGenerator.generate(option, this.domainOfExpertise, false);

        for (NestedElement nestedElement : nestedElements) {
            System.out.println(nestedElement.getShortName());
        }

        assertEquals(2, nestedElements.size());
    }

    @Test
    void verify_that_excluded_usage_option_a_does_not_get_generated_as_nested_element_if_option_is_a_cloned_object() {
        Option option = Iterables.getOnlyElement(this.iteration.getOption().stream().filter(x -> x.getShortName().equals("OPT_A")).collect(Collectors.toList()));
        Option optionClone = option.clone(false);

        Collection<NestedElement> nestedElements = this.nestedElementTreeGenerator.generate(optionClone, this.domainOfExpertise, false);

        for (NestedElement nestedElement : nestedElements) {
            System.out.println(nestedElement.getShortName());
        }

        assertEquals(2, nestedElements.size());
    }

    @Test
    void verify_that_excluded_usage_from_a_In_option_b_get_generated_as_nested_element() {
        Option option = Iterables.getOnlyElement(this.iteration.getOption().stream().filter(x -> x.getShortName().equals("OPT_B")).collect(Collectors.toList()));

        Collection<NestedElement> nestedElements = this.nestedElementTreeGenerator.generate(option, this.domainOfExpertise, false);

        for (NestedElement nestedElement : nestedElements) {
            System.out.println(nestedElement.getShortName());
        }

        assertEquals(3, nestedElements.size());
    }

    @Test
    void verify_that_the_function_returns_values() {
        Option option = Iterables.getOnlyElement(this.iteration.getOption().stream().filter(x -> x.getShortName().equals("OPT_A")).collect(Collectors.toList()));
        List<NestedParameter> flatNestedParameters = this.nestedElementTreeGenerator.getNestedParameters(option, this.domainOfExpertise, false);

        assertTrue(flatNestedParameters.size() > 0);
    }

    @Test
    void verify_that_Path_returns_value_for_Each_NestedElement_and_NestedParameter() {
        Option option = Iterables.getOnlyElement(this.iteration.getOption().stream().filter(x -> x.getShortName().equals("OPT_A")).collect(Collectors.toList()));
        List<NestedParameter> flatNestedParameters = this.nestedElementTreeGenerator.getNestedParameters(option, this.domainOfExpertise, false);

        for (NestedParameter nestedParameter : flatNestedParameters) {
            assertDoesNotThrow(() -> nestedParameter.getPath());
        }
    }

    @Test
    void verify_that_Option_is_set_on_NestedElement_and_NestedParameter() {
        Option option = Iterables.getOnlyElement(this.iteration.getOption().stream().filter(x -> x.getShortName().equals("OPT_A")).collect(Collectors.toList()));

        Collection<NestedElement> nestedElements = this.nestedElementTreeGenerator.generate(option, this.domainOfExpertise, false);

        for (NestedElement nestedElement : nestedElements) {
            assertEquals(option, nestedElement.getContainer());

            for (NestedParameter nestedParameter : nestedElement.getNestedParameter()) {
                assertEquals(option, nestedParameter.getOption());
            }
        }
    }

    @Test
    void verify_that_ValueSet_is_set_on_NestedElement_and_NestedParameter() {
        Option option = Iterables.getOnlyElement(this.iteration.getOption().stream().filter(x -> x.getShortName().equals("OPT_A")).collect(Collectors.toList()));

        List<NestedParameter> NestedParameters = this.nestedElementTreeGenerator.getNestedParameters(option, this.domainOfExpertise, false);

        for (NestedParameter nestedParameter : NestedParameters) {
            assertNotNull(nestedParameter.getValueSet());
        }
    }
}
