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
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValueArrayDeserializer extends StdDeserializer<ValueArray> {

  public ValueArrayDeserializer() {
    this(null);
  }

  public ValueArrayDeserializer(Class<?> vc) {
    super(vc);
  }

  @Override
  public ValueArray deserialize(JsonParser jp, DeserializationContext ctxt)
      throws IOException {
    ObjectMapper mapper = (ObjectMapper) jp.getCodec();
    JsonNode node = mapper.readTree(jp);
    String value = mapper.writeValueAsString(node);

    Pattern patternArray = Pattern.compile("^\\[(.*)\\]$", Pattern.DOTALL);
    Matcher arrayMatcher = patternArray.matcher(value);
    arrayMatcher.find();
    String extractedArrayString = arrayMatcher.group(1);

    // match within 2 unescape double-quote the following content:
    // 1) (no special char \ or ") 0..* times
    // 2) (a pattern that starts with \ followed by any character (special included) and 0..* "non special" characters) 0..* times
    Pattern patternElements = Pattern.compile("\"([^\"\"\\\\]*(\\\\.[^\"\"\\\\]*)*)\"");
    var elements = patternElements.matcher(extractedArrayString);
    var items = new ArrayList<String>();

    while (elements.find()) {
      items.add(elements.group(1).replace("\\\"", "\"").replace("\\\\", "\\"));
    }

    return new ValueArray<>(items, String.class);
  }
}
