/* --------------------------------------------------------------------------------------------------------------------
 *    CategorizableThingExtensionsTest.java
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

package cdp4common.sitedirectorydata;

import cdp4common.commondata.Thing;
import cdp4common.engineeringmodeldata.ElementDefinition;
import cdp4common.engineeringmodeldata.ElementUsage;
import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import org.apache.commons.lang3.tuple.Pair;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.net.URI;
import java.util.Collection;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

class CategorizableThingExtensionsTest {
    private URI uri;
    private Cache<Pair<UUID, UUID>, Thing> cache;

    private Category productCategory;
    private Category equipmentCategory;
    private Category batteryCategory;
    private Category lithiumBatteryCategory;
    private Category transmitterCategory;

    private ElementDefinition elementDefinition;

    @BeforeEach
    void setup() {
        this.uri = URI.create("http://www.rheagroup.com");
        this.cache = CacheBuilder.newBuilder().build();

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

        this.transmitterCategory = new Category(UUID.randomUUID(), this.cache, this.uri);
        this.transmitterCategory.setShortName("TX");
        this.transmitterCategory.setName("Transmitter");

        this.lithiumBatteryCategory.getSuperCategory().add(this.batteryCategory);
        this.batteryCategory.getSuperCategory().add(this.equipmentCategory);
        this.transmitterCategory.getSuperCategory().add(this.equipmentCategory);
        this.equipmentCategory.getSuperCategory().add(this.productCategory);

        this.cache.put(Pair.of(this.productCategory.getIid(), null), this.productCategory);

        this.cache.put(Pair.of(this.equipmentCategory.getIid(), null), this.equipmentCategory);

        this.cache.put(Pair.of(this.batteryCategory.getIid(), null), this.batteryCategory);

        this.cache.put(Pair.of(this.lithiumBatteryCategory.getIid(), null), this.lithiumBatteryCategory);

        this.cache.put(Pair.of(this.transmitterCategory.getIid(), null), this.transmitterCategory);

        this.elementDefinition = new ElementDefinition(UUID.randomUUID(), this.cache, this.uri);
    }

    @Test
    void verifyThatAllCategoriesAreReturned() {
        this.elementDefinition.getCategory().add(this.equipmentCategory);

        Collection<Category> categories = CategorizableThingExtensions.getAllCategories(elementDefinition);

        assertTrue(categories.contains(this.productCategory));
        assertTrue(categories.contains(this.equipmentCategory));
    }

    @Test
    void verifyThatIfCategorizableThingIsElementUsageTheCategoriesOfTheReferencedElementDefinitionAreReturnedAsWell() {
        this.elementDefinition.getCategory().add(this.equipmentCategory);

        ElementUsage elementUsage = new ElementUsage(UUID.randomUUID(), this.cache, this.uri);
        elementUsage.setElementDefinition(this.elementDefinition);

        Collection<Category> categories = CategorizableThingExtensions.getAllCategories(elementUsage);

        assertTrue(categories.contains(this.productCategory));
        assertTrue(categories.contains(this.equipmentCategory));
    }

    @Test
    void verifyThatAllCategoryShortNamesAreReturned() {
        this.elementDefinition.getCategory().add(this.equipmentCategory);

        assertEquals("PROD EQT", CategorizableThingExtensions.getAllCategoryShortNames(this.elementDefinition));
    }

    @Test
    void verifyThatIfCategorizableThingIsAMemberOfACategoryTrueIsReturned() {
        ElementDefinition battery = new ElementDefinition(UUID.randomUUID(), this.cache, this.uri);
        battery.getCategory().add(this.batteryCategory);

        assertTrue(CategorizableThingExtensions.isMemberOfCategory(battery, this.batteryCategory));
        assertTrue(CategorizableThingExtensions.isMemberOfCategory(battery, this.equipmentCategory));
        assertTrue(CategorizableThingExtensions.isMemberOfCategory(battery, this.productCategory));
    }

    @Test
    void verifyThatIfCategorizableThingIsANotMemberOfACategoryFalseIsReturned() {
        ElementDefinition battery = new ElementDefinition(UUID.randomUUID(), this.cache, this.uri);
        battery.getCategory().add(this.batteryCategory);

        assertFalse(CategorizableThingExtensions.isMemberOfCategory(battery, this.lithiumBatteryCategory));
        assertFalse(CategorizableThingExtensions.isMemberOfCategory(battery, this.transmitterCategory));
    }
}
