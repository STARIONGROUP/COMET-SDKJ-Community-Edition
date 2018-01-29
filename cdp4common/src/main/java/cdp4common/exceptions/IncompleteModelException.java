/*
 * IncompleteModelException.java
 * Copyright (c) 2018 RHEA System S.A.
 */

package cdp4common.exceptions;

/**
 * An {@link IncompleteModelException} is thrown when the containment tree of any {@link Thing} is walked, either
 * up or down and the model is incomplete.
 */
public class IncompleteModelException extends Exception {
    /**
     * Initializes a new instance of the {@link IncompleteModelException} class.
     */
    public IncompleteModelException() {
    }

    /**
     * Initializes a new instance of the {@link IncompleteModelException} class.
     *
     * @param message The exception message
     */
    public IncompleteModelException(String message) {
        super(message);
    }

    /**
     * Initializes a new instance of the {@link IncompleteModelException} class.
     *
     * @param message The exception message
     * @param cause   the cause (which is saved for later retrieval by the
     *                {@link #getCause()} method).  (A {@code null} value is
     *                permitted, and indicates that the cause is nonexistent or
     *                unknown.)
     */
    public IncompleteModelException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * Initializes a new instance of the {@link IncompleteModelException} class.
     *
     * @param cause the cause (which is saved for later retrieval by the
     *              {@link #getCause()} method).  (A {@code null} value is
     *              permitted, and indicates that the cause is nonexistent or
     *              unknown.)
     */
    public IncompleteModelException(Throwable cause) {
        super(cause);
    }
}
