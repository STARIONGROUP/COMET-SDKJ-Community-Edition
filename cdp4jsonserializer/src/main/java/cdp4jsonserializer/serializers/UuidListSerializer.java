/*
 * UuidListSerializer.java
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

import cdp4common.comparators.UuidComparator;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import java.io.IOException;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

public class UuidListSerializer extends StdSerializer<List<UUID>> {

  private UuidComparator uuidComparator = new UuidComparator();

  public UuidListSerializer() {
    this(null);
  }

  public UuidListSerializer(Class<List<UUID>> t) {
    super(t);
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public void serialize(
      List<UUID> value, JsonGenerator jgen, SerializerProvider provider)
      throws IOException {

    // Empty list
    if (value.isEmpty()) {
      jgen.writeRawValue("[]");
      return;
    }

    jgen.writeStartArray();
    for (UUID item : value.stream().sorted(this.uuidComparator).collect(Collectors.toList())) {
      jgen.writeString(item.toString());
    }
    jgen.writeEndArray();
  }
}
