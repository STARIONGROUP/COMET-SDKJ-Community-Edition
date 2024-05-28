/*
 * WSPPostOperationTest.java
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

package cdp4wspdal;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import cdp4common.ClasslessDTO;
import cdp4common.Version;
import cdp4common.commondata.ClassKind;
import cdp4common.dto.ArrayParameterType;
import cdp4common.dto.DomainFileStore;
import cdp4common.dto.File;
import cdp4common.dto.FileRevision;
import cdp4common.dto.Person;
import cdp4common.dto.SimpleUnit;
import cdp4common.types.OrderedItem;
import cdp4dal.operations.Operation;
import cdp4dal.operations.OperationContainer;
import cdp4dal.operations.OperationKind;
import cdp4jsonserializer.Cdp4JsonSerializer;
import cdp4jsonserializer.Cdp4JsonSerializerImpl;
import com.fasterxml.jackson.core.type.TypeReference;
import com.google.common.collect.MoreCollectors;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.UUID;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class WSPPostOperationTest {

  private WSPPostOperation wspPostOperation;
  private Cdp4JsonSerializer serializer;

  @BeforeEach
  void setup() throws URISyntaxException {
    this.wspPostOperation = new WSPPostOperation();
    this.serializer = new Cdp4JsonSerializerImpl(new Version(1, 0, 0));
  }

  @AfterEach
  void tearDown() {
    this.wspPostOperation = null;
  }

  @Test
  void verify_that_deserialization_of_Post_Operation_does_not_throw_an_exception()
      throws IOException {
    Path response = Paths.get("src/test/java/cdp4wspdal/testdata/PostOperation.json");
    InputStream io = new BufferedInputStream(Files.newInputStream(response));

    assertDoesNotThrow(() -> this.serializer.deserialize(new TypeReference<WSPPostOperation>() {
    }, io));
  }

  @Test
  void verify_that_serialization_of_Post_Operation_returns_expected_result()
      throws IOException {
    String expected = "{\"_create\":[{\"classKind\":\"File\",\"category\":[],\"fileRevision\":[\"cb54801a-9a08-495f-996c-6467a86ed9cc\"],\"iid\":\"643e6154-a035-4445-a4f2-2c7ff5d2fdbd\",\"lockedBy\":null,\"owner\":\"0e92edde-fdff-41db-9b1d-f2e484f12535\",\"revisionNumber\":0},{\"classKind\":\"FileRevision\",\"containingFolder\":null,\"contentHash\":\"F73747371CFD9473C19A0A7F99BCAB008474C4CA\",\"createdOn\":null,\"creator\":\"284334dd-e8e5-42d6-bc8a-715c507a7f02\",\"fileType\":[{\"k\":1,\"v\":\"b16894e4-acb5-4e81-a118-16c00eb86d8f\"}],\"iid\":\"cb54801a-9a08-495f-996c-6467a86ed9cc\",\"name\":\"testfile\",\"revisionNumber\":0}],\"_delete\":[],\"_update\":[{\"iid\":\"da7dddaa-02aa-4897-9935-e8d66c811a96\",\"classKind\":\"DomainFileStore\",\"file\":[\"643e6154-a035-4445-a4f2-2c7ff5d2fdbd\"]}]}";

    UUID engineeringModelIid = UUID.fromString("9ec982e4-ef72-4953-aa85-b158a95d8d56");
    UUID iterationIid = UUID.fromString("e163c5ad-f32b-4387-b805-f4b34600bc2c");
    UUID domainFileStoreIid = UUID.fromString("da7dddaa-02aa-4897-9935-e8d66c811a96");
    UUID fileIid = UUID.fromString("643e6154-a035-4445-a4f2-2c7ff5d2fdbd");
    UUID fileRevisionIid = UUID.fromString("cb54801a-9a08-495f-996c-6467a86ed9cc");
    UUID domainOfExpertiseIid = UUID.fromString("0e92edde-fdff-41db-9b1d-f2e484f12535");
    UUID fileTypeIid = UUID.fromString("b16894e4-acb5-4e81-a118-16c00eb86d8f"); //PDF
    UUID participantIid = UUID.fromString("284334dd-e8e5-42d6-bc8a-715c507a7f02");

    DomainFileStore originalDomainFileStore = new cdp4common.dto.DomainFileStore(domainFileStoreIid, 0);
    originalDomainFileStore.addContainer(ClassKind.Iteration, iterationIid);
    originalDomainFileStore.addContainer(ClassKind.EngineeringModel, engineeringModelIid);

    DomainFileStore modifiedDomainFileStore = new cdp4common.dto.DomainFileStore(domainFileStoreIid, 0);
    modifiedDomainFileStore.getFile().add(fileIid);
    modifiedDomainFileStore.addContainer(ClassKind.Iteration, iterationIid);
    modifiedDomainFileStore.addContainer(ClassKind.EngineeringModel, engineeringModelIid);

    File file = new cdp4common.dto.File(fileIid, 0);
    file.setOwner(domainOfExpertiseIid);
    file.getFileRevision().add(fileRevisionIid);
    file.addContainer(ClassKind.DomainFileStore, domainFileStoreIid);
    file.addContainer(ClassKind.Iteration, iterationIid);
    file.addContainer(ClassKind.EngineeringModel, engineeringModelIid);

    FileRevision fileRevision = new cdp4common.dto.FileRevision(fileRevisionIid, 0);
    fileRevision.setName("testfile");
    fileRevision.setContentHash("F73747371CFD9473C19A0A7F99BCAB008474C4CA");
    fileRevision.getFileType().add(new OrderedItem(1, fileTypeIid));
    fileRevision.setCreator(participantIid);
    fileRevision.addContainer(ClassKind.File, fileIid);
    fileRevision.addContainer(ClassKind.DomainFileStore, domainFileStoreIid);
    fileRevision.addContainer(ClassKind.Iteration, iterationIid);
    fileRevision.addContainer(ClassKind.EngineeringModel, engineeringModelIid);

    String context = String
        .format("/EngineeringModel/%s/iteration/%s", engineeringModelIid, iterationIid);
    OperationContainer operationContainer = new OperationContainer(context, null);

    Operation updateCommonFileStoreOperation = new Operation(originalDomainFileStore,
        modifiedDomainFileStore, OperationKind.UPDATE);
    operationContainer.addOperation(updateCommonFileStoreOperation);

    Operation createFileOperation = new Operation(null, file, OperationKind.CREATE);
    operationContainer.addOperation(createFileOperation);

    Operation createFileRevisionOperation = new Operation(null, fileRevision, OperationKind.CREATE);
    operationContainer.addOperation(createFileRevisionOperation);

    WSPPostOperation postOperation = new WSPPostOperation();

    // add the simple operations to the WSP container
    for (Operation operation : operationContainer.getOperations()) {
      postOperation.constructFromOperation(operation);
    }

    ByteArrayOutputStream os = new ByteArrayOutputStream();
    this.serializer.serializeToStream(postOperation, os);

    assertEquals(expected, os.toString());
  }

  @Test
  void verifyThatConstructorCreatesDeleteCreateAndUpdateContainers() {
    assertEquals(0, this.wspPostOperation.getCreate().size());
    assertEquals(0, this.wspPostOperation.getDelete().size());
    assertEquals(0, this.wspPostOperation.getUpdate().size());
  }

  @Test
  void verifyThatAnUpdateOfUnchangedThingIsFilteredOut() {
    SimpleUnit simpleUnit = new SimpleUnit(UUID.randomUUID(), 1);
    Operation operation = new Operation(simpleUnit, simpleUnit, OperationKind.UPDATE);
    this.wspPostOperation.constructFromOperation(operation);

    assertEquals(0, this.wspPostOperation.getCreate().size());
    assertEquals(0, this.wspPostOperation.getUpdate().size());
    assertEquals(0, this.wspPostOperation.getDelete().size());

    Person person1 = new Person(UUID.randomUUID(), 1);
    Person person1update = new Person(person1.getIid(), 1);
    person1update.getTelephoneNumber().add(UUID.randomUUID());
    Operation operation2 = new Operation(person1, person1update, OperationKind.UPDATE);
    this.wspPostOperation.constructFromOperation(operation2);

    assertEquals(0, this.wspPostOperation.getCreate().size());
    assertNotEquals(0, this.wspPostOperation.getUpdate().size());
    assertEquals(0, this.wspPostOperation.getDelete().size());
  }

  @Test
  void verifyThatExceptionIsThrownWhenModifiedThingIsNotProvided() {
    SimpleUnit simpleUnit = new SimpleUnit(UUID.randomUUID(), 1);
    Operation operation = new Operation(simpleUnit, null, OperationKind.DELETE);
    assertThrows(NullPointerException.class,
        () -> this.wspPostOperation.constructFromOperation(operation));
  }

  @Test
  void verifyThatExceptionIsThrowWhenOperationIsUpdateAndOriginalThingIsNull() {
    SimpleUnit simpleUnit = new SimpleUnit(UUID.randomUUID(), 1);
    Operation operation = new Operation(null, simpleUnit, OperationKind.UPDATE);
    assertThrows(IllegalArgumentException.class,
        () -> this.wspPostOperation.constructFromOperation(operation));
  }

  @Test
  void verifyThatExceptionIsThrowWhenOperationIsCopy() {
    SimpleUnit simpleUnit = new SimpleUnit(UUID.randomUUID(), 1);
    Operation operation = new Operation(null, simpleUnit, OperationKind.COPY);
    assertThrows(UnsupportedOperationException.class,
        () -> this.wspPostOperation.constructFromOperation(operation));
  }

  @Test
  void verifyThatExceptionIsThrowWhenOperationIsMove() {
    SimpleUnit simpleUnit = new SimpleUnit(UUID.randomUUID(), 1);
    Operation operation = new Operation(null, simpleUnit, OperationKind.MOVE);
    assertThrows(UnsupportedOperationException.class,
        () -> this.wspPostOperation.constructFromOperation(operation));
  }

  @Test
  void verifyThatOperationIsCorrectlyComputedFromArrayParameterTypeUpdate() {
    ArrayParameterType array1 = new ArrayParameterType(UUID.randomUUID(), 1);
    ArrayParameterType array2 = new ArrayParameterType(UUID.randomUUID(), 1);

    array1.getDimension().add(new OrderedItem(123, 1));
    array1.getDimension().add(new OrderedItem(456, 1));
    array1.getDimension().add(new OrderedItem(789, 1));

    array2.getDimension().add(new OrderedItem(1234, 1));
    array2.getDimension().add(new OrderedItem(4567, 1));
    array2.getDimension().add(new OrderedItem(7890, 1));

    Operation operation = new Operation(array1, array2, OperationKind.UPDATE);
    this.wspPostOperation.constructFromOperation(operation);
    ClasslessDTO updatedClasslessDto = this.wspPostOperation.getUpdate().stream()
        .collect(MoreCollectors.toOptional()).orElse(null);
    assertNotNull(updatedClasslessDto);

    Object value = updatedClasslessDto.get("dimension");
    assertNotNull(value);
    List<OrderedItem> orderedItemList = (List<OrderedItem>) value;

    assertEquals(1234, orderedItemList.get(0).getK());
    assertEquals(4567, orderedItemList.get(1).getK());
    assertEquals(7890, orderedItemList.get(2).getK());
  }

  @Test
  void verifyThatOperationIsCorrectlyComputedFromArrayParameterTypeUpdateGuid() {
    ArrayParameterType array1 = new ArrayParameterType(UUID.randomUUID(), 1);
    ArrayParameterType array2 = new ArrayParameterType(UUID.randomUUID(), 1);

    UUID guid1 = UUID.randomUUID();
    UUID guid2 = UUID.randomUUID();
    UUID guid3 = UUID.randomUUID();

    array1.getDimension().add(new OrderedItem(123, guid1));
    array1.getDimension().add(new OrderedItem(456, guid2));
    array1.getDimension().add(new OrderedItem(789, guid3));

    array2.getDimension().add(new OrderedItem(1234, guid1));
    array2.getDimension().add(new OrderedItem(4567, guid2));
    array2.getDimension().add(new OrderedItem(7890, guid3));

    Operation operation = new Operation(array1, array2, OperationKind.UPDATE);
    this.wspPostOperation.constructFromOperation(operation);
    ClasslessDTO updatedClasslessDto = this.wspPostOperation.getUpdate().stream()
        .collect(MoreCollectors.toOptional()).orElse(null);
    assertNotNull(updatedClasslessDto);

    Object value = updatedClasslessDto.get("dimension");
    assertNotNull(value);
    List<OrderedItem> orderedItemList = (List<OrderedItem>) value;

    assertEquals(123, orderedItemList.get(0).getK());
    assertEquals(456, orderedItemList.get(1).getK());
    assertEquals(789, orderedItemList.get(2).getK());

    assertEquals(1234, orderedItemList.get(0).getM());
    assertEquals(4567, orderedItemList.get(1).getM());
    assertEquals(7890, orderedItemList.get(2).getM());

    assertEquals(guid1, orderedItemList.get(0).getV());
    assertEquals(guid2, orderedItemList.get(1).getV());
    assertEquals(guid3, orderedItemList.get(2).getV());
  }
}
