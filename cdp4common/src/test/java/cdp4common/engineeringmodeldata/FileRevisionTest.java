/*
 * FileRevisionTest.java
 * Copyright (c) 2015 - 2019 RHEA System S.A.
 */

package cdp4common.engineeringmodeldata;

import cdp4common.sitedirectorydata.FileType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FileRevisionTest {
    private FileRevision filerev;
    private Folder folder;

    @BeforeEach
    void setup() {
        this.folder = new Folder(UUID.randomUUID(), null, null);
        this.folder.setName("path");

        this.filerev = new FileRevision(UUID.randomUUID(), null, null);
        this.filerev.setName("filerev");

        FileType fileType1 = new FileType(UUID.randomUUID(), null, null);
        fileType1.setExtension("ext1");
        this.filerev.getFileType().add(fileType1);

        FileType fileType2 = new FileType(UUID.randomUUID(), null, null);
        fileType2.setExtension("ext2");
        this.filerev.getFileType().add(fileType2);

        this.filerev.setContainingFolder(this.folder);
    }

    @Test
    void verifyPath() {
        assertEquals("/path/filerev.ext1.ext2", this.filerev.getPath());
    }
}
