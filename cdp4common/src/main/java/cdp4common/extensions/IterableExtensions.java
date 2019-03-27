/*
 * IterableExtensions.java
 *
 * Copyright (c) 2015-2019 RHEA System S.A.
 *
 * Author: Alex Vorobiev, Yevhen Ikonnykov, Sam Gerené
 *
 * This file is part of CDP4-SDKJ Community Edition
 *
 * The CDP4-SDKJ Community Edition is free software; you can redistribute it and/or
 *  modify it under the terms of the GNU Lesser General Public
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
