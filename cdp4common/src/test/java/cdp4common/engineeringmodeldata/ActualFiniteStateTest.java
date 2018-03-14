/* --------------------------------------------------------------------------------------------------------------------
 *    ActualFiniteStateTest.java
 *    Copyright (c) 2015-2018 RHEA System S.A.
 *
 *    Author: Sam Gerené, Merlin Bieze, Alex Vorobiev, Naron Phou
 *
 *    This file is part of CDP4-SDK Community Edition
 *
 *    The CDP4-SDK Community Edition is free software; you can redistribute it and/or
 *    modify it under the terms of the GNU Lesser General Public
 *    License as published by the Free Software Foundation; either
 *    version 3 of the License, or (at your option) any later version.
 *
 *    The CDP4-SDK Community Edition is distributed in the hope that it will be useful,
 *    but WITHOUT ANY WARRANTY; without even the implied warranty of
 *    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 *    Lesser General Public License for more details.
 *
 *    You should have received a copy of the GNU Lesser General Public License
 *    along with this program; if not, write to the Free Software Foundation,
 *    Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 *  --------------------------------------------------------------------------------------------------------------------
 */

package cdp4common.engineeringmodeldata;

import cdp4common.exceptions.ContainmentException;
import cdp4common.sitedirectorydata.DomainOfExpertise;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import java.util.UUID;

class ActualFiniteStateTest {
    private ActualFiniteState actualFiniteState;
    private ActualFiniteStateList actualList;
    private Iteration iteration;
    private EngineeringModel model;

    private PossibleFiniteStateList possibleList1;
    private PossibleFiniteStateList possibleList2;

    private PossibleFiniteState possibleState1;
    private PossibleFiniteState possibleState2;

    @BeforeEach
    void setup() {
        this.actualFiniteState = new ActualFiniteState(UUID.randomUUID(), null, null);
        this.actualList = new ActualFiniteStateList(UUID.randomUUID(), null, null);
        this.actualList.setOwner(new DomainOfExpertise(UUID.randomUUID(), null, null));

        this.possibleList1 = new PossibleFiniteStateList(UUID.randomUUID(), null, null);
        this.possibleList2 = new PossibleFiniteStateList(UUID.randomUUID(), null, null);

        this.possibleState1 = new PossibleFiniteState(UUID.randomUUID(), null, null);
        possibleState1.setName("possiblestate1");
        possibleState1.setShortName("1");

        this.possibleState2 = new PossibleFiniteState(UUID.randomUUID(), null, null);
        possibleState2.setName("possiblestate2");
        possibleState2.setShortName("2");

        this.possibleList1.getPossibleState().add(this.possibleState1);
        this.possibleList2.getPossibleState().add(this.possibleState2);

        this.actualFiniteState.getPossibleState().add(this.possibleState1);
        this.actualFiniteState.getPossibleState().add(this.possibleState2);

        this.actualList.getPossibleFiniteStateList().add(this.possibleList1);
        this.actualList.getPossibleFiniteStateList().add(this.possibleList2);

        this.iteration = new Iteration(UUID.randomUUID(), null, null);
        this.model = new EngineeringModel(UUID.randomUUID(), null, null);

        this.model.getIteration().add(this.iteration);
        this.iteration.getActualFiniteStateList().add(this.actualList);
        this.iteration.getPossibleFiniteStateList().add(this.possibleList1);
        this.iteration.getPossibleFiniteStateList().add(this.possibleList2);
        this.actualList.getActualState().add(this.actualFiniteState);
    }

    @Test
    void verifyThatGetNameWorks() {
        Assertions.assertNotNull(this.actualFiniteState.getName());
        Assertions.assertFalse(this.actualFiniteState.getName().isEmpty());
        Assertions.assertEquals("possiblestate1 → possiblestate2", this.actualFiniteState.getName());
    }

    @Test
    void verifyThatGetShortNameNameWorks() {
        Assertions.assertNotNull(this.actualFiniteState.getShortName());
        Assertions.assertFalse(this.actualFiniteState.getShortName().isEmpty());
        Assertions.assertEquals("1.2", this.actualFiniteState.getShortName());
    }

    @Test
    void verifyThatGetOwnerWorks() {
        Assertions.assertNotNull(this.actualFiniteState.getOwner());
        Assertions.assertTrue(this.actualList.getOwner() == this.actualFiniteState.getOwner());
    }

    @Test
    void verifyThatNullContainerThrowException() {
        this.actualFiniteState = new ActualFiniteState(UUID.randomUUID(), null, null);
        Executable executable = () -> this.actualFiniteState.getName();
        Assertions.assertThrows(ContainmentException.class, executable);
    }

    @Test
    void verifyThatNullContainerThrowException2() {
        this.actualFiniteState = new ActualFiniteState(UUID.randomUUID(), null, null);
        Executable executable = () -> this.actualFiniteState.getShortName();
        Assertions.assertThrows(ContainmentException.class, executable);
    }

    @Test
    void verifyThatNullContainerThrowException3() {
        this.actualFiniteState = new ActualFiniteState(UUID.randomUUID(), null, null);
        Executable executable = () -> this.actualFiniteState.getOwner();
        Assertions.assertThrows(ContainmentException.class, executable);
    }

    @Test
    void verifyIsDefaultWorks() {
        Assertions.assertFalse(this.actualFiniteState.isDefault());
        this.possibleList1.setDefaultState(this.possibleState1);

        Assertions.assertFalse(this.actualFiniteState.isDefault());
        this.possibleList2.setDefaultState(this.possibleState2);
        Assertions.assertTrue(this.actualFiniteState.isDefault());
    }
}
