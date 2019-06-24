/*
 * PostOperationTest.java
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

package cdp4servicesdal;

import static org.junit.jupiter.api.Assertions.assertEquals;

import cdp4common.Version;
import cdp4jsonserializer.Cdp4JsonSerializer;
import cdp4jsonserializer.Cdp4JsonSerializerImpl;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PostOperationTest {

  private Cdp4JsonSerializer serializer;

  @BeforeEach
  void setup() {
    this.serializer = new Cdp4JsonSerializerImpl(new Version(1, 0, 0));
  }

  @Test
  void verify_that_deserialization_of_Post_Operation_does_not_throw_an_exception()
      throws IOException {
    var response = Paths.get("src/test/java/cdp4servicesdal/testdata/PostOperation.json");
    InputStream io = new BufferedInputStream(Files.newInputStream(response));

    var test = this.serializer.deserialize(new TypeReference<CdpPostOperation>() {
    }, io);

    assertEquals(1, test.getCopy().size());
  }
}
