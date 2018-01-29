/* --------------------------------------------------------------------------------------------------------------------
 * RuleVerificationStatusKind.java
 * Copyright (c) 2018 RHEA System S.A.
 *
 * This is an auto-generated Enumeration. Any manual changes to this file will be overwritten!
 * --------------------------------------------------------------------------------------------------------------------
 */

package cdp4common.engineeringmodeldata;

/**
 * enumeration datatype that represents the possible values for the status of the executed verification of a rule
 */
public enum RuleVerificationStatusKind
{
    /**
     * verification has not been executed yet
     */
    NONE,

    /**
     * verification passed successfully, the rule is satisfied
     */
    PASSED,

    /**
     * verification failed, the rule is violated
     */
    FAILED,

    /**
     * verification was executed, but no verdict could be produced
     */
    INCONCLUSIVE,
}
