/*
 * ValidationResult.java
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

package cdp4common.validation;

import cdp4common.engineeringmodeldata.Parameter;
import lombok.Getter;
import lombok.Setter;

/**
 * The compound result of {@link Parameter} value validation that carries the {@link ValidationResultKind}
 * and an optional message.
 */
public final class ValidationResult {
    /**
     * The actual result of a validation
     */
    @Getter
    @Setter
    private ValidationResultKind resultKind;

    /**
     * An optional message to provide more detail regarding the validation result. When the
     * {@link #resultKind} is VALID the message is empty
     */
    @Getter
    @Setter
    private String message;
}
