/*
 * SessionTest.java
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

import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import cdp4dal.CDPMessageBus;
import cdp4dal.Session;
import cdp4dal.SessionImpl;
import cdp4dal.dal.Credentials;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.concurrent.atomic.AtomicBoolean;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class SessionTest {

  private URI uri;
  private Session session;

  private Credentials credentials;
  private AtomicBoolean cancelled;

  @BeforeEach
  void setup() throws URISyntaxException {
    this.uri = new URI("https://cdp4services-test.cdp4.org");
    this.credentials = new Credentials("admin", "pass", this.uri, null);

    this.cancelled = new AtomicBoolean();
  }

  @AfterEach
  void tearDown() {
    CDPMessageBus.getCurrent().clearSubscriptions();
  }

  @Test
  @Tag("WebServicesDependent")
  void verify_That_Session_Open_Populates_cache() {
    WSPDal dal = new WSPDal();
    this.session = new SessionImpl(dal, this.credentials);

    assertEquals(0, this.session.getAssembler().getCache().size());

    session.open().join();

    assertNotEquals(0, this.session.getAssembler().getCache().size());
  }
}
