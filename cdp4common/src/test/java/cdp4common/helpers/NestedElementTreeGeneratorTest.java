/* --------------------------------------------------------------------------------------------------------------------
 *    NestedElementTreeGeneratorTest.java
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

package cdp4common.helpers;

import cdp4common.commondata.Thing;
import cdp4common.engineeringmodeldata.*;
import cdp4common.sitedirectorydata.DomainOfExpertise;
import cdp4common.types.CacheKey;
import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import com.google.common.collect.Iterables;
import org.apache.commons.lang3.tuple.Pair;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.net.URI;
import java.util.Collection;
import java.util.UUID;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class NestedElementTreeGeneratorTest {
    private NestedElementTreeGenerator nestedElementTreeGenerator;
    private URI uri;
    private Cache<CacheKey, Thing> cache;
    private Iteration iteration;
    private DomainOfExpertise domainOfExpertise;


    @BeforeEach
    void setup() {
        this.nestedElementTreeGenerator = new NestedElementTreeGenerator();

        this.uri = URI.create("http://www.rheagroup.com");
        this.cache = CacheBuilder.newBuilder().build();

        this.domainOfExpertise = new DomainOfExpertise(UUID.randomUUID(), this.cache, this.uri);
        this.domainOfExpertise.setShortName("SYS");
        this.domainOfExpertise.setName("System");

        this.iteration = new Iteration(UUID.randomUUID(), this.cache, this.uri);

        Option option_A = new Option(UUID.randomUUID(), this.cache, this.uri);
        option_A.setShortName("OPT_A");
        option_A.setName("Option A");

        this.iteration.getOption().add(option_A);
        this.iteration.setDefaultOption(option_A);

        Option option_B = new Option(UUID.randomUUID(), this.cache, this.uri);
        option_B.setShortName("OPT_B");
        option_B.setName("Option B");

        this.iteration.getOption().add(option_B);

        ElementDefinition satellite = new ElementDefinition(UUID.randomUUID(), this.cache, this.uri);
        satellite.setShortName("Sat");
        satellite.setName("Satellite");

        this.iteration.getElement().add(satellite);
        this.iteration.setTopElement(satellite);

        ElementDefinition battery = new ElementDefinition(UUID.randomUUID(), this.cache, this.uri);
        battery.setShortName("Bat");
        battery.setName("Battery");

        this.iteration.getElement().add(battery);

        ElementUsage battery_a = new ElementUsage(UUID.randomUUID(), this.cache, this.uri);
        battery_a.setElementDefinition(battery);
        battery_a.setShortName("bat_a");
        battery_a.setName("battery a");

        satellite.getContainedElement().add(battery_a);

        ElementUsage battery_b = new ElementUsage(UUID.randomUUID(), this.cache, this.uri);
        battery_b.setElementDefinition(battery);
        battery_b.setShortName("bat_b");
        battery_b.setName("battery b");

        battery_b.getExcludeOption().add(option_A);

        satellite.getContainedElement().add(battery_b);
    }

    @Test
    void verify_that_null_arguments_throws_exception() {
        assertThrows(NullPointerException.class, () -> this.nestedElementTreeGenerator.generate(null, null));

        Option option = this.iteration.getOption().get(0);
        assertThrows(NullPointerException.class, () -> this.nestedElementTreeGenerator.generate(option, null));
    }

    @Test
    void verify_that_excluded_usage_option_a_does_not_get_generated_as_nested_element() {
        Option option = Iterables.getOnlyElement(this.iteration.getOption().stream().filter(x -> x.getShortName().equals("OPT_A")).collect(Collectors.toList()));

        Collection<NestedElement> nestedElements = this.nestedElementTreeGenerator.generate(option, this.domainOfExpertise);

        for (NestedElement nestedElement : nestedElements) {
            System.out.println(nestedElement.getShortName());
        }

        assertEquals(2, nestedElements.size());
    }

    @Test
    void verify_that_excluded_usage_option_a_does_not_get_generated_as_nested_element_if_option_is_a_cloned_object() {
        Option option = Iterables.getOnlyElement(this.iteration.getOption().stream().filter(x -> x.getShortName().equals("OPT_A")).collect(Collectors.toList()));
        Option optionClone = option.clone(false);

        Collection<NestedElement> nestedElements = this.nestedElementTreeGenerator.generate(optionClone, this.domainOfExpertise);

        for (NestedElement nestedElement : nestedElements) {
            System.out.println(nestedElement.getShortName());
        }

        assertEquals(2, nestedElements.size());
    }

    @Test
    void verify_that_excluded_usage_from_a_In_option_b_get_generated_as_nested_element() {
        Option option = Iterables.getOnlyElement(this.iteration.getOption().stream().filter(x -> x.getShortName().equals("OPT_B")).collect(Collectors.toList()));

        Collection<NestedElement> nestedElements = this.nestedElementTreeGenerator.generate(option, this.domainOfExpertise);

        for (NestedElement nestedElement : nestedElements) {
            System.out.println(nestedElement.getShortName());
        }

        assertEquals(3, nestedElements.size());
    }
}
