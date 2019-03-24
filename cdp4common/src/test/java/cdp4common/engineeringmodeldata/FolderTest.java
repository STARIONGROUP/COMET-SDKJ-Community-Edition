/*
 * FolderTest.java
 * Copyright (c) 2015 - 2019 RHEA System S.A.
 */

package cdp4common.engineeringmodeldata;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class FolderTest {
    private Folder folder;
    private Folder topfolder;
    private Folder superTopfolder;

    @BeforeEach
    void setup() {
        this.folder = new Folder(UUID.randomUUID(), null, null);
        this.folder.setName("path");
        this.topfolder = new Folder(UUID.randomUUID(), null, null);
        this.topfolder.setName("top");
        this.superTopfolder = new Folder(UUID.randomUUID(), null, null);
        this.superTopfolder.setName("supertop");

        this.folder.setContainingFolder(this.topfolder);
        this.topfolder.setContainingFolder(this.superTopfolder);
    }

    @Test
    void verifyPath() {
        assertEquals("supertop/top", this.folder.getPath());
    }
}
