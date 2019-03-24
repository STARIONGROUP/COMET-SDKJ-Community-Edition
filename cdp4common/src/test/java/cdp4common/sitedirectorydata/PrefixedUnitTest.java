/*
 * PrefixedUnitTest.java
 * Copyright (c) 2015 - 2019 RHEA System S.A.
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
