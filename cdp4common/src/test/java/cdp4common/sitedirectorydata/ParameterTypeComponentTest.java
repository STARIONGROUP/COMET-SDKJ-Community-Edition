/*
 * ParameterTypeComponentTest.java
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

package cdp4common.sitedirectorydata;

import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ParameterTypeComponentTest {
    @Test
    void verifyThatTheIndexOfAComponentReturnsTheExpectedResult() {
        CompoundParameterType compoundParameterType = new CompoundParameterType(UUID.randomUUID(), null, null);

        ParameterTypeComponent component0 = new ParameterTypeComponent(UUID.randomUUID(), null, null);
        ParameterTypeComponent component1 = new ParameterTypeComponent(UUID.randomUUID(), null, null);
        ParameterTypeComponent component2 = new ParameterTypeComponent(UUID.randomUUID(), null, null);
        ParameterTypeComponent componentnocontainer = new ParameterTypeComponent(UUID.randomUUID(), null, null);

        compoundParameterType.getComponent().add(component0);
        compoundParameterType.getComponent().add(component1);
        compoundParameterType.getComponent().add(component2);

        assertEquals(0, component0.getIndex());
        assertEquals(1, component1.getIndex());
        assertEquals(2, component2.getIndex());
        assertEquals(-1, componentnocontainer.getIndex());
    }
}
