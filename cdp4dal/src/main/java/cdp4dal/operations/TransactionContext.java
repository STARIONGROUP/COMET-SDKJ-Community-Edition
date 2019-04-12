/*
 * TransactionContext.java
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
import cdp4common.engineeringmodeldata.Iteration;
import cdp4common.sitedirectorydata.SiteDirectory;
import lombok.Getter;

/**
 * The purpose if the {@link TransactionContext} class is to provide a wrapper around types that can
 * be used as context in a {@link ThingTransaction}. An ECSS-E-TM-10-25 data-source only accepts
 * transactions on either a {@link SiteDirectory} and an {@link Iteration}.
 */
public class TransactionContext {

  /**
   * Initializes a new instance of the {@link TransactionContext} class.
   *
   * @param siteDirectory The {@link SiteDirectory} that is the {@link #context} of the current
   * {@link TransactionContext}.
   */
  TransactionContext(SiteDirectory siteDirectory) {
    this.context = siteDirectory;
  }

  /**
   * Initializes a new instance of the {@link TransactionContext} class.
   *
   * @param iteration The {@link Iteration} that is the {@link #context} of the current {@link
   * TransactionContext}
   */
  TransactionContext(Iteration iteration) {
    this.context = iteration;
  }

  /**
   * Gets the {@link Thing} that represents the context of the current {@link TransactionContext}
   * The context can only a {@link SiteDirectory} or {@link Iteration}
   */
  @Getter
  private Thing context;

  /**
   * Returns the route of the current {@link #context}
   *
   * @return A String that represents the a route
   *
   * {@code example:} /SiteDirectory/{iid} /EngineeringModel/{iid}/iteration/{iid}
   */
  public String getContextRoute() {
    return this.context.getRoute();
  }
}
