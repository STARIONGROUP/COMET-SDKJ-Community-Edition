/*
 * CDPVersion.java
 * Copyright (c) 2018 RHEA System S.A.
 */

package cdp4common;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * An annotation to mimic C# DataMemberAttribute
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD})
public @interface DataMember {
}
