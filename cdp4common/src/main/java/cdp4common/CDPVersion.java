/*
 * CDPVersion.java
 *
 * Copyright (c) 2015-2019 RHEA System S.A.
 *
 * Author: Alex Vorobiev, Yevhen Ikonnykov, Sam Gerené
 *
 * This file is part of CDP4-SDKJ Community Edition
 *
 * The CDP4-SDKJ Community Edition is free software; you can redistribute it and/or
 *  modify it under the terms of the GNU Lesser General Public
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

import java.lang.annotation.*;

/**
 * The purpose of the <code>cdp4common.CDPVersion</code> annotation is to decorate Classes and Fields
 * that constitute CDP4 extensions to the ECSS-E-TM-10-25A Annex A master model.
 * A POJO or DTO Class or Field that is not decorated with this annotation is a vanilla ECSS-E-TM-10-25 class or field.
 * A vanilla ECSS-E-TM-10-25A Annex class may have fields decorated with this annotation.
 *
 * @see CDPVersion
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.FIELD, ElementType.METHOD})
public @interface CDPVersion {

    /**
     * Gets the version of the CDP4 data-model that the decorated
     * class or property belongs to.
     */
    String version();
}
