/*
 * NestedParameterTest.java
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

import cdp4common.sitedirectorydata.SimpleQuantityKind;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NestedParameterTest {
    private SimpleQuantityKind simpleQuantityKind;
    private Parameter parameter;
    private NestedParameter nestedParameter;

    @BeforeEach
    void setup() {
        this.simpleQuantityKind = new SimpleQuantityKind();
        this.simpleQuantityKind.setShortName("TST");
        this.simpleQuantityKind.setName("TEST");
        this.parameter = new Parameter();
        this.parameter.setParameterType(this.simpleQuantityKind);
        this.nestedParameter = new NestedParameter();
        this.nestedParameter.setAssociatedParameter(this.parameter);
    }

    @Test
    void verifyThatUserFriendlyShortNameReturnsExpectedResult() {
        assertEquals("TST", this.nestedParameter.getUserFriendlyShortName());
    }

    @Test
    void verifyThatUserFriendlyNameReturnsExpectedResult() {
        assertEquals("TST", this.nestedParameter.getUserFriendlyName());
    }
}
