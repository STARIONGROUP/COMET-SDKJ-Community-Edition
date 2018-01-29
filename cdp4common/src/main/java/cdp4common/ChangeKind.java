/*
 * ChangeKind.java
 * Copyright (c) 2018 RHEA System S.A.
 */

package cdp4common;

/**
 * Enum to specify the edit status of a <code>Thing</code>
 *
 * @see Thing
 */
public enum ChangeKind {
    /**
     * The <code>Thing</code> is not being updated
     *
     * @see Thing
     */
    NONE(0),

    /**
     * The <code>Thing</code> is being deleted
     *
     * @see Thing
     */
    DELETE(-1),

    /**
     * The <code>Thing</code> is being updated
     *
     * @see Thing
     */
    UPDATE(1),

    /**
     * The <code>Thing</code> is being created
     *
     * @see Thing
     */
    CREATE(2);

    private final int changeKind;

    ChangeKind(int changeKind) {
        this.changeKind = changeKind;
    }
}
