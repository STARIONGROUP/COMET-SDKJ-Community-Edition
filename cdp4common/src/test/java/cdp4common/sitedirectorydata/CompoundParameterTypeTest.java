/*
 * CompoundParameterTypeTest.java
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

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CompoundParameterTypeTest {
    @Test
    void verifyThatNumberOfValuesIsCorrect() {
        CompoundParameterType compound = new CompoundParameterType();

        CompoundParameterType compound2 = new CompoundParameterType();
        EnumerationParameterType scalar = new EnumerationParameterType();

        ParameterTypeComponent scalarc1 = new ParameterTypeComponent();
        scalarc1.setParameterType(scalar);
        compound2.getComponent().add(scalarc1);

        ParameterTypeComponent compound2Component = new ParameterTypeComponent();
        compound2Component.setParameterType(compound2);

        compound.getComponent().add(compound2Component);
        compound.getComponent().add(scalarc1);

        assertEquals(2, compound.getNumberOfValues());
    }
}
