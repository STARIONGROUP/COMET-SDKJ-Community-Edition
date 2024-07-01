/*
 * UuidComparator.java
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

package cdp4common.comparators;

import java.util.Comparator;
import java.util.UUID;

/**
 * A class to have a comparison of UUID as GUID in C# Description of how comparison is performed in
 * C# can be found here https://docs.microsoft.com/ru-ru/dotnet/api/system.guid.compareto?view=netframework-4.8.
 * By default UUID.compareTo(UUID val) returns different results in comparison to GUID.CompareTo(T),
 * because of different internal representation and comparison logic
 */
public class UuidComparator implements Comparator<UUID> {

  /**
   * {@inheritDoc}
   */
  @Override
  public int compare(UUID uuid1, UUID uuid2) {
    return compareUuid(uuid1, uuid2);
  }

  /**
   * Compares its two arguments for order.  Returns a negative integer, zero, or a positive integer
   * as the first argument is less than, equal to, or greater than the second.<p>
   *
   * The implementor must ensure that {@code sgn(compare(x, y)) == -sgn(compare(y, x))} for all
   * {@code x} and {@code y}.  (This implies that {@code compare(x, y)} must throw an exception if
   * and only if {@code compare(y, x)} throws an exception.)<p>
   *
   * The implementor must also ensure that the relation is transitive: {@code ((compare(x, y)>0) &&
   * (compare(y, z)>0))} implies {@code compare(x, z)>0}.<p>
   *
   * Finally, the implementor must ensure that {@code compare(x, y)==0} implies that {@code
   * sgn(compare(x, z))==sgn(compare(y, z))} for all {@code z}.<p>
   *
   * It is generally the case, but <i>not</i> strictly required that {@code (compare(x, y)==0) ==
   * (x.equals(y))}.  Generally speaking, any comparator that violates this condition should clearly
   * indicate this fact.  The recommended language is "Note: this comparator imposes orderings that
   * are inconsistent with equals."<p>
   *
   * In the foregoing description, the notation {@code sgn(}<i>expression</i>{@code )} designates
   * the mathematical
   * <i>signum</i> function, which is defined to return one of {@code -1},
   * {@code 0}, or {@code 1} according to whether the value of
   * <i>expression</i> is negative, zero, or positive, respectively.
   *
   * @param uuid1 the first object to be compared.
   * @param uuid2 the second object to be compared.
   * @return a negative integer, zero, or a positive integer as the first argument is less than,
   * equal to, or greater than the second.
   * @throws NullPointerException if an argument is null and this comparator does not permit null
   * arguments
   */
  public static int compareUuid(UUID uuid1, UUID uuid2) {
    // The simplest way is to compare as strings,
    //
    // return uuid1.toString().compareTo(uuid2.toString());
    //
    // but it appears to be ~3 times slower
    // then the below bit comparison approach

    long uuid1_first32 = extractBits(uuid1.getMostSignificantBits(), 32, 32);
    long uuid2_first32 = extractBits(uuid2.getMostSignificantBits(), 32, 32);

    if (uuid1_first32 == uuid2_first32) {
      long uuid1_second16 = extractBits(uuid1.getMostSignificantBits(), 16, 16);
      long uuid2_second16 = extractBits(uuid2.getMostSignificantBits(), 16, 16);

      if (uuid1_second16 == uuid2_second16) {
        long uuid1_third16 = extractBits(uuid1.getMostSignificantBits(), 16, 0);
        long uuid2_third16 = extractBits(uuid2.getMostSignificantBits(), 16, 0);

        if (uuid1_third16 == uuid2_third16) {
          long uuid1_last64 = uuid1.getLeastSignificantBits();
          byte[] uuid1_last8byte_array = new byte[8];
          for (int i = 7; i >= 0; i--) {
            uuid1_last8byte_array[i] = (byte) (uuid1_last64 & 0xFF);
            uuid1_last64 >>= 8;
          }

          long uuid2_last64 = uuid2.getLeastSignificantBits();
          byte[] uuid2_last8byte_array = new byte[8];
          for (int i = 7; i >= 0; i--) {
            uuid2_last8byte_array[i] = (byte) (uuid2_last64 & 0xFF);
            uuid2_last64 >>= 8;
          }

          for (int i = 0; i < 8; i++) {
            if (uuid1_last8byte_array[i] != uuid2_last8byte_array[i]) {
              return Integer.compare(Byte.toUnsignedInt(uuid1_last8byte_array[i]), Byte.toUnsignedInt(uuid2_last8byte_array[i]));
            }
          }

          return 0;
        } else {
          return Long.compare(uuid1_third16, uuid2_third16);
        }
      } else {
        return Long.compare(uuid1_second16, uuid2_second16);
      }
    }

    return Long.compare(uuid1_first32, uuid2_first32);
  }

  /**
   * Extracts required amount of bits from the supplied value starting from the required position.
   *
   * @param value {@code long} value to extract bits from.
   * @param numberOfBits Number of bits in a row to extract.
   * @param offset Position from which to start extracting bits. The direction is from right to left
   * (from the least significant bit to the most significant bit).
   * @return Extracted bits as a {@code long} value.
   */
  private static long extractBits(final long value, final int numberOfBits, final int offset) {
    final long rightShifted = value >>> offset;
    final long mask = (1L << numberOfBits) - 1L;
    return rightShifted & mask;
  }
}
