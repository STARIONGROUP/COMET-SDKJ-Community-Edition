/* --------------------------------------------------------------------------------------------------------------------
 * VcardTelephoneNumberKind.java
 * Copyright (c) 2018 RHEA System S.A.
 *
 * This is an auto-generated Enumeration. Any manual changes to this file will be overwritten!
 * --------------------------------------------------------------------------------------------------------------------
 */

package cdp4common.sitedirectorydata;

/**
 * <a id="ParameterValueKind">enumeration datatype that represents</a> the possible values for a vCard telephone numberNote: The values are defined in the vCard format specification in <a href="http://datatracker.ietf.org/doc/rfc6350/?include_text=1">IETF RFC 6350</a>.
 */
public enum VcardTelephoneNumberKind
{
    /**
     * indication that a telephone number is for professional use
     */
    W_O_R_K,

    /**
     * indication that a telephone number is for private or home use
     */
    H_O_M_E,

    /**
     * indication of a voice telephone number
     */
    V_O_I_C_E,

    /**
     * indication that the telephone number supports text messages (SMS)
     */
    T_E_X_T,

    /**
     * indication of a facsimile telephone number
     */
    F_A_X,

    /**
     * indication of a cellular or mobile telephone number
     */
    C_E_L_L,

    /**
     * indication of a paging device telephone number
     */
    P_A_G_E_R,

    /**
     * indication of a telecommunication device for people with hearing or speech difficulties
     */
    T_E_X_T_P_H_O_N_E,

    /**
     * indication of a video conferencing telephone number
     */
    V_I_D_E_O,
}
