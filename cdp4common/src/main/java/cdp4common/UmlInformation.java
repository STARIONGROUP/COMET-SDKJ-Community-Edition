/*
 * UmlInformation.java
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

package cdp4common;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * The purpose of the <code>cdp4common.UmlInformation</code> is to decorate properties of classes
 * to be able to use reflection to compute what kind of Aggregation of the property is.
 *
 * @see UmlInformation
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD})
public @interface UmlInformation {
    /**
     * Gets the <code>cdp4common.AggregationKind</code> of the decorated property
     *
     * @see AggregationKind
     */
    AggregationKind aggregation();

    /**
     * Gets a value indicating whether the property is ordered
     */
    boolean isOrdered();

    /**
     * Gets a value indicating whether the property is derived
     */
    boolean isDerived();

    /**
     * Gets a value indicating whether the property is nullable
     */
    boolean isNullable() default false;

    /**
     * Gets a value indicating whether the property is non-persistent
     */
    boolean isPersistent() default true;
}
