/*
 * BooleanExpressionVerifier.java
 *
 * Copyright (c) 2015-2019 RHEA System S.A.
 *
 * Author: Alex Vorobiev, Yevhen Ikonnykov, Sam Gerené, Alexander van Delft
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

package cdp4requirementsverification.verifiers;

import cdp4common.engineeringmodeldata.BooleanExpression;
import cdp4common.engineeringmodeldata.ElementDefinition;
import cdp4common.engineeringmodeldata.ElementUsage;
import cdp4common.engineeringmodeldata.Iteration;
import cdp4common.engineeringmodeldata.Requirement;
import cdp4requirementsverification.HaveRequirementStateOfCompliance;
import cdp4requirementsverification.RequirementStateOfCompliance;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

/**
 * Specification of the {@link BooleanExpressionVerifierBase} verification interface.
 */
public interface BooleanExpressionVerifier extends HaveRequirementStateOfCompliance {

  /**
   * Verify a {@link BooleanExpression} with respect to a {@link Requirement} using data from a
   * given {@link Iteration}
   *
   * @param booleanExpressionVerifiers A dictionary that contains all {@link BooleanExpression}s and
   * their {@link BooleanExpressionVerifier}s
   * @param iteration The {@link Iteration} that contains the data ({@link ElementDefinition} and
   * {@link ElementUsage}) used for verification
   * @return {@link CompletableFuture} that returns the calculated {@link
   * RequirementStateOfCompliance} for this class
   */
  CompletableFuture<RequirementStateOfCompliance> verifyRequirementStateOfCompliance(
      Map<BooleanExpression, BooleanExpressionVerifier> booleanExpressionVerifiers,
      Iteration iteration);
}
