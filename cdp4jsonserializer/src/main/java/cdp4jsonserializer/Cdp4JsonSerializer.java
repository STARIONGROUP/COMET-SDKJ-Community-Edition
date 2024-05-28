/*
 * Cdp4JsonSerializer.java
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

package cdp4jsonserializer;

import cdp4common.Version;
import cdp4common.dto.Thing;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;

/**
 * An interface for the CDP4 JSON Serializer.
 */
public interface Cdp4JsonSerializer {

  /**
   * Gets the data model version for this request.
   *
   * @return {@link Version} of the data model for this request.
   */
  Version getRequestDataModelVersion();

  /**
   * Initialize this instance with the supported {@link Version}.
   *
   * @param supportedVersion The supported {@link Version}.
   */
  void initialize(Version supportedVersion);

  /**
   * The serialize to stream.
   *
   * @param collectionSource The collection source.
   * @param outputStream The output stream to which the serialized JSON objects are written.
   * @throws IOException when there is a problem with accessing outputStream.
   */
  void serializeToStream(Object collectionSource, OutputStream outputStream) throws IOException;

  /**
   * Serialize the {@link cdp4common.commondata.Thing} to a JSON stream.
   *
   * @param source The {@link cdp4common.commondata.Thing}.
   * @param outputStream The output stream to which the serialized JSON objects are written.
   * @param isExtentDeep A value indicating whether the contained {@link
   * cdp4common.commondata.Thing} shall be included in the JSON stream.
   * @throws IOException when there is a problem with accessing outputStream.
   */
  void serializeToStream(cdp4common.commondata.Thing source, OutputStream outputStream,
      boolean isExtentDeep) throws IOException;

  /**
   * Serialize the {@link cdp4common.commondata.Thing} to a JSON String.
   *
   * @param source The {@link cdp4common.commondata.Thing}.
   * @param isExtentDeep A value indicating whether the contained {@link
   * cdp4common.commondata.Thing} shall be processed.
   * @return The JSON String.
   * @throws IOException when there is a problem with serializing {@code source}.
   */
  String serializeToString(cdp4common.commondata.Thing source, boolean isExtentDeep)
      throws IOException;

  /**
   * Convenience method that deserializes the passed in JSON content stream.
   *
   * @param contentStream The content Stream.
   * @return The the deserialized collection of {@link cdp4common.dto.Thing}.
   * @throws IOException when there is a problem with deserializing {@code source}.
   */
  List<Thing> deserialize(InputStream contentStream) throws IOException;

  /**
   * Convenience method that deserializes the passed in JSON content stream.
   *
   * @param <T> The type of deserialized objects.
   * @param typeReference The type reference for which deserialization will be performed.
   * @param contentStream The content Stream.
   * @return The deserialized instance of {@code T}.
   * @throws IOException when there is a problem with deserializing {@code source}.
   */
  <T> T deserialize(TypeReference<T> typeReference, InputStream contentStream) throws IOException;
}
