/*
 * TransactionContextResolver.java
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

package cdp4dal.operations;

import cdp4common.commondata.Thing;
import cdp4common.commondata.TopContainer;
import cdp4common.engineeringmodeldata.EngineeringModel;
import cdp4common.engineeringmodeldata.Iteration;
import cdp4common.exceptions.IncompleteModelException;
import cdp4common.helpers.Constants;
import cdp4common.sitedirectorydata.SiteDirectory;
import com.google.common.collect.MoreCollectors;
import java.util.Comparator;
import java.util.regex.Pattern;

/**
 * The purpose of the {@link TransactionContextResolver} is to resolve either the {@link
 * SiteDirectory} or the {@link Iteration} that is in the containment chain of any {@link Thing}. In
 * case a {@link Thing} is not contained somehow by an {@link Iteration} but by an {@link
 * EngineeringModel} it is either the non-frozen {@link Iteration} or the {@link Iteration} with the
 * highest revision number that is returned.
 *
 * The {@link SiteDirectory} or {@link Iteration} that is resolved is used by the {@link
 * ThingTransaction}.
 */
public class TransactionContextResolver {

  /**
   * Resolves either the {@link SiteDirectory} or the {@link Iteration} that is in the containment
   * chain of any {@link Thing}.
   *
   * @param thing The {@link Thing} for which the context needs to be resolved.
   * @return An instance of {@link SiteDirectory} or {@link Iteration}.
   * @throws IncompleteModelException an {@link IncompleteModelException} is thrown when the model
   * is incomplete or the context could not be determined.
   */
  public static TransactionContext resolveContext(Thing thing) {
    SiteDirectory siteDirectory = thing instanceof SiteDirectory ? (SiteDirectory) thing : null;
    if (siteDirectory != null) {
      return new TransactionContext(siteDirectory);
    }

    Iteration iteration = thing instanceof Iteration ? (Iteration) thing : null;
    if (iteration != null) {
      return new TransactionContext(iteration);
    }

    TopContainer topContainer = thing.getTopContainer();
    siteDirectory = topContainer instanceof SiteDirectory ? (SiteDirectory) topContainer : null;
    if (siteDirectory != null) {
      return new TransactionContext(siteDirectory);
    }

    EngineeringModel engineeringModel =
        topContainer instanceof EngineeringModel ? (EngineeringModel) topContainer : null;
    if (engineeringModel != null) {
      // First check if the thing has an Iteration as a container
      iteration = thing.getContainerOfType(Iteration.class);
      if (iteration != null) {
        return new TransactionContext(iteration);
      }

      if (engineeringModel.getIteration().size() == 0) {
        throw new IncompleteModelException(
            "The EngineeringModel does not contain any iterations while this was expected: the transaction context cannot be resolved");
      }

      iteration = engineeringModel.getIteration().stream()
          .filter(x -> x.getIterationSetup().getFrozenOn() == null).collect(
              MoreCollectors.toOptional()).orElse(null);
      if (iteration != null) {
        return new TransactionContext(iteration);
      } else {
        iteration = engineeringModel.getIteration().stream()
            .max(Comparator.comparing(Iteration::getRevisionNumber)).orElseThrow(
                () -> new NullPointerException(String.format("There are not any iterations in %s",
                    engineeringModel.getUserFriendlyName())));
        return new TransactionContext(iteration);
      }
    }

    throw new IncompleteModelException(String
        .format("The context of the %s:%s could not be determined.", thing.getClass().getName(),
            thing.getIid()));
  }

  /**
   * Validates the provided context which must be a valid route to a {@link SiteDirectory} or an
   * {@link Iteration}.
   *
   * @param route the route that is to be validated.
   * @return true if the context is a valid context, false otherwise.
   *
   * {@code example:} The following are valid routes (the leading / is required)
   * /SiteDirectory/{uuid} /EngineeringModel/{uuid}/iteration/{uuid}
   */
  public static boolean validateRouteContext(String route) {
    String siteDirectoryPattern = new StringBuilder().append("^/SiteDirectory")
        .append(Constants.URI_PATH_SEPARATOR).append(Constants.URI_UUID_PATTERN.pattern())
        .append("$").toString();
    if (Pattern.matches(siteDirectoryPattern, route)) {
      return true;
    }

    String iterationPattern = new StringBuilder().append("^/EngineeringModel")
        .append(Constants.URI_PATH_SEPARATOR).append(Constants.URI_UUID_PATTERN.pattern())
        .append(Constants.URI_PATH_SEPARATOR).append("iteration")
        .append(Constants.URI_PATH_SEPARATOR).append(Constants.URI_UUID_PATTERN.pattern())
        .append("$").toString();

    return Pattern.matches(iterationPattern, route);
  }
}
