/* --------------------------------------------------------------------------------------------------------------------
 *    EngineeringModelTest.java
 *    Copyright (c) 2015-2018 RHEA System S.A.
 *
 *    Author: Sam Gerené, Merlin Bieze, Alex Vorobiev, Naron Phou
 *
 *    This file is part of CDP4-SDK Community Edition
 *
 *    The CDP4-SDK Community Edition is free software; you can redistribute it and/or
 *    modify it under the terms of the GNU Lesser General
 *    License as published by the Free Software Foundation; either
 *    version 3 of the License, or (at your option) any later version.
 *
 *    The CDP4-SDK Community Edition is distributed in the hope that it will be useful,
 *    but WITHOUT ANY WARRANTY; without even the implied warranty of
 *    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 *    Lesser General  License for more details.
 *
 *    You should have received a copy of the GNU Lesser General  License
 *    along with this program; if not, write to the Free Software Foundation,
 *    Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 *  --------------------------------------------------------------------------------------------------------------------
 */

package cdp4common.sitedirectorydata;

import cdp4common.engineeringmodeldata.EngineeringModel;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class EngineeringModelTest {
    private EngineeringModel model;
    private EngineeringModelSetup modelsetup;
    private Participant participant;
    private Person person;

    @BeforeEach
    void setup() {
        this.model = new EngineeringModel();
        this.modelsetup = new EngineeringModelSetup();
        this.participant = new Participant();
        this.person = new Person();

        this.participant.setPerson(this.person);
        this.modelsetup.getParticipant().add(this.participant);
        this.model.setEngineeringModelSetup(this.modelsetup);
    }

    @Test
    void verifyThatGetParticipantWorks() {
        assertNotNull(this.model.getActiveParticipant(this.person));
    }

    @Test
    void verifyThatMethodThrow() {
        assertThrows(NullPointerException.class, () -> this.model.getActiveParticipant(null));
    }

    @Test
    void verifyThatRequiredRdlsReturnsExpectedResult() {
        SiteReferenceDataLibrary genericRdl = new SiteReferenceDataLibrary();
        SiteReferenceDataLibrary familyOfRdl = new SiteReferenceDataLibrary();

        familyOfRdl.setRequiredRdl(genericRdl);

        ModelReferenceDataLibrary modelRdl = new ModelReferenceDataLibrary();
        modelRdl.setRequiredRdl(familyOfRdl);

        this.modelsetup.getRequiredRdl().add(modelRdl);

        List<ReferenceDataLibrary> expectedRdls = new ArrayList<>();
        expectedRdls.add(genericRdl);
        expectedRdls.add(familyOfRdl);
        expectedRdls.add(modelRdl);

        assertTrue(expectedRdls.containsAll(this.model.getRequiredRdls()) && expectedRdls.size() == this.model.getRequiredRdls().size());
    }
}
