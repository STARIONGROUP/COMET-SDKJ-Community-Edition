/* --------------------------------------------------------------------------------------------------------------------
 * BooleanOperatorKind.java
 * Copyright (c) 2018 RHEA System S.A.
 *
 * This is an auto-generated Enumeration. Any manual changes to this file will be overwritten!
 * --------------------------------------------------------------------------------------------------------------------
 */

package cdp4common.engineeringmodeldata;

/**
 * enumeration datatype that represents a simple set of boolean operatorsNote: For an explanation of the operators see <a href="http://en.wikipedia.org/wiki/Boolean_algebra#Basic_operations">WikipediaBoolean_algebra Basic_operations</a>.
 */
public enum BooleanOperatorKind
{
    /**
     * conjunction boolean operatorNote: When both operands are true then the result is true, otherwise false.
     */
    AND,

    /**
     * disjunction boolean operatorNote: When at least one operand is true then the result is true,otherwise false.
     */
    OR,

    /**
     * exclusive or boolean operatorNote: When one operand is true and the other is false then the result istrue, when both operands are true or both are false then the result isfalse.
     */
    XOR,
}
