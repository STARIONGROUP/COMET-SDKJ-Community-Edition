/* --------------------------------------------------------------------------------------------------------------------
 * FileRevision.java
 * Copyright (c) 2018 RHEA System S.A.
 * --------------------------------------------------------------------------------------------------------------------
 */

package cdp4common.engineeringmodeldata;

import java.util.*;
import java.util.concurrent.*;
import java.net.URI;
import cdp4common.*;
import cdp4common.commondata.*;
import cdp4common.diagramdata.*;
import cdp4common.engineeringmodeldata.*;
import cdp4common.reportingdata.*;
import cdp4common.sitedirectorydata.*;
import org.apache.commons.lang3.tuple.Pair;

/**
 * representation of a persisted revision of a File
 * Note 1: The <i>name</i> property is used to denote the name of the FileRevision and therefore of the File, without any file type extension. So for a Microsoft Windows file the name contains the characters up to (but not including) the dot that separates the file name from the extension. The file type extension is stored in the associated FileType. Case is preserved in the file name.
 * Note 2: The representation of the actual file content of a FileRevision depends on the implementation technology and is not modeled as an explicit property. It may differ between server and client applications. A server application (e.g. a combination of a web services processor and a persistent data store) may store the content partitioned into chunks for reasons of efficiency. A client application may implement an API that provides access to an instance of a retrieved file in a locally accessible file system. There is a FileContentType data type that can be used in code generation or implementation.
 */
@Container(clazz = File.class, propertyName = "fileRevision")
public class FileRevision extends AbstractFileRevision {
    /**
     * Initializes a new instance of the <code>FileRevision<code/> class.
     *
     * @see FileRevision
     */
    public FileRevision() {
        super();
    }

    /**
     * Initializes a new instance of the <code>FileRevision<code/> class.
     * @param iid The unique identifier.
     * @param cache The <code>ConcurrentHashMap<K,V></code> where the current thing is stored.
     * The <code>Pair<L,R><code/> of <code>UUID<code/> is the key used to store this thing.
     * The key is a combination of this thing's identifier and the identifier of its <code>Iteration<code/> container if applicable or null.
     * @param iDalUri The <code>URI</code> of this thing
     *
     * @see ConcurrentHashMap
     * @see URI
     * @see UUID
     * @see Pair
     * @see Iteration
     * @see FileRevision
     */
    public FileRevision(UUID iid, ConcurrentHashMap<Pair<UUID, UUID>, Lazy<Thing>> cache, URI iDalUri) {
        super(iid, cache, iDalUri);
    }
}
