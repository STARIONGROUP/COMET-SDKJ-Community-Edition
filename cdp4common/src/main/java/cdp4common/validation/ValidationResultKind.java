/*
 * ValidationResultKind.java
 * Copyright (c) 2018 RHEA System S.A.
 */

package cdp4common.validation;

import cdp4common.sitedirectorydata.QuantityKind;
import cdp4common.sitedirectorydata.MeasurementScale;

/**
* Enumeration data type that defines the overall result of processing the Parameter sheet
*/
public enum ValidationResultKind {
    /**
    * The validation result is inconclusive
    */        
    IN_CONCLUSIVE(0),

    /**
    * The value is valid
    */
    VALID(1),

    /**
    * The value is valid, but outside of the permissible values
    * <p>
    * This is only relevant for {@link QuantityKind}s where 
     * the {@link MeasurementScale} minimumPermissibleValue and maximumPermissibleValue are set.
    */
    OUT_OF_BOUNDS(2),

    /**
    * The value is invalid
    */
    INVALID(3);


    private final int validationResultKind;

    ValidationResultKind(int validationResultKind) {
        this.validationResultKind = validationResultKind;
    }
}
