/* --------------------------------------------------------------------------------------------------------------------
 * NumberSetKind.java
 *
 * Copyright (c) 2015-2019 RHEA System S.A.
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

package cdp4common.sitedirectorydata;

/**
 * enumeration datatype that specifies a mathematical number set
 */
public enum NumberSetKind
{
    /**
     * Note: In mathematics the set of natural numbers is denoted by ℕ, seealso <a href="http://mathworld.wolfram.com/NaturalNumber.html">http://mathworld.wolfram.com/NaturalNumber.html</a>.Theset of natural numbers is a subset of the set of integer numbers.
     */
    NATURAL_NUMBER_SET,

    /**
     * designation of the mathematical set of integer numbers, i.e. ..., -2,-1, 0, 1, 2, ...Note: In mathematics the set of integer numbers is denoted by ℤ, seealso <a href="http://mathworld.wolfram.com/Integer.html">http://mathworld.wolfram.com/Integer.html</a>.The set of integer numbers is a subset of the set of rational numbers.
     */
    INTEGER_NUMBER_SET,

    /**
     * designation of the mathematical set of rational numbers, i.e. numbersthat can be expressed as a ratio (with a non-zero denominator)Note: In mathematics the set of rational numbers is denoted by ℂ, seealso <a href="http://mathworld.wolfram.com/RationalNumber.html">http://mathworld.wolfram.com/RationalNumber.html</a>.The set of rational numbers is a subset of the set of real numbers.
     */
    RATIONAL_NUMBER_SET,

    /**
     * designation of the mathematical set of real numbers, i.e. the union ofrational and irrational numbersNote: In mathematics the set of real numbers is denoted by ℝ, see also <a href="http://mathworld.wolfram.com/RealNumber.html">http://mathworld.wolfram.com/RealNumber.html</a>.
     */
    REAL_NUMBER_SET,
}
