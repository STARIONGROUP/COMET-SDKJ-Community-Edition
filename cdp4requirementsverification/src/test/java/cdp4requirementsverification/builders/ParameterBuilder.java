/*
 * ParameterBuilder.java
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

import cdp4common.engineeringmodeldata.*;
import cdp4common.sitedirectorydata.ScalarParameterType;
import cdp4common.sitedirectorydata.SimpleQuantityKind;
import cdp4common.types.ValueArray;

import java.util.List;
import java.util.UUID;


/**
 * Class that follows the builder pattern, to construct a {@link Parameter}
 */
public class ParameterBuilder {
    /**
     * The {@link Option}
     */
    private Option option;

    /**
     * The {@link ScalarParameterType}
     */
    private ScalarParameterType parameterType;

    /**
     * The {@link ValueArray<String>}
     */
    private ValueArray<String> values;

    /**
     * The {@link ElementDefinition}
     */
    private ElementDefinition elementDefinition;

    /**
     * Add an {@link Option} to be added to the {@link Parameter} when the {@code build} method is used
     *
     * @param option The {@link Option}
     * @return {@link ParameterBuilder} "this"
     */
    public ParameterBuilder withOption(Option option) {
        this.option = option;

        return this;
    }

    /**
     * Create a {@link SimpleQuantityKind} to be added to the {@link Parameter} when the {@code build} method is used
     *
     * @return {@link ParameterBuilder} "this"
     */
    public ParameterBuilder withSimpleQuantityKindParameterType() {
        this.parameterType = new SimpleQuantityKind();

        return this;
    }

    /**
     * Create a {@link ValueArray<String>} to be added to the {@link Parameter} when the {@code build} method is used
     *
     * @param value The value of the first element in the {@link ValueArray<String>}
     * @return {@link ParameterBuilder} "this"
     */
    public ParameterBuilder withValue(Object value) {
        this.values = new ValueArray<>(List.of(value.toString()), String.class);

        return this;
    }

    /**
     * Sets the {@link ElementDefinition} that will be used to add the {@link Parameter} to after it is constructed in the {@code build} method
     *
     * @param elementDefinition The {@link ElementDefinition}
     * @return {@link ParameterBuilder} "this"
     */
    public ParameterBuilder addToElementDefinition(ElementDefinition elementDefinition) {
        this.elementDefinition = elementDefinition;

        return this;
    }

    /**
     * Construct a new {@link Parameter}
     *
     * @return The {@link Parameter}
     */
    public Parameter build() {
        var parameter = new Parameter(UUID.randomUUID(), null, null);
        if (this.parameterType == null) {
            throw new NullPointerException("ParameterType is not set");
        }
        parameter.setParameterType(this.parameterType);

        var parameterValueSet = new ParameterValueSet();
        parameterValueSet.setActualOption(this.option);
        parameterValueSet.setValueSwitch(ParameterSwitchKind.MANUAL);
        if (this.values == null) {
            throw new NullPointerException("Values are not set");
        }
        parameterValueSet.setManual(this.values);


        parameter.getValueSet().add(parameterValueSet);

        if (this.elementDefinition != null) {

            this.elementDefinition.getParameter().add(parameter);
        }
        return parameter;
    }
}
