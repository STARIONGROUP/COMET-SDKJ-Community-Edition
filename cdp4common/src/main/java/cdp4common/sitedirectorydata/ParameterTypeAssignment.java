/* --------------------------------------------------------------------------------------------------------------------
 * ParameterTypeAssignment.java
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
 *
 * This is an auto-generated POJO Interface. Any manual changes to this file will be overwritten!
 * --------------------------------------------------------------------------------------------------------------------
 */

package cdp4common.sitedirectorydata;

import java.time.OffsetDateTime;
import java.util.*;
import cdp4common.sitedirectorydata.*;
import cdp4common.types.*;
import cdp4common.CDPVersion;

/**
 * a pairing of an assigned ParameterType and a MeasurementScale in case a QuantityKind is selected. The MeasurementScale must be in the array of possible MeasurementScales of the the ParameterType.
 */
public interface ParameterTypeAssignment {
    /**
     * Gets the MeasurementScale.
     * the MeasurementScale applicable to the ParameterType of the selection. Null if the ParameterType is not a QuantityKind. Must be in the array of possible MeasurementScales of the selected ParameterType.
     */
    MeasurementScale getMeasurementScale();

    /**
     * Gets the ParameterType.
     * the selected ParameterType assignment.
     */
    ParameterType getParameterType();

    /**
     * Sets the MeasurementScale.
     * the MeasurementScale applicable to the ParameterType of the selection. Null if the ParameterType is not a QuantityKind. Must be in the array of possible MeasurementScales of the selected ParameterType.
     */
    void setMeasurementScale(MeasurementScale measurementScale);

    /**
     * Sets the ParameterType.
     * the selected ParameterType assignment.
     */
    void setParameterType(ParameterType parameterType);
}
