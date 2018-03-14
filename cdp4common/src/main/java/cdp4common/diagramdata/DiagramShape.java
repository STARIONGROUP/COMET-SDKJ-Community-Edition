/* --------------------------------------------------------------------------------------------------------------------
 * DiagramShape.java
 * Copyright (c) 2018 RHEA System S.A.
 *
 * This is an auto-generated POJO Class. Any manual changes to this file will be overwritten!
 * --------------------------------------------------------------------------------------------------------------------
 */

package cdp4common.diagramdata;

import java.util.*;
import java.util.stream.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.io.*;
import java.net.URI;
import cdp4common.*;
import cdp4common.commondata.*;
import cdp4common.diagramdata.*;
import cdp4common.engineeringmodeldata.*;
import cdp4common.exceptions.ContainmentException;
import cdp4common.helpers.*;
import cdp4common.reportingdata.*;
import cdp4common.sitedirectorydata.*;
import cdp4common.types.*;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.tuple.Pair;
import com.google.common.base.Strings;
import com.google.common.cache.Cache;
import com.google.common.collect.Iterables;
import lombok.*;

/**
 * Shape is a diagram element with given bounds that is laid out relative to the origin of the diagram.
 * Note:
 * A shape can be purely notational, i.e., does not reference any model element. Examples include a note shape on a UML
 * class diagram with some text describing the diagram and an overlay shape with some semi-transparent fill enclosing a
 * bunch of shapes on the diagram to make them stand out. On the other hand, a shape can be a depiction of a component
 * (non-relational) element from an abstract syntax model. Examples include a UML class shape and a BPMN activity
 * shape.
 */
@CDPVersion(version = "1.1.0")
@Container(clazz = DiagramElementContainer.class, propertyName = "diagramElement")
@ToString
@EqualsAndHashCode(callSuper = true)
public abstract class DiagramShape extends DiagramElementThing implements Cloneable {
    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    @Getter
    private final PersonAccessRightKind defaultPersonAccess = PersonAccessRightKind.NOT_APPLICABLE;

    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    @Getter
    private final ParticipantAccessRightKind defaultParticipantAccess = ParticipantAccessRightKind.SAME_AS_SUPERCLASS;

    /**
     * Initializes a new instance of the {@link DiagramShape} class.
     */
    protected DiagramShape() {
    }

    /**
     * Initializes a new instance of the {@link DiagramShape} class.
     * @param iid The unique identifier.
     * @param cache The {@link Cache} where the current thing is stored.
     * The {@link Pair} of {@link UUID} is the key used to store this thing.
     * The key is a combination of this thing's identifier and the identifier of its {@link Iteration} container if applicable or null.
     * @param iDalUri The {@link URI} of this thing
     */
    protected DiagramShape(UUID iid, Cache<Pair<UUID, UUID>, Thing> cache, URI iDalUri) {
        super(iid, cache, iDalUri);
    }

    /**
     * Creates and returns a copy of this {@link DiagramShape} for edit purpose.
     * @param cloneContainedThings A value that indicates whether the contained {@link Thing}s should be cloned or not.
     *
     * @return A cloned instance of {@link DiagramShape}.
     */
    @Override
    public DiagramShape clone(boolean cloneContainedThings) {
        this.setChangeKind(ChangeKind.UPDATE);

        return (DiagramShape)this.genericClone(cloneContainedThings);
    }

    /**
     * Validates the cardinalities of the properties of this DiagramShape}.
     *
     * @return A list of potential errors.
     */
    protected List<String> validatePojoCardinality() {
        List<String> errorList = new ArrayList<String>(super.validatePojoCardinality());

        return errorList;
    }
}
