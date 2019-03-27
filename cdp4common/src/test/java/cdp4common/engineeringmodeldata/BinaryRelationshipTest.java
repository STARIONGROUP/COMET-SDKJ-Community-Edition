/*
 * BinaryRelationshipTest.java
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
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class BinaryRelationshipTest {
    private SiteDirectory sitedir;
    private SiteReferenceDataLibrary srdl;
    private Category cat1;
    private Category cat2;
    private Category cat3;
    private BinaryRelationshipRule rule1;
    private BinaryRelationshipRule rule11;
    private BinaryRelationshipRule rule2;
    private BinaryRelationshipRule rule3;

    private EngineeringModelSetup modelSetup;
    private ModelReferenceDataLibrary mrdl;
    private IterationSetup iterationSetup;
    private EngineeringModel model;
    private Iteration iteration;

    @BeforeEach
    void setup() {
        this.sitedir = new SiteDirectory();
        this.srdl = new SiteReferenceDataLibrary();
        sitedir.getSiteReferenceDataLibrary().add(srdl);

        this.cat1 = new Category();
        this.cat2 = new Category();

        this.rule1 = new BinaryRelationshipRule();
        this.rule1.setRelationshipCategory(cat1);

        this.rule2 = new BinaryRelationshipRule();
        this.rule2.setRelationshipCategory(cat2);

        srdl.getDefinedCategory().add(cat1);
        srdl.getDefinedCategory().add(cat2);
        srdl.getRule().add(rule1);
        srdl.getRule().add(rule2);

        this.modelSetup = new EngineeringModelSetup();
        this.mrdl = new ModelReferenceDataLibrary();
        this.mrdl.setRequiredRdl(srdl);
        modelSetup.getRequiredRdl().add(mrdl);

        this.cat3 = new Category();
        this.rule3 = new BinaryRelationshipRule();
        this.rule3.setRelationshipCategory(cat3);
        this.rule11 = new BinaryRelationshipRule();
        this.rule11.setRelationshipCategory(cat1);
        mrdl.getDefinedCategory().add(cat3);
        mrdl.getRule().add(rule3);
        mrdl.getRule().add(rule11);

        this.iterationSetup = new IterationSetup();
        modelSetup.getIterationSetup().add(iterationSetup);

        this.model = new EngineeringModel();
        this.model.setEngineeringModelSetup(modelSetup);
        this.iteration = new Iteration();
        this.iteration.setIterationSetup(iterationSetup);
        model.getIteration().add(iteration);
    }

    @Test
    void verifyThatAppliedRulesGetterWorks() {
        BinaryRelationship relationship = new BinaryRelationship();
        iteration.getRelationship().add(relationship);

        // test
        assertEquals(0, relationship.getAppliedBinaryRelationshipRules().size());

        relationship.getCategory().add(cat3);
        assertTrue(relationship.getAppliedBinaryRelationshipRules().contains(rule3));

        relationship.getCategory().add(cat1);
        assertTrue(relationship.getAppliedBinaryRelationshipRules().contains(rule3));
        assertTrue(relationship.getAppliedBinaryRelationshipRules().contains(rule1));
        assertTrue(relationship.getAppliedBinaryRelationshipRules().contains(rule11));

        relationship.setCategory(null);
        assertEquals(0, relationship.getAppliedBinaryRelationshipRules().size());
    }
}
