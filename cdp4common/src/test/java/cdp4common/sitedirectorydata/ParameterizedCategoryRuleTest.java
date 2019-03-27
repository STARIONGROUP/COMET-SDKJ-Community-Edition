/*
 * ParameterizedCategoryRuleTest.java
 *
 * Copyright (c) 2015-2019 RHEA System S.A.
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

package cdp4common.sitedirectorydata;

import cdp4common.commondata.Thing;
import cdp4common.engineeringmodeldata.ElementDefinition;
import cdp4common.engineeringmodeldata.Iteration;
import cdp4common.engineeringmodeldata.Parameter;
import cdp4common.engineeringmodeldata.RuleViolation;
import cdp4common.types.CacheKey;
import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import com.google.common.collect.Iterables;
import org.apache.commons.lang3.tuple.Pair;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.net.URI;
import java.util.List;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

class ParameterizedCategoryRuleTest {
    private URI uri;
    private Cache<CacheKey, Thing> cache;
    private Iteration iteration;

    private Category productCategory;
    private Category equipmentCategory;
    private Category batteryCategory;
    private Category lithiumBatteryCategory;

    private TextParameterType textParameterType;
    private SimpleQuantityKind simpleQuantityKind;

    @BeforeEach
    void setup() {
        this.uri = URI.create("http://www.rheagroup.com");
        this.cache = CacheBuilder.newBuilder().build();

        this.сreateCategories();

        this.textParameterType = new TextParameterType(UUID.randomUUID(), this.cache, this.uri);
        this.textParameterType.setShortName("TXT");
        this.simpleQuantityKind = new SimpleQuantityKind(UUID.randomUUID(), this.cache, this.uri);
        this.simpleQuantityKind.setShortName("SIMPLE");

        this.iteration = new Iteration(UUID.randomUUID(), this.cache, this.uri);
    }

    /**
     * instantiate categories
     */
    private void сreateCategories() {
        this.productCategory = new Category(UUID.randomUUID(), this.cache, this.uri);
        this.productCategory.setShortName("PROD");
        this.productCategory.setName("Product");

        this.equipmentCategory = new Category(UUID.randomUUID(), this.cache, this.uri);
        this.equipmentCategory.setShortName("EQT");
        this.equipmentCategory.setName("Equipment");

        this.batteryCategory = new Category(UUID.randomUUID(), this.cache, this.uri);
        this.batteryCategory.setShortName("BAT");
        this.batteryCategory.setName("Battery");

        this.lithiumBatteryCategory = new Category(UUID.randomUUID(), this.cache, this.uri);
        this.lithiumBatteryCategory.setShortName("LITBAT");
        this.lithiumBatteryCategory.setName("Lithium Battery");

        this.lithiumBatteryCategory.getSuperCategory().add(this.batteryCategory);
        this.batteryCategory.getSuperCategory().add(this.equipmentCategory);
        this.equipmentCategory.getSuperCategory().add(this.productCategory);

        this.cache.put(new CacheKey(this.productCategory.getIid(), null), this.productCategory);

        this.cache.put(new CacheKey(this.equipmentCategory.getIid(), null), this.equipmentCategory);

        this.cache.put(new CacheKey(this.batteryCategory.getIid(), null), this.batteryCategory);

        this.cache.put(new CacheKey(this.lithiumBatteryCategory.getIid(), null), this.lithiumBatteryCategory);
    }

    @Test
    void verifyThatNullIterationThrowsException() {
        ParameterizedCategoryRule rule = new ParameterizedCategoryRule(UUID.randomUUID(), this.cache, this.uri);
        assertThrows(NullPointerException.class, () -> rule.verify(null));
    }

    @Test
    void verifyThatIfCategoryNotSetOnRuleExceptionIsThrown() {
        ParameterizedCategoryRule rule = new ParameterizedCategoryRule(UUID.randomUUID(), this.cache, this.uri);
        assertThrows(IllegalArgumentException.class, () -> rule.verify(this.iteration));
    }

    @Test
    void verifyThatIfNoElementDefinitionsAreContainedByIterationNoViolationIsReturned() {
        ParameterizedCategoryRule rule = new ParameterizedCategoryRule(UUID.randomUUID(), this.cache, this.uri);
        rule.setCategory(this.productCategory);

        List<RuleViolation> violations = rule.verify(this.iteration);

        assertEquals(0, violations.size());
    }

    @Test
    void verifyThatIfNoParameterTypesSpecifiedNoViolationIsReturned() {
        ParameterizedCategoryRule rule = new ParameterizedCategoryRule(UUID.randomUUID(), this.cache, this.uri);
        rule.setCategory(this.productCategory);

        ElementDefinition elementDefinition = new ElementDefinition(UUID.randomUUID(), this.cache, this.uri);
        elementDefinition.setShortName("BAT");
        elementDefinition.setName("Battery");

        elementDefinition.getCategory().add(this.batteryCategory);
        this.iteration.getElement().add(elementDefinition);

        List<RuleViolation> violations = rule.verify(this.iteration);

        assertEquals(0, violations.size());
    }

    @Test
    void verifyThatIfElementDefinitionIsCategprizedAndParametersAreMissionAViolationIsReturned() {
        ParameterizedCategoryRule rule = new ParameterizedCategoryRule(UUID.randomUUID(), this.cache, this.uri);
        rule.setCategory(this.productCategory);
        rule.getParameterType().add(this.textParameterType);
        rule.getParameterType().add(this.simpleQuantityKind);

        ElementDefinition elementDefinition = new ElementDefinition(UUID.randomUUID(), this.cache, this.uri);
        elementDefinition.setShortName("BAT");
        elementDefinition.setName("Battery");
        elementDefinition.getCategory().add(this.batteryCategory);
        this.iteration.getElement().add(elementDefinition);

        List<RuleViolation> violations = rule.verify(this.iteration);

        assertFalse(violations.isEmpty());

        RuleViolation violation = Iterables.getOnlyElement(violations);
        assertTrue(violation.getViolatingThing().contains(elementDefinition.getIid()));

        assertTrue(violation.getDescription().contains("does not contain parameters that reference the following parameter types"));
    }

    @Test
    void verifyThatIfElementDefinitionContainsCorrectParametersNoViolationIsReturned() {
        ParameterizedCategoryRule rule = new ParameterizedCategoryRule(UUID.randomUUID(), this.cache, this.uri);
        rule.setCategory(this.productCategory);
        rule.getParameterType().add(this.textParameterType);
        rule.getParameterType().add(this.simpleQuantityKind);

        ElementDefinition elementDefinition = new ElementDefinition(UUID.randomUUID(), this.cache, this.uri);
        elementDefinition.setShortName("BAT");
        elementDefinition.setName("Battery");

        Parameter textParameter = new Parameter(UUID.randomUUID(), this.cache, this.uri);
        textParameter.setParameterType(this.textParameterType);
        Parameter simpleParameter = new Parameter(UUID.randomUUID(), this.cache, this.uri);
        simpleParameter.setParameterType(simpleQuantityKind);

        elementDefinition.getParameter().add(textParameter);
        elementDefinition.getParameter().add(simpleParameter);

        elementDefinition.getCategory().add(this.batteryCategory);
        this.iteration.getElement().add(elementDefinition);

        List<RuleViolation> violations = rule.verify(this.iteration);

        assertTrue(violations.isEmpty());
    }
}
