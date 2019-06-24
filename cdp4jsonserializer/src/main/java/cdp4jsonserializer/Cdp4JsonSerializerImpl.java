/*
 * Cdp4JsonSerializerImpl.java
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

package cdp4jsonserializer;

import cdp4common.Version;
import cdp4common.dto.Thing;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.google.common.base.Stopwatch;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.concurrent.TimeUnit;
import lombok.Getter;
import lombok.extern.log4j.Log4j2;

/**
* The CDP4 JSON Serializer.
*/
@Log4j2
public class Cdp4JsonSerializerImpl implements Cdp4JsonSerializer{

  /**
  * Initializes a new instance of the {@link Cdp4JsonSerializer} class.
  *
  * @param supportedVersion The supported version of the data-model.
   */
  public Cdp4JsonSerializerImpl(Version supportedVersion)
  {
    this.initialize(supportedVersion);
  }

  /**
  * Initializes a new instance of the {@link Cdp4JsonSerializerImpl} class.
  */
  public Cdp4JsonSerializerImpl()
  {
  }

  /**
  * Data model version for this request.
  */
  @Getter(onMethod = @__({@Override}))
  private Version requestDataModelVersion;

  /**
  * Initialize this instance with the supported {@link Version}.
  *
  * @param supportedVersion The supported {@link Version}.
   */
  @Override
  public void initialize(Version supportedVersion)
  {
    this.requestDataModelVersion = supportedVersion;
  }

  /**
  * The serialize to stream.
  *
  * @param collectionSource The collection source.
  * @param outputStream The output stream to which the serialized JSON objects are written.
  */
  @Override
  public void serializeToStream(Object collectionSource, OutputStream outputStream)
  {
  }

  /**
  * Serialize the {@link cdp4common.commondata.Thing} to a JSON stream.
  
  * @param source The {@link cdp4common.commondata.Thing}.
  * @param outputStream The output stream to which the serialized JSON objects are written.
  * @param isExtentDeep A value indicating whether the contained {@link cdp4common.commondata.Thing} shall be included in the JSON stream.
  */
  @Override
  public void serializeToStream(cdp4common.commondata.Thing source, OutputStream outputStream, boolean isExtentDeep)
  {
  }

  /**
  * Serialize the {@link cdp4common.commondata.Thing} to a JSON String.
  *
  * @param source The {@link cdp4common.commondata.Thing}.
  * @param isExtentDeep A value indicating whether the contained {@link cdp4common.commondata.Thing} shall be processed.
  * @return The JSON String
   */
  @Override
  public String serializeToString(cdp4common.commondata.Thing source, boolean isExtentDeep)
  {
    return "";
  }

  /**
  * Convenience method that deserializes the passed in JSON content stream.
  *
  * @param contentStream The content Stream.
  * @return The deserialized collection of {@link cdp4common.dto.Thing}.
  */
  @Override
  public List<Thing> deserialize(InputStream contentStream) throws IOException {
    return this.deserialize(new TypeReference<List<Thing>>() {}, contentStream);
  }

  /**
  * Convenience method that deserializes the passed in JSON content stream.
  *
  * @param <T> The type reference for which deserialization will be performed.
  * @param contentStream The content Stream.
  * @return The deserialized instance of {@link T}.
  */
  @Override
  public <T> T deserialize(TypeReference<T> typeReference, InputStream contentStream)
      throws IOException {
    if (this.requestDataModelVersion == null)
    {
      throw new IllegalArgumentException("The supported version has not been set. Call the initialize method to set it.");
    }

    var serializer = this.createObjectMapper();

      var sw = Stopwatch.createStarted();
      T data = serializer.readValue(contentStream, typeReference);
      log.trace("Deserialize from stream in {} [ms]", sw.elapsed(TimeUnit.MILLISECONDS));

    return data;
  }

  /**
  * Create a {@link com.fasterxml.jackson.databind.ObjectMapper}.
  *
  * @return An instance of {@link ObjectMapper}.
  */
  private ObjectMapper createObjectMapper()
  {
    log.trace("initializing ObjectMapper");

    ObjectMapper objectMapper = new ObjectMapper();
    objectMapper.addMixIn(Thing.class, DtoThingMixIn.class);
    objectMapper.setSerializationInclusion(Include.NON_NULL);

    // Setup checked visibility of fields and getters/setters
    objectMapper.setVisibility(objectMapper.getSerializationConfig().getDefaultVisibilityChecker()
        .withFieldVisibility(Visibility.ANY)
        .withGetterVisibility(Visibility.PUBLIC_ONLY)
        .withIsGetterVisibility(Visibility.PUBLIC_ONLY)
        .withSetterVisibility(Visibility.PUBLIC_ONLY)
        .withCreatorVisibility(Visibility.ANY)
    );

    // Register a module for Java Time mapping
    objectMapper.registerModule(new JavaTimeModule());

    // TODO version property or class handling


    return objectMapper;
  }
}
