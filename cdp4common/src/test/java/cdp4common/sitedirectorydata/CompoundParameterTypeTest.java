/*
 * CompoundParameterTypeTest.java
 * Copyright (c) 2015 - 2019 RHEA System S.A.
 */

package cdp4common.sitedirectorydata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CompoundParameterTypeTest {
    @Test
    void verifyThatNumberOfValuesIsCorrect() {
        CompoundParameterType compound = new CompoundParameterType();

        CompoundParameterType compound2 = new CompoundParameterType();
        EnumerationParameterType scalar = new EnumerationParameterType();

        ParameterTypeComponent scalarc1 = new ParameterTypeComponent();
        scalarc1.setParameterType(scalar);
        compound2.getComponent().add(scalarc1);

        ParameterTypeComponent compound2Component = new ParameterTypeComponent();
        compound2Component.setParameterType(compound2);

        compound.getComponent().add(compound2Component);
        compound.getComponent().add(scalarc1);

        assertEquals(2, compound.getNumberOfValues());
    }
}
