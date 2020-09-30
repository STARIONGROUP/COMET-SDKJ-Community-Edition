/*
 * UUIDComparatorTest.java
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

package cdp4common.comparators;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class UUIDComparatorTest {

  @Test
  void verify_that_UUID_is_compared_differently_than_in_csharp() {
    UUID id_1 = UUID.fromString("622d8e0f-ed5e-4dde-92b8-97ff06e69110");
    UUID id_2 = UUID.fromString("90e43d0c-edf8-4630-963b-90e6530ac9db");
    UUID id_3 = UUID.fromString("47b3abc1-ce06-40ef-8ea6-466e7eaccccd");
    UUID id_4 = UUID.fromString("47b3abc1-ce06-40ef-8ea6-466e7eaccccd");

    UUID id_5 = UUID.fromString("01e75c83-c6f5-4192-b57e-7427cec5560d");
    UUID id_6 = UUID.fromString("01e75c83-c6f5-4192-b57e-7427cec5560c");
    UUID id_7 = UUID.fromString("01e75c84-c6f5-4192-b57e-7427cec5560d");

    assertEquals(1, id_1.compareTo(id_2));   // C# returns -1, an opposite result
    assertEquals(-1, id_2.compareTo(id_3));  // C# returns 1, an opposite result
    assertEquals(0, id_3.compareTo(id_4));   // equality works for both languages

    // Edge cases when results are the same for C# and Java
    assertEquals(1, id_5.compareTo(id_6));
    assertEquals(-1, id_5.compareTo(id_7));
  }

  @Test
  void verify_that_UUID_is_compared_as_in_csharp() {
    UUID id_1 = UUID.fromString("622d8e0f-ed5e-4dde-92b8-97ff06e69110");
    UUID id_2 = UUID.fromString("90e43d0c-edf8-4630-963b-90e6530ac9db");
    UUID id_3 = UUID.fromString("47b3abc1-ce06-40ef-8ea6-466e7eaccccd");
    UUID id_4 = UUID.fromString("47b3abc1-ce06-40ef-8ea6-466e7eaccccd");

    UUID id_5 = UUID.fromString("01e75c83-c6f5-4192-b57e-7427cec5560d");
    UUID id_6 = UUID.fromString("01e75c83-c6f5-4192-b57e-7427cec5560c");
    UUID id_7 = UUID.fromString("01e75c84-c6f5-4192-b57e-7427cec5560d");
    UUID id_8 = UUID.fromString("01e75c83-c6f6-4192-b57e-7427cec5560d");
    UUID id_9 = UUID.fromString("01e75c83-c6f5-4193-b57e-7427cec5560d");
    UUID id_10 = UUID.fromString("01e75c83-c6f5-4191-b57e-7427cec5560d");
    UUID id_11 = UUID.fromString("01e75c83-c6f5-4192-b58e-7427cec5560d");
    UUID id_12 = UUID.fromString("01e75c83-c6f5-4192-b57e-7427cec5559d");

    UuidComparator comparator = new UuidComparator();
    assertTrue(comparator.compare(id_1, id_2) < 0);   // C# returns -1, an opposite result
    assertTrue(comparator.compare(id_2, id_3) > 0);    // C# returns 1, an opposite result
    assertEquals(0, comparator.compare(id_3, id_4));    // equality works for both languages

    // Edge cases when results are the same for C# and Java
    assertTrue(comparator.compare(id_5, id_6) > 0);
    assertTrue(comparator.compare(id_5, id_7) < 0);

    // Additional assertions
    assertTrue(comparator.compare(id_5, id_8) < 0);
    assertTrue(comparator.compare(id_5, id_9) < 0);
    assertTrue(comparator.compare(id_5, id_10) > 0);
    assertTrue(comparator.compare(id_5, id_11) < 0);
    assertTrue(comparator.compare(id_5, id_12) > 0);
  }

  @Test
  void verify_that_List_of_Guid_is_ordered() {
    UUID id_1 = UUID.fromString("622d8e0f-ed5e-4dde-92b8-97ff06e69110");
    UUID id_2 = UUID.fromString("90e43d0c-edf8-4630-963b-90e6530ac9db");
    UUID id_3 = UUID.fromString("47b3abc1-ce06-40ef-8ea6-466e7eaccccd");

    List<UUID> ids = Arrays.asList(id_1, id_2, id_3);
    ids.sort(new UuidComparator());

    List<UUID> ordered = Arrays.asList(id_3, id_1, id_2);

    Assertions.assertThat(ordered).containsExactlyElementsOf(ids);
  }
}
