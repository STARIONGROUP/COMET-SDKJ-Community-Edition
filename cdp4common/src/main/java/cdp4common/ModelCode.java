/*
 * ModelCode.java
 * Copyright (c) 2018 RHEA System S.A.
 */

package cdp4common;

/**
 * A class that implements the {@link ModelCode} interface exposes it's model-code. The model-code is much
 * like the path a file in a file system, derived using short names of contained items.
 */
public interface ModelCode {
    /**
     * Computes the model code of the current object
     *
     * @param componentIndex The component Index.
     * @return The {@link String} that represents the model code, valid separators are {@code .} and {@code /}
     */
    String modelCode(Integer componentIndex);
}
