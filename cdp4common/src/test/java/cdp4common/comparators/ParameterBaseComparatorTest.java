/*
 * ParameterBaseComparatorTest.java
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
package cdp4common.comparators;

import cdp4common.engineeringmodeldata.Parameter;
import cdp4common.sitedirectorydata.BooleanParameterType;
import cdp4common.sitedirectorydata.CompoundParameterType;
import cdp4common.sitedirectorydata.EnumerationParameterType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ParameterBaseComparatorTest {
    @Test
    void testComparator() {
      EnumerationParameterType type1 = new EnumerationParameterType();
        type1.setName("a");
      EnumerationParameterType type2 = new EnumerationParameterType();
        type2.setName("c");

      Parameter parameter1 = new Parameter();
        parameter1.setParameterType(type1);
      Parameter parameter2 = new Parameter();
        parameter2.setParameterType(type2);

      ParameterBaseComparator comparator = new ParameterBaseComparator();
        assertEquals(-2, comparator.compare(parameter1, parameter2));

        type1.setName("d");
        assertEquals(1, comparator.compare(parameter1, parameter2));

        type2.setName("d");
        assertEquals(0, comparator.compare(parameter1, parameter2));
    }

    @Test
    void testComparator2() {
      CompoundParameterType type1 = new CompoundParameterType();
        type1.setName("C");
      BooleanParameterType type2 = new BooleanParameterType();
        type2.setName("a");

      Parameter parameter1 = new Parameter();
        parameter1.setParameterType(type1);
      Parameter parameter2 = new Parameter();
        parameter2.setParameterType(type2);

      ParameterBaseComparator comparator = new ParameterBaseComparator();
        assertEquals(2, comparator.compare(parameter1, parameter2));
    }
}
