/*
 * StreamToHashComputer.java
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

package cdp4dal.utilities;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.security.DigestInputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * The purpose of the {@link StreamToHashComputer} class is to compute a hash of a stream.
 */
public class StreamToHashComputer {

  /**
   * Calculate the SHA1 hash from a stream.
   *
   * @param inputStream The {@link java.io.InputStream}stream for which to calculate the hash.
   * @return The hexadecimal string representation of a SHA-1 hash code.
   */
  public static String calculateSha1HashFromStream(InputStream inputStream) {
    try (DigestInputStream in = new DigestInputStream(new BufferedInputStream(inputStream),
        MessageDigest.getInstance("SHA-1"))) {
      // Read the stream and do nothing with it
      while (in.read() != -1) {
      }

      final MessageDigest md = in.getMessageDigest();
      BigInteger hash = new BigInteger(1, md.digest());

      return hash.toString(16);
    } catch (IOException e) {
      e.printStackTrace();
      throw new RuntimeException("Cannot read input stream for calculating hash.");
    } catch (NoSuchAlgorithmException e) {
      e.printStackTrace();
      throw new RuntimeException("Unable to find SHA-1 algorithm in the available implementation.");
    }
  }
}
