/*
 * RequirementStateOfComplianceChangedEvent.java
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

package cdp4requirementsverification.events;

import cdp4requirementsverification.RequirementStateOfCompliance;
import lombok.Getter;

/**
 * The purpose of the {@link RequirementStateOfComplianceChangedEvent} is to notify an observer.
 * that the referenced {@link RequirementStateOfCompliance} has changed in some way and what that change is.
 */
public class RequirementStateOfComplianceChangedEvent {
    /**
     * Initializes a new instance of the {@link RequirementStateOfComplianceChangedEvent} class.
     *
     * @param requirementStateOfCompliance The payload {@link RequirementStateOfCompliance}.
     */
    public RequirementStateOfComplianceChangedEvent(cdp4requirementsverification.RequirementStateOfCompliance requirementStateOfCompliance) {
        this.requirementStateOfCompliance = requirementStateOfCompliance;
    }

    /**
     * Gets the changed {@link RequirementStateOfCompliance}
     */
    @Getter
    public RequirementStateOfCompliance requirementStateOfCompliance;
}
