/*
 * Cdp4ModelValidationException.java
 * Copyright (c) 2018 RHEA System S.A.
 */

package cdp4common.exceptions;

/**
 * The CDP4 model validation exception.
 */
public class Cdp4ModelValidationException extends Exception {
    /**
     * Initializes a new instance of the {@link Cdp4ModelValidationException} class.
     */
    public Cdp4ModelValidationException() {
    }

    /**
     * Initializes a new instance of the {@link Cdp4ModelValidationException} class.
     *
     * @param message The exception message
     */
    public Cdp4ModelValidationException(String message) {
        super(message);
    }

    /**
     * Initializes a new instance of the {@link Cdp4ModelValidationException} class.
     *
     * @param message The exception message
     * @param cause   the cause (which is saved for later retrieval by the
     *                {@link #getCause()} method).  (A {@code null} value is
     *                permitted, and indicates that the cause is nonexistent or
     *                unknown.)
     */
    public Cdp4ModelValidationException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * Initializes a new instance of the {@link Cdp4ModelValidationException} class.
     *
     * @param cause the cause (which is saved for later retrieval by the
     *              {@link #getCause()} method).  (A {@code null} value is
     *              permitted, and indicates that the cause is nonexistent or
     *              unknown.)
     */
    public Cdp4ModelValidationException(Throwable cause) {
        super(cause);
    }
}
