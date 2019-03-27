/* --------------------------------------------------------------------------------------------------------------------
 * ActualFiniteStateKind.java
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
 * This is an auto-generated Enumeration. Any manual changes to this file will be overwritten!
 * --------------------------------------------------------------------------------------------------------------------
 */

package cdp4common.engineeringmodeldata;

/**
 * enumeration datatype that defines the possible kinds of ActualFiniteState
 */
public enum ActualFiniteStateKind
{
    /**
     * assertion that an ActualFiniteState is mandatory, i.e. shall be used as an actualState on a ParameterValueSet or ParameterSubscriptionValueSet for a Parameter that has a <i>stateDependence</i> on the ActualFiniteStateList that contains the ActualFiniteState
     */
    MANDATORY,

    /**
     * assertion that an ActualFiniteState is forbidden, i.e. shall be not used as an actualState on a ParameterValueSet or ParameterSubscriptionValueSet for a Parameter that has a <i>stateDependence</i> on the ActualFiniteStateList that contains the ActualFiniteState
     */
    FORBIDDEN,
}
