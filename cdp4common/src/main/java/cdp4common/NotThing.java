/*
 * NotThing.java
 * Copyright (c) 2018 RHEA System S.A.
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
