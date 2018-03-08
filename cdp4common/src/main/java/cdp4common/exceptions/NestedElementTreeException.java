/*
 * NestedElementTreeException.java
 * Copyright (c) 2018 RHEA System S.A.
 */

package cdp4common.exceptions;

import cdp4common.engineeringmodeldata.NestedElement;

/**
 * A {@link NestedElementTreeException} is thrown when a problem occurs while
 * generating the {@link NestedElement} Tree
 */
public class NestedElementTreeException extends RuntimeException {
    /**
     * Initializes a new instance of the {@link NestedElementTreeException} class.
     */
    public NestedElementTreeException() {
    }

    /**
     * Initializes a new instance of the {@link NestedElementTreeException} class.
     *
     * @param message The exception message
     */
    public NestedElementTreeException(String message) {
        super(message);
    }

    /**
     * Initializes a new instance of the {@link NestedElementTreeException} class.
     *
     * @param message The exception message
     * @param cause   the cause (which is saved for later retrieval by the
     *                {@link #getCause()} method).  (A {@code null} value is
     *                permitted, and indicates that the cause is nonexistent or
     *                unknown.)
     */
    public NestedElementTreeException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * Initializes a new instance of the {@link NestedElementTreeException} class.
     *
     * @param cause the cause (which is saved for later retrieval by the
     *              {@link #getCause()} method).  (A {@code null} value is
     *              permitted, and indicates that the cause is nonexistent or
     *              unknown.)
     */
    public NestedElementTreeException(Throwable cause) {
        super(cause);
    }
}
