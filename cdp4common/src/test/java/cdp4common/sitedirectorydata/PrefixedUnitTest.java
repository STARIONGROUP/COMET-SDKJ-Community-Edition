/*
 * PrefixedUnitTest.java
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

package cdp4common.sitedirectorydata;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PrefixedUnitTest {
    private PrefixedUnit prefixedUnit;
    private UnitPrefix unitPrefix;
    private MeasurementUnit measurementUnit;

    @BeforeEach
    void setup() {
        this.prefixedUnit = new PrefixedUnit();

        this.unitPrefix = new UnitPrefix();
        this.unitPrefix.setConversionFactor("conv");
        this.unitPrefix.setName("unit");
        this.unitPrefix.setShortName("u");

        this.measurementUnit = new SimpleUnit();
        this.measurementUnit.setName("measurement");
        this.measurementUnit.setShortName("m");
    }

    @Test
    void testGetConversion() {
        this.prefixedUnit.setPrefix(this.unitPrefix);
        assertEquals("conv", this.prefixedUnit.getConversionFactor());
    }

    @Test
    void testGetConversionEmpty() {
        assertEquals(this.prefixedUnit.getConversionFactor().length(), 0);
    }

    @Test
    void testGetName() {
        this.prefixedUnit.setPrefix(this.unitPrefix);
        this.prefixedUnit.setReferenceUnit(this.measurementUnit);
        assertEquals("unitmeasurement", this.prefixedUnit.getName());
    }

    @Test
    void testGetNameEmpty() {
        assertEquals(this.prefixedUnit.getName().length(), 0);
    }

    @Test
    void testGetShortName() {
        this.prefixedUnit.setPrefix(this.unitPrefix);
        this.prefixedUnit.setReferenceUnit(this.measurementUnit);
        assertEquals("um", this.prefixedUnit.getShortName());
    }

    @Test
    void testGetShortNameEmpty() {
        assertEquals(this.prefixedUnit.getShortName().length(), 0);
    }
}
