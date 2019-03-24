/*
 * CopyKind.java
 * Copyright (c) 2015 - 2019 RHEA System S.A.
 */
package cdp4common.dto;

/**
 * Assertion on the kind of copy operation to perform
 */
public enum CopyKind {
    /**
     * Asserts that the copy operation shall be a deep copy
     */
    DEEP,

    /**
     * Asserts that the copy operation shall be a shallow copy
     */
    SHALLOW
}
