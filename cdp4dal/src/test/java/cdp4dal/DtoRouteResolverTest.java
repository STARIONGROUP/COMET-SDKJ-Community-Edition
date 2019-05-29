/*
 * DtoRouteResolverTest.java
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

package cdp4dal;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import cdp4common.dto.EngineeringModel;
import cdp4common.dto.Iteration;
import cdp4common.dto.PossibleFiniteState;
import cdp4common.dto.PossibleFiniteStateList;
import cdp4common.dto.Thing;
import cdp4common.types.CacheKey;
import cdp4common.types.OrderedItem;
import cdp4dal.exceptions.InstanceNotFoundException;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DtoRouteResolverTest {

  private EngineeringModel model;
  private Iteration iteration;
  private PossibleFiniteStateList stateList;
  private PossibleFiniteState state;
  private Session session;
  private Assembler assembler;
  private URI uri = URI.create("http://test.com");

  private cdp4common.engineeringmodeldata.EngineeringModel pojoModel;
  private cdp4common.engineeringmodeldata.Iteration pojoIt;
  private cdp4common.engineeringmodeldata.PossibleFiniteStateList pojoStateList;
  private cdp4common.engineeringmodeldata.PossibleFiniteState pojoState;

  @BeforeEach
  void setup() {
    this.model = new EngineeringModel(UUID.randomUUID(), 0);
    this.iteration = new Iteration(UUID.randomUUID(), 0);
    this.stateList = new PossibleFiniteStateList(UUID.randomUUID(), 0);
    this.stateList.setIterationContainerId(this.iteration.getIid());
    this.state = new PossibleFiniteState(UUID.randomUUID(), 0);
    this.state.setIterationContainerId(this.iteration.getIid());
    this.model.getIteration().add(this.iteration.getIid());
    this.iteration.getPossibleFiniteStateList().add(this.stateList.getIid());
    var orderedItem = new OrderedItem();
    orderedItem.setK(1);
    orderedItem.setV(this.state.getIid());
    this.stateList.getPossibleState().add(orderedItem);

    this.assembler = new Assembler(this.uri);
    this.session = mock(Session.class);
    when(this.session.getAssembler()).thenReturn(this.assembler);

    this.pojoModel = new cdp4common.engineeringmodeldata.EngineeringModel(this.model.getIid(),
        this.assembler.getCache(), this.uri);
    this.pojoIt = new cdp4common.engineeringmodeldata.Iteration(this.iteration.getIid(),
        this.assembler.getCache(), this.uri);
    this.pojoStateList = new cdp4common.engineeringmodeldata.PossibleFiniteStateList(
        this.stateList.getIid(), this.assembler.getCache(), this.uri);
    this.pojoState = new cdp4common.engineeringmodeldata.PossibleFiniteState(this.state.getIid(),
        this.assembler.getCache(), this.uri);

    this.pojoModel.getIteration().add(pojoIt);
    this.pojoIt.getPossibleFiniteStateList().add(pojoStateList);
    this.pojoStateList.getPossibleState().add(pojoState);
  }

  @Test
  void verifyThatResolveRouteWorks() throws InstanceNotFoundException {
    List<Thing> list = List.of(this.model, this.iteration, this.stateList, this.state);

    DtoRouteResolver.resolveRoute(this.state, list, this.session);
    var route = this.state.getRoute();
    assertEquals(String
        .format("/EngineeringModel/%s/iteration/%s/possibleFiniteStateList/%s/possibleState/%s",
            this.model.getIid(), this.iteration.getIid(), this.stateList.getIid(),
            this.state.getIid()), route);
  }

  @Test
  void verifyThatResolveTopContainerRouteWorks() throws InstanceNotFoundException {
    List<Thing> list = List.of(this.model, this.iteration, this.stateList, this.state);

    DtoRouteResolver.resolveRoute(this.model, list, this.session);
    var route = this.model.getRoute();
    assertEquals(String.format("/EngineeringModel/%s", this.model.getIid()), route);
  }

  @Test
  void verifyThatFullContainmentTreeIsBuiltFromSession() throws InstanceNotFoundException {
    List<Thing> list = List.of(this.state);

    this.assembler.getCache().put(new CacheKey(this.model.getIid(), null), this.pojoModel);
    this.assembler.getCache().put(new CacheKey(this.iteration.getIid(), null), this.pojoIt);
    this.assembler.getCache()
        .put(new CacheKey(this.stateList.getIid(), this.iteration.getIid()), this.pojoStateList);
    this.assembler.getCache()
        .put(new CacheKey(this.state.getIid(), this.iteration.getIid()), this.pojoState);

    DtoRouteResolver.resolveRoute(this.state, list, this.session);
    var route = this.state.getRoute();
    assertEquals(String
        .format("/EngineeringModel/%s/iteration/%s/possibleFiniteStateList/%s/possibleState/%s",
            this.model.getIid(), this.iteration.getIid(), this.stateList.getIid(),
            this.state.getIid()), route);
  }

  @Test
  void verifyThatPartialContainmentTreeIsBuiltFromSession() throws InstanceNotFoundException {
    List<Thing> list = List.of(this.stateList, this.state);

    this.assembler.getCache().put(new CacheKey(this.model.getIid(), null), this.pojoModel);
    this.assembler.getCache().put(new CacheKey(this.iteration.getIid(), null), this.pojoIt);
    this.assembler.getCache()
        .put(new CacheKey(this.stateList.getIid(), this.iteration.getIid()), this.pojoStateList);

    DtoRouteResolver.resolveRoute(this.state, list, this.session);
    var route = this.state.getRoute();
    assertEquals(String
        .format("/EngineeringModel/%s/iteration/%s/possibleFiniteStateList/%s/possibleState/%s",
            this.model.getIid(), this.iteration.getIid(), this.stateList.getIid(),
            this.state.getIid()), route);
  }

  @Test
  void verifyThatExceptionThrown() {
    List<Thing> list = List.of(this.model, this.stateList, this.state);

    assertThrows(InstanceNotFoundException.class,
        () -> DtoRouteResolver.resolveRoute(this.state, list, this.session));
  }

  @Test
  void verifyThatExceptionThrown2() {
    var list = new ArrayList<Thing>();

    assertThrows(InstanceNotFoundException.class,
        () -> DtoRouteResolver.resolveRoute(this.state, list, this.session));
  }

  @Test
  void verifyThatExceptionThrown3() {
    List<Thing> list = List.of(this.state);

    this.pojoState.setContainer(null);
    this.assembler.getCache()
        .put(new CacheKey(this.state.getIid(), this.iteration.getIid()), this.pojoState);

    assertThrows(NullPointerException.class,
        () -> DtoRouteResolver.resolveRoute(this.state, list, this.session));
  }

  @Test
  void verifyThatExceptionThrown4() {
    List<Thing> list = List.of(this.stateList, this.state);

    this.pojoStateList.setContainer(null);
    this.assembler.getCache()
        .put(new CacheKey(this.stateList.getIid(), this.iteration.getIid()), this.pojoStateList);

    assertThrows(NullPointerException.class,
        () -> DtoRouteResolver.resolveRoute(this.state, list, this.session));
  }

  @Test
  void verifyThatNullPointerExceptionIsThrown() {
    assertThrows(NullPointerException.class,
        () -> DtoRouteResolver.resolveRoute(this.state, null, this.session));
  }

  @Test
  void VerifyThatNullPointerExceptionIsThrown2() {
    List<Thing> list = List.of(this.model, this.stateList, this.state);

    assertThrows(NullPointerException.class,
        () -> DtoRouteResolver.resolveRoute(this.state, list, null));
  }
}
