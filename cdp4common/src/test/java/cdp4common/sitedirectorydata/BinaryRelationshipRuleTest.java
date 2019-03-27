/*
 * BinaryRelationshipRuleTest.java
 *
 * Copyright (c) 2015-2019 RHEA System S.A.

 * Author: Alex Vorobiev, Yevhen Ikonnykov, Sam Gerené

 * This file is part of CDP4-SDKJ Community Edition

 * The CDP4-SDKJ Community Edition is free software; you can redistribute it and/or
 *  modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.

 * The CDP4-SDKJ Community Edition is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.

 * You should have received a copy of the GNU Lesser General Public License
 * along with this program; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 */

package cdp4common.sitedirectorydata;

import cdp4common.commondata.Alias;
import cdp4common.commondata.Thing;
import cdp4common.engineeringmodeldata.*;
import cdp4common.types.CacheKey;
import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import com.google.common.collect.MoreCollectors;
import org.apache.commons.lang3.tuple.Pair;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.net.URI;
import java.util.Collection;
import java.util.List;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

class BinaryRelationshipRuleTest {
    private URI uri;
    private Cache<CacheKey, Thing> cache;
    private Iteration iteration;

    private Category productCategory;
    private Category equipmentCategory;
    private Category batteryCategory;
    private Category lithiumBatteryCategory;

    @BeforeEach
    void setup() {
        this.uri = URI.create("http://www.rheagroup.com");
        this.cache = CacheBuilder.newBuilder().build();

        this.createCategories();

        this.iteration = new Iteration(UUID.randomUUID(), this.cache, this.uri);
    }

    /**
     * instantiate categories
     */
    private void createCategories() {
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
        BinaryRelationshipRule rule = new BinaryRelationshipRule(UUID.randomUUID(), this.cache, this.uri);
        assertThrows(NullPointerException.class, () -> rule.verify(null));
    }

    @Test
    void verifyThatIfTheIterationContainsNoBinaryRelationShipsAnEmptyResultIsReturned() {
        BinaryRelationshipRule rule = new BinaryRelationshipRule(UUID.randomUUID(), this.cache, this.uri);

        MultiRelationship multiRelationship = new MultiRelationship(UUID.randomUUID(), this.cache, this.uri);
        this.iteration.getRelationship().add(multiRelationship);

        List<RuleViolation> violations = rule.verify(this.iteration);
        assertEquals(0, violations.size());
    }

    @Test
    void verifyThatIfRelationshipRuleDoesNotHaveRelationshipCategorySetThatNoViolationsAreReturned() {
        BinaryRelationshipRule rule = new BinaryRelationshipRule(UUID.randomUUID(), this.cache, this.uri);
        BinaryRelationship binaryRelationShip = new BinaryRelationship(UUID.randomUUID(), this.cache, this.uri);
        this.iteration.getRelationship().add(binaryRelationShip);

        List<RuleViolation> violations = rule.verify(this.iteration);

        assertEquals(0, violations.size());
    }

    @Test
    void verifyThatIfSourceOrTargetIsNotCategorizableViolationIsCreated() {
        Category relationshipCategory = new Category(UUID.randomUUID(), this.cache, this.uri);
        relationshipCategory.setShortName("link");
        relationshipCategory.setName("a link");

        BinaryRelationshipRule rule = new BinaryRelationshipRule(UUID.randomUUID(), this.cache, this.uri);
        rule.setShortName("BinRule");
        rule.setName("Binary Relationship Rule");
        rule.setRelationshipCategory(relationshipCategory);

        Alias sourceAlias = new Alias(UUID.randomUUID(), this.cache, this.uri);
        Alias targetAlias = new Alias(UUID.randomUUID(), this.cache, this.uri);
        BinaryRelationship binaryRelationship = new BinaryRelationship(UUID.randomUUID(), this.cache, this.uri);
        binaryRelationship.setSource(sourceAlias);
        binaryRelationship.setTarget(targetAlias);

        binaryRelationship.getCategory().add(relationshipCategory);

        this.iteration.getRelationship().add(binaryRelationship);

        List<RuleViolation> violations = rule.verify(this.iteration);
        assertFalse(violations.isEmpty());

        RuleViolation sourceViolation = violations.stream().filter(x -> x.getViolatingThing().contains(binaryRelationship.getIid()) && x.getDescription().contains("The Source")).collect(MoreCollectors.onlyElement());
        assertNotNull(sourceViolation);
        System.out.println(sourceViolation.getDescription());

        RuleViolation targetViolation = violations.stream().filter(x -> x.getViolatingThing().contains(binaryRelationship.getIid()) && x.getDescription().contains("The Target")).collect(MoreCollectors.onlyElement());
        assertNotNull(targetViolation);
        System.out.println(targetViolation.getDescription());
    }

    @Test
    void verifyThatIfRuleIsViolatedViolationsAreReturned() {
        Category relationshipCategory = new Category(UUID.randomUUID(), this.cache, this.uri);
        relationshipCategory.setShortName("link");
        relationshipCategory.setName("a link");

        Category sourceAndTargetCategory = new Category(UUID.randomUUID(), this.cache, this.uri);
        sourceAndTargetCategory.setShortName("SOURCEANDTARGET");

        this.cache.put(new CacheKey(sourceAndTargetCategory.getIid(), null), sourceAndTargetCategory);

        BinaryRelationshipRule rule = new BinaryRelationshipRule(UUID.randomUUID(), this.cache, this.uri);
        rule.setShortName("BinRule");
        rule.setName("Binary Relationship Rule");
        rule.setRelationshipCategory(relationshipCategory);

        rule.setSourceCategory(sourceAndTargetCategory);
        rule.setTargetCategory(sourceAndTargetCategory);

        ElementDefinition elementDefinitionBattery1 = new ElementDefinition(UUID.randomUUID(), this.cache, this.uri);
        ElementDefinition elementDefinitionBattery2 = new ElementDefinition(UUID.randomUUID(), this.cache, this.uri);
        BinaryRelationship binaryRelationship = new BinaryRelationship(UUID.randomUUID(), this.cache, this.uri);
        binaryRelationship.setSource(elementDefinitionBattery1);
        binaryRelationship.setTarget(elementDefinitionBattery2);

        binaryRelationship.getCategory().add(relationshipCategory);
        this.iteration.getRelationship().add(binaryRelationship);

        List<RuleViolation> violations = rule.verify(this.iteration);

        assertFalse(violations.isEmpty());

        RuleViolation sourceViolation = violations.stream().filter(x -> x.getViolatingThing().contains(binaryRelationship.getIid()) && x.getDescription().contains("The Source")).collect(MoreCollectors.onlyElement());
        assertNotNull(sourceViolation);
        assertTrue(sourceViolation.getViolatingThing().contains(elementDefinitionBattery1.getIid()));
        System.out.println(sourceViolation.getDescription());

        RuleViolation targetViolation = violations.stream().filter(x -> x.getViolatingThing().contains(binaryRelationship.getIid()) && x.getDescription().contains("The Target")).collect(MoreCollectors.onlyElement());
        assertNotNull(targetViolation);
        assertTrue(targetViolation.getViolatingThing().contains(elementDefinitionBattery2.getIid()));
        System.out.println(targetViolation.getDescription());
    }

    @Test
    void verifyThatGetRequiredRdlsReturnsExpectedResults() {
        SiteReferenceDataLibrary srdl1 = new SiteReferenceDataLibrary(UUID.randomUUID(), this.cache, this.uri);
        SiteReferenceDataLibrary srdl1_1 = new SiteReferenceDataLibrary(UUID.randomUUID(), this.cache, this.uri);
        SiteReferenceDataLibrary mrdl = new SiteReferenceDataLibrary(UUID.randomUUID(), this.cache, this.uri);
        SiteReferenceDataLibrary srdl2 = new SiteReferenceDataLibrary(UUID.randomUUID(), this.cache, this.uri);

        BinaryRelationshipRule rule = new BinaryRelationshipRule(UUID.randomUUID(), this.cache, this.uri);

        srdl1_1.setRequiredRdl(srdl1);
        mrdl.setRequiredRdl(srdl1_1);
        srdl2.setRequiredRdl(srdl1);

        mrdl.getRule().add(rule);

        Collection<ReferenceDataLibrary> requiredRdls = rule.getRequiredRdls();

        assertTrue(requiredRdls.contains(mrdl));
        assertTrue(requiredRdls.contains(srdl1_1));
        assertTrue(requiredRdls.contains(srdl1));

        assertFalse(requiredRdls.contains(srdl2));
    }
}
