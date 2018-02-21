/*
 * ValidationResult.java
 * Copyright (c) 2018 RHEA System S.A.
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
