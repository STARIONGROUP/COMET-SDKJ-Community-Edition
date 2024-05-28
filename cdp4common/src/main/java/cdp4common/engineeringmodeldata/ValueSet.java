/*
 * ValueSet.java
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
 */

package cdp4common.engineeringmodeldata;

import cdp4common.ModelCode;
import cdp4common.sitedirectorydata.DomainOfExpertise;
import cdp4common.types.ValueArray;

/**
 * The interface for the value-set of the {@link ParameterBase}
 */
public interface ValueSet extends ModelCode {
    /**
     * Gets the reference to the actual {@link ActualFiniteState} to which {@code ValueSet}  pertains
     */
    ActualFiniteState getActualState();

    /**
     * Gets the reference to the actual {@link Option} to which {@code ValueSet}  pertains
     */
    Option getActualOption();

    /**
     * Gets the value manually set for {@code ValueSet}
     */
    ValueArray<String> getManual();

    /**
     * Gets the computed value for {@code ValueSet}
     */
    ValueArray<String> getComputed();

    /**
     * Gets the reference value for {@code ValueSet}
     */
    ValueArray<String> getReference();

    /**
     * Gets the actual value used for {@code ValueSet}  which depends on {@code ValueSwitch}
     */
    ValueArray<String> getActualValue();

    /**
     * Gets the formula assigned by the owner {@link DomainOfExpertise} of the associated {@link Parameter} or {@link ParameterOverride}
     */
    ValueArray<String> getFormula();

    /**
     * Gets the {@link ParameterSwitchKind} that determines the actual value to use for {@code ValueSet}
     */
    ParameterSwitchKind getValueSwitch();

    /**
     * Sets the {@link ParameterSwitchKind} that determines the actual value to use for {@code ValueSet}
     *
     * @param valueSwitch {@link ParameterSwitchKind} to set
     */
    void setValueSwitch(ParameterSwitchKind valueSwitch);

    /**
     * Resets the {@code ValueArray} of the {@link #getManual()} to proper amount of slots and default value of "-"
     */
    void resetManual();

    /**
     * Resets the {@code ValueArray} of the {@link #getComputed()} to proper amount of slots and default value of "-"
     */
    void resetComputed();

    /**
     * Resets the {@code ValueArray} of the {@link #getReference()} to proper amount of slots and default value of "-"
     */
    void resetReference();

    /**
     * Resets the {@code ValueArray} of the {@link #getFormula()} Formula} to proper amount of slots and default value of "-"
     */
    void resetFormula();
}
