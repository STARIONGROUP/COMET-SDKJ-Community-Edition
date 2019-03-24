/*
 * ValueSet.java
 * Copyright (c) 2018 RHEA System S.A.
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
