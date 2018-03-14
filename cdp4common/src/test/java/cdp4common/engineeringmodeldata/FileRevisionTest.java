/* --------------------------------------------------------------------------------------------------------------------
 *    FileRevisionTest.java
 *    Copyright (c) 2015-2018 RHEA System S.A.
 *
 *    Author: Sam Gerené, Merlin Bieze, Alex Vorobiev, Naron Phou
 *
 *    This file is part of CDP4-SDK Community Edition
 *
 *    The CDP4-SDK Community Edition is free software; you can redistribute it and/or
 *    modify it under the terms of the GNU Lesser General Public
 *    License as published by the Free Software Foundation; either
 *    version 3 of the License, or (at your option) any later version.
 *
 *    The CDP4-SDK Community Edition is distributed in the hope that it will be useful,
 *    but WITHOUT ANY WARRANTY; without even the implied warranty of
 *    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 *    Lesser General Public License for more details.
 *
 *    You should have received a copy of the GNU Lesser General Public License
 *    along with this program; if not, write to the Free Software Foundation,
 *    Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 *  --------------------------------------------------------------------------------------------------------------------
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
        this.filerev.getFileType().add(new FileType(UUID.randomUUID(), null, null));
        FileType fileType2 = new FileType(UUID.randomUUID(), null, null);
        fileType2.setExtension("ext2");
        this.filerev.getFileType().add(fileType2);

        this.filerev.setContainingFolder(this.folder);
    }

    @Test
    void VerifyPath() {
        assertEquals("/path/filerev.ext1.ext2", this.filerev.getPath());
    }
}
