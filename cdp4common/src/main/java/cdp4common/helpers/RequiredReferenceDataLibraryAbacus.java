/*
 * RequiredReferenceDataLibraryAbacus.java
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

import cdp4common.commondata.Thing;
import cdp4common.sitedirectorydata.ReferenceDataLibrary;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/**
 * The purpose of the {@link RequiredReferenceDataLibraryAbacus} is to compute the
 * chain of Required {@link ReferenceDataLibrary}s
 */
public class RequiredReferenceDataLibraryAbacus {
    /**
     * Computes the {@link Collection} that contains
     * the required {@link ReferenceDataLibrary} for the current {@link Thing}
     *
     * @return a {@link Collection} of the required {@link ReferenceDataLibrary}s for the current {@link Thing}
     * @throws IllegalArgumentException when this method is invoked on a class that is not directly contained by a {@link ReferenceDataLibrary}
     */
    public static Collection<ReferenceDataLibrary> computeRequiredRdls(Thing thing) {
        if (!(thing.getContainer() instanceof ReferenceDataLibrary)) {
            throw new IllegalArgumentException("The ComputeRequiredRdls method may only be invoked on classes that are directly contained by a ReferenceDataLibrary");
        }

        Set<ReferenceDataLibrary> requiredRdls = new HashSet<>();
        ReferenceDataLibrary rdl = (ReferenceDataLibrary) (thing.getContainer());
        requiredRdls.add(rdl);
        requiredRdls.addAll(rdl.getRequiredRdlsChain());
        return requiredRdls;
    }
}
