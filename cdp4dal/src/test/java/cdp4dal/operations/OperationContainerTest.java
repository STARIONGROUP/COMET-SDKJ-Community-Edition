/*
 * OperationContainerTest.java
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

package cdp4dal.operations;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import cdp4common.commondata.ClassKind;
import cdp4common.dto.ElementDefinition;
import cdp4common.dto.Iteration;
import com.google.common.base.Strings;
import java.util.UUID;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class OperationContainerTest {

  private String siteDirectoryContext;

  private String iterationContext;

  @BeforeEach
  void setUp() {
    this.siteDirectoryContext = "/SiteDirectory/47363f0d-eb6d-4a58-95f5-fa7854995650";
    this.iterationContext = "/EngineeringModel/5e5dc7f8-833d-4331-b421-eb2c64fcf64b/iteration/b58ea73d-350d-4520-b9d9-a52c75ac2b5d";
  }

  @Test
  void verify_that_token_is_set_when_constructed() {
    var operationContainer = new OperationContainer(this.siteDirectoryContext, 1);
    assertFalse(Strings.isNullOrEmpty(operationContainer.getToken()));
  }

  @Test
  void verifyThatIfContextIsNullOrEmptyExceptionIsThrown() {
    assertThrows(NullPointerException.class, () -> new OperationContainer(null, 1));

    assertThrows(NullPointerException.class, () -> new OperationContainer("", 1));
  }

  @Test
  void verifyThatConstructorInitializesObjectPropertiesWithValidSiteDirectoryContext() {
    var operationContainer = new OperationContainer(this.siteDirectoryContext, 1);
    assertNotNull(operationContainer.getOperations());

    assertEquals(1, operationContainer.getTopContainerRevisionNumber());
  }

  @Test
  void verifyThatConstructorInitializesObjectPropertiesWithInValidSiteDirectoryContext() {
    assertThrows(IllegalArgumentException.class, () -> new OperationContainer("/blah/123", 1));
    assertThrows(IllegalArgumentException.class, () -> new OperationContainer("/SiteDirectory/123", 1));
  }

  @Test
  void verifyThatConstructorInitializesObjectPropertiesWithValidIterationContext() {
    var operationContainer = new OperationContainer(this.iterationContext, 1);
    assertNotNull(operationContainer.getOperations());
  }

  @Test
  void verifyThatConstructorInitializesObjectPropertiesWithValidInvalidIterationContext() {
    assertThrows(IllegalArgumentException.class,
        () -> new OperationContainer("/EngineeringModel/123/iteration/456", 1));
    assertThrows(IllegalArgumentException.class, () -> new OperationContainer(
        "/EngineeringModel/5e5dc7f8-833d-4331-b421-eb2c64fcf64b/iteration/456", 1));
    assertThrows(IllegalArgumentException.class, () -> new OperationContainer(
        "/EngineeringModel/5e5dc7f8-833d-4331-b421-eb2c64fcf64b/blah/5e5dc7f8-833d-4331-b421-eb2c64fcf64b",
        1));
  }

  @Test
  void verifyExecutionOfOperationAddAndRemove() {
    var elementDefinition = new ElementDefinition(UUID.randomUUID(), 0);
    elementDefinition.getPartialRoutes().add("iteration/b58ea73d-350d-4520-b9d9-a52c75ac2b5d");
    elementDefinition.getPartialRoutes().add("EngineeringModel/5e5dc7f8-833d-4331-b421-eb2c64fcf64b");

    var clone = elementDefinition.deepClone(ElementDefinition.class);
    var operation = new Operation(elementDefinition, clone, OperationKind.UPDATE);

    var operationContainer = new OperationContainer(this.iterationContext, null);

    operationContainer.addOperation(operation);
    assertEquals(1, operationContainer.getOperations().size());

    operationContainer.removeOperation(operation);
    assertEquals(0, operationContainer.getOperations().size());
  }

  @Test
  void verifyThatResolveRouteThrowsExceptionWhenOperationsAreForMultipleTopContainers() {
    var engineeringModelIid_1 = UUID.randomUUID();
    var iterationIid_1 = UUID.randomUUID();
    var iteration_1 = new Iteration(iterationIid_1, 1);
    iteration_1.addContainer(ClassKind.EngineeringModel, engineeringModelIid_1);

    var topContainerContext = iteration_1.getTopContainerRoute();
    var operationContainer = new OperationContainer(topContainerContext, 1);

    var modifiedIteration_1 = new Iteration(iterationIid_1, 2);
    modifiedIteration_1.addContainer(ClassKind.EngineeringModel, engineeringModelIid_1);
    var operation_1 = new Operation(iteration_1, modifiedIteration_1, OperationKind.UPDATE);
    operationContainer.addOperation(operation_1);

    var engineeringModelIid_2 = UUID.randomUUID();
    var iterationIid_2 = UUID.randomUUID();
    var iteration_2 = new Iteration(iterationIid_2, 1);
    iteration_2.addContainer(ClassKind.EngineeringModel, engineeringModelIid_2);
    var modifiedIteration_2 = new Iteration(iterationIid_2, 2);
    modifiedIteration_2.addContainer(ClassKind.EngineeringModel, engineeringModelIid_2);
    var operation_2 = new Operation(iteration_2, modifiedIteration_2, OperationKind.UPDATE);
    assertThrows(IllegalArgumentException.class,
        () -> operationContainer.addOperation(operation_2));
  }
}
