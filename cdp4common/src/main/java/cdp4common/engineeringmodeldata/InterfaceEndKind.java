/* --------------------------------------------------------------------------------------------------------------------
 * InterfaceEndKind.java
 * Copyright (c) 2018 RHEA System S.A.
 *
 * This is an auto-generated Enumeration. Any manual changes to this file will be overwritten!
 * --------------------------------------------------------------------------------------------------------------------
 */

package cdp4common.engineeringmodeldata;

/**
 * enumeration datatype that asserts whether an ElementUsage is an interface end, and if so, what kind of role the interface end fulfillsNote: An <i>interface end</i> is one side of an interface. A complete interface consists of at least two interface ends and a connection between them.
 */
public enum InterfaceEndKind
{
    /**
     * not an interface end
     */
    N_O_N_E,

    /**
     * general undirected interface endExample: For example a mechanical mounting plate.
     */
    U_N_D_I_R_E_C_T_E_D,

    /**
     * interface end that acts as an input for its <i>containingElement</i> ElementDefinitionExample: For example a power inlet socket.
     */
    I_N_P_U_T,

    /**
     * interface end that acts as an output for its <i>containingElement</i> ElementDefinitionExample: For example a signal output connector on a sensor.
     */
    O_U_T_P_U_T,

    /**
     * interface end that acts both as an input and an output for its <i>containingElement</i> ElementDefinitionExample: For example an Ethernet port on an electronic device.
     */
    I_N__O_U_T,
}
