/*
 * CopySource.java
 * Copyright (c) 2015 - 2019 RHEA System S.A.
 */
package cdp4common.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

/**
 * The source of the copy operation
 */
@Getter
@Setter
public class CopySource {
    /**
     * The thing to copy
     */
    public CopyReference thing;

    /**
     * Gets or sets the top container identifier
     */
    public CopyReference topContainer;

    /**
     * Gets or sets the iteration identifier
     */
    public UUID iterationId;
}
