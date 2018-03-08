/* --------------------------------------------------------------------------------------------------------------------
 *    ReferenceDataLibraryTest.java
 *    Copyright (c) 2015-2018 RHEA System S.A.
 *
 *    Author: Sam Gerené, Merlin Bieze, Alex Vorobiev, Naron Phou
 *
 *    This file is part of CDP4-SDK Community Edition
 *
 *    The CDP4-SDK Community Edition is free software; you can redistribute it and/or
 *    modify it under the terms of the GNU Lesser General Public
 *    License as published by the Free Software Foundation; either
 *    version 3 of the License, or (at your option) any later version.
 *
 *    The CDP4-SDK Community Edition is distributed in the hope that it will be useful,
 *    but WITHOUT ANY WARRANTY; without even the implied warranty of
 *    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 *    Lesser General Public License for more details.
 *
 *    You should have received a copy of the GNU Lesser General Public License
 *    along with this program; if not, write to the Free Software Foundation,
 *    Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 *  --------------------------------------------------------------------------------------------------------------------
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
