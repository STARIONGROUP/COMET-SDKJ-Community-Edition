/*
 * CopyInfoOptions.java
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
package cdp4common.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * The type used in the POST body to exchange data for copy operations
 */
@Getter
@Setter
public class CopyInfoOptions {
    /**
     * Gets or sets the {@link CopyKind}
     */
    public CopyKind copyKind;

    /**
     * Gets or sets a value indicating whether values should be kept (parameter-values)
     */
    public Boolean keepValues;

    /**
     * Gets or sets a value indicating whether the copied objects should keep their original owner (if applicable)
     * Or use {@code Owner}
     */
    public Boolean keepOwner;
}
