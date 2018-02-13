/*
 * FuncImpl.java
 * Copyright (c) 2018 RHEA System S.A.
 */

package cdp4common.helpers;

/**
 * It is an implementation of {@link Func} that is used to mimic C# Func Delegate
 * @param <T> The parameter of the method that this delegate encapsulates.
 * @param <TResult> The return value of the method that this delegate encapsulates.
 */
public class FuncImpl<T, TResult> implements Func<T, TResult> {
    private Func<T, TResult> function;

    public FuncImpl(Func<T, TResult> function) {
        this.function = function;
    }

    @Override
    public TResult invoke(T arg) {
        return this.function.invoke(arg);
    }
}

