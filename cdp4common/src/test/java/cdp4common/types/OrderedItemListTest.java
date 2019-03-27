/*
 * OrderedItemListTest.java
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

package cdp4common.types;

import cdp4common.commondata.Thing;
import cdp4common.engineeringmodeldata.ActualFiniteState;
import cdp4common.engineeringmodeldata.ActualFiniteStateList;
import cdp4common.sitedirectorydata.EmailAddress;
import cdp4common.sitedirectorydata.Person;
import cdp4common.sitedirectorydata.TelephoneNumber;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

class OrderedItemListTest {
    private OrderedItemList<Thing> testList;

    private Person person;

    @BeforeEach
    void setup() {
        this.person = new Person(UUID.randomUUID(), null, null);
        this.testList = new OrderedItemList<>(null, Thing.class);
    }

    @AfterEach
    void tearDown() {
        this.testList.clear();
    }

    @Test
    void verifyThatContainerSetToClone() {
        ActualFiniteStateList list = new ActualFiniteStateList();
        ActualFiniteState state = new ActualFiniteState();
        list.getActualState().add(state);

        ActualFiniteStateList clone = list.clone(false);
        assertSame(list, state.getContainer());

        clone.getActualState().clear();
        clone.getActualState().add(state);

        assertSame(clone, state.getContainer());
    }

    @Test
    void verifyThatAddWorks_NotCompositeList() {
        this.testList = new OrderedItemList<Thing>(this.person, Thing.class);
        this.testList.add(new EmailAddress(UUID.randomUUID(), null, null));

        assertEquals(1, this.testList.size());
        assertNull(this.testList.get(0).getContainer());
    }

    @Test
    void verifyThatAddWorks_CompositeList() {
        this.testList = new OrderedItemList<Thing>(this.person, true, Thing.class);
        this.testList.add(new EmailAddress(UUID.randomUUID(), null, null));

        assertEquals(1, this.testList.size());
        assertEquals(this.person, this.testList.get(0).getContainer());

        assertTrue((-20000000L < this.testList.getSortedItems().firstKey()) && (20000000L > this.testList.getSortedItems().firstKey()));
    }

    @Test
    void verifyThatGetIteratorWork() {
        this.testList = new OrderedItemList<Thing>(this.person, true, Thing.class);
        this.testList.add(new EmailAddress(UUID.randomUUID(), null, null));
        for (Thing item : this.testList) {
            assertNotNull(item);
        }
    }

    @Test
    void verifyThatRemoveWorks() {
        EmailAddress email = new EmailAddress(UUID.randomUUID(), null, null);
        this.testList = new OrderedItemList<>(this.person, true, Thing.class);
        this.testList.add(email);
        this.testList.remove(email);

        assertEquals(0, this.testList.size());
    }

    @Test
    void verifyThatClearWorks() {
        this.testList = new OrderedItemList<Thing>(this.person, true, Thing.class);
        this.testList.add(new EmailAddress(UUID.randomUUID(), null, null));
        this.testList.add(new EmailAddress(UUID.randomUUID(), null, null));

        this.testList.clear();
        assertEquals(0, this.testList.size());
    }

    @Test
    void verifyThatAddOrderedItemsWorks() {
        List<OrderedItem> listOrderedItem = new ArrayList<>();
        OrderedItem item1 = new OrderedItem();
        item1.setK(-2000);
        item1.setV(new EmailAddress(UUID.randomUUID(), null, null));
        listOrderedItem.add(item1);

        OrderedItem item2 = new OrderedItem();
        item2.setK(500000);
        item2.setV(new EmailAddress(UUID.randomUUID(), null, null));
        listOrderedItem.add(item2);

        OrderedItem item3 = new OrderedItem();
        item3.setK(10000000);
        item3.setV(new EmailAddress(UUID.randomUUID(), null, null));
        listOrderedItem.add(item3);

        this.testList = new OrderedItemList<Thing>(this.person, true, Thing.class);

        this.testList.addOrderedItems(listOrderedItem);
        assertEquals(3, this.testList.size());
    }

    @Test
    void verifyThatAddRangeWorks() {
        this.testList = new OrderedItemList<Thing>(this.person, true, Thing.class);

        List<Thing> listItemToAdd = new ArrayList<>();
        listItemToAdd.add(new EmailAddress(UUID.randomUUID(), null, null));
        listItemToAdd.add(new TelephoneNumber(UUID.randomUUID(), null, null));

        this.testList.addAll(listItemToAdd);
        assertEquals(listItemToAdd.size(), this.testList.size());
    }

    @Test
    void verifyThatInsertWorks() {
        this.testList = new OrderedItemList<Thing>(this.person, true, Thing.class);

        List<Thing> listItemToAdd = new ArrayList<>();
        listItemToAdd.add(new EmailAddress(UUID.randomUUID(), null, null));
        listItemToAdd.add(new TelephoneNumber(UUID.randomUUID(), null, null));

        this.testList.addAll(listItemToAdd);

        Person inserted = new Person(UUID.randomUUID(), null, null);
        this.testList.insert(1, inserted);

        assertEquals(inserted, this.testList.get(1));
        assertTrue((long) this.testList.getSortedItems().keySet().toArray()[1] > (long) this.testList.getSortedItems().keySet().toArray()[0] && (long) this.testList.getSortedItems().keySet().toArray()[2] > (long) this.testList.getSortedItems().keySet().toArray()[1]);
    }

    @Test
    void verifyThatContainsWorks() {
        this.testList = new OrderedItemList<Thing>(this.person, true, Thing.class);
        Person inserted = new Person(UUID.randomUUID(), null, null);

        testList.add(inserted);

        assertTrue(this.testList.contains(inserted));
    }

//        @Test
//      void verifyThatCopyToWorks()
//     {
//         this.testList = new OrderedItemList<Thing>(this.person, true, Thing.class);
//         Person inserted = new Person(UUID.randomUUID(), null, null);
//
//         testList.add(inserted);
//
//         Thing[] array = new Thing[1];
//         this.testList.CopyTo(array, 0);
//
//         Assert.IsNotNull(array[0]);
//     }

    @Test
    void verifyThatToDtoListOrderedItemWorks() {
        this.testList = new OrderedItemList<Thing>(this.person, true, Thing.class);

        EmailAddress email = new EmailAddress(UUID.randomUUID(), null, null);
        TelephoneNumber tel = new TelephoneNumber(UUID.randomUUID(), null, null);

        this.testList.add(email);
        this.testList.add(tel);

        List<OrderedItem> dtoOrderedList = this.testList.toDtoOrderedItemList();
        assertEquals(this.testList.size(), dtoOrderedList.size());
        assertEquals((long) this.testList.getSortedItems().firstKey(), dtoOrderedList.get(0).getK());
        assertEquals(this.testList.getSortedItems().keySet().toArray()[1], dtoOrderedList.get(1).getK());

        assertEquals(((Thing) this.testList.getSortedItems().values().toArray()[0]).getIid(), dtoOrderedList.get(0).getV());
        assertEquals(((Thing) this.testList.getSortedItems().values().toArray()[1]).getIid(), dtoOrderedList.get(1).getV());
    }

    @Test
    void verifyThatOrderedItemWithPrimitiveVTypeMayBeAdded() {
        OrderedItemList<Integer> orderedList = new OrderedItemList<>(null, Integer.class);

        OrderedItem orderedItem1 = new OrderedItem();
        orderedItem1.setK(1);
        orderedItem1.setV("2");
        List<OrderedItem> list = new ArrayList<OrderedItem>();
        list.add(orderedItem1);
        orderedList.addOrderedItems(list);

        assertEquals(1, orderedList.size());
    }

    @Test
    void verifyThatAddNullThrowsException() {
        this.testList = new OrderedItemList<Thing>(this.person, true, Thing.class);
        assertThrows(NullPointerException.class, () -> this.testList.add(null));
    }

    @Test
    void verifyThatAddingWrongOrderedItemTypeThrowsException() {
        List<OrderedItem> listOrderedItem = new ArrayList<>();
        OrderedItem item1 = new OrderedItem();
        item1.setK(-2000);
        item1.setV(new EmailAddress(UUID.randomUUID(), null, null));

        OrderedItem item2 = new OrderedItem();
        item2.setK(500000);
        item2.setV(new EmailAddress(UUID.randomUUID(), null, null));

        OrderedItem item3 = new OrderedItem();
        item3.setK(10000000);
        item3.setV("hello");

        listOrderedItem.add(item1);
        listOrderedItem.add(item2);
        listOrderedItem.add(item3);

        this.testList = new OrderedItemList<Thing>(this.person, true, Thing.class);

        assertThrows(ClassCastException.class, () -> this.testList.addOrderedItems(listOrderedItem));
    }

    @Test
    void verifyThatIndexOfReturnsTheExpectpedIndex() {
        this.testList = new OrderedItemList<Thing>(this.person, true, Thing.class);
        EmailAddress email_0 = new EmailAddress(UUID.randomUUID(), null, null);
        EmailAddress email_1 = new EmailAddress(UUID.randomUUID(), null, null);
        EmailAddress email_2 = new EmailAddress(UUID.randomUUID(), null, null);
        EmailAddress email_notcontained = new EmailAddress(UUID.randomUUID(), null, null);

        this.testList.add(email_0);
        this.testList.add(email_1);
        this.testList.add(email_2);

        assertEquals(0, this.testList.indexOf(email_0));
        assertEquals(1, this.testList.indexOf(email_1));
        assertEquals(2, this.testList.indexOf(email_2));

        assertEquals(-1, this.testList.indexOf(email_notcontained));
    }

    @Test
    void verifyThatSameItemCannotBeAddedTwice() {
        OrderedItemList<Thing> list = new OrderedItemList<>(this.person, true, Thing.class);
        EmailAddress email_0 = new EmailAddress(UUID.randomUUID(), null, null);

        list.add(email_0);

        assertThrows(IllegalArgumentException.class, () -> list.add(email_0));
    }

    @Test
    void verifyThatArgumentOutOfRangeIsThrownWhenIndexIsOutOfRange() {
        OrderedItemList<Thing> list = new OrderedItemList<>(this.person, false, Thing.class);
        EmailAddress email;

        assertThrows(IndexOutOfBoundsException.class, () -> list.get(-1));

        email = new EmailAddress(UUID.randomUUID(), null, null);
        list.add(email);
        int invalidIndex = list.size();

        assertThrows(IndexOutOfBoundsException.class, () -> list.get(invalidIndex));
        assertThrows(IndexOutOfBoundsException.class, () -> list.set(-1, email));
        assertThrows(IndexOutOfBoundsException.class, () -> list.set(invalidIndex, email));
    }

    @Test
    void verifyThatArgumentNullExceptionWhenNullIsSet() {
        OrderedItemList<Thing> list = new OrderedItemList<>(this.person, false, Thing.class);
        EmailAddress email = new EmailAddress(UUID.randomUUID(), null, null);
        list.add(email);

        assertThrows(NullPointerException.class, () -> list.set(0, null));
    }

    @Test
    void verifyThatNullCannotBeInserted() {
        OrderedItemList<Thing> list = new OrderedItemList<>(this.person, false, Thing.class);
        assertThrows(NullPointerException.class, () -> list.insert(1, null));
    }

    @Test
    void verifyThatIfInsertAtIndexGreaterThatCountItemIsAppendedToList() {
        OrderedItemList<Thing> list = new OrderedItemList<>(this.person, false, Thing.class);
        EmailAddress email1 = new EmailAddress(UUID.randomUUID(), null, null);
        list.add(email1);

        int index = list.size() + 1;
        EmailAddress email2 = new EmailAddress(UUID.randomUUID(), null, null);
        list.insert(index, email2);

        assertSame(email1, list.get(0));
        assertSame(email2, list.get(1));
    }

    @Test
    void verifyThatSameItemCannotBeAddedTwiceBis() {
        OrderedItemList<Thing> list = new OrderedItemList<>(this.person, true, Thing.class);
        EmailAddress email_0 = new EmailAddress(UUID.randomUUID(), null, null);
        EmailAddress email_1 = new EmailAddress(UUID.randomUUID(), null, null);

        list.add(email_0);
        list.add(email_1);

        assertThrows(IllegalArgumentException.class, () -> list.set(0, email_1));
    }

    @Test
    void verifyThatMoveWorks() {
        OrderedItemList<Thing> testlist = new OrderedItemList<Thing>(this.person, true, Thing.class);
        EmailAddress email0 = new EmailAddress(UUID.randomUUID(), null, null);
        EmailAddress email1 = new EmailAddress(UUID.randomUUID(), null, null);
        EmailAddress email2 = new EmailAddress(UUID.randomUUID(), null, null);
        EmailAddress email3 = new EmailAddress(UUID.randomUUID(), null, null);
        EmailAddress email4 = new EmailAddress(UUID.randomUUID(), null, null);

        testlist.add(email0);
        testlist.add(email1);
        testlist.add(email2);
        testlist.add(email3);
        testlist.add(email4);

        assertSame(email0, testlist.get(0));
        assertSame(email1, testlist.get(1));
        assertSame(email2, testlist.get(2));
        assertSame(email3, testlist.get(3));
        assertSame(email4, testlist.get(4));

        // move 1st to last
        testlist.move(0, 4);
        assertSame(email1, testlist.get(0));
        assertSame(email2, testlist.get(1));
        assertSame(email3, testlist.get(2));
        assertSame(email4, testlist.get(3));
        assertSame(email0, testlist.get(4));

        // move last to first
        testlist.move(4, 0);
        assertSame(email0, testlist.get(0));
        assertSame(email1, testlist.get(1));
        assertSame(email2, testlist.get(2));
        assertSame(email3, testlist.get(3));
        assertSame(email4, testlist.get(4));

        // does not do anything
        testlist.move(0, 0);
        assertSame(email0, testlist.get(0));
        assertSame(email1, testlist.get(1));
        assertSame(email2, testlist.get(2));
        assertSame(email3, testlist.get(3));
        assertSame(email4, testlist.get(4));
    }

    @Test
    void verifyThatMoveThrowsException() {
        OrderedItemList<Thing> testlist = new OrderedItemList<>(this.person, true, Thing.class);
        EmailAddress email0 = new EmailAddress(UUID.randomUUID(), null, null);
        EmailAddress email1 = new EmailAddress(UUID.randomUUID(), null, null);

        testlist.add(email0);
        testlist.add(email1);

        assertThrows(IndexOutOfBoundsException.class, () -> testlist.move(-1, 1));
    }

    @Test
    void VerifyThatMoveThrowsException2() {
        OrderedItemList<Thing> testlist = new OrderedItemList<>(this.person, true, Thing.class);
        EmailAddress email0 = new EmailAddress(UUID.randomUUID(), null, null);
        EmailAddress email1 = new EmailAddress(UUID.randomUUID(), null, null);

        testlist.add(email0);
        testlist.add(email1);

        assertThrows(IndexOutOfBoundsException.class, () -> testlist.move(2, 1));
    }

    @Test
    void verifyThatMoveThrowsException3() {
        OrderedItemList<Thing> testlist = new OrderedItemList<Thing>(this.person, true, Thing.class);
        EmailAddress email0 = new EmailAddress(UUID.randomUUID(), null, null);
        EmailAddress email1 = new EmailAddress(UUID.randomUUID(), null, null);

        testlist.add(email0);
        testlist.add(email1);

        assertThrows(IndexOutOfBoundsException.class, () -> testlist.move(0, -1));
    }

    @Test
    void verifyThatMoveThrowsException4() {
        OrderedItemList<Thing> testlist = new OrderedItemList<>(this.person, true, Thing.class);
        EmailAddress email0 = new EmailAddress(UUID.randomUUID(), null, null);
        EmailAddress email1 = new EmailAddress(UUID.randomUUID(), null, null);

        testlist.add(email0);
        testlist.add(email1);

        assertThrows(IndexOutOfBoundsException.class, () -> testlist.move(0, 3));
    }

    @Test
    void verifyThatFindIndexWorks() {
        OrderedItemList<Thing> testlist = new OrderedItemList<>(this.person, true, Thing.class);
        EmailAddress email0 = new EmailAddress(UUID.randomUUID(), null, null);
        EmailAddress email1 = new EmailAddress(UUID.randomUUID(), null, null);

        testlist.add(email0);
        testlist.add(email1);

        assertEquals(0, testlist.findIndex(x -> x.getIid() == email0.getIid()));
        assertEquals(-1, testlist.findIndex(x -> x.getIid() == UUID.randomUUID()));

        assertThrows(NullPointerException.class, () -> testlist.findIndex(null));
    }
}
