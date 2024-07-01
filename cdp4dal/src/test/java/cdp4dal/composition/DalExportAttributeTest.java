/*
 * DalExportAttributeTest.java
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

package cdp4dal.composition;

import static org.junit.jupiter.api.Assertions.assertEquals;

import cdp4dal.dal.DalStubExport;
import org.junit.jupiter.api.Test;

class DalExportAttributeTest {

  @Test
  void verifyThatThePropertiesAreSet() {
    // Values that DalStubExport should have in its DalExport annotation
    String name = "CDP4";
    String description = "CDP4 Webservices";
    String cdpVersion = "1.1.0";
    DalType type = DalType.WEB;
    DalStubExport dalStub = new DalStubExport();
    DalExport[] dalExportAttribute = dalStub.getClass().getAnnotationsByType(DalExport.class);

    assertEquals(name, dalExportAttribute[0].name());
    assertEquals(description, dalExportAttribute[0].description());
    assertEquals(cdpVersion, dalExportAttribute[0].cdpVersion());
    assertEquals(type, dalExportAttribute[0].dalType());
  }
}
