/*
 * ValueArraySerializer.java
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

package cdp4jsonserializer.serializers;

import cdp4common.types.ValueArray;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import java.io.IOException;

public class ValueArraySerializer extends StdSerializer<ValueArray> {

  public ValueArraySerializer() {
    this(null);
  }

  public ValueArraySerializer(Class<ValueArray> t) {
    super(t);
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public void serialize(
      ValueArray value, JsonGenerator jgen, SerializerProvider provider)
      throws IOException {

    StringBuilder builder = new StringBuilder("[");

    for (Object item : value) {
      builder.append("\"");
      // Escape special string characters in accordance with JSON specification
      // Details see http://www.ecma-international.org/publications/files/ECMA-ST/ECMA-404.pdf
      // Section 9 String
      builder.append(item.toString()
          .replace("\\", "\\\\")
          .replace("\"", "\\\"")
          .replace("\b", "\\b")
          .replace("\f", "\\f")
          .replace("\n", "\\n")
          .replace("\r", "\\r")
          .replace("\t", "\\t")
          .replace("/", "\\/")
      );
      builder.append("\"");
      builder.append(",");
    }

    // Delete last comma
    builder.deleteCharAt(builder.length() - 1);

    builder.append("]");

    jgen.writeString(builder.toString());
  }
}
