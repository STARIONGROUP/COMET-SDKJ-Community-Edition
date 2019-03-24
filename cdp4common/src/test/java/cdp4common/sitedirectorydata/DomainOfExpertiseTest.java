/*
 * DomainOfExpertiseTest.java
 * Copyright (c) 2015 - 2019 RHEA System S.A.
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
