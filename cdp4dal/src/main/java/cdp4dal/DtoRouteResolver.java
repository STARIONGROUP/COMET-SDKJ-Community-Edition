/*
 * DtoRouteResolver.java
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

import cdp4common.dto.Thing;
import cdp4common.dto.TopContainer;
import cdp4common.types.CacheKey;
import cdp4dal.exceptions.InstanceNotFoundException;
import com.google.common.collect.MoreCollectors;
import java.util.List;
import java.util.Optional;

/**
 * A class that resolve the route of a {@link Thing}
 */
public class DtoRouteResolver {

  /**
   * Resolve the route of a {@link Thing} from a {@link List} that contains all its containers.
   *
   * @param thing The {@link Thing} to resolve.
   * @param dtoList The {@link List} that shall contain.
   * @param session The {@link Session} associated to the {@link Thing}.
   * @throws NullPointerException The arguments cannot be null.
   * @throws InstanceNotFoundException If the container cannot be found.
   * @throws IllegalArgumentException If the multiple containers are found for one thing.
   * @throws NullPointerException The containment tree is broken for a {@code Pojo} currently in the
   * {@link Session}.
   */
  public static void resolveRoute(Thing thing, List<Thing> dtoList, Session session)
      throws InstanceNotFoundException {
    if (dtoList == null) {
      throw new NullPointerException("dtolist");
    }

    if (session == null) {
      throw new NullPointerException("session");
    }

    if (thing instanceof TopContainer) {
      return;
    }

    var dtos = List.copyOf(dtoList);
    Optional<Thing> container = dtos
        .stream()
        .filter(dto -> dto.contains(thing))
        .collect(MoreCollectors.toOptional());
    if (container.isEmpty()) {
      // The container is not in the list of dtos, search in the current Session
      var containerFromCache = session.getAssembler().getCache()
          .getIfPresent(new CacheKey(thing.getIid(), thing.getIterationContainerId()));
      if (containerFromCache == null) {
        throw new InstanceNotFoundException(String
            .format("The %s with id %s could not be found", thing.CLASS_KIND, thing.getIid()));
      }

      // Build the complete containment tree
      addContainerCompleteTree(thing, containerFromCache);
      return;
    }

    // The container is in the list of dtos
    thing.addContainer(container.get().CLASS_KIND, container.get().getIid());
    while (!(container.get() instanceof TopContainer)) {
      var previousContainer = container.get();
      container = dtos
          .stream()
          .filter(dto -> dto.contains(previousContainer))
          .collect(MoreCollectors.toOptional());
      if (container.isPresent()) {
        thing.addContainer(container.get().CLASS_KIND, container.get().getIid());
        continue;
      }

      // One of the containers cannot be found in the list of dtos -> search in the current Session
      // and build the partial tree up to the top container
      var containerFromCache = session.getAssembler().getCache().getIfPresent(
          new CacheKey(previousContainer.getIid(), previousContainer.getIterationContainerId()));
      if (containerFromCache == null) {
        throw new InstanceNotFoundException(String
            .format("The %s with id %s could not be found", previousContainer.CLASS_KIND,
                previousContainer.getIid()));
      }

      addContainerPartialTree(thing, containerFromCache);
      break;
    }
  }

  /**
   * Build the full containment tree for a {@link Thing} from its associated {@code Pojo}.
   *
   * @param thing The {@link Thing} which containment tree is computed.
   * @param cachedThing Its associated {@code Pojo} in the current {@link Session}.
   */
  private static void addContainerCompleteTree(Thing thing,
      cdp4common.commondata.Thing cachedThing) {
    var container = cachedThing.getContainer();
    if (container == null) {
      throw new NullPointerException(String
          .format("The container of the %s with id %s is null.", thing.CLASS_KIND, thing.getIid()));
    }

    thing.addContainer(container.getClassKind(), container.getIid());
    addContainerPartialTree(thing, container);
//    while (!(container instanceof cdp4common.commondata.TopContainer))
//    {
//      container = container.getContainer();
//      if (container == null)
//      {
//        throw new NullPointerException(String.format("The containment tree is broken for the %s with id %s.", thing.CLASS_KIND, thing.getIid()));
//      }
//
//      thing.addContainer(container.getClassKind(), container.getIid());
//    }
  }

  /**
   * Build the partial containment tree of a {@link Thing} starting from one of its container.
   *
   * @param thing The {@link Thing} which containment tree is computed.
   * @param container One of its container in the containment tree in the current {@link Session}.
   */
  private static void addContainerPartialTree(Thing thing, cdp4common.commondata.Thing container) {
    var tmpContainer = container;
    while (!(tmpContainer instanceof cdp4common.commondata.TopContainer)) {
      tmpContainer = tmpContainer.getContainer();
      if (tmpContainer == null) {
        throw new NullPointerException(String
            .format("The containment tree is broken for the %s with id %s.", thing.CLASS_KIND,
                thing.getIid()));
      }

      thing.addContainer(tmpContainer.getClassKind(), tmpContainer.getIid());
    }
  }
}
