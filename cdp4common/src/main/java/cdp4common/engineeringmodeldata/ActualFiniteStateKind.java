/* --------------------------------------------------------------------------------------------------------------------
 * ActualFiniteStateKind.java
 * Copyright (c) 2018 RHEA System S.A.
 *
 * This is an auto-generated Enumeration. Any manual changes to this file will be overwritten!
 * --------------------------------------------------------------------------------------------------------------------
 */

package cdp4common.engineeringmodeldata;

/**
 * enumeration datatype that defines the possible kinds of ActualFiniteState
 */
public enum ActualFiniteStateKind
{
    /**
     * assertion that an ActualFiniteState is mandatory, i.e. shall be used as an actualState on a ParameterValueSet or ParameterSubscriptionValueSet for a Parameter that has a <i>stateDependence</i> on the ActualFiniteStateList that contains the ActualFiniteState
     */
    MANDATORY,

    /**
     * assertion that an ActualFiniteState is forbidden, i.e. shall be not used as an actualState on a ParameterValueSet or ParameterSubscriptionValueSet for a Parameter that has a <i>stateDependence</i> on the ActualFiniteStateList that contains the ActualFiniteState
     */
    FORBIDDEN,
}
