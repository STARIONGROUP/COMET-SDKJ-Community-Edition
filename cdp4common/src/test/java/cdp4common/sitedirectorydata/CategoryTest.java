/* --------------------------------------------------------------------------------------------------------------------
 *    CategoryTest.java
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

package cdp4common.sitedirectorydata;

import cdp4common.commondata.ClassKind;
import cdp4common.commondata.DefinedThing;
import cdp4common.commondata.Thing;
import cdp4common.engineeringmodeldata.ElementDefinition;
import cdp4common.engineeringmodeldata.Iteration;
import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import org.apache.commons.lang3.tuple.Pair;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.net.URI;
import java.util.Collection;
import java.util.UUID;

/**
 * Suite of tests for the {@link Category}
 */
class CategoryTest {
    private URI uri;
    private Cache<Pair<UUID, UUID>, Thing> cache;

    @BeforeEach
    void beforeEach() {
        this.uri = URI.create("http://www.rheagroup.com");

        this.cache = CacheBuilder.newBuilder().build();
    }

    @Test
    void verifyThatExpectedCategoriesAreReturned() {
        Category categorya1 = new Category(UUID.randomUUID(), this.cache, this.uri);
        categorya1.setShortName("A1");

        Category categorya2 = new Category(UUID.randomUUID(), this.cache, this.uri);
        categorya2.setShortName("A2");

        Category categorya11 = new Category(UUID.randomUUID(), this.cache, this.uri);
        categorya11.setShortName("A11");

        categorya11.getSuperCategory().add(categorya1);
        categorya11.getSuperCategory().add(categorya2);

        Category categoryb = new Category(UUID.randomUUID(), this.cache, this.uri);
        categoryb.setShortName("B");
        Category category = new Category(UUID.randomUUID(), this.cache, this.uri);
        category.setShortName("subcat");

        category.getSuperCategory().add(categorya11);
        category.getSuperCategory().add(categoryb);

        Collection<Category> allSuperCategories = category.getAllSuperCategories();

        Assertions.assertEquals(4, allSuperCategories.size());

        String shortNames = allSuperCategories.stream().map(DefinedThing::getShortName).reduce("",
                (current, cat) -> current + " " + cat);

        Assertions.assertEquals("A11 A1 A2 B", shortNames.trim());
    }

    @Test
    void verifyThatExpectedDerivedCategoriesAreReturned() {
        Category a = new Category(UUID.randomUUID(), this.cache, this.uri);
        a.setShortName("A");
        Category aa = new Category(UUID.randomUUID(), this.cache, this.uri);
        aa.setShortName("AA");
        Category aaa = new Category(UUID.randomUUID(), this.cache, this.uri);
        aaa.setShortName("AAA");
        Category aaaa = new Category(UUID.randomUUID(), this.cache, this.uri);
        aaaa.setShortName("AAAA");

        aaaa.getSuperCategory().add(aaa);
        aaa.getSuperCategory().add(aa);
        aa.getSuperCategory().add(a);

        this.cache.put(Pair.of(a.getIid(), null), a);
        this.cache.put(Pair.of(aa.getIid(), null), aa);
        this.cache.put(Pair.of(aaa.getIid(), null), aaa);
        this.cache.put(Pair.of(aaaa.getIid(), null), aaaa);

        Category b = new Category(UUID.randomUUID(), this.cache, this.uri);
        b.setShortName("B");
        Category bb = new Category(UUID.randomUUID(), this.cache, this.uri);
        bb.setShortName("BB");
        Category bbb = new Category(UUID.randomUUID(), this.cache, this.uri);
        bbb.setShortName("BBB");
        Category bbbb = new Category(UUID.randomUUID(), this.cache, this.uri);
        bbbb.setShortName("BBBB");

        this.cache.put(Pair.of(b.getIid(), null), b);
        this.cache.put(Pair.of(bb.getIid(), null), bb);
        this.cache.put(Pair.of(bbb.getIid(), null), bbb);
        this.cache.put(Pair.of(bbbb.getIid(), null), bbbb);

        bbbb.getSuperCategory().add(bbb);
        bbb.getSuperCategory().add(bb);
        bb.getSuperCategory().add(b);

        Assertions.assertEquals(8, this.cache.size());

        Collection<Category> derivedCategoriesOfA = a.getAllDerivedCategories();

        Assertions.assertEquals(3, derivedCategoriesOfA.size());

        Assertions.assertTrue(derivedCategoriesOfA.contains(aa));
        Assertions.assertTrue(derivedCategoriesOfA.contains(aaa));
        Assertions.assertTrue(derivedCategoriesOfA.contains(aaaa));
    }

    @Test
    void verifyThatGetRequiredRdlsWorks() {
        SiteReferenceDataLibrary srdl1 = new SiteReferenceDataLibrary(UUID.randomUUID(), this.cache, this.uri);
        SiteReferenceDataLibrary srdl1_1 = new SiteReferenceDataLibrary(UUID.randomUUID(), this.cache, this.uri);
        SiteReferenceDataLibrary mrdl = new SiteReferenceDataLibrary(UUID.randomUUID(), this.cache, this.uri);
        SiteReferenceDataLibrary srdl2 = new SiteReferenceDataLibrary(UUID.randomUUID(), this.cache, this.uri);

        Category category = new Category(UUID.randomUUID(), this.cache, this.uri);

        srdl1_1.setRequiredRdl(srdl1);
        mrdl.setRequiredRdl(srdl1_1);
        srdl2.setRequiredRdl(srdl1);

        mrdl.getDefinedCategory().add(category);

        Assertions.assertTrue(category.getRequiredRdls().contains(mrdl));
        Assertions.assertTrue(category.getRequiredRdls().contains(srdl1_1));
        Assertions.assertTrue(category.getRequiredRdls().contains(srdl1));

        Assertions.assertFalse(category.getRequiredRdls().contains(srdl2));
    }

    @Test
    void verifyThatCategorizedThingsReturnsExpectedElementDefinitions() {
        Category categorya1 = new Category(UUID.randomUUID(), this.cache, this.uri);
        categorya1.setShortName("A1");
        categorya1.getPermissibleClass().add(ClassKind.ELEMENT_DEFINITION);
        this.cache.put(Pair.of(categorya1.getIid(), null), categorya1);

        Category categorya11 = new Category(UUID.randomUUID(), this.cache, this.uri);
        categorya11.setShortName("A11");
        categorya11.getPermissibleClass().add(ClassKind.ELEMENT_DEFINITION);
        this.cache.put(Pair.of(categorya11.getIid(), null), categorya11);

        Category categorya111 = new Category(UUID.randomUUID(), this.cache, this.uri);
        categorya111.setShortName("A111");
        categorya111.getPermissibleClass().add(ClassKind.ELEMENT_DEFINITION);
        this.cache.put(Pair.of(categorya111.getIid(), null), categorya111);

        categorya111.getSuperCategory().add(categorya11);
        categorya11.getSuperCategory().add(categorya1);

        Category categoryb1 = new Category(UUID.randomUUID(), this.cache, this.uri);
        categoryb1.setShortName("B1");
        categoryb1.getPermissibleClass().add(ClassKind.ELEMENT_DEFINITION);
        this.cache.put(Pair.of(categoryb1.getIid(), null), categoryb1);

        Category categoryb11 = new Category(UUID.randomUUID(), this.cache, this.uri);
        categoryb11.setShortName("B11");
        categoryb11.getPermissibleClass().add(ClassKind.ELEMENT_DEFINITION);
        this.cache.put(Pair.of(categoryb11.getIid(), null), categoryb11);

        Category categoryb111 = new Category(UUID.randomUUID(), this.cache, this.uri);
        categoryb111.setShortName("B111");
        categoryb111.getPermissibleClass().add(ClassKind.ELEMENT_DEFINITION);
        this.cache.put(Pair.of(categoryb111.getIid(), null), categoryb111);

        categoryb111.getSuperCategory().add(categoryb11);
        categoryb11.getSuperCategory().add(categoryb1);

        Iteration iteration = new Iteration(UUID.randomUUID(), this.cache, this.uri);
        this.cache.put(Pair.of(iteration.getIid(), null), iteration);

        ElementDefinition elementDefinitionA = new ElementDefinition(UUID.randomUUID(), this.cache, this.uri);
        elementDefinitionA.setShortName("A");
        this.cache.put(Pair.of(elementDefinitionA.getIid(), null), elementDefinitionA);

        ElementDefinition elementDefinitionB = new ElementDefinition(UUID.randomUUID(), this.cache, this.uri);
        elementDefinitionB.setShortName("B");
        this.cache.put(Pair.of(elementDefinitionB.getIid(), null), elementDefinitionB);

        iteration.getElement().add(elementDefinitionA);
        iteration.getElement().add(elementDefinitionB);

        elementDefinitionA.getCategory().add(categorya11);
        elementDefinitionB.getCategory().add(categoryb111);

        Assertions.assertTrue(categorya1.getCategorizedThings().contains(elementDefinitionA));
        Assertions.assertTrue(categorya11.getCategorizedThings().contains(elementDefinitionA));

        Assertions.assertTrue(categoryb1.getCategorizedThings().contains(elementDefinitionB));
        Assertions.assertTrue(categoryb11.getCategorizedThings().contains(elementDefinitionB));
        Assertions.assertTrue(categoryb111.getCategorizedThings().contains(elementDefinitionB));
    }

    @Test
    void verifyThatCategorizedThingsReturnsNoneWhenThereAreNoCategorizableThingsInTheCache() {
        Category categorya1 = new Category(UUID.randomUUID(), this.cache, this.uri);
        categorya1.setShortName("A1");
        categorya1.getPermissibleClass().add(ClassKind.ELEMENT_DEFINITION);
        this.cache.put(Pair.of(categorya1.getIid(), null), categorya1);

        Assertions.assertTrue(categorya1.getCategorizedThings().isEmpty());
    }
}
