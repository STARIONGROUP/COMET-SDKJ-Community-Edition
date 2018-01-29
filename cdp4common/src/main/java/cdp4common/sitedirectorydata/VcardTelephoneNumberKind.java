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
    WORK,

    /**
     * indication that a telephone number is for private or home use
     */
    HOME,

    /**
     * indication of a voice telephone number
     */
    VOICE,

    /**
     * indication that the telephone number supports text messages (SMS)
     */
    TEXT,

    /**
     * indication of a facsimile telephone number
     */
    FAX,

    /**
     * indication of a cellular or mobile telephone number
     */
    CELL,

    /**
     * indication of a paging device telephone number
     */
    PAGER,

    /**
     * indication of a telecommunication device for people with hearing or speech difficulties
     */
    TEXTPHONE,

    /**
     * indication of a video conferencing telephone number
     */
    VIDEO,
}
