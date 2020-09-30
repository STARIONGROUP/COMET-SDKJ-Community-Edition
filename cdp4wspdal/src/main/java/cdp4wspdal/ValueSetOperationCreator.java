/*
 * ValueSetOperationCreator.java
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


package cdp4wspdal;

import cdp4common.commondata.ClassKind;
import cdp4common.dto.Thing;
import cdp4common.engineeringmodeldata.Iteration;
import cdp4common.engineeringmodeldata.ParameterBase;
import cdp4common.engineeringmodeldata.ParameterSubscriptionValueSet;
import cdp4common.engineeringmodeldata.ParameterValueSetBase;
import cdp4common.engineeringmodeldata.ValueSet;
import cdp4dal.DtoRouteResolver;
import cdp4dal.Session;
import cdp4dal.operations.Operation;
import cdp4dal.operations.OperationContainer;
import cdp4dal.operations.OperationKind;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.google.common.collect.MoreCollectors;
import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;
import java.util.UUID;
import java.util.stream.Collectors;

/**
 * The class that compensate operations non performed directly by the WSP.
 */
class ValueSetOperationCreator {

  /**
   * The {@link Session} associated.
   */
  private final Session session;

  /**
   * Initializes a new instance of the {@link ValueSetOperationCreator} class.
   *
   * @param session The {@link Session}.
   */
  ValueSetOperationCreator(Session session) {
    this.session = session;
  }

  /**
   * Computes a {@link OperationContainer} that contains update operations on value-sets.
   *
   * @param context The route of the {@link cdp4common.dto.SiteDirectory} or {@link Iteration} for
   * which the current {@link OperationContainer} is valid.
   * @param dtos The returned {@link Thing}s.
   * @param copyThingMap The copy map containing the original {@link Thing} associated to their
   * copy.
   * @return The {@link OperationContainer}.
   */
  OperationContainer createValueSetsUpdateOperations(String context,
      List<Thing> dtos,
      ImmutableMap<cdp4common.commondata.Thing, cdp4common.commondata.Thing> copyThingMap) {
    ArrayList<Thing> dtolist = Lists.newArrayList(dtos);

    Thing topContainer = dtolist
        .stream()
        .filter(x -> x instanceof cdp4common.dto.TopContainer)
        .collect(MoreCollectors.toOptional()).orElse(null);

    if (topContainer == null) {
      throw new IllegalArgumentException(
          "No Top container were found in the returned list of dtos.");
    }

    // Gets the parameter base which value set shall be updated
    List<cdp4common.dto.ParameterBase> copyParameterBases = dtolist
        .stream()
        .filter(x -> x instanceof cdp4common.dto.ParameterBase)
        .map(x -> (cdp4common.dto.ParameterBase) x)
        .collect(Collectors.toList());

    List<UUID> copyParameterBasesIds = copyParameterBases
        .stream()
        .map(x -> x.getIid())
        .collect(Collectors.toList());

    List<Thing> valueSets = dtolist
        .stream()
        .filter(dto -> dto.getClassKind() == ClassKind.ParameterValueSet
            || dto.getClassKind() == ClassKind.ParameterSubscriptionValueSet
            || dto.getClassKind() == ClassKind.ParameterOverrideValueSet
        )
        .collect(Collectors.toList());

    this.computeRoutes(valueSets, dtolist);
    List<Thing> valueSetsClones = valueSets
        .stream()
        .map(dto -> dto.deepClone(Thing.class))
        .collect(Collectors.toList());

    // The original of the copy are normally in the map
    List<Entry<cdp4common.commondata.Thing, cdp4common.commondata.Thing>> originalParameterBases = copyThingMap
        .entrySet()
        .stream()
        .filter(x -> copyParameterBasesIds.contains(x.getValue().getIid()))
        .collect(Collectors.toList());

    // set the values
    for (Entry<cdp4common.commondata.Thing, cdp4common.commondata.Thing> copyPair : originalParameterBases) {
      UUID copyId = copyPair.getValue().getIid();
      ParameterBase originalParameter = (ParameterBase) copyPair.getKey();
      cdp4common.dto.ParameterBase copyDto = copyParameterBases
          .stream()
          .filter(x -> x.getIid().equals(copyId))
          .collect(MoreCollectors.onlyElement());

      // value sets to update
      List<Thing> copyValueSets = valueSetsClones
          .stream()
          .filter(x -> copyDto.getValueSets().contains(x.getIid()))
          .collect(Collectors.toList());

      ValueSet defaultValueSet = this.getDefaultValueSet(originalParameter);
      if (defaultValueSet == null) {
        continue;
      }

      this.setValueSetValues(copyValueSets, defaultValueSet);
    }

    OperationContainer operationContainer = new OperationContainer(context, topContainer.getRevisionNumber());
    for (Thing valueSetsClone : valueSetsClones) {
      Thing valueSetToUpdate = valueSets
          .stream()
          .filter(x -> x.getIid().equals(valueSetsClone.getIid()))
          .collect(MoreCollectors.onlyElement());

      Operation operation = new Operation(valueSetToUpdate, valueSetsClone, OperationKind.UPDATE);
      operationContainer.addOperation(operation);
    }

    return operationContainer;
  }

  /**
   * Computes the routes of a set of {@link Thing}s contained in a bigger list.
   *
   * @param dtos The set of {@link Thing} to compute.
   * @param dtoList The list returned by the data-source.
   */
  private void computeRoutes(List<Thing> dtos, List<Thing> dtoList) {
    for (Thing valueSet : dtos) {
      DtoRouteResolver.resolveRoute(valueSet, dtoList, this.session);
    }
  }

  /**
   * Gets the {@link ValueSet} to copy.
   *
   * @param parameterBase The {@link ParameterBase} which {@link ValueSet} shall be copied.
   * @return The default {@link ValueSet} to copy or null.
   */
  private ValueSet getDefaultValueSet(ParameterBase parameterBase) {
    // single value set in original
    if (parameterBase.getValueSets().size() == 1) {
      return parameterBase.getValueSets().get(0);
    }

    if (parameterBase.isOptionDependent() && parameterBase.getStateDependence() != null) {
      return parameterBase.getValueSets()
          .stream()
          .filter(x -> x.getActualState().isDefault() && x.getActualOption().isDefault())
          .findFirst()
          .orElse(null);
    }

    if (parameterBase.getStateDependence() != null) {
      return parameterBase.getValueSets()
          .stream()
          .filter(x -> x.getActualState().isDefault())
          .findFirst()
          .orElse(null);
    }

    return parameterBase.getValueSets()
        .stream()
        .filter(x -> x.getActualOption().isDefault())
        .findFirst()
        .orElse(null);
  }

  /**
   * Set the values of the copied {@link Thing}s representing value-sets.
   *
   * @param things The copied {@link Thing} representing a value-set.
   * @param originalValueSet The original {@link ValueSet} to copy.
   */
  private void setValueSetValues(List<Thing> things, ValueSet originalValueSet) {
    for (Thing thing : things) {
      switch (thing.getClassKind()) {
        case ParameterValueSet:
        case ParameterOverrideValueSet:
          this.setValueSetValues((cdp4common.dto.ParameterValueSetBase) thing,
              (ParameterValueSetBase) originalValueSet);
          break;
        case ParameterSubscriptionValueSet:
          this.setValueSetValues((cdp4common.dto.ParameterSubscriptionValueSet) thing,
              (ParameterSubscriptionValueSet) originalValueSet);
          break;
      }
    }
  }

  /**
   * Set the values of the {@link cdp4common.dto.ParameterValueSetBase} with the values of an
   * original {@link ParameterValueSetBase}.
   *
   * @param valueSet The {@link cdp4common.dto.ParameterValueSetBase}.
   * @param originalValueSet The {@link ParameterValueSetBase}.
   */
  private void setValueSetValues(cdp4common.dto.ParameterValueSetBase valueSet,
      ParameterValueSetBase originalValueSet) {
    valueSet.setManual(originalValueSet.getManual());
    valueSet.setReference(originalValueSet.getReference());
    valueSet.setValueSwitch(originalValueSet.getValueSwitch());
    valueSet.setFormula(originalValueSet.getFormula());
    valueSet.setComputed(originalValueSet.getComputed());
  }

  /**
   * Set the values of the {@link cdp4common.dto.ParameterSubscriptionValueSet} with the values of
   * an original {@link ParameterSubscriptionValueSet}.
   *
   * @param valueSet The {@link cdp4common.dto.ParameterSubscriptionValueSet}.
   * @param originalValueSet The {@link ParameterSubscriptionValueSet}.
   */
  private void setValueSetValues(cdp4common.dto.ParameterSubscriptionValueSet valueSet,
      ParameterSubscriptionValueSet originalValueSet) {
    valueSet.setManual(originalValueSet.getManual());
    valueSet.setValueSwitch(originalValueSet.getValueSwitch());
  }
}
