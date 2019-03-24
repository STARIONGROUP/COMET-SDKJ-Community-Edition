/*
 * MultiRelationshipRuleTest.java
 * Copyright (c) 2015-2018 RHEA System S.A.
 */

package cdp4common.sitedirectorydata;

import cdp4common.commondata.Alias;
import cdp4common.commondata.Definition;
import cdp4common.commondata.Thing;
import cdp4common.engineeringmodeldata.*;
import cdp4common.types.CacheKey;
import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import com.google.common.collect.Iterables;
import com.google.common.collect.MoreCollectors;
import org.apache.commons.lang3.tuple.Pair;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.net.URI;
import java.util.List;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

class MultiRelationshipRuleTest {
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
        MultiRelationshipRule rule = new MultiRelationshipRule(UUID.randomUUID(), this.cache, this.uri);
        assertThrows(NullPointerException.class, () -> rule.verify(null));
    }

    @Test
    void verifyThatIfNoMultiRelationshipsAreContainedByIterationNoViolationsAreReturned() {
        MultiRelationshipRule rule = new MultiRelationshipRule(UUID.randomUUID(), this.cache, this.uri);
        List<RuleViolation> violations = rule.verify(this.iteration);

        assertEquals(0, violations.size());
    }

    @Test
    void verifyThatIfRelationshipCategoryIsNullNoViolationsAreReturned() {
        MultiRelationshipRule rule = new MultiRelationshipRule();
        rule.setRelationshipCategory(null);

        BinaryRelationship binaryRelationship = new BinaryRelationship(UUID.randomUUID(), this.cache, this.uri);
        this.iteration.getRelationship().add(binaryRelationship);

        List<RuleViolation> violations = rule.verify(this.iteration);

        assertEquals(0, violations.size());
    }

    @Test
    void verifyThatIfRelationshipIsNotMemberOfCategoryNoViolationIsReturned() {
        MultiRelationshipRule rule = new MultiRelationshipRule();
        rule.setRelationshipCategory(this.equipmentCategory);

        MultiRelationship multiRelationship = new MultiRelationship(UUID.randomUUID(), this.cache, this.uri);
        this.iteration.getRelationship().add(multiRelationship);

        List<RuleViolation> violations = rule.verify(this.iteration);

        assertEquals(0, violations.size());
    }

    @Test
    void verifyThatIfRelationshipViolatesRuleViolationIsReturned() {
        MultiRelationshipRule rule = new MultiRelationshipRule(UUID.randomUUID(), this.cache, this.uri);
        rule.setRelationshipCategory(this.lithiumBatteryCategory);

        rule.getRelatedCategory().add(this.lithiumBatteryCategory);

        ElementDefinition battery = new ElementDefinition(UUID.randomUUID(), this.cache, this.uri);
        battery.setShortName("BAT");
        battery.setName("Battery");

        battery.getCategory().add(this.batteryCategory);
        this.iteration.getElement().add(battery);

        ElementDefinition lithiumBattery = new ElementDefinition(UUID.randomUUID(), this.cache, this.uri);
        lithiumBattery.setShortName("LITBAT");
        lithiumBattery.setName("Lithium Battery");

        lithiumBattery.getCategory().add(this.lithiumBatteryCategory);
        this.iteration.getElement().add(lithiumBattery);

        MultiRelationship multiRelationship = new MultiRelationship(UUID.randomUUID(), this.cache, this.uri);
        multiRelationship.getCategory().add(this.lithiumBatteryCategory);
        multiRelationship.getRelatedThing().add(battery);
        multiRelationship.getRelatedThing().add(lithiumBattery);
        this.iteration.getRelationship().add(multiRelationship);

        List<RuleViolation> violations = rule.verify(this.iteration);
        RuleViolation violation = Iterables.getOnlyElement(violations);

        assertTrue(violation.getViolatingThing().contains(multiRelationship.getIid()));
    }

    @Test
    void verifyThatIfNonCategorizableThingsAreRelatedViolationsAreReturned() {
        MultiRelationshipRule rule = new MultiRelationshipRule(UUID.randomUUID(), this.cache, this.uri);
        rule.setRelationshipCategory(this.lithiumBatteryCategory);

        rule.getRelatedCategory().add(this.lithiumBatteryCategory);

        Alias alias = new Alias(UUID.randomUUID(), this.cache, this.uri);
        Definition definition = new Definition(UUID.randomUUID(), this.cache, this.uri);

        MultiRelationship multiRelationship = new MultiRelationship(UUID.randomUUID(), this.cache, this.uri);
        multiRelationship.getCategory().add(this.lithiumBatteryCategory);

        multiRelationship.getRelatedThing().add(alias);
        multiRelationship.getRelatedThing().add(definition);
        this.iteration.getRelationship().add(multiRelationship);

        List<RuleViolation> violations = rule.verify(this.iteration);

        assertEquals(2, violations.size());

        RuleViolation aliasViolation = violations.stream().filter(v -> v.getViolatingThing().contains(alias.getIid())).collect(MoreCollectors.onlyElement());
        assertTrue(aliasViolation.getDescription().contains("is not a CategorizableThing"));

        RuleViolation definitionViolation = violations.stream().filter(v -> v.getViolatingThing().contains(definition.getIid())).collect(MoreCollectors.onlyElement());
        assertTrue(definitionViolation.getDescription().contains("is not a CategorizableThing"));
    }

    @Test
    void verifyThatIfRuleIsNotViolatedNoViolationsAreReturned() {
        MultiRelationshipRule rule = new MultiRelationshipRule(UUID.randomUUID(), this.cache, this.uri);
        rule.setRelationshipCategory(this.productCategory);

        rule.getRelatedCategory().add(this.productCategory);

        ElementDefinition battery = new ElementDefinition(UUID.randomUUID(), this.cache, this.uri);
        battery.getCategory().add(this.batteryCategory);
        this.iteration.getElement().add(battery);

        ElementDefinition cell = new ElementDefinition(UUID.randomUUID(), this.cache, this.uri);
        cell.getCategory().add(this.equipmentCategory);
        this.iteration.getElement().add(cell);

        ElementUsage cellElementUsage = new ElementUsage(UUID.randomUUID(), this.cache, this.uri);
        cellElementUsage.setElementDefinition(cell);
        battery.getContainedElement().add(cellElementUsage);

        ElementDefinition pcdu = new ElementDefinition(UUID.randomUUID(), this.cache, this.uri);
        pcdu.getCategory().add(this.equipmentCategory);
        this.iteration.getElement().add(pcdu);

        MultiRelationship multiRelationship = new MultiRelationship(UUID.randomUUID(), this.cache, this.uri);
        multiRelationship.getCategory().add(this.productCategory);
        this.iteration.getRelationship().add(multiRelationship);

        multiRelationship.getRelatedThing().add(battery);
        multiRelationship.getRelatedThing().add(cellElementUsage);
        multiRelationship.getRelatedThing().add(pcdu);

        List<RuleViolation> violations = rule.verify(this.iteration);

        assertEquals(0, violations.size());
    }
}
