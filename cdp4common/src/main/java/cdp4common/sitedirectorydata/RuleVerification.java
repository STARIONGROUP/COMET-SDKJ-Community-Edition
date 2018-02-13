/*
 * RuleVerification.java
 * Copyright (c) 2018 RHEA System S.A.
 */

package cdp4common.sitedirectorydata;

import cdp4common.engineeringmodeldata.Iteration;
import cdp4common.engineeringmodeldata.RuleViolation;

/**
 * Specification of the {@link Rule} verification interface.
 */
public interface RuleVerification {

    /**
     * Verify an {@link Iteration} with respect to a {@link Rule}
     *
     * @param iteration The {@link Iteration} that is to be verified.
     * @return an {@link Iterable<RuleViolation>}, this may be empty if no {@link RuleViolation}s have been found.
     */
    Iterable<RuleViolation> verify(Iteration iteration);
}
