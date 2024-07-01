/*
 * DecompositionRuleTest.java
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

package cdp4common.sitedirectorydata;

import cdp4common.commondata.Thing;
import cdp4common.engineeringmodeldata.*;
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

class DecompositionRuleTest {
    private URI uri;
    private Cache<CacheKey, Thing> cache;
    private Iteration iteration;

    private Category systemCategory;
    private Category productCategory;
    private Category equipmentCategory;
    private Category batteryCategory;
    private Category lithiumBatteryCategory;

    private Category functionCategory;
    private Category powerStorageCategory;
    private Category electricalPowerStorageCategory;

    @BeforeEach
    void setup() {
        this.uri = URI.create("http://www.stariongroup.eu");
        this.cache = CacheBuilder.newBuilder().build();

        this.createCategories();

        this.iteration = new Iteration(UUID.randomUUID(), this.cache, this.uri);
    }

    /**
     * instantiate categories
     */
    private void createCategories() {
        this.systemCategory = new Category(UUID.randomUUID(), this.cache, this.uri);
        this.systemCategory.setShortName("SYS");
        this.systemCategory.setName("System");
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
        this.functionCategory = new Category(UUID.randomUUID(), this.cache, this.uri);
        this.functionCategory.setShortName("FUNC");
        this.functionCategory.setName("Function");
        this.powerStorageCategory = new Category(UUID.randomUUID(), this.cache, this.uri);
        this.powerStorageCategory.setShortName("POWSTORE");
        this.powerStorageCategory.setName("Power Storage");
        this.electricalPowerStorageCategory = new Category(UUID.randomUUID(), this.cache, this.uri);
        this.electricalPowerStorageCategory.setShortName("ELECPOWSTORE");
        this.electricalPowerStorageCategory.setName("Electrical Power Storage");

        this.lithiumBatteryCategory.getSuperCategory().add(this.batteryCategory);
        this.batteryCategory.getSuperCategory().add(this.equipmentCategory);
        this.equipmentCategory.getSuperCategory().add(this.productCategory);

        this.electricalPowerStorageCategory.getSuperCategory().add(this.powerStorageCategory);
        this.powerStorageCategory.getSuperCategory().add(this.functionCategory);
        this.functionCategory.getSuperCategory().add(this.systemCategory);

        this.cache.put(new CacheKey(this.productCategory.getIid(), null), this.productCategory);

        this.cache.put(new CacheKey(this.equipmentCategory.getIid(), null), this.equipmentCategory);

        this.cache.put(new CacheKey(this.batteryCategory.getIid(), null), this.batteryCategory);

        this.cache.put(new CacheKey(this.lithiumBatteryCategory.getIid(), null), this.lithiumBatteryCategory);

        this.cache.put(new CacheKey(this.functionCategory.getIid(), null), this.functionCategory);

        this.cache.put(new CacheKey(this.powerStorageCategory.getIid(), null), this.powerStorageCategory);

        this.cache.put(new CacheKey(this.electricalPowerStorageCategory.getIid(), null), this.electricalPowerStorageCategory);
    }

    @Test
    void verifyThatNullIterationThrowsArgumentException() {
        DecompositionRule rule = new DecompositionRule(UUID.randomUUID(), this.cache, this.uri);
        assertThrows(NullPointerException.class, () -> rule.verify(null));
    }

    @Test
    void verifyThatIfTheIterationContainsNoBinaryRelationShipsAnEmptyResultIsReturned() {
        DecompositionRule rule = new DecompositionRule(UUID.randomUUID(), this.cache, this.uri);

        MultiRelationship multiRelationship = new MultiRelationship(UUID.randomUUID(), this.cache, this.uri);
        this.iteration.getRelationship().add(multiRelationship);

        List<RuleViolation> violations = rule.verify(this.iteration);
        assertTrue(violations.isEmpty());
    }

    @Test
    void verifyThatIfThereAreNoElementDefinitionsContainedByAnITerationAnEmptyResultIsReturned() {
        DecompositionRule rule = new DecompositionRule(UUID.randomUUID(), this.cache, this.uri);

        assertTrue(this.iteration.getElement().isEmpty());

        List<RuleViolation> violations = rule.verify(this.iteration);

        assertTrue(violations.isEmpty());
    }

    @Test
    void verifyThatIfRuleIsViolatedExpectedViolationsAreReturned() {
        DecompositionRule rule = new DecompositionRule(UUID.randomUUID(), this.cache, this.uri);
        rule.setContainingCategory(this.systemCategory);

        rule.getContainedCategory().add(this.functionCategory);
        rule.getContainedCategory().add(this.productCategory);

        ElementDefinition spaceMissionElementDefinition = new ElementDefinition(UUID.randomUUID(), this.cache, this.uri);
        spaceMissionElementDefinition.setShortName("SpaceMission");
        spaceMissionElementDefinition.setName("Space Mission");

        spaceMissionElementDefinition.getCategory().add(this.systemCategory);

        ElementDefinition satelliteElementDefinition = new ElementDefinition(UUID.randomUUID(), this.cache, this.uri);
        satelliteElementDefinition.setShortName("SAT");
        satelliteElementDefinition.setName("satellite");
        satelliteElementDefinition.getCategory().add(this.systemCategory);

        ElementUsage satelliteElementUsage = new ElementUsage(UUID.randomUUID(), this.cache, this.uri);
        satelliteElementUsage.setElementDefinition(satelliteElementDefinition);

        spaceMissionElementDefinition.getContainedElement().add(satelliteElementUsage);

        this.iteration.getElement().add(spaceMissionElementDefinition);
        this.iteration.getElement().add(satelliteElementDefinition);

        List<RuleViolation> violations = rule.verify(this.iteration);

        RuleViolation violation = Iterables.getOnlyElement(violations, null);

        assertNotNull(violation);

        assertTrue(violation.getDescription().contains("of an incorrect type"));

        assertTrue(violation.getViolatingThing().contains(spaceMissionElementDefinition.getIid()));
        assertTrue(violation.getViolatingThing().contains(satelliteElementUsage.getIid()));
    }

    @Test
    void verifyThatIfDecompositionIsSatisfiedButMinContainedNotViolationIsReturned() {
        DecompositionRule rule = new DecompositionRule(UUID.randomUUID(), this.cache, this.uri);
        rule.setContainingCategory(this.systemCategory);
        rule.getContainedCategory().add(this.productCategory);
        rule.setMinContained(2);

        ElementDefinition satelliteElementDefinition = new ElementDefinition(UUID.randomUUID(), this.cache, this.uri);
        satelliteElementDefinition.setShortName("SAT");
        satelliteElementDefinition.setName("satellite");

        satelliteElementDefinition.getCategory().add(this.systemCategory);
        this.iteration.getElement().add(satelliteElementDefinition);

        ElementDefinition batteryElementDefinition = new ElementDefinition(UUID.randomUUID(), this.cache, this.uri);
        batteryElementDefinition.setShortName("BAT");
        batteryElementDefinition.setName("Battery");

        batteryElementDefinition.getCategory().add(this.productCategory);
        this.iteration.getElement().add(batteryElementDefinition);

        ElementUsage batteryUsage = new ElementUsage(UUID.randomUUID(), this.cache, this.uri);
        batteryUsage.setShortName("bat_1");
        batteryUsage.setName("battery 1");

        batteryUsage.setElementDefinition(batteryElementDefinition);

        satelliteElementDefinition.getContainedElement().add(batteryUsage);

        List<RuleViolation> violations = rule.verify(this.iteration);
        assertEquals(1, violations.size());

        RuleViolation violation = Iterables.getOnlyElement(violations);

        assertTrue(violation.getDescription().contains("does not contain the minimum of 2"));
    }

    @Test
    void verifyThatIfDecompositionIsSatisfiedButMaxContainedNotViolationIsReturned() {
        DecompositionRule rule = new DecompositionRule(UUID.randomUUID(), this.cache, this.uri);
        rule.setContainingCategory(this.systemCategory);
        rule.getContainedCategory().add(this.productCategory);
        rule.setMinContained(1);
        rule.setMaxContained(2);

        ElementDefinition satelliteElementDefinition = new ElementDefinition(UUID.randomUUID(), this.cache, this.uri);
        satelliteElementDefinition.setShortName("SAT");
        satelliteElementDefinition.setName("satellite");

        satelliteElementDefinition.getCategory().add(this.systemCategory);
        this.iteration.getElement().add(satelliteElementDefinition);

        ElementDefinition batteryElementDefinition = new ElementDefinition(UUID.randomUUID(), this.cache, this.uri);
        batteryElementDefinition.setShortName("BAT");
        batteryElementDefinition.setName("Battery");

        batteryElementDefinition.getCategory().add(this.productCategory);
        this.iteration.getElement().add(batteryElementDefinition);

        ElementUsage batteryUsage1 = new ElementUsage(UUID.randomUUID(), this.cache, this.uri);
        batteryUsage1.setShortName("bat_1");
        batteryUsage1.setName("battery 1");

        batteryUsage1.setElementDefinition(batteryElementDefinition);
        satelliteElementDefinition.getContainedElement().add(batteryUsage1);

        ElementUsage batteryUsage2 = new ElementUsage(UUID.randomUUID(), this.cache, this.uri);
        batteryUsage2.setShortName("bat_2");
        batteryUsage2.setName("battery 2");

        batteryUsage2.setElementDefinition(batteryElementDefinition);
        satelliteElementDefinition.getContainedElement().add(batteryUsage2);

        ElementUsage batteryUsage3 = new ElementUsage(UUID.randomUUID(), this.cache, this.uri);
        batteryUsage3.setShortName("bat_3");
        batteryUsage3.setName("battery 3");

        batteryUsage3.setElementDefinition(batteryElementDefinition);
        satelliteElementDefinition.getContainedElement().add(batteryUsage3);

        List<RuleViolation> violations = rule.verify(this.iteration);
        assertEquals(1, violations.size());

        RuleViolation violation = Iterables.getOnlyElement(violations);

        assertTrue(violation.getDescription().contains("contains more Element Usages than the maximum of 2"));
    }

    @Test
    void verifyThatIfNoDecompositionRuleIsViolatedNoViolationsAreReturned() {
        DecompositionRule rule = new DecompositionRule(UUID.randomUUID(), this.cache, this.uri);
        rule.setContainingCategory(this.systemCategory);
        rule.getContainedCategory().add(this.functionCategory);
        rule.setMinContained(1);
        rule.setMaxContained(2);

        ElementDefinition satellite = new ElementDefinition(UUID.randomUUID(), this.cache, this.uri);
        satellite.getCategory().add(this.systemCategory);
        this.iteration.getElement().add(satellite);

        ElementDefinition electricalStorage = new ElementDefinition(UUID.randomUUID(), this.cache, this.uri);
        electricalStorage.getCategory().add(this.electricalPowerStorageCategory);
        this.iteration.getElement().add(electricalStorage);

        ElementUsage elementUsage = new ElementUsage(UUID.randomUUID(), this.cache, this.uri);
        elementUsage.setElementDefinition(electricalStorage);
        satellite.getContainedElement().add(elementUsage);

        List<RuleViolation> violations = rule.verify(this.iteration);

        assertTrue(violations.isEmpty());
    }
}
