/*
 * CopyInfoOptions.java
 * Copyright (c) 2015 - 2019 RHEA System S.A.
 */
package cdp4common.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * The type used in the POST body to exchange data for copy operations
 */
@Getter
@Setter
public class CopyInfoOptions {
    /**
     * Gets or sets the {@link CopyKind}
     */
    public CopyKind copyKind;

    /**
     * Gets or sets a value indicating whether values should be kept (parameter-values)
     */
    public Boolean keepValues;

    /**
     * Gets or sets a value indicating whether the copied objects should keep their original owner (if applicable)
     * Or use {@code Owner}
     */
    public Boolean keepOwner;
}
