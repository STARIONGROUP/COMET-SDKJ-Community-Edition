/*
 * ValueValidatorTest.java
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

package cdp4common.validation;

import cdp4common.commondata.Thing;
import cdp4common.sitedirectorydata.*;
import cdp4common.types.CacheKey;
import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import org.apache.commons.lang3.tuple.Pair;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.net.URI;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Locale;
import java.util.UUID;

class ValueValidatorTest {
    private URI uri;
    private Cache<CacheKey, Thing> cache;

    private BooleanParameterType booleanParameterType;
    private DateParameterType dateParameterType;
    private DateTimeParameterType dateTimeParameterType;
    private EnumerationParameterType enumerationParameterType;
    private SimpleQuantityKind simpleQuantityKind;
    private TextParameterType textParameterType;
    private TimeOfDayParameterType timeOfDayParameterType;
    private RatioScale ratioScale;

    @BeforeEach
    void setup() {
        this.uri = URI.create("http://www.rheagroup.com");
        this.cache = CacheBuilder.newBuilder().build();

        this.ratioScale = new RatioScale(UUID.randomUUID(), this.cache, this.uri);

        EnumerationValueDefinition valuedefLow = new EnumerationValueDefinition(UUID.randomUUID(), this.cache, this.uri);
        valuedefLow.setShortName("low");
        EnumerationValueDefinition valuedefMedium = new EnumerationValueDefinition(UUID.randomUUID(), this.cache, this.uri);
        valuedefMedium.setShortName("medium");

        this.booleanParameterType = new BooleanParameterType(UUID.randomUUID(), this.cache, this.uri);
        this.dateParameterType = new DateParameterType(UUID.randomUUID(), this.cache, this.uri);
        this.dateTimeParameterType = new DateTimeParameterType(UUID.randomUUID(), this.cache, this.uri);

        this.enumerationParameterType = new EnumerationParameterType(UUID.randomUUID(), this.cache, this.uri);
        this.enumerationParameterType.setName("test");
        this.enumerationParameterType.getValueDefinition().add(valuedefLow);
        this.enumerationParameterType.getValueDefinition().add(valuedefMedium);

        this.simpleQuantityKind = new SimpleQuantityKind(UUID.randomUUID(), this.cache, this.uri);
        this.simpleQuantityKind.getAllPossibleScale().add(this.ratioScale);
        this.simpleQuantityKind.setDefaultScale(this.ratioScale);

        this.textParameterType = new TextParameterType(UUID.randomUUID(), this.cache, this.uri);
        this.timeOfDayParameterType = new TimeOfDayParameterType(UUID.randomUUID(), this.cache, this.uri);
    }

    @Test
    void verifyThatBooleanParameterTypeValidatesValue() {
        ValidationResult result;

        result = ValueValidator.validate(this.booleanParameterType, "-");
        Assertions.assertEquals(ValidationResultKind.VALID, result.getResultKind());
        Assertions.assertTrue(result.getMessage().isEmpty());

        result = ValueValidator.validate(this.booleanParameterType, true);
        Assertions.assertEquals(ValidationResultKind.VALID, result.getResultKind());
        Assertions.assertTrue(result.getMessage().isEmpty());

        result = ValueValidator.validate(this.booleanParameterType, false);
        Assertions.assertEquals(ValidationResultKind.VALID, result.getResultKind());
        Assertions.assertTrue(result.getMessage().isEmpty());

        result = ValueValidator.validate(this.booleanParameterType, 0);
        Assertions.assertEquals(ValidationResultKind.VALID, result.getResultKind());
        Assertions.assertTrue(result.getMessage().isEmpty());

        result = ValueValidator.validate(this.booleanParameterType, 1);
        Assertions.assertEquals(ValidationResultKind.VALID, result.getResultKind());
        Assertions.assertTrue(result.getMessage().isEmpty());

        result = ValueValidator.validate(this.booleanParameterType, -1);
        Assertions.assertEquals(ValidationResultKind.INVALID, result.getResultKind());
        Assertions.assertFalse(result.getMessage().isEmpty());

        result = ValueValidator.validate(this.booleanParameterType, "True");
        Assertions.assertEquals(ValidationResultKind.VALID, result.getResultKind());
        Assertions.assertTrue(result.getMessage().isEmpty());

        result = ValueValidator.validate(this.booleanParameterType, "False");
        Assertions.assertEquals(ValidationResultKind.VALID, result.getResultKind());
        Assertions.assertTrue(result.getMessage().isEmpty());

        result = ValueValidator.validate(this.booleanParameterType, "1");
        Assertions.assertEquals(ValidationResultKind.VALID, result.getResultKind());
        Assertions.assertTrue(result.getMessage().isEmpty());

        result = ValueValidator.validate(this.booleanParameterType, "0");
        Assertions.assertEquals(ValidationResultKind.VALID, result.getResultKind());
        Assertions.assertTrue(result.getMessage().isEmpty());

        result = ValueValidator.validate(this.booleanParameterType, "TRUE");
        Assertions.assertEquals(ValidationResultKind.VALID, result.getResultKind());
        Assertions.assertTrue(result.getMessage().isEmpty());

        result = ValueValidator.validate(this.booleanParameterType, "FALSE");
        Assertions.assertEquals(ValidationResultKind.VALID, result.getResultKind());
        Assertions.assertTrue(result.getMessage().isEmpty());

        result = ValueValidator.validate(this.booleanParameterType, "Falsch");
        Assertions.assertEquals(ValidationResultKind.INVALID, result.getResultKind());
        Assertions.assertEquals("Falsch is not a valid boolean, valid values are: -,true,false,True,False,1,0", result.getMessage());

        result = ValueValidator.validate(this.booleanParameterType, "-1");
        Assertions.assertEquals(ValidationResultKind.INVALID, result.getResultKind());
        Assertions.assertEquals("-1 is not a valid boolean, valid values are: -,true,false,True,False,1,0", result.getMessage());
    }

    @Test
    void verifyThatBooleanValidatesWithFrenchCulture() {
        Locale.setDefault(Locale.FRANCE);
        ValidationResult result;

        result = ValueValidator.validate(this.booleanParameterType, "-");
        Assertions.assertEquals(ValidationResultKind.VALID, result.getResultKind());
        Assertions.assertTrue(result.getMessage().isEmpty());

        result = ValueValidator.validate(this.booleanParameterType, "True");
        Assertions.assertEquals(ValidationResultKind.VALID, result.getResultKind());
        Assertions.assertTrue(result.getMessage().isEmpty());
    }

    @Test
    void VerifyThatDateParameterTypeValidatesValue_with_Z()
    {
        ValidationResult result = ValueValidator.validate(this.dateParameterType, "1976-08-20Z");
        Assertions.assertEquals(ValidationResultKind.INVALID, result.getResultKind());
        Assertions.assertEquals("1976-08-20Z is not a valid Date, valid dates are specified in ISO 8601 YYYY-MM-DD", result.getMessage());
    }

    @Test
    void verifyThatDateParameterTypeValidatesValue() {
        ValidationResult result;

        result = ValueValidator.validate(this.dateParameterType, "-");
        Assertions.assertEquals(ValidationResultKind.VALID, result.getResultKind());
        Assertions.assertTrue(result.getMessage().isEmpty());

        result = ValueValidator.validate(this.dateParameterType, "1976-08-20");
        Assertions.assertEquals(ValidationResultKind.VALID, result.getResultKind());
        Assertions.assertTrue(result.getMessage().isEmpty());

        result = ValueValidator.validate(this.dateParameterType, "some text");
        Assertions.assertEquals(ValidationResultKind.INVALID, result.getResultKind());
        Assertions.assertEquals("some text is not a valid Date, valid dates are specified in ISO 8601 YYYY-MM-DD", result.getMessage());

        result = ValueValidator.validate(this.dateParameterType, "2012-13-13");
        Assertions.assertEquals(ValidationResultKind.INVALID, result.getResultKind());
        Assertions.assertEquals("2012-13-13 is not a valid Date, valid dates are specified in ISO 8601 YYYY-MM-DD", result.getMessage());

        LocalDate date = LocalDate.of(2002, 12, 1);
        result = ValueValidator.validate(this.dateParameterType, date);
        Assertions.assertEquals(ValidationResultKind.VALID, result.getResultKind());
        Assertions.assertTrue(result.getMessage().isEmpty());

        LocalDateTime dateTime = LocalDateTime.of(2002, 12, 1, 1, 0, 1);
        result = ValueValidator.validate(this.dateParameterType, dateTime);
        Assertions.assertEquals(ValidationResultKind.INVALID, result.getResultKind());
        Assertions.assertFalse(result.getMessage().isEmpty());
    }

    @Test
    void verifyThatDateTimeParameterTypeValidatesValue() {
        ValidationResult result;

        result = ValueValidator.validate(this.dateTimeParameterType, "-");
        Assertions.assertEquals(ValidationResultKind.VALID, result.getResultKind());
        Assertions.assertTrue(result.getMessage().isEmpty());

        result = ValueValidator.validate(this.dateTimeParameterType, "2010-01-02T07:59:00Z");
        Assertions.assertEquals(ValidationResultKind.VALID, result.getResultKind());
        Assertions.assertTrue(result.getMessage().isEmpty());

        result = ValueValidator.validate(this.dateTimeParameterType, "2009-10-23T16:04:23.332+02");
        Assertions.assertEquals(ValidationResultKind.VALID, result.getResultKind());
        Assertions.assertTrue(result.getMessage().isEmpty());

        result = ValueValidator.validate(this.dateTimeParameterType, "2012-13-13T12:01:01+02");
        Assertions.assertEquals(ValidationResultKind.INVALID, result.getResultKind());

        LocalDateTime date = LocalDateTime.of(2002, 12, 1, 0, 0);
        result = ValueValidator.validate(this.dateTimeParameterType, date);
        Assertions.assertEquals(ValidationResultKind.VALID, result.getResultKind());
        Assertions.assertTrue(result.getMessage().isEmpty());
    }

    @Test
    void verifyThatEnumerationParameterTypeValidatesValue() {
        ValidationResult result;

        result = ValueValidator.validate(this.enumerationParameterType, "-");
        Assertions.assertEquals(ValidationResultKind.VALID, result.getResultKind());
        Assertions.assertTrue(result.getMessage().isEmpty());

        result = ValueValidator.validate(this.enumerationParameterType, "low");
        Assertions.assertEquals(ValidationResultKind.VALID, result.getResultKind());
        Assertions.assertTrue(result.getMessage().isEmpty());

        result = ValueValidator.validate(this.enumerationParameterType, "medium");
        Assertions.assertEquals(ValidationResultKind.VALID, result.getResultKind());
        Assertions.assertTrue(result.getMessage().isEmpty());

        result = ValueValidator.validate(this.enumerationParameterType, "high");
        Assertions.assertEquals(ValidationResultKind.INVALID, result.getResultKind());
        Assertions.assertEquals("The test Enumeration ParameterType does not contain the following value definition high, allowed values are: low, medium", result.getMessage());

        this.enumerationParameterType.setAllowMultiSelect(true);
        result = ValueValidator.validate(this.enumerationParameterType, "low | medium");
        Assertions.assertEquals(ValidationResultKind.VALID, result.getResultKind());
        Assertions.assertTrue(result.getMessage().isEmpty());
    }

    @Test
    void verifyThatSimpleQuantityKindValidatesDefaultValue() {
        ValidationResult result;

        result = ValueValidator.validate(this.simpleQuantityKind, this.ratioScale, "-", null);
        Assertions.assertEquals(ValidationResultKind.VALID, result.getResultKind());
        Assertions.assertTrue(result.getMessage().isEmpty());
    }

    @Test
    void verifyThatSimpleQuantityKindValidatesNonDefaultValue() {
        ValidationResult result;

        this.ratioScale.setNumberSet(NumberSetKind.NATURAL_NUMBER_SET);
        result = ValueValidator.validate(this.simpleQuantityKind, this.ratioScale, "13", null);
        Assertions.assertEquals(ValidationResultKind.VALID, result.getResultKind());
        Assertions.assertTrue(result.getMessage().isEmpty());
    }

    @Test
    void verifyThatSimpleQuantityKindValidatesIntegerNumberSet() {
        ValidationResult result;
        this.ratioScale.setNumberSet(NumberSetKind.INTEGER_NUMBER_SET);

        String stringValue = "-13";
        result = ValueValidator.validate(this.simpleQuantityKind, this.ratioScale, stringValue, null);
        Assertions.assertEquals(ValidationResultKind.VALID, result.getResultKind());
        Assertions.assertTrue(result.getMessage().isEmpty());

        int intValue = -13;
        result = ValueValidator.validate(this.simpleQuantityKind, this.ratioScale, intValue, null);
        Assertions.assertEquals(ValidationResultKind.VALID, result.getResultKind());
        Assertions.assertTrue(result.getMessage().isEmpty());

        double intdoubleValue = -13d;
        result = ValueValidator.validate(this.simpleQuantityKind, this.ratioScale, intdoubleValue, null);
        Assertions.assertEquals(ValidationResultKind.VALID, result.getResultKind());
        Assertions.assertTrue(result.getMessage().isEmpty());

        double doubleValue = -13.001d;
        result = ValueValidator.validate(this.simpleQuantityKind, this.ratioScale, doubleValue, null);
        Assertions.assertEquals(ValidationResultKind.INVALID, result.getResultKind());
        Assertions.assertFalse(result.getMessage().isEmpty());
    }

    @Test
    void verifyThatSimpleQuantityKindValidatesNaturalNumberSet() {
        ValidationResult result;
        this.ratioScale.setNumberSet(NumberSetKind.NATURAL_NUMBER_SET);

        String stringValue = "+13";
        result = ValueValidator.validate(this.simpleQuantityKind, this.ratioScale, stringValue, null);
        Assertions.assertEquals(ValidationResultKind.VALID, result.getResultKind());
        Assertions.assertTrue(result.getMessage().isEmpty());

        String stringNegativeValue = "-13";
        result = ValueValidator.validate(this.simpleQuantityKind, this.ratioScale, stringNegativeValue, null);
        Assertions.assertEquals(ValidationResultKind.INVALID, result.getResultKind());
        Assertions.assertFalse(result.getMessage().isEmpty());

        int intValue = +13;
        result = ValueValidator.validate(this.simpleQuantityKind, this.ratioScale, intValue, null);
        Assertions.assertEquals(ValidationResultKind.VALID, result.getResultKind());
        Assertions.assertTrue(result.getMessage().isEmpty());

        int intNegativeValue = -13;
        result = ValueValidator.validate(this.simpleQuantityKind, this.ratioScale, intNegativeValue, null);
        Assertions.assertEquals(ValidationResultKind.INVALID, result.getResultKind());
        Assertions.assertFalse(result.getMessage().isEmpty());

        double intdoubleValue = +13d;
        result = ValueValidator.validate(this.simpleQuantityKind, this.ratioScale, intdoubleValue, null);
        Assertions.assertEquals(ValidationResultKind.VALID, result.getResultKind());
        Assertions.assertTrue(result.getMessage().isEmpty());

        double intdoubleNegativeValue = -13d;
        result = ValueValidator.validate(this.simpleQuantityKind, this.ratioScale, intdoubleNegativeValue, null);
        Assertions.assertEquals(ValidationResultKind.INVALID, result.getResultKind());
        Assertions.assertFalse(result.getMessage().isEmpty());

        double doubleValue = +13.001d;
        result = ValueValidator.validate(this.simpleQuantityKind, this.ratioScale, doubleValue, null);
        Assertions.assertEquals(ValidationResultKind.INVALID, result.getResultKind());
        Assertions.assertFalse(result.getMessage().isEmpty());
    }

    @Test
    void verifyThatSimpleQuantityKindValidatesRealNumberSet() {
        ValidationResult result;
        this.ratioScale.setNumberSet(NumberSetKind.REAL_NUMBER_SET);

        String stringValue = "13.1e1";
        result = ValueValidator.validate(this.simpleQuantityKind, this.ratioScale, stringValue, null);
        Assertions.assertEquals(ValidationResultKind.VALID, result.getResultKind());
        Assertions.assertTrue(result.getMessage().isEmpty());

        double doubleValue = 13d;
        result = ValueValidator.validate(this.simpleQuantityKind, this.ratioScale, doubleValue, null);
        Assertions.assertEquals(ValidationResultKind.VALID, result.getResultKind());
        Assertions.assertTrue(result.getMessage().isEmpty());

        int intValue = -13;
        result = ValueValidator.validate(this.simpleQuantityKind, this.ratioScale, intValue, null);
        Assertions.assertEquals(ValidationResultKind.VALID, result.getResultKind());
        Assertions.assertTrue(result.getMessage().isEmpty());
    }

    @Test
    void verifyThatSimpleQuantityKindValidatesRealWithFrenchCulture() {
        Locale.setDefault(Locale.FRANCE);
        ValidationResult result;

        this.ratioScale.setNumberSet(NumberSetKind.REAL_NUMBER_SET);
        result = ValueValidator.validate(this.simpleQuantityKind, this.ratioScale, "13.1e1", null);
        Assertions.assertEquals(ValidationResultKind.VALID, result.getResultKind());
        Assertions.assertTrue(result.getMessage().isEmpty());
    }

    @Test
    void verifyThatSimpleQuantityKindInValidatesRealCommaSeparator() {
        ValidationResult result;
        this.ratioScale.setNumberSet(NumberSetKind.REAL_NUMBER_SET);
        result = ValueValidator.validate(this.simpleQuantityKind, this.ratioScale, "131,1", null);
        Assertions.assertEquals(ValidationResultKind.INVALID, result.getResultKind());
        Assertions.assertFalse(result.getMessage().isEmpty());
    }

    @Test
    void verifyThatWithNumberFormatInfoSimpleQuantityKindValidatesRealCommaSeparator() {
        DecimalFormat format;
        format = (DecimalFormat) NumberFormat.getInstance();
        DecimalFormatSymbols symbols = format.getDecimalFormatSymbols();
        symbols.setDecimalSeparator(',');
        symbols.setGroupingSeparator('.');
        format.setDecimalFormatSymbols(symbols);

        ValidationResult result;
        this.ratioScale.setNumberSet(NumberSetKind.REAL_NUMBER_SET);
        result = ValueValidator.validate(this.simpleQuantityKind, this.ratioScale, "131,1", format);
        Assertions.assertEquals(ValidationResultKind.VALID, result.getResultKind());
        Assertions.assertTrue(result.getMessage().isEmpty());
    }

    @Test
    void verifyThatSimpleQuantityKindValidatesInvalidValue() {
        ValidationResult result;

        this.ratioScale.setNumberSet(NumberSetKind.REAL_NUMBER_SET);

        result = ValueValidator.validate(this.simpleQuantityKind, this.ratioScale, "a", null);
        Assertions.assertEquals(ValidationResultKind.INVALID, result.getResultKind());
        Assertions.assertEquals("String:\"a\" is not a member of the REAL NUMBER SET", result.getMessage());
    }

    @Test
    void verifyThatTextParameterTypeValidatesValue() {
        ValidationResult result;

        result = ValueValidator.validate(this.textParameterType, "-");
        Assertions.assertEquals(ValidationResultKind.VALID, result.getResultKind());
        Assertions.assertTrue(result.getMessage().isEmpty());
    }

    @Test
    void verifyThatTimeOfDayParameterTypeValidatesValue() {
        ValidationResult result;

        result = ValueValidator.validate(this.timeOfDayParameterType, "-");
        Assertions.assertEquals(ValidationResultKind.VALID, result.getResultKind());
        Assertions.assertTrue(result.getMessage().isEmpty());

        result = ValueValidator.validate(this.timeOfDayParameterType, "10:15:49");
        Assertions.assertEquals(ValidationResultKind.VALID, result.getResultKind());
        Assertions.assertTrue(result.getMessage().isEmpty());

        result = ValueValidator.validate(this.timeOfDayParameterType, "17:49:30.453Z");
        Assertions.assertEquals(ValidationResultKind.VALID, result.getResultKind());
        Assertions.assertTrue(result.getMessage().isEmpty());

        result = ValueValidator.validate(this.timeOfDayParameterType, "17:49:30.453+01:00");
        Assertions.assertEquals(ValidationResultKind.VALID, result.getResultKind());
        Assertions.assertTrue(result.getMessage().isEmpty());

        result = ValueValidator.validate(this.timeOfDayParameterType, "17:49:30.453+01");
        Assertions.assertEquals(ValidationResultKind.VALID, result.getResultKind());
        Assertions.assertTrue(result.getMessage().isEmpty());

        result = ValueValidator.validate(this.timeOfDayParameterType, "17:49:30.453Z+01:00");
        Assertions.assertEquals(ValidationResultKind.INVALID, result.getResultKind());
        Assertions.assertFalse(result.getMessage().isEmpty());

        result = ValueValidator.validate(this.timeOfDayParameterType, "17:49:30+01:00");
        Assertions.assertEquals(ValidationResultKind.VALID, result.getResultKind());
        Assertions.assertTrue(result.getMessage().isEmpty());

        result = ValueValidator.validate(this.timeOfDayParameterType, "17:49:30+01");
        Assertions.assertEquals(ValidationResultKind.VALID, result.getResultKind());
        Assertions.assertTrue(result.getMessage().isEmpty());

        result = ValueValidator.validate(this.timeOfDayParameterType, "17:49:30Z+01:00");
        Assertions.assertEquals(ValidationResultKind.INVALID, result.getResultKind());
        Assertions.assertFalse(result.getMessage().isEmpty());

        result = ValueValidator.validate(this.timeOfDayParameterType, "25:23");
        Assertions.assertEquals(ValidationResultKind.INVALID, result.getResultKind());
        Assertions.assertEquals("25:23 is not a valid Time of Day, for valid Time Of Day formats see http://www.w3.org/TR/xmlschema-2/#time.", result.getMessage());

        LocalTime localTime = LocalTime.parse("10:15:49");
        result = ValueValidator.validate(this.timeOfDayParameterType, localTime);
        Assertions.assertEquals(ValidationResultKind.VALID, result.getResultKind());

        result = ValueValidator.validate(this.timeOfDayParameterType, false);
        Assertions.assertEquals(ValidationResultKind.INVALID, result.getResultKind());
        Assertions.assertFalse(result.getMessage().isEmpty());
    }
}
