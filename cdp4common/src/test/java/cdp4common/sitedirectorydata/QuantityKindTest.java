/*
 * QuantityKindTest.java
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
