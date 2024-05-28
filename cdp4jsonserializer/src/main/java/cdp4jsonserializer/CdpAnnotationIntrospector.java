/*
 * CdpAnnotationIntrospector.java
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

import cdp4common.CDPVersion;
import cdp4common.Version;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector;

class CdpAnnotationIntrospector extends JacksonAnnotationIntrospector {

  /**
   * Data model version for this request.
   */
  private Version requestDataModelVersion;

  CdpAnnotationIntrospector(Version requestDataModelVersion) {
    this.requestDataModelVersion = requestDataModelVersion;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public boolean hasIgnoreMarker(AnnotatedMember member) {
    CDPVersion cdpVersion = member.getAnnotation(CDPVersion.class);

    // Ignore all fields that have a higher version than a requested data model version
    if (cdpVersion != null
        && Version.parseVersion(cdpVersion.version()).compareTo(requestDataModelVersion) > 0) {
      return true;
    }

    return _isIgnorable(member);
  }
}
