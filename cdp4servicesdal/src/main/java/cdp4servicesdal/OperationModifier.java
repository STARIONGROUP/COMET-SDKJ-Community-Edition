/*
 * OperationModifier.java
 *
 * Copyright (c) 2015-2024 Starion Group S.A.
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

package cdp4servicesdal;

import static cdp4common.helpers.Utils.as;

import cdp4common.commondata.Thing;
import cdp4common.dto.ActualFiniteState;
import cdp4common.engineeringmodeldata.ActualFiniteStateKind;
import cdp4common.engineeringmodeldata.ActualFiniteStateList;
import cdp4common.engineeringmodeldata.PossibleFiniteStateList;
import cdp4dal.Session;
import cdp4dal.operations.Operation;
import cdp4dal.operations.OperationContainer;
import cdp4dal.operations.OperationKind;
import com.google.common.collect.MoreCollectors;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

/**
 * The purpose of the {@link OperationModifier} is to perform operations that are not performed
 * directly by the server
 */
class OperationModifier {

  /**
   * The {@link Session} associated.
   */
  private final Session session;

  /**
   * Initializes a new instance of the {@link OperationModifier} class.
   *
   * @param session The {@link Session}.
   */
  OperationModifier(Session session) {
    this.session = session;
  }

  /**
   * Modify the {@link OperationContainer} to compensate for operations that should be performed by
   * the data-source but is not by the WSP.
   *
   * @param operationContainer The {@link OperationContainer} to modify.
   */
  void modifyOperationContainer(OperationContainer operationContainer) {
    ArrayList<Operation> operationsToAdd = new ArrayList<Operation>();

    for (Operation operation : operationContainer.getOperations()) {
      if (operation.getOperationKind() == OperationKind.UPDATE) {
        cdp4common.dto.PossibleFiniteStateList possibleStateList = as(operation.getModifiedThing(),
            cdp4common.dto.PossibleFiniteStateList.class);
        if (possibleStateList != null) {
          operationsToAdd
              .addAll(this.modifyActualStateKindOnDefaultPossibleStateUpdate(possibleStateList));
        }
      }
    }

    for (Operation operation : operationsToAdd) {
      operationContainer.addOperation(operation);
    }
  }

  /**
   * Modify the {@link ActualFiniteState#getKind()} state of the potential new default actual state
   * to "Mandatory".
   *
   * @param possibleFiniteStateList The updated {@link cdp4common.dto.PossibleFiniteStateList}.
   * @return A {@link List} of new {@link Operation}s.
   */
  private List<Operation> modifyActualStateKindOnDefaultPossibleStateUpdate(
      cdp4common.dto.PossibleFiniteStateList possibleFiniteStateList) {
    ArrayList<Operation> operations = new ArrayList<Operation>();
    UUID defaultStateId = possibleFiniteStateList.getDefaultState();
    if (defaultStateId == null || defaultStateId.equals(new UUID(0L, 0L))) {
      return operations;
    }

    // gets the actualList that uses the updated possible list
    List<ActualFiniteStateList> actualLists = this.session.getAssembler().getCache()
        .asMap()
        .values()
        .stream()
        .filter(x -> x instanceof ActualFiniteStateList)
        .map(x -> (ActualFiniteStateList) x)
        .filter(x -> x.getPossibleFiniteStateList()
            .stream()
            .map(Thing::getIid)
            .anyMatch(y -> y.equals(possibleFiniteStateList.getIid()))
        )
        .collect(Collectors.toList());

    for (ActualFiniteStateList actualFiniteStateList : actualLists) {
      List<PossibleFiniteStateList> possibleLists = actualFiniteStateList.getPossibleFiniteStateList()
          .stream()
          .filter(x -> !x.getIid().equals(possibleFiniteStateList.getIid()))
          .collect(Collectors.toList());

      if (possibleLists
          .stream()
          .anyMatch(x -> x.getDefaultState() == null)) {
        // One of the possible list has no default state
        continue;
      }

      List<UUID> defaultPossibleStatesIds = possibleLists
          .stream()
          .map(x -> x.getDefaultState().getIid())
          .collect(Collectors.toList());

      defaultPossibleStatesIds.add(defaultStateId);

      // get the "default" actual state
      cdp4common.engineeringmodeldata.ActualFiniteState defaultActualState =
          actualFiniteStateList.getActualState()
              .stream()
              .filter(x -> {
                List<UUID> list = x.getPossibleState()
                    .stream()
                    .map(Thing::getIid)
                    .collect(Collectors.toList());
                list.retainAll(defaultPossibleStatesIds);

                return list.size() == defaultPossibleStatesIds.size();
              })
              .collect(MoreCollectors.toOptional())
              .orElse(null);

      if (defaultActualState == null
          || defaultActualState.getKind() == ActualFiniteStateKind.MANDATORY) {
        continue;
      }

      // The new default is forbidden, send update with mandatory
      ActualFiniteState actualStateDto = (ActualFiniteState) defaultActualState.toDto();
      actualStateDto.setKind(ActualFiniteStateKind.MANDATORY);
      Operation newOperation = new Operation(defaultActualState.toDto(), actualStateDto,
          OperationKind.UPDATE);
      operations.add(newOperation);
    }

    return operations;
  }
}
