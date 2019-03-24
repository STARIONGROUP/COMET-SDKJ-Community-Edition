/*
 * ParameterValueSetBaseTest.java
 * Copyright (c) 2015 - 2019 RHEA System S.A.
 */

package cdp4common.engineeringmodeldata;

import cdp4common.exceptions.ContainmentException;
import cdp4common.sitedirectorydata.DomainOfExpertise;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParameterValueSetBaseTest {
    private ParameterValueSetBase parameterValueSetBase;

    @BeforeEach
    void setup() {
        this.parameterValueSetBase = new ParameterValueSet();
    }

    @Test
    void testGetActualValue() {
        this.parameterValueSetBase.setValueSwitch(ParameterSwitchKind.COMPUTED);
        assertEquals(this.parameterValueSetBase.getComputed(), this.parameterValueSetBase.getActualValue());

        this.parameterValueSetBase.setValueSwitch(ParameterSwitchKind.REFERENCE);
        assertEquals(this.parameterValueSetBase.getReference(), this.parameterValueSetBase.getActualValue());

        this.parameterValueSetBase.setValueSwitch(ParameterSwitchKind.MANUAL);
        assertEquals(this.parameterValueSetBase.getManual(), this.parameterValueSetBase.getActualValue());
    }

    @Test
    void testGetOwner1() {
        Parameter container = new Parameter();
        container.setOwner(new DomainOfExpertise());

        container.getValueSet().add((ParameterValueSet) this.parameterValueSetBase);

        assertTrue(container.getOwner() == this.parameterValueSetBase.getOwner());
    }

    @Test
    void testGetOwner2() {
        ParameterOverride container = new ParameterOverride();
        container.setOwner(new DomainOfExpertise());
        this.parameterValueSetBase = new ParameterOverrideValueSet();

        container.getValueSet().add((ParameterOverrideValueSet) this.parameterValueSetBase);

        assertTrue(container.getOwner() == this.parameterValueSetBase.getOwner());
    }

    @Test
    void testGetOwnerThrowsEx() {
        assertThrows(ContainmentException.class, () -> this.parameterValueSetBase.getOwner());
    }
}
