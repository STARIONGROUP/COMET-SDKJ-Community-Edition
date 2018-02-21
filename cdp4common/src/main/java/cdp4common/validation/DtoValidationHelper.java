/*
 * DtoValidationHelper.java
 * Copyright (c) 2018 RHEA System S.A.
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
     * Initializes a new instance of the {@link DtoValidationHelper<T>} class.
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
    public void validate(T thing) throws Cdp4ModelValidationException {
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
