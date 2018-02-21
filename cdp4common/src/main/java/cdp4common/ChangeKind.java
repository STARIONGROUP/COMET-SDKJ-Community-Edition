/*
 * ChangeKind.java
 * Copyright (c) 2018 RHEA System S.A.
 */

package cdp4common;

import cdp4common.commondata.Thing;

/**
 * Enum to specify the edit status of a {@link Thing}
 */
public enum ChangeKind {
    /**
     * The {@link Thing} is not being updated
     */
    NONE(0),

    /**
     * The {@link Thing} is being deleted
     */
    DELETE(-1),

    /**
     * The {@link Thing} is being updated
     */
    UPDATE(1),

    /**
     * The {@link Thing} is being created
     */
    CREATE(2);

    private final int changeKind;

    ChangeKind(int changeKind) {
        this.changeKind = changeKind;
    }
}
