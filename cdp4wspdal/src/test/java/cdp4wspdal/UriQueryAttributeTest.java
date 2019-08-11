/*
 * UriQueryAttributeTest.java
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

package cdp4wspdal;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import cdp4dal.dal.QueryAttributes;
import cdp4dal.dal.ecss1025annexc.ExtentQueryAttribute;
import cdp4dal.dal.ecss1025annexc.QueryAttributesImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class UriQueryAttributeTest {

  private QueryAttributes attributes;

  @BeforeEach
  void setup() {
    this.attributes = new QueryAttributesImpl();
  }

  @Test
  void testToString() {
    this.attributes.setExtent(ExtentQueryAttribute.deep);
    this.attributes.setIncludeAllContainers(true);
    this.attributes.setIncludeFileData(true);
    this.attributes.setIncludeReferenceData(true);
    this.attributes.setRevisionNumber(2);

    var test = this.attributes.toString();
    assertTrue(test.contains("extent"));
    assertTrue(test.contains("includeReferenceData"));
    assertTrue(test.contains("includeAllContainers"));
    assertTrue(test.contains("includeFileData"));
    assertTrue(test.contains("revisionNumber"));
  }

  @Test
  void testEmptyAttributeToString() {
    var str = this.attributes.toString();
    assertEquals("", str);
  }
}
