/*
 * CategoryTest.java
 * Copyright (c) 2015 - 2019 RHEA System S.A.
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
