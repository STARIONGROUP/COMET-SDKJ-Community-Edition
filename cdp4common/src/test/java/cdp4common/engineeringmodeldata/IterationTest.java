/*
 * CategoryTest.java
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

package cdp4common.engineeringmodeldata;

import cdp4common.sitedirectorydata.*;
import org.junit.jupiter.api.Test;

import java.util.Collection;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class IterationTest {
    @Test
    void verifyThatRequiredRdlsReturnsExpectedResult() {
        SiteReferenceDataLibrary genericRdl = new SiteReferenceDataLibrary();
        SiteReferenceDataLibrary familyofRdl = new SiteReferenceDataLibrary();

        familyofRdl.setRequiredRdl(genericRdl);

        ModelReferenceDataLibrary modelrdl = new ModelReferenceDataLibrary();
        modelrdl.setRequiredRdl(familyofRdl);

        Iteration iteration = new Iteration();
        EngineeringModel engineeringModel = new EngineeringModel();
        engineeringModel.getIteration().add(iteration);

        EngineeringModelSetup engineeringModelSetup = new EngineeringModelSetup();
        IterationSetup iterationSetup = new IterationSetup();

        engineeringModelSetup.getRequiredRdl().add(modelrdl);
        engineeringModelSetup.getIterationSetup().add(iterationSetup);

        iteration.setIterationSetup(iterationSetup);

        Collection<ReferenceDataLibrary> requiredRdls = iteration.getRequiredRdls();

        assertTrue(requiredRdls.contains(genericRdl));
        assertTrue(requiredRdls.contains(familyofRdl));
        assertTrue(requiredRdls.contains(modelrdl));

        assertEquals(3, requiredRdls.size());
    }
}
