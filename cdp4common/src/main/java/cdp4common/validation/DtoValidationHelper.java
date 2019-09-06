/*
 * DtoValidationHelper.java
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

import cdp4common.commondata.Thing;
import cdp4common.exceptions.Cdp4ModelValidationException;
import cdp4common.helpers.Func;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

/**
 * The validation helper.
 *
 * @param <T> Type parameter to bind this generic class
 */
public class DtoValidationHelper<T extends Thing> {
    /**
     * Initializes a new instance of the {@link DtoValidationHelper} class.
     *
     * @param validationPredicate The validation predicate.
     * @param validationError     The validation error.
     */
    public DtoValidationHelper(Func<T, Boolean> validationPredicate, String validationError) {
        this.validationPredicate = validationPredicate;
        this.validationError = validationError;
    }

    /**
     * Validation predicate.
     */
    @Getter
    @Setter(AccessLevel.PRIVATE)
    private Func<T, Boolean> validationPredicate;

    /**
     * The validation error text.
     */
    @Getter
    @Setter(AccessLevel.PRIVATE)
    private String validationError;

    /**
     * Run the validation rule, throw a {@link Cdp4ModelValidationException} if not passed.
     *
     * @param thing The thing on which to perform the validation.
     * @throws Cdp4ModelValidationException If the validation rule failed
     */
    public void validate(T thing) {
        if (!this.tryValidate(thing)) {
            throw new Cdp4ModelValidationException(this.getValidationError());
        }
    }

    /**
     * Run the validation rule.
     *
     * @param thing The thing on which to perform the validation.
     * @return True if validation has passed.
     */
    public boolean tryValidate(T thing) {
        return this.validationPredicate.invoke(thing);
    }
}
