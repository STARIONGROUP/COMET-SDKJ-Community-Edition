/*
 * Container.java
 * Copyright (c) RHEA System S.A.
 */

package cdp4common;

import java.lang.annotation.*;

/**
 * The purpose of the <code>cdp4common.Container</code> is to decorate classes that take part in a Composition
 * relationship at the contained end. The <code>cdp4common.Container</code> has a property that specifies the name
 * of the container property that contains the current class.
 *
 * @see Container
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
public @interface Container {

    /**
     * The <code>Class</code> of the container
     *
     * @see Class
     */
    Class clazz();

    /**
     * The name of the container property
     */
    String propertyName();
}
