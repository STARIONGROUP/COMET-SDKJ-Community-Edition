/*
 * Utils.java
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

package cdp4common.helpers;

import cdp4common.commondata.ClassKind;
import cdp4common.sitedirectorydata.ParameterTypeComponent;
import cdp4common.types.OrderedItem;
import com.google.common.base.CaseFormat;
import com.google.common.base.Strings;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

public class Utils {

  /**
   * Get constant notation from upper camel according to the Java naming convention
   *
   * @param input The subject input string
   * @return A string
   */
  public static String getConstantNotationFromUpperCamel(String input) {
    if (Strings.isNullOrEmpty(input)) {
      throw new IllegalArgumentException("String can't be empty!");
    }

    char[] chars = input.toCharArray();
    StringBuilder constantName = new StringBuilder(Character.toString(chars[0]).toUpperCase());

    for (int i = 1; i < chars.length; i++) {
      if (Character.isUpperCase(chars[i]) && Character.isLowerCase(chars[i - 1])) {
        constantName.append("_");
      }

      constantName.append(chars[i]);
    }

    return constantName.toString().toUpperCase();
  }

  /**
   * Get upper camel notation from constant according to the Java naming convention
   *
   * @param input The subject input string
   * @return A string
   */
  public static String getUpperCamelNotationFromConstant(String input) {
    if (Strings.isNullOrEmpty(input)) {
      throw new IllegalArgumentException("String can't be empty!");
    }

    return CaseFormat.UPPER_UNDERSCORE.to(CaseFormat.UPPER_CAMEL, input);
  }

  /**
   * Extension method that extract the ordered Ids as a list of GUID from the passed in IEnumerable
   * of {@link OrderedItem}.
   *
   * @param orderedList The ordered list of UUIDs.
   * @return A list instance with the extracted UUIDs.
   */
  public static List<UUID> toIdList(List<OrderedItem> orderedList) {
    return orderedList.stream().map(x -> (UUID) x.getV()).collect(Collectors.toList());
  }

  /**
   * Format a string using only the alpha numerical characters and underscore
   * <p>
   * This is used to format the {@link ParameterTypeComponent}'s short-name for a better
   * readability
   *
   * @param shortName The string to format
   * @return The formatted string
   */
  public static String formatComponentShortName(String shortName) {
    if (Strings.isNullOrEmpty(shortName)) {
      return "";
    }

    // Replace all non alpha-numerical character by underscore
    String formatString = shortName.replaceAll("[^a-zA-Z0-9]+", "_");

    // remove the formatted string from its potential leading and trailing underscore
    return formatString.replaceAll("^_+|_+$", "");
  }

  /**
   * Extracts only class name without packages.
   *
   * @param className The class name such as "java.util.String".
   * @return The only class name without packages such as "String".
   * @throws IllegalArgumentException if a supplied {@code className} in {@code null} or empty.
   */
  public static String getOnlyClassName(String className) {
    if (Strings.isNullOrEmpty(className)) {
      throw new IllegalArgumentException("Class name can't be empty!");
    }

    // If class name includes packages then extract only the direct class name from the end
    if (className.contains(".")) {
      className = className.substring(className.lastIndexOf(".") + 1);
    }

    return className;
  }

  /**
   * Parses a supplied {@link Class} to a {@link ClassKind} if it is possible.
   *
   * @param clazz The {@link Class} to convert to {@link ClassKind}.
   * @return {@link ClassKind} if parsing was successful, otherwise {@code null}.
   */
  public static ClassKind parseClassToClassKind(Class clazz) {
    if (clazz == null) {
      throw new IllegalArgumentException("Class can't be null!");
    }

    String className = clazz.getName();

    try {
      return ClassKind.valueOf(getOnlyClassName(className));
    } catch (IllegalArgumentException ex) {
      return null;
    }
  }

  /**
   * Parses a supplied {@link String} to a {@link ClassKind} if it is possible.
   *
   * @param typeName The type name to convert to {@link ClassKind}.
   * @return {@link ClassKind} if parsing was successful, otherwise {@code null}.
   */
  public static ClassKind parseTypeNameToClassKind(String typeName) {
    if (typeName == null) {
      throw new IllegalArgumentException("Type name can't be null!");
    }

    try {
      return ClassKind.valueOf(typeName);
    } catch (IllegalArgumentException ex) {
      return null;
    }
  }

  /**
   * Mimic a c# {@code as} keyword functionality to have a less verbose expressions.
   *
   * @param o The object to be checked for a specific type.
   * @param clazz The {@link Class} to check object's type for.
   * @return <T> if an object is not null and is instance of the supplied {@link Class}, otherwise
   * {@code null}.
   */
  public static <T> T as(Object o, Class<T> clazz) {
    return clazz.isInstance(o) ? clazz.cast(o) : null;
  }

  /**
   * Gets a super class name for a supplied type name. It attempts to load a class from the
   * following packages: commondata, diagramdata, engineeringmodeldata, reportingdata,
   * sitedirectorydata and find a super type name.
   *
   * @param typeName The type name to find a super class name for in cdp4 data classes.
   * @return The name of a super type if found or an empty string if it is Object.
   * @throws IllegalArgumentException if a class is not found in the above mentioned packages.
   */
  public static String getSuperClassNameForClassName(String typeName) {
    List<String> packages = List
        .of("cdp4common.commondata.", "cdp4common.diagramdata.", "cdp4common.engineeringmodeldata.",
            "cdp4common.reportingdata.", "cdp4common.sitedirectorydata.");

    Class clazz = null;
    for (var pkg : packages) {
      try {
        clazz = Class.forName(pkg + typeName);
      } catch (ClassNotFoundException e) {
        // not found, just swallow this exception and continue
        continue;
      }

      if (clazz != null) {
        break;
      }
    }

    // Check whether we found anything
    if (clazz == null) {
      throw new IllegalArgumentException("Supplied type name is not found among data classes");
    }

    String superTypeName = clazz.getSuperclass().getSimpleName();

    return superTypeName.equals("Object") ? "" : superTypeName;
  }
}
