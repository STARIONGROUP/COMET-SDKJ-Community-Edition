/*
 * TypeResolver.java
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

package cdp4common.helpers;

import cdp4common.commondata.Thing;
import org.apache.commons.lang3.ClassUtils;
import org.reflections.Reflections;
import org.reflections.scanners.ResourcesScanner;
import org.reflections.scanners.SubTypesScanner;
import org.reflections.util.ClasspathHelper;
import org.reflections.util.ConfigurationBuilder;
import org.reflections.util.FilterBuilder;

import java.util.*;

/**
 * The purpose of the {@link TypeResolver} is to provide subType information on super and sub classes of any
 * class in E-TM-10-25
 */
public class TypeResolver {
    /**
     * Gets all the derived types of the specified {@link Class} in the specified Assembly
     *
     * @param baseType The {@link Class} for which all subtypes need to be returned
     * @param packageName The package name in which {@code baseType}
     * @return an {@link Collection} of all the derived types of the {@code baseType}
     */
    public static Collection<Class> getDerivedTypes(Class baseType, String packageName)
    {
        List<ClassLoader> classLoadersList = new LinkedList<ClassLoader>();
        classLoadersList.add(ClasspathHelper.contextClassLoader());
        classLoadersList.add(ClasspathHelper.staticClassLoader());

        Reflections reflections = new Reflections(new ConfigurationBuilder()
                .setScanners(new SubTypesScanner(false /* don't exclude Object.class */), new ResourcesScanner())
                .setUrls(ClasspathHelper.forClassLoader(classLoadersList.toArray(new ClassLoader[0])))
                .filterInputsBy(new FilterBuilder().include(FilterBuilder.prefix(packageName))));

        //SubTypesScanner
        Set<Class> derivedTypes =  reflections.getSubTypesOf(baseType);

        return derivedTypes;
    }

    /**
     * Returns all the super-types of a {@link Thing}.
     *
     * @param thing The {@link Thing} to have its {@link Class} analyzed
     * @return The {@link Collection} of {@link Class}es that are super-types of the provided {@link Thing}.
     */
    public static Collection<Class> getAllSuperTypes(Thing thing)
    {
        List<Class> result = new ArrayList<>();

        Class typeOfThing = thing.getClass();
        result.add(typeOfThing);

        while (true)
        {
            if (typeOfThing == Thing.class || typeOfThing == null)
            {
                break;
            }

            typeOfThing = typeOfThing.getSuperclass();
            result.add(typeOfThing);
        }

        return result;
    }

    /**
     * Assertion whether {@code subType} is a sub type of {@code superType}
     *
     * @param subType the {@link Class} that is being asserted.
     * @param superType The {@link Class} of which {@code subType} may be a sub type
     * @return true if {@code subType} is a subtype of {@code superType}
     */
    public static boolean isSubclassOf(Class subType, Class superType)
    {
        Iterable<Class<?>> hierarchy = ClassUtils.hierarchy(subType);

        for (Class clazz : hierarchy){
            if (clazz == superType){
                return true;
            }
        }

        return false;
    }
}
