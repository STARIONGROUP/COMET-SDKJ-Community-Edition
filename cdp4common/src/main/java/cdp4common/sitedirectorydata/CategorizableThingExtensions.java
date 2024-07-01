/*
 * CategorizableThingExtensions.java
 *
 * Copyright (c) 2015-2024 Starion Group S.A.
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

package cdp4common.sitedirectorydata;

import cdp4common.engineeringmodeldata.ElementDefinition;
import cdp4common.engineeringmodeldata.ElementUsage;
import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Extension methods for {@link CategorizableThing}
 */
public class CategorizableThingExtensions {
    /**
     * Queries the {@link CategorizableThing} and checks whether it is a member of the
     * supplied {@link Category}, this includes membership of the sub {@link Category} instances
     * of the provided {@link Category}
     *
     * @param categorizableThing The {@link CategorizableThing} instance that is being queried.
     * @param category           The {@link Category} that the {@link CategorizableThing} may be a member of.
     * @return true if the {@link CategorizableThing} is a member of the {@code category}, including it's
     * sub {@link Category} instances. Returns false if the {@link CategorizableThing} is not a member
     * of the {@code category} nor any of it's sub {@link Category} instances.
     */
    public static boolean isMemberOfCategory(CategorizableThing categorizableThing, Category category) {
        Iterable<Category> memberOfCategories = getAllCategories(categorizableThing);

        List<Category> categoriesToCheck = Lists.newArrayList(category.getAllDerivedCategories());
        categoriesToCheck.add(category);

        for (Category memberOfCategory : memberOfCategories) {
            if (categoriesToCheck.contains(memberOfCategory)) {
                return true;
            }
        }

        return false;
    }

    /**
     * Queries all the super categories of the categories of an {@link CategorizableThing}
     * and returns the categories and all the super categories up the inheritance chain.
     * <p>
     * If the {@code categorizableThing} is an {@link ElementUsage} the returned {@link Category} instances
     * include those of the referenced {@link ElementDefinition}
     *
     * @param categorizableThing The {@link CategorizableThing} that is to be queried for all its categories
     *                           and its super categories.
     * @return a {@link Collection} that contains all the categories
     */
    public static Collection<Category> getAllCategories(CategorizableThing categorizableThing) {
        List<Category> allCategories = new ArrayList<>();

        if (categorizableThing instanceof ElementUsage) {
            ElementDefinition elementDefinition = ((ElementUsage) categorizableThing).getElementDefinition();
            if (elementDefinition != null) {
                allCategories.addAll(elementDefinition.getCategory());
            }
        }

        allCategories.addAll(categorizableThing.getCategory());
        List<Category> foundCategories = allCategories.stream()
                .flatMap(c -> c.getAllSuperCategories().stream())
                .collect(Collectors.toList());


        foundCategories.addAll(allCategories);
        return foundCategories;
    }

    /*
     * Queries all the super categories of the categories of an {@link CategorizableThing}
     * and returns the categories and all the super categories up the inheritance chain.
     *
     * @param categorizableThing The {@link CategorizableThing} that is to be queried for all its categories
     * and its super categories.
     * @return the short names of the categories and super categories concatenated as a string
     */
    public static String getAllCategoryShortNames(CategorizableThing categorizableThing) {
        List<Category> allCategories = Lists.newArrayList(getAllCategories(categorizableThing));
        return allCategories.stream().map(Category::getShortName).reduce("", (current, shortName) -> String.format("%1$s %2$s", current, shortName)).trim();
    }
}
