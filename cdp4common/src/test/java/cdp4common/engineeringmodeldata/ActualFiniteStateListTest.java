/*
 * SimpleParameterValueTest.java
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

package cdp4common.engineeringmodeldata;

import cdp4common.comparators.ActualFiniteStateComparator;
import cdp4common.types.ContainerList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class ActualFiniteStateListTest {
    private ActualFiniteStateList actualList;
    private Iteration iteration;
    private EngineeringModel model;

    private PossibleFiniteStateList possibleList1;
    private PossibleFiniteStateList possibleList2;
    private PossibleFiniteStateList possibleList3;

    @BeforeEach
    void setup() {
        this.actualList = new ActualFiniteStateList(UUID.randomUUID(), null, null);

        this.possibleList1 = new PossibleFiniteStateList(UUID.randomUUID(), null, null);
        possibleList1.setName("list1");
        possibleList1.setShortName("1");
        this.possibleList2 = new PossibleFiniteStateList(UUID.randomUUID(), null, null);
        possibleList2.setName("list2");
        possibleList2.setShortName("2");
        this.possibleList3 = new PossibleFiniteStateList(UUID.randomUUID(), null, null);
        possibleList3.setName("list3");
        possibleList3.setShortName("3");

        this.actualList.getPossibleFiniteStateList().add(this.possibleList1);
        this.actualList.getPossibleFiniteStateList().add(this.possibleList2);
        this.actualList.getPossibleFiniteStateList().add(this.possibleList3);

        this.iteration = new Iteration(UUID.randomUUID(), null, null);
        this.model = new EngineeringModel(UUID.randomUUID(), null, null);

        this.model.getIteration().add(this.iteration);
        this.iteration.getActualFiniteStateList().add(this.actualList);
        this.iteration.getPossibleFiniteStateList().add(this.possibleList1);
        this.iteration.getPossibleFiniteStateList().add(this.possibleList2);
        this.iteration.getPossibleFiniteStateList().add(this.possibleList3);

      PossibleFiniteState ps11 = new PossibleFiniteState(UUID.randomUUID(), null, null);
        ps11.setShortName("11");
        ps11.setName("11");
      PossibleFiniteState ps12 = new PossibleFiniteState(UUID.randomUUID(), null, null);
        ps12.setShortName("12");
        ps12.setName("12");
      PossibleFiniteState ps21 = new PossibleFiniteState(UUID.randomUUID(), null, null);
        ps21.setShortName("21");
        ps21.setName("21");
      PossibleFiniteState ps22 = new PossibleFiniteState(UUID.randomUUID(), null, null);
        ps22.setShortName("22");
        ps22.setName("22");

      PossibleFiniteState ps31 = new PossibleFiniteState(UUID.randomUUID(), null, null);
        ps31.setShortName("31");
        ps31.setName("31");
      PossibleFiniteState ps32 = new PossibleFiniteState(UUID.randomUUID(), null, null);
        ps32.setShortName("32");
        ps32.setName("32");
      PossibleFiniteState ps33 = new PossibleFiniteState(UUID.randomUUID(), null, null);
        ps33.setShortName("33");
        ps33.setName("33");

        this.possibleList1.getPossibleState().add(ps11);
        this.possibleList1.getPossibleState().add(ps12);

        this.possibleList2.getPossibleState().add(ps21);
        this.possibleList2.getPossibleState().add(ps22);

        this.possibleList3.getPossibleState().add(ps31);
        this.possibleList3.getPossibleState().add(ps32);
        this.possibleList3.getPossibleState().add(ps33);

      ActualFiniteState as1 = new ActualFiniteState(UUID.randomUUID(), null, null);
      ActualFiniteState as2 = new ActualFiniteState(UUID.randomUUID(), null, null);
      ActualFiniteState as3 = new ActualFiniteState(UUID.randomUUID(), null, null);
      ActualFiniteState as4 = new ActualFiniteState(UUID.randomUUID(), null, null);
      ActualFiniteState as5 = new ActualFiniteState(UUID.randomUUID(), null, null);
      ActualFiniteState as6 = new ActualFiniteState(UUID.randomUUID(), null, null);
      ActualFiniteState as7 = new ActualFiniteState(UUID.randomUUID(), null, null);
      ActualFiniteState as8 = new ActualFiniteState(UUID.randomUUID(), null, null);
      ActualFiniteState as9 = new ActualFiniteState(UUID.randomUUID(), null, null);
      ActualFiniteState as10 = new ActualFiniteState(UUID.randomUUID(), null, null);
      ActualFiniteState as11 = new ActualFiniteState(UUID.randomUUID(), null, null);
      ActualFiniteState as12 = new ActualFiniteState(UUID.randomUUID(), null, null);

        as1.getPossibleState().add(ps11);
        as1.getPossibleState().add(ps21);
        as1.getPossibleState().add(ps31);

        as2.getPossibleState().add(ps11);
        as2.getPossibleState().add(ps21);
        as2.getPossibleState().add(ps32);

        as3.getPossibleState().add(ps11);
        as3.getPossibleState().add(ps21);
        as3.getPossibleState().add(ps33);

        as4.getPossibleState().add(ps11);
        as4.getPossibleState().add(ps22);
        as4.getPossibleState().add(ps31);

        as5.getPossibleState().add(ps11);
        as5.getPossibleState().add(ps22);
        as5.getPossibleState().add(ps32);

        as6.getPossibleState().add(ps11);
        as6.getPossibleState().add(ps22);
        as6.getPossibleState().add(ps33);

        as7.getPossibleState().add(ps12);
        as7.getPossibleState().add(ps21);
        as7.getPossibleState().add(ps31);

        as8.getPossibleState().add(ps12);
        as8.getPossibleState().add(ps21);
        as8.getPossibleState().add(ps32);

        as9.getPossibleState().add(ps12);
        as9.getPossibleState().add(ps21);
        as9.getPossibleState().add(ps33);

        as10.getPossibleState().add(ps12);
        as10.getPossibleState().add(ps22);
        as10.getPossibleState().add(ps31);

        as11.getPossibleState().add(ps12);
        as11.getPossibleState().add(ps22);
        as11.getPossibleState().add(ps32);

        as12.getPossibleState().add(ps12);
        as12.getPossibleState().add(ps22);
        as12.getPossibleState().add(ps33);

        this.actualList.getActualState().add(as3);
        this.actualList.getActualState().add(as12);
        this.actualList.getActualState().add(as6);
        this.actualList.getActualState().add(as2);
        this.actualList.getActualState().add(as11);
        this.actualList.getActualState().add(as5);
        this.actualList.getActualState().add(as4);
        this.actualList.getActualState().add(as1);
        this.actualList.getActualState().add(as7);
        this.actualList.getActualState().add(as10);
        this.actualList.getActualState().add(as8);
        this.actualList.getActualState().add(as9);
    }

    @Test
    void verifyName() {
        assertEquals("list1 → list2 → list3", this.actualList.getName());
    }

    @Test
    void verifyShortName() {
        assertEquals("1.2.3", this.actualList.getShortName());
    }
    
    @Test
     void verifyOrderStateWorks()
    {
        assertNotEquals(this.actualList.getActualState().get(0).getShortName(), "11.21.31");
        this.actualList.getActualState().sort(new ActualFiniteStateComparator());
      ContainerList<ActualFiniteState> orderedStates = this.actualList.getActualState();

        assertEquals(orderedStates.get(0).getShortName(), "11.21.31");
        assertEquals(orderedStates.get(1).getShortName(), "11.21.32");
        assertEquals(orderedStates.get(2).getShortName(), "11.21.33");
        assertEquals(orderedStates.get(3).getShortName(), "11.22.31");
        assertEquals(orderedStates.get(4).getShortName(), "11.22.32");
        assertEquals(orderedStates.get(5).getShortName(), "11.22.33");
        assertEquals(orderedStates.get(6).getShortName(), "12.21.31");
        assertEquals(orderedStates.get(7).getShortName(), "12.21.32");
        assertEquals(orderedStates.get(8).getShortName(), "12.21.33");
        assertEquals(orderedStates.get(9).getShortName(), "12.22.31");
        assertEquals(orderedStates.get(10).getShortName(), "12.22.32");
        assertEquals(orderedStates.get(11).getShortName(), "12.22.33");
    }
}
