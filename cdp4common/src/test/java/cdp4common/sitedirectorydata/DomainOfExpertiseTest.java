/*
 * DomainOfExpertiseTest.java
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

package cdp4common.sitedirectorydata;

import cdp4common.engineeringmodeldata.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertTrue;

class DomainOfExpertiseTest {
    private DomainOfExpertise domainOfExpertise;
    private EngineeringModel model;
    private Iteration iteration;

    @BeforeEach
    void setup() {
        this.domainOfExpertise = new DomainOfExpertise(UUID.randomUUID(), null, null);

        this.iteration = new Iteration(UUID.randomUUID(), null, null);
        this.model = new EngineeringModel(UUID.randomUUID(), null, null);
        this.model.getIteration().add(this.iteration);
    }

    @Test
    void verifyThatOwnedParametersReturnsExpectedResult() {
        ElementDefinition elementDefinition = new ElementDefinition(UUID.randomUUID(), null, null);
        elementDefinition.setOwner(this.domainOfExpertise);
        this.iteration.getElement().add(elementDefinition);

        Parameter parameter = new Parameter(UUID.randomUUID(), null, null);
        parameter.setOwner(this.domainOfExpertise);
        elementDefinition.getParameter().add(parameter);


        List<ParameterOrOverrideBase> ownedParameters = this.domainOfExpertise.getOwnedParameters(this.iteration);
        assertTrue(ownedParameters.contains(parameter));
    }
}
