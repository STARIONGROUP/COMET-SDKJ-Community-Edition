/*
 * VerifiedRequirementStateOfComplianceList.java
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

import cdp4common.engineeringmodeldata.Iteration;
import cdp4common.engineeringmodeldata.ParameterValueSetBase;
import cdp4common.engineeringmodeldata.RelationalExpression;
import cdp4requirementsverification.RequirementStateOfCompliance;
import cdp4requirementsverification.calculations.RequirementStateOfComplianceCalculator;
import java.util.HashMap;

/**
 * Class used for the verification if a {@link RelationalExpression} is compliant to data in an
 * {@link Iteration} It inherits from a {@link HashMap<>} so it links a {@link
 * ParameterValueSetBase} to a {@link RequirementStateOfCompliance}
 */
public class VerifiedRequirementStateOfComplianceList extends
    HashMap<ParameterValueSetBase, RequirementStateOfCompliance> {

  private final RequirementStateOfComplianceCalculator requirementStateOfComplianceCalculator;

  /**
   * Initializes an instance of {@link VerifiedRequirementStateOfComplianceList}
   *
   * @param requirementStateOfComplianceCalculator Implementation of {@link
   * RequirementStateOfComplianceCalculator} that will be used to calculate the {@link
   * RequirementStateOfCompliance}
   */
  public VerifiedRequirementStateOfComplianceList(
      RequirementStateOfComplianceCalculator requirementStateOfComplianceCalculator) {
    this.requirementStateOfComplianceCalculator = requirementStateOfComplianceCalculator;
  }

  /**
   * Check a list of {@link ParameterValueSetBase}s for compliance with a RelationalExpression and
   * add the result to this instance of {@link VerifiedRequirementStateOfComplianceList}
   *
   * @param valueSets List of {@link ParameterValueSetBase}s to be checked and added to this
   * instance of {@link VerifiedRequirementStateOfComplianceList}
   * @param relationalExpression The {@link RelationalExpression} that will be used to verify
   * compliance
   */
  public void verifyAndAdd(Iterable<? extends ParameterValueSetBase> valueSets,
      RelationalExpression relationalExpression) {
    for (ParameterValueSetBase valueSet : valueSets) {
      if (!this.containsKey(valueSet)) {
        this.put(valueSet,
            this.requirementStateOfComplianceCalculator.calculate(valueSet, relationalExpression));
      }
    }
  }
}
