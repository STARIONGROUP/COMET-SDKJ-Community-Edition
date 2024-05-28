/*
 * ShortNameThingComparatorTest.java
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

import cdp4common.sitedirectorydata.DomainOfExpertise;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ShortNameThingComparatorTest {
    private DomainOfExpertise domainOfExpertise_1;
    private DomainOfExpertise domainOfExpertise_2;
    private ShortNameThingComparator comparer;

    @BeforeEach
    void setUp() {
        this.comparer = new ShortNameThingComparator();

        this.domainOfExpertise_1 = new DomainOfExpertise();
        this.domainOfExpertise_2 = new DomainOfExpertise();
    }

    @Test
    void verifyThatCompareIsCaseInsensitive() {
        this.domainOfExpertise_1.setShortName("a");
        this.domainOfExpertise_2.setShortName("A");

        assertEquals(0, this.comparer.compare(this.domainOfExpertise_1, this.domainOfExpertise_2));
    }
}
