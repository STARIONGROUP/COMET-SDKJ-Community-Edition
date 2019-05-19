/*
 * PojoThingFactory.java
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

package cdp4common.helpers;

import cdp4common.ChangeKind;
import cdp4common.commondata.Thing;
import cdp4common.engineeringmodeldata.Iteration;
import cdp4common.types.CacheKey;
import cdp4common.types.ContainerList;
import cdp4common.types.OrderedItem;
import cdp4common.types.OrderedItemList;
import com.google.common.cache.Cache;
import lombok.extern.log4j.Log4j2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UUID;

/**
 * Provides static method to instantiate and resolve the properties of all {@link Thing}s stored in a cache.
 * Provides internal static helper methods to resolve the properties of a thing.
 */
@Log4j2
public class PojoThingFactory {
    /**
     * Call ResolvedReferencedProperties for the POJO {@link Thing}s
     *
     * @param dtoThings the associated DTO {@link Thing}s with the data
     * @param cache     the cache containing the {@link Thing}s
     */
    public static void resolveDependencies(Iterable<cdp4common.dto.Thing> dtoThings, Cache<CacheKey, Thing> cache) {
        for (cdp4common.dto.Thing dtoThing : dtoThings) {
            CacheKey cacheKey = new CacheKey(dtoThing.getIid(), dtoThing.getIterationContainerId());
            Thing associatedPojo = cache.getIfPresent(cacheKey);
            if (associatedPojo != null) {
                associatedPojo.resetSentinel();
                associatedPojo.resolveProperties(dtoThing);
            }
        }
    }

    /**
     * Resolve the {@link ContainerList<T>} from a {@link Iterable<UUID>} that represent the ids of the contained {@link Thing}s
     *
     * @param <T>         The type of {@link Thing}
     * @param list        The {@link ContainerList<T>} to resolve
     * @param UUIDList    The source {@link Iterable<UUID>}
     * @param iterationId The potential {@link Iteration} container id of the contained {@link Thing}s
     * @param cache       The cache that stores the {@link Thing}s
     * @param clazz       The expected type of {@link Thing}
     */
    public static <T extends Thing> void resolveList(ContainerList<T> list, Iterable<UUID> UUIDList, UUID iterationId, Cache<CacheKey, Thing> cache, Class<T> clazz) {
        list.clear();
        for (UUID uuid : UUIDList) {
            T thing = tryGet(cache, uuid, iterationId, clazz);
            if (thing != null) {
                thing.setChangeKind(ChangeKind.NONE);
                list.add(thing);
            }
        }
    }

    /**
     * Resolve the {@link OrderedItemList<T>} from a {@link Iterable<OrderedItem>} that shall represent an ordered list of {@link UUID}
     *
     * @param <T>             A type of {@link Thing}
     * @param list            The ordered list to resolve
     * @param orderedItemList The source {@link Iterable<OrderedItem>}
     * @param iterationId     The potential {@link Iteration}'s id at the top of the containment tree
     * @param cache           The cache that stores the {@link Thing}s
     * @param clazz           The expected type of {@link Thing}
     */
    public static <T extends Thing> void resolveList(OrderedItemList<T> list, Iterable<OrderedItem> orderedItemList, UUID iterationId, Cache<CacheKey, Thing> cache, Class<T> clazz) {
        list.clear();
        List<OrderedItem> orderedList = new ArrayList<>();

        for (OrderedItem item : orderedItemList) {
            UUID uuid;
            try {
                uuid = java.util.UUID.fromString(item.getV().toString());
            } catch (Exception ex) {
                log.error("The ordered item does not represent a Thing.", ex.toString());
                continue;
            }

            T thing = tryGet(cache, uuid, iterationId, clazz);
            if (thing != null) {
                OrderedItem ordereditem = new OrderedItem();
                ordereditem.setK(item.getK());
                ordereditem.setV(thing);
                orderedList.add(ordereditem);
                if (list.isComposite) {
                    thing.setChangeKind(ChangeKind.NONE);
                }
            }
        }

        list.addOrderedItems(orderedList);
    }

    /**
     * Clear and add the item of a source {@link Collection<T>} to a {@link List<T>}
     *
     * @param <T>        A type
     * @param list       The {@link List<T>}
     * @param sourceList The source {@link Iterable<T>}
     */
    public static <T> void clearAndAddRange(List<T> list, Collection<T> sourceList) {
        list.clear();
        list.addAll(sourceList);
    }

    /**
     * Clear and add to the {@link OrderedItemList<T>} from a {@link Iterable<OrderedItem>}
     *
     * @param <T>             The generic type of the {@link OrderedItemList<T>}. This should be a primitive type that matches the value of the {@link cdp4common.dto.Thing}'s {@link Iterable<OrderedItem>}
     * @param list            The {@link OrderedItemList<T>} to resolve
     * @param orderedItemList The source {@link Iterable<OrderedItem>}
     */
    public static <T> void clearAndAddRange(OrderedItemList<T> list, Iterable<OrderedItem> orderedItemList) {
        list.clear();
        list.addOrderedItems(orderedItemList);
    }

    /**
     * Resolve the {@link List<T>} from a {@link Iterable<UUID>}
     *
     * @param <T>         A type of {@link Thing}
     * @param list        The {@link List<T>} to resolve
     * @param UUIDList    The {@link Iterable<UUID>} that contains the {@link UUID}s of the {@link Thing}s that shall be contained in {@code list}
     * @param iterationId The {@link Iteration} {@link UUID} at the top of the containment tree
     * @param cache       The cache that stores the {@link Thing}s
     * @param clazz       The expected type of {@link Thing}
     */
    public static <T extends Thing> void resolveList(List<T> list, Iterable<UUID> UUIDList, UUID iterationId, Cache<CacheKey, Thing> cache, Class<T> clazz) {
        list.clear();
        for (UUID uuid : UUIDList) {
            T thing = tryGet(cache, uuid, iterationId, clazz);
            if (thing != null) {
                list.add(thing);
            }
        }
    }

    /**
     * Check whether the {@link Thing} is present corresponding to the given {@code itemIid}
     *
     * @param <T>         The type of {@link Thing} to get
     * @param cache       The cache that stores the {@link Thing}s
     * @param itemIid     The id of the {@link Thing} to retrieve
     * @param iterationId The potential iteration id the item to retrieve is contained in
     * @param clazz       The expected type of {@link Thing}
     * @return True if an item is present in the cache
     */
    public static <T extends Thing> T tryGet(Cache<CacheKey, Thing> cache, UUID itemIid, UUID iterationId, Class<T> clazz) {
        return get(cache, itemIid, iterationId, clazz);
    }

    /**
     * Get the {@link Thing} of type {@link T} corresponding to the given {@code itemIid}
     * A 2 steps approach is necessary to retrieve a thing
     * as in some cases it is not possible to know if the {@link Thing} is contained in an iteration or not.
     *
     * @param <T>         The type of {@link Thing} to get
     * @param cache       The cache that stores the {@link Thing}s
     * @param itemIid     The id of the {@link Thing} to retrieve
     * @param iterationId The potential iteration id the item to retrieve is contained in
     * @param clazz       The expected type of {@link Thing}
     * @return The {@link Thing} of type {@link T}
     */
    public static <T extends Thing> T get(Cache<CacheKey, Thing> cache, UUID itemIid, UUID iterationId, Class<T> clazz) {
        if(itemIid == null){
            log.debug(String.format("The %1$s is not possible to found in the cache for item: %2$s", clazz.getSimpleName(), itemIid));
            return null;
        }

        // try with the iteration id
        CacheKey key = new CacheKey(itemIid, iterationId);
        T thing = get(cache, key, clazz);

        if (thing != null) {
            return thing;
        }

        // try without iteration id
        if (iterationId != null) {
            key = new CacheKey(itemIid, null);
            thing = get(cache, key, clazz);
            if (thing != null) {
                return thing;
            }
        }

        // Get the first one if any whatever the iterationId might be
        CacheKey firstKey = null;
        for (CacheKey cacheKey : cache.asMap().keySet()) {
            if (cacheKey.getThing().equals(itemIid)) {
                firstKey = cacheKey;
                break;
            }
        }

        if (firstKey != null && !firstKey.getThing().equals(new UUID(0L, 0L)) && firstKey.getIteration() != null) {
            return get(cache, firstKey, clazz);
        }

        log.debug(String.format("The %1$s was not found in the cache: %2$s", clazz.getSimpleName(), key.getThing()));
        return null;
    }

    /**
     * Get the {@link Thing} of type {@link T} with the given {@code key}
     *
     * @param <T>   The type of {@link Thing}
     * @param cache The cache that stores all the things
     * @param key   The key
     * @param clazz The expected type of {@link Thing}
     * @return The casted {@link Thing}
     */
    private static <T extends Thing> T get(Cache<CacheKey, Thing> cache, CacheKey key, Class<T> clazz) {
        Thing result = cache.getIfPresent(key);
        if (result == null) {
            return null;
        }

        if (!clazz.isInstance(result)) {
            log.error(String.format("The thing found in the cache with the key is not of the right type, cached id: %1$s, %2$s", result.getCacheKey().getThing(), result.getCacheKey().getIteration()));
            return null;
        }

        return clazz.cast(result);
    }
}
