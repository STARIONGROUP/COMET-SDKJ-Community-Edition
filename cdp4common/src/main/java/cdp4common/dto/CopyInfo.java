/*
 * CopyInfo.java
 * Copyright (c) 2015 - 2019 RHEA System S.A.
 */
package cdp4common.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

/**
 * The type used in the POST body to exchange data for copy operations
 */
@Getter
@Setter
public class CopyInfo {
    /**
     * Gets or sets the {@link CopyKind}
     */
    public CopyInfoOptions options;

    /**
     * Gets or sets the source of the copy operation
     */
    public CopySource source;

    /**
     * Gets or sets the target container unique-identifier of the copied object
     */
    public CopyTarget target;

    /**
     * Gets or sets the current owner
     */
    public UUID activeOwner;
}
