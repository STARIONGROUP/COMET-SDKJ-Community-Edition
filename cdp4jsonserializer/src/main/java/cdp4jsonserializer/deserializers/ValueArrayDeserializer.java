/*
 * ValueArrayDeserializer.java
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
 */

package cdp4jsonserializer.deserializers;

import cdp4common.types.ValueArray;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ValueArrayDeserializer extends StdDeserializer<ValueArray> {

  public ValueArrayDeserializer() {
    this(null);
  }

  public ValueArrayDeserializer(Class<?> vc) {
    super(vc);
  }

  @Override
  public ValueArray deserialize(JsonParser jp, DeserializationContext ctxt)
      throws IOException, JsonProcessingException {
    String value = jp.getCodec().readValue(jp, String.class);

    int firstBracketIndex = value.indexOf("[");
    int lastBracketIndex = value.indexOf("]");

    String[] values = value.substring(firstBracketIndex + 1, lastBracketIndex).split(",");

    List<String> list = new ArrayList<>();

    for (var item : values) {
      list.add(item.strip().replace("\"", ""));
    }

    return new ValueArray<>(list, String.class);
  }
}
