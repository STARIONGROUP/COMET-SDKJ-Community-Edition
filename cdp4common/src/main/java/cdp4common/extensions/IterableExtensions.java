/*
 * IterableExtensions.java
 * Copyright (c) 2018 RHEA System S.A.
 */

package cdp4common.extensions;

import cdp4common.helpers.Func;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Extension methods for {@link Iterable}
 */
public class IterableExtensions {

    /**
     * Returns all distinct elements of the given source, where "distinctness"
     * is determined via a projection and the default equality comparer for the projected type.
     *
     * @param <TSource>   Type of the source sequence
     * @param <TKey>      Type of the projected element
     * @param source      Source sequence
     * @param keySelector Projection for determining "distinctness"
     * @return A sequence consisting of distinct elements from the source sequence, comparing them by the specified key projection.
     */
    public static <TSource, TKey> Iterable<TSource> distinctBy(Iterable<TSource> source, Func<TSource, TKey> keySelector) {
        Set<TKey> seenKeys = new HashSet<>();
        List<TSource> iterable = new ArrayList<>();

        for (TSource element : source) {
            if (seenKeys.add(keySelector.invoke(element))) {
                iterable.add(element);
            }
        }

        return iterable;
    }
}
