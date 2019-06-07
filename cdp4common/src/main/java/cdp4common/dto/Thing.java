/*
 * Thing.java
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

package cdp4common.dto;

import cdp4common.AggregationKind;
import cdp4common.CDPVersion;
import cdp4common.ContainerLevelKind;
import cdp4common.DataMember;
import cdp4common.UmlInformation;
import cdp4common.commondata.ClassKind;
import cdp4common.helpers.ContainerPropertyHelper;
import cdp4common.helpers.Utils;
import cdp4common.types.CacheKey;
import cdp4common.types.OrderedItem;
import com.google.common.cache.Cache;
import com.google.common.collect.Lists;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.net.URI;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import javax.xml.bind.annotation.XmlTransient;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.apache.commons.lang3.SerializationUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.reflect.FieldUtils;

/**
 * The Data Transfer Object representing the abstract {@link Thing} class.
 */
@ToString
public abstract class Thing {
    /**
     * A list of {@link cdp4common.commondata.ClassKind} representing the container that are added to compute the route
     */
    private final List<ClassKind> partialClassKindRoute = new ArrayList<>();

    /**
     * Gets or sets the {@link cdp4common.commondata.Thing} that the current DTO was created from.
     */
    @Getter
    @Setter
    private cdp4common.commondata.Thing sourceThing;

    /**
     * A list of partial routes, the outermost part of the route is the first in the list
     */
    @Getter
    private final List<String> partialRoutes = new ArrayList<>();

    /**
     * Initializes a new instance of the {@link Thing} class.
     */
    protected Thing() {
        this.classKind = computeCurrentClassKind();

        this.excludedDomain = new ArrayList<>();
        this.excludedPerson = new ArrayList<>();
    }

    /**
     * Initializes a new instance of the {@link Thing} class.
     *
     * @param iid The unique identifier.
     * @param rev The revision number.
     */
    protected Thing(UUID iid, int rev) {
        this.iid = iid;
        this.classKind = computeCurrentClassKind();
        this.revisionNumber = rev;

        this.excludedDomain = new ArrayList<>();
        this.excludedPerson = new ArrayList<>();
    }

    /**
     * Gets the assertion of the ClassKind of this Thing, denoting its actual class.
     * Note: Typically this is used internally by the implementing software to improve classification of instances and optimise performance when moving data between different programming environments. In an object-oriented software engineering environment that supports reflection such information would be redundant.
     */
    @DataMember
    @Getter
    private final ClassKind classKind;

    /**
     * Gets or sets the list of unique identifiers of the referenced ExcludedDomain instances.
     */
    @CDPVersion(version = "1.1.0")
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    @DataMember
    private List<UUID> excludedDomain;

    /**
     * Gets or sets the list of unique identifiers of the referenced ExcludedPerson instances.
     */
    @CDPVersion(version = "1.1.0")
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    @DataMember
    private List<UUID> excludedPerson;

    /**
     * Gets or sets the Universally Unique Identifier (UUID) that uniquely identifies an instance of Thing
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false)
    @Getter
    @Setter
    @DataMember
    private UUID iid;

    /**
     * Gets or sets the ModifiedOn.
     */
    @CDPVersion(version = "1.1.0")
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    @DataMember
    private LocalDateTime modifiedOn;

    /**
     * Gets or set the revision number of this Thing
     * Note: In this data model a revision numbering approach similar to Subversion is used, see http://svnbook.red-bean.com/en/1.7/svn-book.html#svn.basic. Therefore the revision number is actually a change set number. At any time that an update to a Thing is made and committed to a persistent data store, the revisionNumber of its TopContainer is incremented by one, and then the revisionNumber of the updated Thing is set to the new TopContainer's revisionNumber. See also TopContainer. When a Thing is first created (in a client application) its revisionNumber is set to zero, implying it has not yet been persisted.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    @DataMember
    private int revisionNumber;

    /**
     * Gets or sets the {@link UUID} of the {@link Iteration} container
     * This is null if this is not an iteration data
     */
    @Getter
    @Setter
    private UUID iterationContainerId;

    /**
     * The {@link ContainerLevelKind} that determines where in the containment tree
     * the DTO is situated.
     */
    @XmlTransient
    private ContainerLevelKind containerLevelKind;

    /**
     * Gets the {@link ContainerLevelKind} that determines where in the containment tree
     * the DTO is situated.
     */
    public ContainerLevelKind getContainerLevelKind() {
        return ContainerLevelKind.INVALID;
    }

    /**
     * Sets the {@link ContainerLevelKind} that determines where in the containment tree
     * the DTO is situated.
     *
     * @throws UnsupportedOperationException when the {@link ContainerLevelKind} is fixed and may not be updated.
     */
    public void setContainerLevelKind(ContainerLevelKind containerLevelKind) {
        throw new UnsupportedOperationException("The ContainerLevelKind may not be set.");
    }

    /**
     * Gets an {@link Iterable<Iterable>} that references the composite properties of the current {@link Thing}
     */
    private Iterable<Iterable> containerLists;

    /**
     * Gets an {@link List<List>} that references the composite properties of the current {@link Thing}
     */
    public List<List> getContainerLists() {
        return new ArrayList<>();
    }

    /**
     * Queries the {@link cdp4common.commondata.Thing} that was the source of the DTO
     *
     * @return The {@link Thing} that is the source from which the DTO may have been created.
     * The return value may be null if the DTO was not created based on an existing POJO.
     */
    public cdp4common.commondata.Thing querySourceThing() {
        return this.sourceThing;
    }

    /**
     * Register the Source {@link cdp4common.commondata.Thing} with the current DTO
     *
     * @param thing The {@link cdp4common.commondata.Thing} that is to be registered
     */
    public void registerSourceThing(cdp4common.commondata.Thing thing) {
        this.sourceThing = thing;
    }

    /**
     * The route for the current {@link Thing}
     */
    private String route;

    /**
     * Gets the route for the current {@link Thing}
     */
    public String getRoute() {
        throw new UnsupportedOperationException("This object does not have a Route property associated with it.");
    }

    /**
     * Instantiate a {@link cdp4common.commondata.Thing} from a {@link Thing}
     *
     * @param cache The cache that stores all the {@link cdp4common.commondata.Thing}
     * @param uri   The {@link URI} of the {@link cdp4common.commondata.Thing}
     * @return A new {@link cdp4common.commondata.Thing}
     */
    public abstract cdp4common.commondata.Thing instantiatePojo(Cache<CacheKey, cdp4common.commondata.Thing> cache, URI uri);

    /**
     * Check if the current {@link Thing} contains the {@code thing}
     *
     * @param thing The potential contained {@link Thing}
     * @return True if the current {@link Thing} does contain the {@code thing}
     */
    public boolean contains(Thing thing) {
        for (List containerList : getContainerLists()) {
            for (Object element : containerList) {
                OrderedItem orderedItem;
                if (element instanceof OrderedItem) {
                    orderedItem = (OrderedItem) element;
                    UUID uuid = UUID.fromString(orderedItem.getV().toString());
                    if (uuid.equals(thing.getIid())) {
                        return true;
                    }

                    continue;
                }

                if (thing.getIid().equals(element)) {
                    return true;
                }
            }
        }

        return false;
    }

    /**
     * Adds a container to the current {@link Thing}. The containers should be added following the containment
     * hierarchy starting at the current {@link Thing}. The last addition shall be either a {@link EngineeringModel}
     * or a {@link SiteDirectory}
     *
     * @param classKind A {@link ClassKind} specifying the type of the container that is being added
     * @param iid       the unique id of the container that is being added
     */
    public void addContainer(ClassKind classKind, UUID iid) {
        ClassKind lastRouteClassKind = this.partialClassKindRoute.size() > 0
                ? this.partialClassKindRoute.get(this.partialClassKindRoute.size() - 1)
                : this.classKind;

        switch (lastRouteClassKind) {
            case SITE_DIRECTORY:
                throw new UnsupportedOperationException("Cannot add another container, SiteDirectory is a top container");
            case ENGINEERING_MODEL:
                throw new UnsupportedOperationException("Cannot add another container, EngineeringModel is a top container");
            default: {
                if (isAuthorizedRoute(lastRouteClassKind, classKind)) {
                    String containerPropertyName = ContainerPropertyHelper.getContainerPropertyName(classKind);
                    String partialRoute = String.format("%1$s/%2$s", containerPropertyName, iid);
                    this.partialRoutes.add(partialRoute);
                    this.partialClassKindRoute.add(classKind);
                    break;
                }

                throw new UnsupportedOperationException(String.format("the added container of classKind: %1$s is not consistent with the existing route", classKind));
            }
        }
    }

    /**
     * Returns the computed route of the current {@link Thing}
     *
     * @return A string that represents the route
     */
    protected String computedRoute() {
        List<String> temporaryList = Lists.reverse(new ArrayList<>(this.partialRoutes));
        String containerRoute = String.join("/", temporaryList);

        String containerPropertyName = ContainerPropertyHelper.getContainerPropertyName(this.classKind);
        String partialRoute = String.format("%1$s/%2$s", containerPropertyName, getIid());

        if (StringUtils.isEmpty(containerRoute)) {
            return "/" + partialRoute;
        }

        return String.format("/%1$s/%2$s", containerRoute, partialRoute);
    }

    /**
     * Computes the ClassKind of the current object based on it's type
     *
     * @return the {@link ClassKind} of the current object
     */
    protected ClassKind computeCurrentClassKind() {
        String className = Utils.getConstantNotationFromUpperCamel(this.getClass().getSimpleName());

        return ClassKind.valueOf(className); // unsuccessful call will throw an exception
    }

    /**
     * Assert that the new added container is consistent with the container previously added
     *
     * @param lastRoute container previously added
     * @param newRoute  new container
     * @return true if the new route is consistent with the existing one
     */
    private boolean isAuthorizedRoute(ClassKind lastRoute, ClassKind newRoute) {
        String lastRouteContainerClass = ContainerPropertyHelper.getContainerClassName(lastRoute);
        if (newRoute.toClassName().equals(lastRouteContainerClass)) {
            return true;
        }

        // the newRoute may not correspond to the container class because the container class is abstract.
        // Check if the parent of the added container is that abstract class
        Class type;
        try {
            type = Class.forName("cdp4common.dto." + newRoute.toClassName());
            Class parent = type.getSuperclass();

            while (parent != null) {
                if (parent.getSimpleName().equals(lastRouteContainerClass)) {
                    return true;
                }

                parent = parent.getSuperclass();
            }
        } catch (Exception ex) {
            return false;
        }

        return false;
    }

    /**
     * Retrieves the top container route
     *
     * @return The {@link String} representing the route to the top container.
     * @throws UnsupportedOperationException If no valid route is determined this exception is thrown
     */
    public String getTopContainerRoute() {
        List<String> temporaryList = Lists.reverse(this.partialRoutes);

        // if this is a top container simply return itself
        if (this instanceof SiteDirectory || this instanceof Iteration || this instanceof EngineeringModel) {
            return computedRoute();
        }

        if (this.partialRoutes.size() == 0) {
            throw new UnsupportedOperationException(String.format("No valid top container found for DTO: %1$s.", getIid()));
        }

        if (temporaryList.get(0).contains("SiteDirectory")) {
            return String.format("/%1$s", temporaryList.get(0));
        }

        if (temporaryList.get(0).contains("EngineeringModel")) {
            // make a distinction on Iteration and Engineering Model things
            if (temporaryList.size() == 1 || !temporaryList.get(1).contains("iteration")) {
                // a thing that is directly under an EngineeringModel
                return String.format("/%1$s", temporaryList.get(0));
            }

            return String.format("/%1$s", String.join("/", temporaryList.subList(0, 2)));
        }

        throw new UnsupportedOperationException(String.format("No valid top container found for DTO: %1$s.", getIid()));
    }

    /**
     * Returns a deep clone of the current {@link Thing}
     *
     * @param <T> A type of {@link Thing}
     * @return A deep clone of the current {@link Thing}
     */
    public <T extends Thing> T deepClone(Class<T> clazz) {
        // TODO can be refactored to removed reflection
        if (!(clazz.isInstance(this))) {
            throw new UnsupportedOperationException("The type of the clone to create is invalid.");
        }

        try {
            T clone = (T) this.clone();
            Class type = clone.getClass();

            for (Field propertyInfo : type.getDeclaredFields()) {
                if (!propertyInfo.isAnnotationPresent(DataMember.class)) {
                    // only create a clone of the list that is part of the DataMember
                    continue;
                }

                Object newValue;
                Type fieldGenericType = propertyInfo.getGenericType();
                Class fieldType = propertyInfo.getType();
                if (fieldGenericType instanceof ParameterizedType && Iterable.class.isAssignableFrom(fieldType)) {
                    Object oldValue = FieldUtils.readField(this, propertyInfo.getName(), true);
                    newValue = SerializationUtils.clone((Serializable) oldValue);
                } else {
                    continue;
                }

                FieldUtils.writeField(clone, propertyInfo.getName(), newValue, true);
            }

            return clone;
        } catch (Exception e) {
            e.printStackTrace();
            throw new IllegalAccessError(String.format("Somehow %1$s cannot be cloned.", clazz.getName()));
        }
    }
}
