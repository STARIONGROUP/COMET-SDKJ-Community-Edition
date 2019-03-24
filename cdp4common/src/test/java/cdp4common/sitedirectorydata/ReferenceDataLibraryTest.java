/*
 * ReferenceDataLibraryTest.java
 * Copyright (c) 2015 - 2019 RHEA System S.A.
 */

package cdp4common.sitedirectorydata;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ReferenceDataLibraryTest {
    @Test
    void VerifyThatGetRequiresRdlWorks() {
        ModelReferenceDataLibrary mRdl = new ModelReferenceDataLibrary();
        SiteReferenceDataLibrary sRdl1 = new SiteReferenceDataLibrary();
        SiteReferenceDataLibrary srdl11 = new SiteReferenceDataLibrary();
        SiteReferenceDataLibrary sRdl2 = new SiteReferenceDataLibrary();

        mRdl.setRequiredRdl(srdl11);
        srdl11.setRequiredRdl(sRdl1);

        int i = 0;
        for (ReferenceDataLibrary rdl : mRdl.getRequiredRdlsChain()) {
            i++;
        }

        Assertions.assertEquals(2, i);

        i = 0;
        for (ReferenceDataLibrary rdl : sRdl2.getRequiredRdlsChain()) {
            i++;
        }

        Assertions.assertEquals(0, i);
    }
}
