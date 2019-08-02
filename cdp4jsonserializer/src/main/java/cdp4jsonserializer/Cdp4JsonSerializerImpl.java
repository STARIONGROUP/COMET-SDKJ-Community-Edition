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
import cdp4common.types.OrderedItem;
import cdp4common.types.ValueArray;
import cdp4jsonserializer.deserializers.OrderedItemDeserializer;
import cdp4jsonserializer.deserializers.ValueArrayDeserializer;
import cdp4jsonserializer.serializers.OrderedItemSerializer;
import cdp4jsonserializer.serializers.ValueArraySerializer;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.google.common.base.Stopwatch;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import lombok.Getter;
import lombok.extern.log4j.Log4j2;

// TODO filter classes based on CdpVersion before serialization/after deserialization, because object mapper does not provide this functionality
// TODO Generate a map of class - version for fast comparison

/**
 * The CDP4 JSON Serializer.
 */
@Log4j2
public class Cdp4JsonSerializerImpl implements Cdp4JsonSerializer {

  /**
   * An instance of {@link ObjectMapper} that is used as a JSON serializer/deserializer. Practically
   * it should be a single instance for a single instance of {@link Cdp4JsonSerializer}, because it
   * is absolutely thread safe and provides an internal caching mechanism for a better efficiency.
   */
  private ObjectMapper serializer;

  /**
   * Initializes a new instance of the {@link Cdp4JsonSerializer} class.
   *
   * @param supportedVersion The supported version of the data-model.
   */
  public Cdp4JsonSerializerImpl(Version supportedVersion) {
    this.initialize(supportedVersion);
  }

  /**
   * Initializes a new instance of the {@link Cdp4JsonSerializerImpl} class.
   */
  public Cdp4JsonSerializerImpl() {
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
  public void initialize(Version supportedVersion) {
    this.requestDataModelVersion = supportedVersion;
    this.serializer = createObjectMapper();
  }

  /**
   * The serialize to stream.
   *
   * @param collectionSource The collection source.
   * @param outputStream The output stream to which the serialized JSON objects are written.
   * @throws IOException when there is a problem with accessing outputStream.
   */
  @Override
  public void serializeToStream(Object collectionSource, OutputStream outputStream)
      throws IOException {
    if (collectionSource == null) {
      throw new IllegalArgumentException("The collection source may not be null.");
    }

    if (outputStream == null) {
      throw new IllegalArgumentException("OutputStream may not be null.");
    }

    if (this.requestDataModelVersion == null) {
      throw new IllegalStateException(
          "The supported version or the data model version has not been set. Call the Initialize method to set it.");
    }

    var sw = Stopwatch.createStarted();

    log.trace("Serialize sources");
    serializer.writeValue(outputStream, collectionSource);

    sw.stop();
    log.debug("SerializeToStream finished in {} [ms]", sw.elapsed(TimeUnit.MILLISECONDS));
  }

  /**
   * Serialize the {@link cdp4common.commondata.Thing} to a JSON stream.
   *
   * @param source The {@link cdp4common.commondata.Thing}.
   * @param outputStream The output stream to which the serialized JSON objects are written.
   * @param isExtentDeep A value indicating whether the contained {@link
   * cdp4common.commondata.Thing} shall be included in the JSON stream.
   * @throws IOException when there is a problem with accessing outputStream.
   */
  @Override
  public void serializeToStream(cdp4common.commondata.Thing source, OutputStream outputStream,
      boolean isExtentDeep)
      throws IOException {
    if (source == null) {
      throw new IllegalArgumentException("The source Thing may not be null.");
    }

    if (outputStream == null) {
      throw new IllegalArgumentException("OutputStream may not be null.");
    }

    if (this.requestDataModelVersion == null) {
      throw new IllegalStateException(
          "The supported version or the data model version has not been set. Call the Initialize method to set it.");
    }

    var dtos = new ArrayList<Thing>();
    if (isExtentDeep) {
      var pojos = source.queryContainedThingsDeep();
      for (var pojo : pojos) {
        dtos.add(pojo.toDto());
      }
    } else {
      dtos.add(source.toDto());
    }

    log.debug("serializing {} DTO's", dtos.size());

    this.serializeToStream(dtos, outputStream);
  }

  /**
   * Serialize the {@link cdp4common.commondata.Thing} to a JSON String.
   *
   * @param source The {@link cdp4common.commondata.Thing}.
   * @param isExtentDeep A value indicating whether the contained {@link
   * cdp4common.commondata.Thing} shall be processed.
   * @return The JSON String.
   * @throws IOException when there is a problem with serializing {@code source}.
   */
  @Override
  public String serializeToString(cdp4common.commondata.Thing source, boolean isExtentDeep)
      throws IOException {
    if (this.requestDataModelVersion == null) {
      throw new IllegalStateException(
          "The supported version or the data model version has not been set. Call the Initialize method to set it.");
    }

    String jsonString;
    log.trace("initializing ByteArrayOutputStream");

    var outputStream = new ByteArrayOutputStream();
    this.serializeToStream(source, outputStream, isExtentDeep);

    var sw = Stopwatch.createStarted();
    jsonString = outputStream.toString();
    sw.stop();

    log.trace("write json stream to json string in {} [ms]", sw.elapsed(TimeUnit.MILLISECONDS));

    return jsonString;
  }

  /**
   * Convenience method that deserializes the passed in JSON content stream.
   *
   * @param contentStream The content Stream.
   * @return The deserialized collection of {@link cdp4common.dto.Thing}.
   */
  @Override
  public List<Thing> deserialize(InputStream contentStream) throws IOException {
    return this.deserialize(new TypeReference<List<Thing>>() {
    }, contentStream);
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
    if (this.requestDataModelVersion == null) {
      throw new IllegalArgumentException(
          "The supported version has not been set. Call the initialize method to set it.");
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
  private ObjectMapper createObjectMapper() {
    log.trace("initializing ObjectMapper");

    ObjectMapper objectMapper = new ObjectMapper();
    objectMapper.addMixIn(Thing.class, DtoThingMixIn.class);
    objectMapper.setSerializationInclusion(Include.ALWAYS);

    // Setup checked visibility of fields and getters/setters
    objectMapper.setVisibility(objectMapper.getSerializationConfig().getDefaultVisibilityChecker()
        .withFieldVisibility(Visibility.ANY)
        .withGetterVisibility(Visibility.PUBLIC_ONLY)
        .withIsGetterVisibility(Visibility.PUBLIC_ONLY)
        .withSetterVisibility(Visibility.PUBLIC_ONLY)
        .withCreatorVisibility(Visibility.ANY)
    );

    objectMapper.setAnnotationIntrospector(new CdpAnnotationIntrospector(requestDataModelVersion));

    SimpleModule module = new SimpleModule();
    module.addDeserializer(ValueArray.class, new ValueArrayDeserializer());
    module.addDeserializer(OrderedItem.class, new OrderedItemDeserializer());
    module.addSerializer(ValueArray.class, new ValueArraySerializer());
    module.addSerializer(OrderedItem.class, new OrderedItemSerializer());

    // Register modules for Java Time  and custom classes
    objectMapper.registerModules(new JavaTimeModule(), module);
    objectMapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);

    return objectMapper;
  }
}
