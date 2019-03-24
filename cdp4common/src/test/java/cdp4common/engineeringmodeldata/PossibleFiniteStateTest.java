/*
 * PossibleFiniteStateTest.java
 * Copyright (c) 2015 - 2019 RHEA System S.A.
 */

package cdp4common.engineeringmodeldata;

import cdp4common.exceptions.ContainmentException;
import cdp4common.sitedirectorydata.DomainOfExpertise;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

class PossibleFiniteStateTest {
    @Test
    void testGetOwner() {
        PossibleFiniteState thing = new PossibleFiniteState();
        PossibleFiniteStateList list = new PossibleFiniteStateList();
        list.setOwner(new DomainOfExpertise());
        list.getPossibleState().add(thing);

        Assertions.assertTrue(list.getOwner() == thing.getOwner());
    }

    @Test
    void testGetOwnerThrowEx() {
        PossibleFiniteState thing = new PossibleFiniteState();
        Executable executable = thing::getOwner;
        Assertions.assertThrows(ContainmentException.class, executable);
    }

    @Test
    void verifyIsDefault() {
        PossibleFiniteState thing = new PossibleFiniteState();
        PossibleFiniteStateList list = new PossibleFiniteStateList();

        list.getPossibleState().add(thing);
        Assertions.assertFalse(thing.isDefault());

        list.setDefaultState(thing);
        Assertions.assertTrue(thing.isDefault());
    }
}
