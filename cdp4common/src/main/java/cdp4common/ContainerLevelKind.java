/*
 * ContainerLevelKind.java
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

package cdp4common;

/**
 * Enumeration that specifies at what level in the containment hierarchy an instance is located.
 */
public enum ContainerLevelKind {
    /**
     * Assertion that the level cannot be set, this is applicable for Abstract classes
     */
    Invalid,

    /**
     * Assertion that it is not yet determined where the instance is located in the containment hierarchy.
     */
    Inconclusive,

    /**
     * Assertion that the instance is contained by a {@link cdp4common.sitedirectorydata.SiteDirectory}
     */
    SiteDirectory,

    /**
     * Assertion that the instance is contained by a {@link cdp4common.engineeringmodeldata.EngineeringModel}.
     * This exlcudes containment by {@link cdp4common.engineeringmodeldata.Iteration}
     */
    EngineeringModel,

    /**
     * Assertion that the instance is contained by a {@link cdp4common.engineeringmodeldata.Iteration}.
     * This excludes containment by {@link cdp4common.engineeringmodeldata.Iteration}
     */
    Iteration
}
