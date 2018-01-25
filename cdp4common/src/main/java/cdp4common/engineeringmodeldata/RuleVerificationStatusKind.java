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
    N_O_N_E,

    /**
     * verification passed successfully, the rule is satisfied
     */
    P_A_S_S_E_D,

    /**
     * verification failed, the rule is violated
     */
    F_A_I_L_E_D,

    /**
     * verification was executed, but no verdict could be produced
     */
    I_N_C_O_N_C_L_U_S_I_V_E,
}
