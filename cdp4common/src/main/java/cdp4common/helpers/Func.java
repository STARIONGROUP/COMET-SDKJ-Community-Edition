/*
 * Func.java
 * Copyright (c) 2018 RHEA System S.A.
 */

package cdp4common.helpers;

/**
 * An interface to mimic C# Func Delegate
 */
public interface Func<T, TResult> {
    public TResult invoke(T arg);
}

