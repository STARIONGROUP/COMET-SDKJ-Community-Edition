/*
 * ContainmentException.java
 * Copyright (c) 2018 RHEA System S.A.
 */

package cdp4common.exceptions;

import cdp4common.commondata.Thing;

/**
 * A {@link ContainmentException} is thrown the when Container of a {@link Thing} is not set and it is
 * requested in an operation.
 */
public class ContainmentException extends RuntimeException {
    /**
     * Initializes a new instance of the {@link ContainmentException} class.
     */
    public ContainmentException() {
    }

    /**
     * Initializes a new instance of the {@link ContainmentException} class.
     *
     * @param message The exception message
     */
    public ContainmentException(String message) {
        super(message);
    }

    /**
     * Initializes a new instance of the {@link ContainmentException} class.
     *
     * @param message The exception message
     * @param cause   the cause (which is saved for later retrieval by the
     *                {@link #getCause()} method).  (A {@code null} value is
     *                permitted, and indicates that the cause is nonexistent or
     *                unknown.)
     */
    public ContainmentException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * Initializes a new instance of the {@link ContainmentException} class.
     *
     * @param cause the cause (which is saved for later retrieval by the
     *              {@link #getCause()} method).  (A {@code null} value is
     *              permitted, and indicates that the cause is nonexistent or
     *              unknown.)
     */
    public ContainmentException(Throwable cause) {
        super(cause);
    }
}
