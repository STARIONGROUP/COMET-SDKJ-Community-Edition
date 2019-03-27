/*
 * NotThing.java
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

import cdp4common.commondata.Thing;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

/**
 * Represent an object of the CDP4 application but is not a 10-25 Thing
 */
public class NotThing extends Thing {
    /**
     * Initializes a new instance of the {@link NotThing} class
     *
     * @param name The Name
     */
    public NotThing(String name) {
        this.setName(name);
        this.setContainer(null);
    }

    /**
     * The Name of this {@link NotThing}
     */
    @Getter
    @Setter(AccessLevel.PRIVATE)
    public String name;

    /**
     * Clones the current {@link Thing}. The method is not supported by this class.
     *
     * @param cloneContainedThings A value indicating whether the contained things should be cloned
     * @see UnsupportedOperationException
     */
    protected Thing genericClone(boolean cloneContainedThings) {
        throw new UnsupportedOperationException();
    }

    /**
     * The NotThing class does not support the ResolveProperties method. The method is not supported by this class.
     *
     * @param dto A dto to resolve properties for
     * @see UnsupportedOperationException
     */
    public void resolveProperties(cdp4common.dto.Thing dto) {
        throw new UnsupportedOperationException();
    }

    /**
     * Creates {@link cdp4common.dto.Thing} from the current {@link Thing}. The method is not supported by this class.
     */
    public cdp4common.dto.Thing toDto() {
        throw new UnsupportedOperationException();
    }
}
