package cdp4jsonserializer;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import cdp4common.Version;
import cdp4common.commondata.ClassKind;
import cdp4common.dto.FileRevision;
import cdp4common.dto.Thing;
import cdp4common.types.OrderedItem;
import cdp4common.types.ValueArray;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Cdp4JsonSerializerImplTest {

  private Cdp4JsonSerializerImpl serializer;

  @BeforeEach
  void setup() {
    this.serializer = new Cdp4JsonSerializerImpl();
    this.serializer.initialize(new Version("1.1.0"));
  }

  @Test
  void serializesPropertiesAccordingToVersion() throws IOException {
    String expectedJson = "{\"classKind\":\"File\",\"excludedDomain\":[],\"excludedPerson\":[],\"iid\":\"b3e2edac-3fea-4b7a-964f-c129b6dd63b2\",\"modifiedOn\":null,\"revisionNumber\":0,\"category\":[],\"fileRevision\":[\"e8de903b-9c38-416a-83f4-90b6cf7b7a41\"],\"lockedBy\":null,\"owner\":\"0e92edde-fdff-41db-9b1d-f2e484f12535\"}";
    var engineeringModelIid = UUID.fromString("9ec982e4-ef72-4953-aa85-b158a95d8d56");
    var iterationIid = UUID.fromString("e163c5ad-f32b-4387-b805-f4b34600bc2c");
    var domainFileStoreIid = UUID.fromString("da7dddaa-02aa-4897-9935-e8d66c811a96");
    var fileIid = UUID.fromString("b3e2edac-3fea-4b7a-964f-c129b6dd63b2");
    var fileRevisionIid = UUID.fromString("e8de903b-9c38-416a-83f4-90b6cf7b7a41");
    var domainOfExpertiseIid = UUID.fromString("0e92edde-fdff-41db-9b1d-f2e484f12535");

    var file = new cdp4common.dto.File(fileIid, 0);
    file.setOwner(domainOfExpertiseIid);
    file.getFileRevision().add(fileRevisionIid);
    file.addContainer(ClassKind.DomainFileStore, domainFileStoreIid);
    file.addContainer(ClassKind.Iteration, iterationIid);
    file.addContainer(ClassKind.EngineeringModel, engineeringModelIid);

    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    this.serializer.serializeToStream(file, outputStream);

    assertTrue(areEqualBySumOfBytes(expectedJson, outputStream.toString()));
  }

  @Test
  void serializesPropertiesExcludingWithHigherVersion() throws IOException {
    String expectedJson = "{\"classKind\":\"File\",\"iid\":\"b3e2edac-3fea-4b7a-964f-c129b6dd63b2\",\"revisionNumber\":0,\"category\":[],\"fileRevision\":[\"e8de903b-9c38-416a-83f4-90b6cf7b7a41\"],\"lockedBy\":null,\"owner\":\"0e92edde-fdff-41db-9b1d-f2e484f12535\"}";

    this.serializer.initialize(new Version("1.0.0"));

    var engineeringModelIid = UUID.fromString("9ec982e4-ef72-4953-aa85-b158a95d8d56");
    var iterationIid = UUID.fromString("e163c5ad-f32b-4387-b805-f4b34600bc2c");
    var domainFileStoreIid = UUID.fromString("da7dddaa-02aa-4897-9935-e8d66c811a96");
    var fileIid = UUID.fromString("b3e2edac-3fea-4b7a-964f-c129b6dd63b2");
    var fileRevisionIid = UUID.fromString("e8de903b-9c38-416a-83f4-90b6cf7b7a41");
    var domainOfExpertiseIid = UUID.fromString("0e92edde-fdff-41db-9b1d-f2e484f12535");

    var file = new cdp4common.dto.File(fileIid, 0);
    file.setOwner(domainOfExpertiseIid);
    file.getFileRevision().add(fileRevisionIid);
    file.addContainer(ClassKind.DomainFileStore, domainFileStoreIid);
    file.addContainer(ClassKind.Iteration, iterationIid);
    file.addContainer(ClassKind.EngineeringModel, engineeringModelIid);

    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    this.serializer.serializeToStream(file, outputStream);

    assertTrue(areEqualBySumOfBytes(expectedJson, outputStream.toString()));
  }

  @Test
  void areEqualBySumOfBytesReturnsTrueTest() {
    var s1 = "asdfgqwert";
    var s2 = "qwertgfdsa";

    assertTrue(areEqualBySumOfBytes(s1, s2));
  }

  @Test
  void areEqualBySumOfBytesReturnsFalseTest() {
    var s1 = "asdfgqwert";
    var s2 = "qwertgfdst";

    assertFalse(areEqualBySumOfBytes(s1, s2));
  }

  @Test
  void orderedItemWithNullMIsSerializedTest() throws IOException {
    var expected = "{\"k\":1,\"v\":\"b16894e4-acb5-4e81-a118-16c00eb86d8f\"}";

    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    this.serializer.serializeToStream(new OrderedItem(1, "b16894e4-acb5-4e81-a118-16c00eb86d8f"),
        outputStream);

    assertEquals(expected, outputStream.toString());
  }

  @Test
  void orderedItemWithSetMIsSerializedTest() throws IOException {
    var expected = "{\"k\":1,\"v\":\"b16894e4-acb5-4e81-a118-16c00eb86d8f\",\"m\":2}";

    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    var item = new OrderedItem(1, "b16894e4-acb5-4e81-a118-16c00eb86d8f");
    item.moveItem(1, 2);
    this.serializer.serializeToStream(item, outputStream);

    assertEquals(expected, outputStream.toString());
  }

  @Test
  void orderedItemWithNullMIsDeserializedTest() throws IOException {
    var source = "{\"k\":1,\"v\":\"b16894e4-acb5-4e81-a118-16c00eb86d8f\"}";

    ByteArrayInputStream inputStream = new ByteArrayInputStream(source.getBytes());
    var item = this.serializer.deserialize(new TypeReference<OrderedItem>() {
    }, inputStream);

    assertEquals(1, item.getK());
    assertEquals("b16894e4-acb5-4e81-a118-16c00eb86d8f", item.getV());
    assertNull(item.getM());
  }

  @Test
  void orderedItemWithSetMIsDeserializedTest() throws IOException {
    var source = "{\"k\":1,\"v\":\"b16894e4-acb5-4e81-a118-16c00eb86d8f\",\"m\":2}";

    ByteArrayInputStream inputStream = new ByteArrayInputStream(source.getBytes());
    var item = this.serializer.deserialize(new TypeReference<OrderedItem>() {
    }, inputStream);

    assertEquals(1, item.getK());
    assertEquals("b16894e4-acb5-4e81-a118-16c00eb86d8f", item.getV());
    assertEquals(2, item.getM());
  }

  @Test
  void orderedItemListIsSerializedTest() throws IOException {
    var expected = "{\"classKind\":\"FileRevision\",\"containingFolder\":null,\"contentHash\":\"F73747371CFD9473C19A0A7F99BCAB008474C4CA\",\"createdOn\":null,\"creator\":\"284334dd-e8e5-42d6-bc8a-715c507a7f02\",\"excludedDomain\":[],\"excludedPerson\":[],\"fileType\":[{\"k\":1,\"v\":\"b16894e4-acb5-4e81-a118-16c00eb86d8f\"}],\"iid\":\"e8de903b-9c38-416a-83f4-90b6cf7b7a41\",\"modifiedOn\":null,\"name\":\"testfile\",\"revisionNumber\":0}";

    var fileTypeIid = UUID.fromString("b16894e4-acb5-4e81-a118-16c00eb86d8f");
    var participantIid = UUID.fromString("284334dd-e8e5-42d6-bc8a-715c507a7f02");
    var engineeringModelIid = UUID.fromString("9ec982e4-ef72-4953-aa85-b158a95d8d56");
    var iterationIid = UUID.fromString("e163c5ad-f32b-4387-b805-f4b34600bc2c");
    var domainFileStoreIid = UUID.fromString("da7dddaa-02aa-4897-9935-e8d66c811a96");
    var fileIid = UUID.fromString("b3e2edac-3fea-4b7a-964f-c129b6dd63b2");
    var fileRevisionIid = UUID.fromString("e8de903b-9c38-416a-83f4-90b6cf7b7a41");

    var fileRevision = new cdp4common.dto.FileRevision(fileRevisionIid, 0);
    fileRevision.setName("testfile");
    fileRevision.setContentHash("F73747371CFD9473C19A0A7F99BCAB008474C4CA");
    fileRevision.getFileType().add(new OrderedItem(1, fileTypeIid));
    fileRevision.setCreator(participantIid);
    fileRevision.addContainer(ClassKind.File, fileIid);
    fileRevision.addContainer(ClassKind.DomainFileStore, domainFileStoreIid);
    fileRevision.addContainer(ClassKind.Iteration, iterationIid);
    fileRevision.addContainer(ClassKind.EngineeringModel, engineeringModelIid);

    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    this.serializer.serializeToStream(fileRevision, outputStream);

    assertTrue(areEqualBySumOfBytes(expected, outputStream.toString()));
  }

  @Test
  void orderedItemListIsDeserializedTest() throws IOException {
    var source = "[{\"classKind\":\"FileRevision\",\"containingFolder\":null,\"contentHash\":\"F73747371CFD9473C19A0A7F99BCAB008474C4CA\",\"createdOn\":null,\"creator\":\"284334dd-e8e5-42d6-bc8a-715c507a7f02\",\"excludedDomain\":[],\"excludedPerson\":[],\"fileType\":[{\"k\":1,\"v\":\"b16894e4-acb5-4e81-a118-16c00eb86d8f\"}],\"iid\":\"e8de903b-9c38-416a-83f4-90b6cf7b7a41\",\"modifiedOn\":null,\"name\":\"testfile\",\"revisionNumber\":0}]";

    ByteArrayInputStream inputStream = new ByteArrayInputStream(source.getBytes());
    List<Thing> fileRevisionList = this.serializer.deserialize(inputStream);

    assertEquals(1, fileRevisionList.size());

    var fileRevision = fileRevisionList.get(0);
    assertEquals(1, ((FileRevision) fileRevision).getFileType().size());

    var fileType = ((FileRevision) fileRevision).getFileType().get(0);
    assertEquals(1, fileType.getK());
    assertEquals("b16894e4-acb5-4e81-a118-16c00eb86d8f", fileType.getV());
    assertNull(fileType.getM());
  }

  @Test
  void valueArrayIsSerializedTest() throws IOException {
    String expected = "\"[\\\"one\\\",\\\"two\\\",\\\"three\\\"]\"";

    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    List<String> list = new ArrayList<>();
    list.add(0, "one");
    list.add(1, "two");
    list.add(2, "three");

    this.serializer.serializeToStream(new ValueArray<>(list, String.class), outputStream);

    System.out.println(outputStream.toString());
    System.out.println(expected);
    assertEquals(expected, outputStream.toString());
  }

   @Test
  void valueArrayIsDeserializedTest() throws IOException {
     String source = "\"[\\\"one\\\",\\\"two\\\",\\\"three\\\"]\"";

     ByteArrayInputStream inputStream = new ByteArrayInputStream(source.getBytes());
     var item = this.serializer.deserialize(new TypeReference<ValueArray>() {
     }, inputStream);

    assertEquals(3, item.size());
    assertEquals("one", item.get(0));
    assertEquals("two", item.get(1));
    assertEquals("three", item.get(2));
  }

  @Test
  void valueArrayIsDeserializedForRedundantSpacesTest() throws IOException {
    String source = "\" [  \\\"one\\\",   \\\"two\\\" ,  \\\"three\\\" ]  \"";

    ByteArrayInputStream inputStream = new ByteArrayInputStream(source.getBytes());
    var item = this.serializer.deserialize(new TypeReference<ValueArray>() {
    }, inputStream);

    assertEquals(3, item.size());
    assertEquals("one", item.get(0));
    assertEquals("two", item.get(1));
    assertEquals("three", item.get(2));
  }

  boolean areEqualBySumOfBytes(String s1, String s2) {
    long s1SumOfBytes = 0;
    long s2SumOfBytes = 0;

    for (byte b : s1.getBytes()) {
      s1SumOfBytes += b;
    }

    for (byte b : s2.getBytes()) {
      s2SumOfBytes += b;
    }

    System.out.println(s1SumOfBytes + "--" + s2SumOfBytes);
    return s1SumOfBytes == s2SumOfBytes;
  }
}
