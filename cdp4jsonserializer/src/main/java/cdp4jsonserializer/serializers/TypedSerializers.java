/*
 * TypedSerializers.java
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

package cdp4jsonserializer.serializers;

import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.Serializers;
import com.fasterxml.jackson.databind.type.ArrayType;
import com.fasterxml.jackson.databind.type.ClassKey;
import com.fasterxml.jackson.databind.type.CollectionLikeType;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.type.MapLikeType;
import com.fasterxml.jackson.databind.type.MapType;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

/**
 * Typed {@link Serializers} implementation that implements all methods and provides custom
 * {@link Serializers} for fully resolved type instead of only type-erased {@code Class}.
 * This class is provided for extensions that can be registered with {@link ObjectMapper}.
 * A big part of it was taken from {@link com.fasterxml.jackson.databind.module.SimpleSerializers}
 * as a reference.
 */
public class TypedSerializers extends Serializers.Base {

  /**
   * JavaType-based mappings that is used for exact matches.
   */
  protected HashMap<JavaType, JsonSerializer<?>> _javaTypeMappings = new HashMap<>();

  /**
   * Class-based mappings that are used both for exact and sub-class matches.
   */
  protected HashMap<ClassKey, JsonSerializer<?>> _classMappings = null;

  /**
   * Interface-based matches.
   */
  protected HashMap<ClassKey, JsonSerializer<?>> _interfaceMappings = null;

  /**
   * Flag to help find "generic" enum serializer, if one has been registered.
   *
   * @since 2.3
   */
  protected boolean _hasEnumSerializer = false;

    /*
    /**********************************************************
    /* Life-cycle, construction and configuring
    /**********************************************************
     */

  public TypedSerializers() {
  }

  /**
   * @since 2.1
   */
  public TypedSerializers(List<JsonSerializer<?>> sers) {
    addSerializers(sers);
  }

  /**
   * Method for adding given serializer for type that {@link JsonSerializer#handledType} specifies
   * (which MUST return a non-null class; and can NOT be {@link Object}, as a sanity check). For
   * serializers that do not declare handled type, use the variant that takes two arguments.
   */
  public void addSerializer(JsonSerializer<?> ser) {
    // Interface to match?
    Class<?> cls = ser.handledType();
    if (cls == null || cls == Object.class) {
      throw new IllegalArgumentException("JsonSerializer of type " + ser.getClass().getName()
          + " does not define valid handledType() -- must either register with method that takes type argument "
          + " or make serializer extend 'com.fasterxml.jackson.databind.ser.std.StdSerializer'");
    }
    _addSerializer(cls, ser);
  }

  public <T> void addSerializer(Class<? extends T> type, JsonSerializer<T> ser) {
    _addSerializer(type, ser);
  }

  /**
   * @since 2.1
   */
  public void addSerializers(List<JsonSerializer<?>> sers) {
    for (JsonSerializer<?> ser : sers) {
      addSerializer(ser);
    }
  }

  /**
   * Method for adding given serializer for type that {@link JsonSerializer#handledType} specifies
   * (which MUST return a non-null class; and can NOT be {@link Object}, as a sanity check).
   *
   * @param type Fully resolved type of instances to serialize.
   * @param ser {@link JsonSerializer} to use for the supplied type.
   */
  public <T> void addSerializer(JavaType type, JsonSerializer<T> ser) {
    Objects.requireNonNull(type, "JavaType cannot be null");
    Objects.requireNonNull(ser, "Serializer cannot be null");
    _javaTypeMappings.put(type, ser);
  }

    /*
    /**********************************************************
    /* Serializers implementation
    /**********************************************************
     */

  /**
   * {@inheritDoc}
   */
  @Override
  public JsonSerializer<?> findSerializer(SerializationConfig config,
      JavaType type, BeanDescription beanDesc) {
    Class<?> cls = type.getRawClass();
    ClassKey key = new ClassKey(cls);
    JsonSerializer<?> ser = null;

    if (_javaTypeMappings != null) {
      // First of all we are interested in typed Lists
      if (type.isCollectionLikeType()) {
        var typeKey = _javaTypeMappings.keySet().stream()
            .filter(x -> x.getRawClass().isAssignableFrom(type.getRawClass()))
            .filter(x -> x.getContentType().equals(type.getContentType()))
            .findAny();

        if (typeKey.isPresent()) {
          return _javaTypeMappings.get(typeKey.get());
        }
      }

      ser = _javaTypeMappings.get(type);
      if (ser != null) {
        return ser;
      }
    }

    // First: direct match?
    if (cls.isInterface()) {
      if (_interfaceMappings != null) {
        ser = _interfaceMappings.get(key);
        if (ser != null) {
          return ser;
        }
      }
    } else {
      if (_classMappings != null) {
        ser = _classMappings.get(key);
        if (ser != null) {
          return ser;
        }

        // [Issue#227]: Handle registration of plain `Enum` serializer
        if (_hasEnumSerializer && type.isEnumType()) {
          key.reset(Enum.class);
          ser = _classMappings.get(key);
          if (ser != null) {
            return ser;
          }
        }

        // If not direct match, maybe super-class match?
        for (Class<?> curr = cls; (curr != null); curr = curr.getSuperclass()) {
          key.reset(curr);
          ser = _classMappings.get(key);
          if (ser != null) {
            return ser;
          }
        }
      }
    }
    // No direct match? How about super-interfaces?
    if (_interfaceMappings != null) {
      ser = _findInterfaceMapping(cls, key);
      if (ser != null) {
        return ser;
      }
      // still no matches? Maybe interfaces of super classes
      if (!cls.isInterface()) {
        while ((cls = cls.getSuperclass()) != null) {
          ser = _findInterfaceMapping(cls, key);
          if (ser != null) {
            return ser;
          }
        }
      }
    }
    return null;
  }

  @Override
  public JsonSerializer<?> findArraySerializer(SerializationConfig config,
      ArrayType type, BeanDescription beanDesc,
      TypeSerializer elementTypeSerializer, JsonSerializer<Object> elementValueSerializer) {
    return findSerializer(config, type, beanDesc);
  }

  @Override
  public JsonSerializer<?> findCollectionSerializer(SerializationConfig config,
      CollectionType type, BeanDescription beanDesc,
      TypeSerializer elementTypeSerializer, JsonSerializer<Object> elementValueSerializer) {
    return findSerializer(config, type, beanDesc);
  }

  @Override
  public JsonSerializer<?> findCollectionLikeSerializer(SerializationConfig config,
      CollectionLikeType type, BeanDescription beanDesc,
      TypeSerializer elementTypeSerializer, JsonSerializer<Object> elementValueSerializer) {
    return findSerializer(config, type, beanDesc);
  }

  @Override
  public JsonSerializer<?> findMapSerializer(SerializationConfig config,
      MapType type, BeanDescription beanDesc,
      JsonSerializer<Object> keySerializer,
      TypeSerializer elementTypeSerializer, JsonSerializer<Object> elementValueSerializer) {
    return findSerializer(config, type, beanDesc);
  }

  @Override
  public JsonSerializer<?> findMapLikeSerializer(SerializationConfig config,
      MapLikeType type, BeanDescription beanDesc,
      JsonSerializer<Object> keySerializer,
      TypeSerializer elementTypeSerializer, JsonSerializer<Object> elementValueSerializer) {
    return findSerializer(config, type, beanDesc);
  }

    /*
    /**********************************************************
    /* Internal methods
    /**********************************************************
     */

  protected JsonSerializer<?> _findInterfaceMapping(Class<?> cls, ClassKey key) {
    for (Class<?> iface : cls.getInterfaces()) {
      key.reset(iface);
      JsonSerializer<?> ser = _interfaceMappings.get(key);
      if (ser != null) {
        return ser;
      }
      ser = _findInterfaceMapping(iface, key);
      if (ser != null) {
        return ser;
      }
    }
    return null;
  }

  protected void _addSerializer(Class<?> cls, JsonSerializer<?> ser) {
    ClassKey key = new ClassKey(cls);
    // Interface or class type?
    if (cls.isInterface()) {
      if (_interfaceMappings == null) {
        _interfaceMappings = new HashMap<ClassKey, JsonSerializer<?>>();
      }
      _interfaceMappings.put(key, ser);
    } else { // nope, class:
      if (_classMappings == null) {
        _classMappings = new HashMap<ClassKey, JsonSerializer<?>>();
      }
      _classMappings.put(key, ser);
      if (cls == Enum.class) {
        _hasEnumSerializer = true;
      }
    }
  }
}
