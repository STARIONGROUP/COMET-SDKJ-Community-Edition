/*
 * OptionTest.java
 * Copyright (c) 2015 - 2019 RHEA System S.A.
 */

package cdp4common.engineeringmodeldata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class OptionTest {
    @Test
    void verifyThatIsDefaultWorks() {
        Iteration iteration = new Iteration();
        Option option1 = new Option();
        Option option2 = new Option();

        iteration.getOption().add(option1);
        iteration.getOption().add(option2);
        iteration.setDefaultOption(option1);

        assertTrue(option1.isDefault());
        assertFalse(option2.isDefault());
    }
}
