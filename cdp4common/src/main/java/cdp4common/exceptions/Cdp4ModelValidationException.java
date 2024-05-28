/*
 * Cdp4ModelValidationException.java
 *
 * Copyright (c) 2015-2024 Starion Group S.A.
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

package cdp4common.exceptions;

/**
 * The CDP4 model validation exception.
 */
public class Cdp4ModelValidationException extends RuntimeException {
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
