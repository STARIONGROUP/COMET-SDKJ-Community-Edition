/*
 * ShortNameThingComparatorTest.java
 * Copyright (c) 2015 - 2019 RHEA System S.A.
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
