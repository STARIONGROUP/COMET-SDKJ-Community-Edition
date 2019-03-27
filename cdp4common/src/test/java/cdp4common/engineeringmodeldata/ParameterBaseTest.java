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
 *  modify it under the terms of the GNU Lesser General Public
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

package cdp4common.engineeringmodeldata;

import cdp4common.sitedirectorydata.BooleanParameterType;
import cdp4common.sitedirectorydata.SiteReferenceDataLibrary;
import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

class ParameterBaseTest {
    @Test
    void verifyThatLevelReturnsTheExpectedResult() {
        ElementDefinition elementDefinition = new ElementDefinition(UUID.randomUUID(), null, null);

        ParameterGroup parameterGrouplevel0 = new ParameterGroup(UUID.randomUUID(), null, null);
        elementDefinition.getParameterGroup().add(parameterGrouplevel0);

        ParameterGroup parameterGroulevel1 = new ParameterGroup(UUID.randomUUID(), null, null);
        elementDefinition.getParameterGroup().add(parameterGroulevel1);
        parameterGroulevel1.setContainingGroup(parameterGrouplevel0);

        Parameter parameter_0 = new Parameter(UUID.randomUUID(), null, null);
        elementDefinition.getParameter().add(parameter_0);

        Parameter parameterlevel1 = new Parameter(UUID.randomUUID(), null, null);
        elementDefinition.getParameter().add(parameterlevel1);
        parameterlevel1.setGroup(parameterGrouplevel0);

        Parameter parameterlevel2 = new Parameter(UUID.randomUUID(), null, null);
        elementDefinition.getParameter().add(parameterlevel2);
        parameterlevel2.setGroup(parameterGroulevel1);

        assertEquals(0, parameter_0.getLevel());
        assertEquals(1, parameterlevel1.getLevel());
        assertEquals(2, parameterlevel2.getLevel());
    }

    @Test
    void verifyThatGetRequiredRdlsWorks() {
        SiteReferenceDataLibrary srdl1 = new SiteReferenceDataLibrary(UUID.randomUUID(), null, null);
        SiteReferenceDataLibrary mrdl = new SiteReferenceDataLibrary(UUID.randomUUID(), null, null);
        SiteReferenceDataLibrary srdl2 = new SiteReferenceDataLibrary(UUID.randomUUID(), null, null);

        Parameter parameter = new Parameter(UUID.randomUUID(), null, null);
        BooleanParameterType type = new BooleanParameterType(UUID.randomUUID(), null, null);

        mrdl.setRequiredRdl(srdl1);
        srdl2.setRequiredRdl(srdl1);

        parameter.setParameterType(type);
        mrdl.getParameterType().add(type);

        assertTrue(parameter.getRequiredRdls().contains(srdl1));
        assertTrue(parameter.getRequiredRdls().contains(mrdl));
        assertFalse(parameter.getRequiredRdls().contains(srdl2));
    }

    @Test
    void verifyThatParameterBaseValueSetWorks() {
        Parameter parameter = new Parameter();
        ParameterOverride poverride = new ParameterOverride();
        ParameterSubscription subscription = new ParameterSubscription();

        ParameterValueSet parameterValueSet = new ParameterValueSet();
        ParameterOverrideValueSet overrideValueset = new ParameterOverrideValueSet();
        ParameterSubscriptionValueSet subscriptionValueset = new ParameterSubscriptionValueSet();

        parameter.getValueSet().add(parameterValueSet);
        poverride.getValueSet().add(overrideValueset);
        subscription.getValueSet().add(subscriptionValueset);

        assertArrayEquals(parameter.getValueSet().toArray(), parameter.getValueSets().toArray());
        assertArrayEquals(poverride.getValueSet().toArray(), poverride.getValueSets().toArray());
        assertArrayEquals(subscription.getValueSet().toArray(), subscription.getValueSets().toArray());
    }
}
