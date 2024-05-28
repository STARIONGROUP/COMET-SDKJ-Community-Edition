/*
 * UtilsTest.java
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

package cdp4common.helpers;

import cdp4common.commondata.Alias;
import cdp4common.commondata.ClassKind;
import cdp4common.commondata.Thing;
import cdp4common.diagramdata.Bounds;
import cdp4common.engineeringmodeldata.ActualFiniteState;
import cdp4common.engineeringmodeldata.EngineeringModel;
import cdp4common.reportingdata.ActionItem;
import cdp4common.sitedirectorydata.ArrayParameterType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class UtilsTest {

  @Test
  void getConstantNotationFromUpperCamelTest() {
    Assertions.assertEquals("CONSTANT_NOTATION_TEST",
        Utils.getConstantNotationFromUpperCamel("ConstantNotationTest"));
  }

  @Test
  void getConstantNotationFromUpperCamelDoesNotFailForConstantTest() {
    Assertions.assertEquals("CONSTANT",
        Utils.getConstantNotationFromUpperCamel("CONSTANT"));
    Assertions.assertEquals("CONSTANT_NOTATION_TEST",
        Utils.getConstantNotationFromUpperCamel("CONSTANT_NOTATION_TEST"));
  }

  @Test
  void getUpperCamelNotationFromConstantTest() {
    Assertions.assertEquals("ConstantNotationTest",
        Utils.getUpperCamelNotationFromConstant("CONSTANT_NOTATION_TEST"));
  }

  @Test
  void formatComponentShortNameTest() {
    Assertions.assertEquals("", Utils.formatComponentShortName(null));
    Assertions.assertEquals("4fgr_k0", Utils.formatComponentShortName("4fgr$%k0"));
    Assertions.assertEquals("4fgr_k0", Utils.formatComponentShortName("=-!4fgr$%k0="));
  }

  @Test
  void getOnlyClassNameTest() {
    Assertions.assertEquals("EngineeringModel", Utils.getOnlyClassName(
        EngineeringModel.class.getName()));
    Assertions.assertEquals("EngineeringModel", Utils.getOnlyClassName(
        "EngineeringModel"));
    Assertions
        .assertThrows(IllegalArgumentException.class, () -> Utils.getOnlyClassName(""));
  }

  @Test
  void parseTypeNameToClassKindTest() {
    Assertions.assertEquals(ClassKind.EngineeringModel, Utils.parseTypeNameToClassKind(
        EngineeringModel.class.getSimpleName()));
    Assertions.assertNull(Utils.parseTypeNameToClassKind(
        "Unknown"));
    Assertions
        .assertThrows(IllegalArgumentException.class, () -> Utils.parseTypeNameToClassKind(null));
  }



  @Test
  void parseClassToClassKindTest() {
    Assertions.assertEquals(ClassKind.EngineeringModel, Utils.parseClassToClassKind(
        EngineeringModel.class));
    Assertions
        .assertThrows(IllegalArgumentException.class, () -> Utils.parseClassToClassKind(null));
  }

  @Test
  void asTest() {
    Assertions.assertNull(Utils.as("String", EngineeringModel.class));
    Assertions.assertTrue(Utils.as("String", Object.class) instanceof Object);
  }

  @Test
  void getSuperClassNameForClassNameTest() {
    Assertions.assertEquals("Thing", Utils.getSuperClassNameForClassName(Alias.class.getSimpleName()));
    Assertions.assertEquals("DiagramThingBase", Utils.getSuperClassNameForClassName(Bounds.class.getSimpleName()));
    Assertions.assertEquals("Thing", Utils.getSuperClassNameForClassName(ActualFiniteState.class.getSimpleName()));
    Assertions.assertEquals("ModellingAnnotationItem", Utils.getSuperClassNameForClassName(
        ActionItem.class.getSimpleName()));
    Assertions.assertEquals("CompoundParameterType", Utils.getSuperClassNameForClassName(
        ArrayParameterType.class.getSimpleName()));
    Assertions.assertEquals("", Utils.getSuperClassNameForClassName(
        Thing.class.getSimpleName()));
    Assertions
        .assertThrows(IllegalArgumentException.class, () -> Utils.getSuperClassNameForClassName("Unknown"));
  }
}
