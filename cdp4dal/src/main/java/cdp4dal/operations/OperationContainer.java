/*
 * OperationContainer.java
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

package cdp4dal.operations;

import cdp4common.dto.Iteration;
import cdp4common.dto.SiteDirectory;
import cdp4common.dto.TopContainer;
import cdp4common.helpers.TokenGenerator;
import cdp4dal.dal.Dal;
import com.google.common.base.Strings;
import java.util.ArrayList;
import java.util.List;
import lombok.Getter;

/**
* A container for the {@link Operation}s that need to be executed on a data source using an implementation of {@link Dal}.
*/
@Getter
public class OperationContainer {

  /**
  * Initializes a new instance of the {@link OperationContainer} class.
  *
  * @param context
  * The route of the {@link SiteDirectory} or {@link Iteration} for which the current {@link OperationContainer} is valid.
  *
  * @param topContainerRevNumber The unique top container revision number in this {@link OperationContainer}. By default should be set to {@code null}.
   */
  public OperationContainer(String context, Integer topContainerRevNumber) {
    if (Strings.isNullOrEmpty(context)) {
      throw new NullPointerException("The context may not be null or empty");
    }

    if (!TransactionContextResolver.validateRouteContext(context)) {
      throw new IllegalArgumentException(String.format("The context %s is not a valid context", context));
    }

    this.token = TokenGenerator.generateRandomToken();

    this.context = context;

    this.operations = new ArrayList<>();
    this.topContainerRevisionNumber = topContainerRevNumber;
  }

  /**
  * The unique {@link TopContainer#getRevisionNumber()} in this {@link OperationContainer}.
  */
  private Integer topContainerRevisionNumber;

  /**
  * Correlation token that can be used to correlate the current {@link OperationContainer} to
  * the operations executed on a data-source.
  */
  private String token;

  /**
  * The context in which the {@link OperationContainer} shall be executed.
  * This is either in the context of a {@link SiteDirectory} or an {@link Iteration}.
  */
  private String context;

  /**
  * The list of {@link Operation}s.
  */
  private List<Operation> operations;

  /**
  * Validates and Adds the {@link Operation} to the current {@link OperationContainer}.
  *
  * @param operation
  * The {@link Operation} that is to be added.
  */
  public void addOperation(Operation operation) {
    this.validateContextOfOperation(operation);

    this.operations.add(operation);
  }

  /**
  * Validates whether the provided {@link Operation} fits within
  * the current {@link #context}.
  *
  * @param operation The {@link Operation} to validate context of.
   */
  private void validateContextOfOperation(Operation operation) {
    String topContainerRoute = operation.getModifiedThing().getTopContainerRoute();

    if (!this.context.contains(topContainerRoute)) {
      throw new IllegalArgumentException(String.format(
          "The Thing contained by the Operation does not share the context of the current OperationContainer: thing route: %s - context: %s", topContainerRoute, this.context));
    }
  }

  /**
  * Removes the {@link Operation} from the current {@link OperationContainer}.
  *
  * @param operation
  * The {@link Operation} that is to be removed.
  */
  public void removeOperation(Operation operation) {
    this.operations.remove(operation);
  }
}
