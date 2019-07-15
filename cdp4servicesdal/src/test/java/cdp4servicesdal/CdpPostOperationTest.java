/*
 * CdpPostOperationTest.java
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

package cdp4servicesdal;

import static org.junit.jupiter.api.Assertions.assertEquals;

import cdp4common.Version;
import cdp4common.commondata.ClassKind;
import cdp4common.types.OrderedItem;
import cdp4dal.operations.Operation;
import cdp4dal.operations.OperationContainer;
import cdp4dal.operations.OperationKind;
import cdp4jsonserializer.Cdp4JsonSerializer;
import cdp4jsonserializer.Cdp4JsonSerializerImpl;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.UUID;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CdpPostOperationTest {

  private Cdp4JsonSerializer serializer;

  @BeforeEach
  void setup() {
    this.serializer = new Cdp4JsonSerializerImpl(new Version(1, 1, 0));
  }

  @Test
  void verify_that_deserialization_of_Post_Operation_does_not_throw_an_exception()
      throws IOException {
    var response = Paths.get("src/test/java/cdp4servicesdal/testdata/PostOperation.json");
    InputStream io = new BufferedInputStream(Files.newInputStream(response));

    var test = this.serializer.deserialize(new TypeReference<CdpPostOperation>() {
    }, io);

    assertEquals(1, test.getCopy().size());
  }

  @Test
  void verify_that_serialization_of_Post_Operation_returns_expected_result()
      throws IOException {
    var expected = "{\"_delete\":[],\"_create\":[{\"classKind\":\"File\",\"excludedDomain\":[],\"excludedPerson\":[],\"iid\":\"643e6154-a035-4445-a4f2-2c7ff5d2fdbd\",\"modifiedOn\":null,\"revisionNumber\":0,\"category\":[],\"fileRevision\":[\"cb54801a-9a08-495f-996c-6467a86ed9cc\"],\"lockedBy\":null,\"owner\":\"0e92edde-fdff-41db-9b1d-f2e484f12535\"},{\"classKind\":\"FileRevision\",\"excludedDomain\":[],\"excludedPerson\":[],\"iid\":\"cb54801a-9a08-495f-996c-6467a86ed9cc\",\"modifiedOn\":null,\"revisionNumber\":0,\"containingFolder\":null,\"contentHash\":\"F73747371CFD9473C19A0A7F99BCAB008474C4CA\",\"createdOn\":null,\"creator\":\"284334dd-e8e5-42d6-bc8a-715c507a7f02\",\"fileType\":[{\"k\":1,\"v\":\"b16894e4-acb5-4e81-a118-16c00eb86d8f\"}],\"name\":\"testfile\"}],\"_update\":[{\"file\":[\"643e6154-a035-4445-a4f2-2c7ff5d2fdbd\"],\"iid\":\"da7dddaa-02aa-4897-9935-e8d66c811a96\",\"classKind\":\"DomainFileStore\"}],\"_copy\":[]}";

    var engineeringModelIid = UUID.fromString("9ec982e4-ef72-4953-aa85-b158a95d8d56");
    var iterationIid = UUID.fromString("e163c5ad-f32b-4387-b805-f4b34600bc2c");
    var domainFileStoreIid = UUID.fromString("da7dddaa-02aa-4897-9935-e8d66c811a96");
    var fileIid = UUID.fromString("643e6154-a035-4445-a4f2-2c7ff5d2fdbd");
    var fileRevisionIid = UUID.fromString("cb54801a-9a08-495f-996c-6467a86ed9cc");
    var domainOfExpertiseIid = UUID.fromString("0e92edde-fdff-41db-9b1d-f2e484f12535");
    var fileTypeIid = UUID.fromString("b16894e4-acb5-4e81-a118-16c00eb86d8f"); //PDF
    var participantIid = UUID.fromString("284334dd-e8e5-42d6-bc8a-715c507a7f02");

    var originalDomainFileStore = new cdp4common.dto.DomainFileStore(domainFileStoreIid, 0);
    originalDomainFileStore.addContainer(ClassKind.Iteration, iterationIid);
    originalDomainFileStore.addContainer(ClassKind.EngineeringModel, engineeringModelIid);

    var modifiedDomainFileStore = new cdp4common.dto.DomainFileStore(domainFileStoreIid, 0);
    modifiedDomainFileStore.getFile().add(fileIid);
    modifiedDomainFileStore.addContainer(ClassKind.Iteration, iterationIid);
    modifiedDomainFileStore.addContainer(ClassKind.EngineeringModel, engineeringModelIid);

    var file = new cdp4common.dto.File(fileIid, 0);
    file.setOwner(domainOfExpertiseIid);
    file.getFileRevision().add(fileRevisionIid);
    file.addContainer(ClassKind.DomainFileStore, domainFileStoreIid);
    file.addContainer(ClassKind.Iteration, iterationIid);
    file.addContainer(ClassKind.EngineeringModel, engineeringModelIid);

    var fileRevision = new cdp4common.dto.FileRevision(fileRevisionIid, 0);
    fileRevision.setName("testfile");
    fileRevision.setContentHash("F73747371CFD9473C19A0A7F99BCAB008474C4CA");
    fileRevision.getFileType().add(new OrderedItem(1, fileTypeIid));
    fileRevision.setCreator(participantIid);
    fileRevision.addContainer(ClassKind.File, fileIid);
    fileRevision.addContainer(ClassKind.DomainFileStore, domainFileStoreIid);
    fileRevision.addContainer(ClassKind.Iteration, iterationIid);
    fileRevision.addContainer(ClassKind.EngineeringModel, engineeringModelIid);

    var context = String
        .format("/EngineeringModel/%s/iteration/%s", engineeringModelIid, iterationIid);
    var operationContainer = new OperationContainer(context, null);

    var updateCommonFileStoreOperation = new Operation(originalDomainFileStore,
        modifiedDomainFileStore, OperationKind.UPDATE);
    operationContainer.addOperation(updateCommonFileStoreOperation);

    var createFileOperation = new Operation(null, file, OperationKind.CREATE);
    operationContainer.addOperation(createFileOperation);

    var createFileRevisionOperation = new Operation(null, fileRevision, OperationKind.CREATE);
    operationContainer.addOperation(createFileRevisionOperation);

    var postOperation = new CdpPostOperation();

    // add the simple operations to the WSP container
    for (var operation : operationContainer.getOperations()) {
      postOperation.constructFromOperation(operation);
    }

    ByteArrayOutputStream os = new ByteArrayOutputStream();
    this.serializer.serializeToStream(postOperation, os);

    assertEquals(expected, os.toString());
  }
}
