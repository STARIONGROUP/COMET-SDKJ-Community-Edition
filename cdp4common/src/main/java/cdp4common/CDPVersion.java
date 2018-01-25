/*
 * CDPVersion.java
 * Copyright (c) RHEA System S.A.
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
