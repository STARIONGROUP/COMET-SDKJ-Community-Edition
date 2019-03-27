/*
 * ParameterBaseTest.java
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

package cdp4common.dto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.UUID;

class ParameterBaseTest {
    private ArrayList<UUID> valueSets;

    @BeforeEach
    void setup() {
        this.valueSets = new ArrayList<>();
        this.valueSets.add(UUID.randomUUID());
        this.valueSets.add(UUID.randomUUID());
    }

    @Test
    void verifyThatParameterReturnsValueSets() {
        Parameter parameter = new Parameter(UUID.randomUUID(), 1);
        parameter.setValueSet(this.valueSets);

        Assertions.assertIterableEquals(this.valueSets, parameter.getValueSets());
    }

    @Test
    void verifyThatParameterOverrideReturnsValueSets() {
        ParameterOverride parameterOverride = new ParameterOverride(UUID.randomUUID(), 1);
        parameterOverride.setValueSet(this.valueSets);

        Assertions.assertIterableEquals(this.valueSets, parameterOverride.getValueSets());
    }

    @Test
    void verifyThatParameterSubscriptionReturnsValueSets() {
        ParameterSubscription parameterSubscription = new ParameterSubscription(UUID.randomUUID(), 1);
        parameterSubscription.setValueSet(this.valueSets);

        Assertions.assertIterableEquals(this.valueSets, parameterSubscription.getValueSets());
    }
}
