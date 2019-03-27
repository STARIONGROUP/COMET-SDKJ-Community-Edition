/*
 * ActualFiniteStateComparatorTest.java
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
package cdp4common.comparators;

import cdp4common.commondata.Thing;
import cdp4common.engineeringmodeldata.ActualFiniteState;
import cdp4common.engineeringmodeldata.ActualFiniteStateList;
import cdp4common.engineeringmodeldata.PossibleFiniteState;
import cdp4common.engineeringmodeldata.PossibleFiniteStateList;
import cdp4common.types.CacheKey;
import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import org.apache.commons.lang3.tuple.Pair;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.net.URI;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

class ActualFiniteStateComparatorTest {
    private final URI uri = URI.create("http://sdk.cdp4.org");
    private Cache<CacheKey, Thing> cache;

    private ActualFiniteStateComparator comparator;

    private PossibleFiniteStateList possibleFiniteStateList_1;
    private PossibleFiniteState possibleFiniteState_1_1;
    private PossibleFiniteState possibleFiniteState_1_2;

    private PossibleFiniteStateList possibleFiniteStateList_2;
    private PossibleFiniteState possibleFiniteState_2_1;
    private PossibleFiniteState possibleFiniteState_2_2;

    private ActualFiniteStateList actualFiniteStateList;
    private ActualFiniteState actualFiniteState_1;
    private ActualFiniteState actualFiniteState_2;
    private ActualFiniteState actualFiniteState_3;
    private ActualFiniteState actualFiniteState_4;

    @BeforeEach
    void setUp() {
        this.cache = CacheBuilder.newBuilder().build();

        this.possibleFiniteStateList_1 = new PossibleFiniteStateList(UUID.randomUUID(), this.cache, this.uri);
        this.possibleFiniteState_1_1 = new PossibleFiniteState(UUID.randomUUID(), this.cache, this.uri);
        this.possibleFiniteState_1_2 = new PossibleFiniteState(UUID.randomUUID(), this.cache, this.uri);
        this.possibleFiniteStateList_1.getPossibleState().add(this.possibleFiniteState_1_1);
        this.possibleFiniteStateList_1.getPossibleState().add(this.possibleFiniteState_1_2);

        this.possibleFiniteStateList_2 = new PossibleFiniteStateList(UUID.randomUUID(), this.cache, this.uri);
        this.possibleFiniteState_2_1 = new PossibleFiniteState(UUID.randomUUID(), this.cache, this.uri);
        this.possibleFiniteState_2_2 = new PossibleFiniteState(UUID.randomUUID(), this.cache, this.uri);
        this.possibleFiniteStateList_2.getPossibleState().add(this.possibleFiniteState_2_1);
        this.possibleFiniteStateList_2.getPossibleState().add(this.possibleFiniteState_2_2);

        this.actualFiniteStateList = new ActualFiniteStateList(UUID.randomUUID(), this.cache, this.uri);
        this.actualFiniteStateList.getPossibleFiniteStateList().insert(1, this.possibleFiniteStateList_1);
        this.actualFiniteState_1 = new ActualFiniteState(UUID.randomUUID(), this.cache, this.uri);
        this.actualFiniteState_1.getPossibleState().add(this.possibleFiniteState_1_1);
        this.actualFiniteState_2 = new ActualFiniteState(UUID.randomUUID(), this.cache, this.uri);
        this.actualFiniteState_2.getPossibleState().add(this.possibleFiniteState_1_2);
        this.actualFiniteState_3 = new ActualFiniteState(UUID.randomUUID(), this.cache, this.uri);
        this.actualFiniteState_3.getPossibleState().add(this.possibleFiniteState_2_1);
        this.actualFiniteState_4 = new ActualFiniteState(UUID.randomUUID(), this.cache, this.uri);
        this.actualFiniteState_4.getPossibleState().add(this.possibleFiniteState_2_2);
        this.actualFiniteStateList.getActualState().add(this.actualFiniteState_1);
        this.actualFiniteStateList.getActualState().add(this.actualFiniteState_2);
        this.actualFiniteStateList.getActualState().add(this.actualFiniteState_3);
        this.actualFiniteStateList.getActualState().add(this.actualFiniteState_4);

        this.comparator = new ActualFiniteStateComparator();
    }

    @Test
    void verify_that_when_containers_are_not_the_same_exception_is_thrown() {
        var otherActualFiniteStateList = new ActualFiniteStateList(UUID.randomUUID(), this.cache, this.uri);
        var otherActualFiniteState = new ActualFiniteState(UUID.randomUUID(), this.cache, this.uri);

        otherActualFiniteStateList.getActualState().add(otherActualFiniteState);

        assertThrows(IllegalArgumentException.class, () -> comparator.compare(this.actualFiniteState_1, otherActualFiniteState));
    }

    @Test
    void verify_that_when_states_are_the_same_result_is_zero() {
        var result = this.comparator.compare(this.actualFiniteState_1, this.actualFiniteState_1);
        assertEquals(0, result);
    }

    @Test
    void verify_that_when_actualStates_contain_no_possibleStates_zero_is_returned() {
        this.actualFiniteState_1.getPossibleState().clear();
        this.actualFiniteState_2.getPossibleState().clear();

        var result = this.comparator.compare(this.actualFiniteState_1, this.actualFiniteState_2);

        assertEquals(0, result);
    }

    @Test
    void verify_that_when_actualState1_is_smaller_than_actualState2_a_negative_number_is_returned() {
        var result = this.comparator.compare(this.actualFiniteState_1, this.actualFiniteState_2);

        assertTrue(result < 0);
    }
}
