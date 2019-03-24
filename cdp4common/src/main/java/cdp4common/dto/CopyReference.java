/*
 * CopyReference.java
 * Copyright (c) 2015 - 2019 RHEA System S.A.
 */
package cdp4common.dto;

import cdp4common.commondata.ClassKind;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

/**
 * A class representing a {@link Thing} by just its type and identifier
 */
@Getter
@Setter
public class CopyReference {
    /**
     * Gets or sets the type of the reference
     */
    public ClassKind classKind;

    /**
     * Gets or sets the identifier of the copy-reference
     */
    public UUID iid;
}
