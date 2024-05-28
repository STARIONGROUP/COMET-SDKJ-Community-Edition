/*
 * OrderedItemTest.java
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

package cdp4common.types;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import cdp4common.sitedirectorydata.Person;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.junit.jupiter.api.Test;

class OrderedItemTest {

  @Test
  void verifyThatMoveItemUpdatesTheIndex() {
    int key = 1;

    OrderedItem value1 = new OrderedItem();
    value1.setK(key);
    value1.setV("one");

    Long m = value1.getM();

    value1.moveItem(1, 1);
    assertEquals(m, value1.getM());
    assertEquals(key, value1.getK());
  }

  @Test
  void verifyThatEqualityReturnsTrueWhenKeysAndValuesAreEqual() {
    int key = 1;
    OrderedItem value1 = new OrderedItem();
    value1.setK(key);
    value1.setV("one");
    OrderedItem value2 = new OrderedItem();
    value2.setK(key);
    value2.setV("one");

    assertEquals(value1, value2);
  }

  @Test
  void verifyThatEqualityReturnsTrueWhenKeysAndValuesAreEqualWithGuid() {
    int key = 1;
    UUID value = UUID.randomUUID();
    OrderedItem value1 = new OrderedItem();
    value1.setK(key);
    value1.setV(value);
    OrderedItem value2 = new OrderedItem();
    value2.setK(key);
    value2.setV(value);

    assertEquals(value1, value2);
  }

  @Test
  void verifyThatEqualityReturnsTrueWhenKeysAndValuesAreEqualWithThing() {
    int key = 1;
    Person value = new Person();
    OrderedItem value1 = new OrderedItem();
    value1.setK(key);
    value1.setV(value);
    OrderedItem value2 = new OrderedItem();
    value2.setK(key);
    value2.setV(value);

    assertEquals(value1, value2);
  }

  @Test
  void verifyThatEqualityReturnsTrueWhenReferencesAreEqual() {
    int key = 1;
    OrderedItem value1 = new OrderedItem();
    value1.setK(key);
    value1.setV("one");
    OrderedItem value2 = value1;
    assertTrue(value1.equals(value2));
  }

  @Test
  void verifyThatOrderedItemIsNeverEqualToNull() {
    int key = 1;
    OrderedItem value1 = new OrderedItem();
    value1.setK(key);
    value1.setV("one");
    assertFalse(value1.equals(null));
  }

  @Test
  void verifyThatListOfOrderedItemComparisonWorks() {
    OrderedItem item1 = new OrderedItem();
    item1.setK(123);
    item1.setV(1);
    OrderedItem item2 = new OrderedItem();
    item2.setK(456);
    item2.setV(1);
    OrderedItem item3 = new OrderedItem();
    item3.setK(789);
    item3.setV(2);
    OrderedItem item4 = new OrderedItem();
    item4.setK(123456);
    item4.setV(2);

    OrderedItem item1b = new OrderedItem();
    item1b.setK(123);
    item1b.setV(1);
    OrderedItem item2b = new OrderedItem();
    item2b.setK(456);
    item2b.setV(1);
    OrderedItem item3b = new OrderedItem();
    item3b.setK(789);
    item3b.setV(2);
    OrderedItem item4b = new OrderedItem();
    item4b.setK(123456);
    item4b.setV(2);

    OrderedItem item5 = new OrderedItem();
    item5.setK(123456);
    item5.setV(3);

    List<OrderedItem> list1 = new ArrayList<>();
    list1.add(item1);
    list1.add(item2);
    list1.add(item3);
    list1.add(item4);
    List<OrderedItem> list2 = new ArrayList<>();
    list2.add(item1b);
    list2.add(item2b);
    list2.add(item3b);
    list2.add(item4b);
    list2.add(item5);
    list1.retainAll(list2);
    assertEquals(4, list1.size());
  }
}
