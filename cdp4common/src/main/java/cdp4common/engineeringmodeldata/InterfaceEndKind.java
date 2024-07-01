/* --------------------------------------------------------------------------------------------------------------------
 * InterfaceEndKind.java
 *
 * Copyright (c) 2015-2024 Starion Group S.A.
 *
 * Author: Alex Vorobiev, Yevhen Ikonnykov, Sam Gerené
 *
 * This file is part of CDP4-SDKJ Community Edition
 *
 * The CDP4-SDKJ Community Edition is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * The CDP4-SDKJ Community Edition is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
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
