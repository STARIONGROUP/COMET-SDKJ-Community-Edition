/*
 * CopyTarget.java
 * Copyright (c) 2015 - 2019 RHEA System S.A.
 */
package cdp4common.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

/**
 * The target of the copy operation
 */
@Getter
@Setter
public class CopyTarget {
    /**
     * Gets or sets the target container unique-identifier of the copied object
     */
    public CopyReference container;

    /**
     * Gets or sets the top container identifier
     */
    public CopyReference topContainer;

    /**
     * Gets or sets the iteration identifier
     */
    public UUID iterationId;
}
