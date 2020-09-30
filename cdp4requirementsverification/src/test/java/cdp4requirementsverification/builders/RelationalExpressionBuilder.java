/*
 * RelationalExpressionBuilder.java
 *
 * Copyright (c) 2015-2019 RHEA System S.A.
 *
 * Author: Alex Vorobiev, Yevhen Ikonnykov, Sam Gerené, Alexander van Delft
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

package cdp4requirementsverification.builders;

import cdp4common.engineeringmodeldata.RelationalExpression;
import cdp4common.engineeringmodeldata.RelationalOperatorKind;
import cdp4common.sitedirectorydata.ScalarParameterType;
import cdp4common.sitedirectorydata.SimpleQuantityKind;
import cdp4common.types.ValueArray;
import java.util.Arrays;
import java.util.UUID;

/**
 * Class that follows the builder pattern, to construct a {@link RelationalExpression}
 */
public class RelationalExpressionBuilder {
    /**
     * The {@link ScalarParameterType}
     */
    private ScalarParameterType parameterType;

    /**
     * The {@link ValueArray<String>}
     */
    private ValueArray<String> values;

    /**
     * The {@link RelationalOperatorKind}
     */
    private RelationalOperatorKind relationalOperatorKind;

    /**
     * Create a {@link SimpleQuantityKind} to be added to the {@link RelationalExpression} when the {@code build} method is used
     *
     * @return {@link RelationalExpressionBuilder} "this"
     */
    public RelationalExpressionBuilder withSimpleQuantityKindParameterType() {
        this.parameterType = new SimpleQuantityKind();

        return this;
    }

    /**
     * Create a {@link ValueArray<String>} to be added to the {@link RelationalExpression} when the {@code build} method is used
     *
     * @param value The value of the first element in the {@link ValueArray<String>}
     * @return {@link RelationalExpressionBuilder} "this"
     */
    public RelationalExpressionBuilder withValue(Object value) {
        this.values = new ValueArray<>(Arrays.asList(value.toString()), String.class);
        return this;
    }

    /**
     * Set the {@link RelationalOperatorKind} to be set on the {@link RelationalExpression} when the {@code build} method is used
     *
     * @param relationalOperatorKind value to set
     * @return {@link RelationalExpressionBuilder} "this"
     */
    public RelationalExpressionBuilder withRelationalOperatorKind(RelationalOperatorKind relationalOperatorKind) {
        this.relationalOperatorKind = relationalOperatorKind;

        return this;
    }

    /**
     * Construct a new {@link RelationalExpression}
     *
     * @return The {@link RelationalExpression}
     */
    public RelationalExpression build() {
      RelationalExpression relationalExpression = new RelationalExpression(UUID.randomUUID(), null, null);
        if (this.parameterType == null) {
            throw new NullPointerException("ParameterType is not set");
        }

        if (this.values == null) {
            throw new NullPointerException("Values are not set");
        }

        relationalExpression.setParameterType(this.parameterType);
        relationalExpression.setValue(this.values);
        relationalExpression.setRelationalOperator(this.relationalOperatorKind);

        return relationalExpression;
    }
}
