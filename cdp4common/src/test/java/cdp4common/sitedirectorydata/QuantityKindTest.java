/*
 * QuantityKindTest.java
 * Copyright (c) 2015 - 2019 RHEA System S.A.
 */

package cdp4common.sitedirectorydata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class QuantityKindTest {
    @Test
    void testGetAllPossibleScale() {
        SimpleQuantityKind quantityKind = new SimpleQuantityKind();
        quantityKind.getPossibleScale().add(new LogarithmicScale());

        assertEquals(1, quantityKind.getAllPossibleScale().size());
    }

    @Test
    void testGetAllPossibleScaleSpecialized() {
        SpecializedQuantityKind quantityKind = new SpecializedQuantityKind();

        LogarithmicScale scale = new LogarithmicScale();
        quantityKind.getPossibleScale().add(scale);

        quantityKind.setGeneral(new SimpleQuantityKind());
        quantityKind.getGeneral().getPossibleScale().add(new RatioScale());
        quantityKind.getGeneral().getPossibleScale().add(new CyclicRatioScale());
        quantityKind.getGeneral().getPossibleScale().add(scale);

        assertEquals(3, quantityKind.getAllPossibleScale().size());
    }

    @Test
    void testGetDerivedQuantityDimensionExponent() {
        SpecializedQuantityKind quantityKind = new SpecializedQuantityKind();
        assertThrows(UnsupportedOperationException.class, quantityKind::getQuantityDimensionExponent);
    }

    @Test
    void testGetDerivedQuantityDimensionExpression() {
        SpecializedQuantityKind quantityKind = new SpecializedQuantityKind();
        assertThrows(UnsupportedOperationException.class, quantityKind::getQuantityDimensionExpression);
    }
}
