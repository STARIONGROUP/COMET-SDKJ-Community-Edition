/*
 * DalTest.java
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

package cdp4dal.dal;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import cdp4common.Version;
import cdp4common.dto.ActionItem;
import cdp4common.dto.ArrayParameterType;
import cdp4common.dto.FileRevision;
import cdp4dal.exceptions.InvalidOperationContainerException;
import cdp4dal.operations.Operation;
import cdp4dal.operations.OperationContainer;
import cdp4dal.operations.OperationKind;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.UUID;
import org.junit.jupiter.api.Test;

class DalTest {

  @Test
  void verifyThatQueryRequestContextReturnsExpectedResult() {
    DalStubExport dalStub = new DalStubExport();

    URI elementDefinitionUri = URI.create(
        "http://www.stariongroup.eu/EngineeringModel/00B1FD7E-BE0F-4512-A406-02FCBD63E06A/iteration/0111A76D-346D-4055-A78D-B8215B993DA1/element/E9E8E386-B8BB-44F1-80B9-2C30761EE688");
    String elementDefinitionContext = dalStub.queryRequestContext(elementDefinitionUri);
    assertEquals(
        "/EngineeringModel/00B1FD7E-BE0F-4512-A406-02FCBD63E06A/iteration/0111A76D-346D-4055-A78D-B8215B993DA1",
        elementDefinitionContext);
  }

  @Test
  void closeSessionTest() {
    DalStubExport dalStub = new DalStubExport();
    dalStub.setCredentials(new Credentials("John", "pass", URI.create("file://someuri"), null));
    assertNotNull(dalStub.getCredentials());

    dalStub.closeSession();
    assertNull(dalStub.getCredentials());
  }

  @Test
  void cleanURIFinalSlashTest() {
    DalStubExport dalStub = new DalStubExport();
    String uri = "file://someuri";
    String uriWithSlash = "file://someuri/";

    assertEquals(uri, dalStub.cleanURIFinalSlash(uriWithSlash));
    assertEquals(uri, dalStub.cleanURIFinalSlash(uri));
  }

  @Test
  void setIterationContainerThrowsExceptionTest() {
    DalStubExport dalStub = new DalStubExport();

    assertThrows(NullPointerException.class, () -> dalStub.setIterationContainer(null, null));
    assertThrows(IllegalArgumentException.class,
        () -> dalStub.setIterationContainer(new ArrayList<>(), null));
    assertThrows(IllegalArgumentException.class,
        () -> dalStub.setIterationContainer(new ArrayList<>(), new UUID(0L, 0L)));
  }

  @Test
  void setIterationContainerTest() {
    DalStubExport dalStub = new DalStubExport();
    ActionItem actionItem = new ActionItem();
    ArrayParameterType arrayParameterType = new ArrayParameterType();
    UUID uuid = UUID.randomUUID();

    assertNull(actionItem.getIterationContainerId());
    assertNull(arrayParameterType.getIterationContainerId());

    dalStub.setIterationContainer(Arrays.asList(actionItem, arrayParameterType), uuid);

    assertEquals(uuid, arrayParameterType.getIterationContainerId());
    assertNull(actionItem.getIterationContainerId());
  }

  @Test
  void tryExtractIterationIdFromURIReturnsNullTest() {
    DalStubExport dalStub = new DalStubExport();
    URI siteDirectoryUri = URI.create(
        "/SiteDirectory/f13de6f8-b03a-46e7-a492-53b2f260f294/siteReferenceDataLibrary/c454c687-ba3e-44c4-86bc-44544b2c7880");
    URI iterationUriWithInvalidUuid = URI.create(
        "/EngineeringModel/9ec982e4-ef72-4953-aa85-b158a95d8d56/iteration/baaaaaak-f32b-4387-b805-f4b34600bc2c/element/f73860b2-12f0-43e4-b8b2-c81862c0a159");

    assertNull(dalStub.tryExtractIterationIdFromURI(siteDirectoryUri));
    assertNull(dalStub.tryExtractIterationIdFromURI(iterationUriWithInvalidUuid));
  }

  @Test
  void tryExtractIterationIdFromURIReturnsUuidTest() {
    DalStubExport dalStub = new DalStubExport();
    URI iterationUri = URI.create(
        "/EngineeringModel/9ec982e4-ef72-4953-aa85-b158a95d8d56/iteration/e163c5ad-f32b-4387-b805-f4b34600bc2c/element/f73860b2-12f0-43e4-b8b2-c81862c0a159");

    assertEquals(UUID.fromString("e163c5ad-f32b-4387-b805-f4b34600bc2c"),
        dalStub.tryExtractIterationIdFromURI(iterationUri));
  }

  @Test
  void setCdpVersionTakesValueFromAttributeTest() {
    DalStubExport dalStub = new DalStubExport();

    assertEquals(new Version("1.1.0"),
        dalStub.getDalVersion());
  }

  @Test
  void setCdpVersionTakesDefaultValueTest() {
    DalStubNoExport dalStub = new DalStubNoExport();

    assertEquals(new Version("1.0.0"),
        dalStub.getDalVersion());
  }

  @Test
  void operationContainerFileVerificationThrowsExceptionUnableReadTest() {
    DalStubExport dalStub = new DalStubExport();

    assertThrows(InvalidOperationContainerException.class,
        () -> dalStub.operationContainerFileVerification(null, Arrays.asList("./wrong/path")));
  }

  @Test
  void operationContainerFileVerificationWorksTest()
      throws InvalidOperationContainerException {
    DalStubExport dalStub = new DalStubExport();
    OperationContainer operationContainer = mock(OperationContainer.class);
    FileRevision fileRevision = new FileRevision();
    String correctHash = "ead4bc9d39546a93dd529a0041194bfbdff61e89";
    fileRevision.setContentHash(correctHash);
    Operation operation = new Operation(null, fileRevision, OperationKind.CREATE);
    when(operationContainer.getOperations()).thenReturn(Arrays.asList(operation));

    dalStub.operationContainerFileVerification(operationContainer,
        Arrays.asList("src/test/java/cdp4dal/dal/files/test.json"));
  }

  @Test
  void operationContainerFileVerificationThrowsExceptionForFailedVerificationTest() {
    DalStubExport dalStub = new DalStubExport();
    OperationContainer operationContainer = mock(OperationContainer.class);
    FileRevision fileRevision = new FileRevision();
    String incorrectHash = "haha9d39546a93dd529a0041194bfbdff61e89";
    fileRevision.setContentHash(incorrectHash);
    Operation operation = new Operation(null, fileRevision, OperationKind.CREATE);
    when(operationContainer.getOperations()).thenReturn(Arrays.asList(operation));

    assertThrows(InvalidOperationContainerException.class,
        () -> dalStub.operationContainerFileVerification(operationContainer,
            Arrays.asList("src/test/java/cdp4dal/dal/files/test.json")));
  }
}
