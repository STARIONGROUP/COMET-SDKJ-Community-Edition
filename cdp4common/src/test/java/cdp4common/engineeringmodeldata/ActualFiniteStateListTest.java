/* --------------------------------------------------------------------------------------------------------------------
 *    SimpleParameterValueTest.java
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

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ActualFiniteStateListTest {
    private ActualFiniteStateList actualList;
    private Iteration iteration;
    private EngineeringModel model;

    private PossibleFiniteStateList possibleList1;
    private PossibleFiniteStateList possibleList2;

    @BeforeEach
    void setup() {
        this.actualList = new ActualFiniteStateList(UUID.randomUUID(), null, null);

        this.possibleList1 = new PossibleFiniteStateList(UUID.randomUUID(), null, null);
        possibleList1.setName("list1");
        possibleList1.setShortName("1");
        this.possibleList2 = new PossibleFiniteStateList(UUID.randomUUID(), null, null);
        possibleList2.setName("list2");
        possibleList2.setShortName("2");

        this.actualList.getPossibleFiniteStateList().add(this.possibleList1);
        this.actualList.getPossibleFiniteStateList().add(this.possibleList2);

        this.iteration = new Iteration(UUID.randomUUID(), null, null);
        this.model = new EngineeringModel(UUID.randomUUID(), null, null);

        this.model.getIteration().add(this.iteration);
        this.iteration.getActualFiniteStateList().add(this.actualList);
        this.iteration.getPossibleFiniteStateList().add(this.possibleList1);
        this.iteration.getPossibleFiniteStateList().add(this.possibleList2);
    }

    @Test
    void verifyName() {
        assertEquals("list1 → list2", this.actualList.getName());
    }

    @Test
    void verifyShortName() {
        assertEquals("1.2", this.actualList.getShortName());
    }
}
