/*
 * ValueArrayParseException.java
 * Copyright (c) 2018 RHEA System S.A.
 */

package cdp4common.exceptions;

/**
 * The ValueArray parse exception.
 */
public class ValueArrayParseException extends Exception {
    /**
     * Initializes a new instance of the {@link ValueArrayParseException} class.
     */
    public ValueArrayParseException() {
    }

    /**
     * Initializes a new instance of the {@link ValueArrayParseException} class.
     *
     * @param message The exception message
     */
    public ValueArrayParseException(String message) {
        super(message);
    }

    /**
     * Initializes a new instance of the {@link ValueArrayParseException} class.
     *
     * @param message The exception message
     * @param cause   the cause (which is saved for later retrieval by the
     *                {@link #getCause()} method).  (A {@code null} value is
     *                permitted, and indicates that the cause is nonexistent or
     *                unknown.)
     */
    public ValueArrayParseException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * Initializes a new instance of the {@link ValueArrayParseException} class.
     *
     * @param cause the cause (which is saved for later retrieval by the
     *              {@link #getCause()} method).  (A {@code null} value is
     *              permitted, and indicates that the cause is nonexistent or
     *              unknown.)
     */
    public ValueArrayParseException(Throwable cause) {
        super(cause);
    }
}
