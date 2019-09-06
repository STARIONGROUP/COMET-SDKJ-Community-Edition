/* --------------------------------------------------------------------------------------------------------------------
 * ParameterOrOverrideBase.java
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
 *
 * This is an auto-generated DTO Class. Any manual changes to this file before a special comment
 *
 * // HAND-WRITTEN CODE GOES BELOW.
 * // DO NOT ADD ANYTHING ABOVE THIS COMMENT, BECAUSE IT WILL BE LOST DURING NEXT CODE GENERATION.
 *
 * will be overwritten!
 * --------------------------------------------------------------------------------------------------------------------
 */

package cdp4common.dto;

import cdp4common.AggregationKind;
import cdp4common.DataMember;
import cdp4common.UmlInformation;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * A Data Transfer Object representation of the {@link ParameterOrOverrideBase} class.
 */
@ToString
public abstract class ParameterOrOverrideBase extends ParameterBase implements Cloneable {
    /**
     * Initializes a new instance of the {@link ParameterOrOverrideBase} class.
     */
    protected ParameterOrOverrideBase() {
        this.parameterSubscription = new ArrayList<UUID>();
    }

    /**
     * Initializes a new instance of the {@link ParameterOrOverrideBase} class.
     *
     * @param iid The unique identifier.
     * @param rev The revision number.
     */
    protected ParameterOrOverrideBase(UUID iid, int rev) {
        super(iid, rev);
        this.parameterSubscription = new ArrayList<UUID>();
    }

    /**
     * The unique identifiers of the contained parameterSubscription instances.
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private ArrayList<UUID> parameterSubscription;

    /**
     * Gets an {@link Iterable} that references the composite properties of the current {@link ParameterOrOverrideBase}.
     */
    @Override
    public List<List> getContainerLists() {
        List<List> containers = new ArrayList<>(super.getContainerLists());
        containers.add(this.getParameterSubscription());
        return containers;
    }
}
