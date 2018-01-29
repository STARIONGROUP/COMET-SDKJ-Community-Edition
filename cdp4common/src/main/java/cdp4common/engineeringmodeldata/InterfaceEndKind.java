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
    NONE,

    /**
     * general undirected interface endExample: For example a mechanical mounting plate.
     */
    UNDIRECTED,

    /**
     * interface end that acts as an input for its <i>containingElement</i> ElementDefinitionExample: For example a power inlet socket.
     */
    INPUT,

    /**
     * interface end that acts as an output for its <i>containingElement</i> ElementDefinitionExample: For example a signal output connector on a sensor.
     */
    OUTPUT,

    /**
     * interface end that acts both as an input and an output for its <i>containingElement</i> ElementDefinitionExample: For example an Ethernet port on an electronic device.
     */
    IN_OUT,
}
