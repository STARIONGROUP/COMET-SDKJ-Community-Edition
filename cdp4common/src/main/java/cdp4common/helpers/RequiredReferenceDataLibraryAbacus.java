/*
 * RequiredReferenceDataLibraryAbacus.java
 * Copyright (c) 2018 RHEA System S.A.
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
     * Computes the {@link Collection<ReferenceDataLibrary>} that contains
     * the required {@link ReferenceDataLibrary} for the current {@link Thing}
     *
     * @return a {@link Collection<ReferenceDataLibrary>} of the required {@link ReferenceDataLibrary}s for the current {@link Thing}
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
