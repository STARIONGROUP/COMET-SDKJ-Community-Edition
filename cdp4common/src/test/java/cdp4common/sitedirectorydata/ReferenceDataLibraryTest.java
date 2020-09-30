/*
 * ReferenceDataLibraryTest.java
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

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.UUID;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ReferenceDataLibraryTest {

  private ModelReferenceDataLibrary mRdl;
  private SiteReferenceDataLibrary sRdl1;
  private SiteReferenceDataLibrary sRdl11;
  private SiteReferenceDataLibrary sRdl2;

  @BeforeEach
  void setUp() {
    this.mRdl = new ModelReferenceDataLibrary();
    this.sRdl1 = new SiteReferenceDataLibrary();
    this.sRdl11 = new SiteReferenceDataLibrary();
    this.sRdl2 = new SiteReferenceDataLibrary();

    this.mRdl.setRequiredRdl(this.sRdl11);
    this.sRdl11.setRequiredRdl(this.sRdl1);
  }

  @Test
  void verifyThatGetRequiresRdlWorks() {
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

  @Test
  void verify_that_RequiredRdls_returns_expected_result() {
    List<ReferenceDataLibrary> expectedRdls = Arrays.asList(this.sRdl1, this.sRdl11);

    assertThat(this.mRdl.getRequiredRdls()).containsExactlyInAnyOrderElementsOf(expectedRdls);
  }

  @Test
  void verify_that_AggregateRdls_Returns_expected_result() {
    List<ReferenceDataLibrary> expectedRdls = Arrays.asList(this.mRdl, this.sRdl1, this.sRdl11);

    Collection<ReferenceDataLibrary> rdls = this.mRdl.getAggregatedReferenceDataLibrary();

    assertThat(rdls).containsExactlyInAnyOrderElementsOf(expectedRdls);
  }

  @Test
  void verify_that_QueryCategoriesFromChainOfRdls_returns_expected_result() {
    Category mRdl_category = new Category(UUID.randomUUID(), null, null);
    Category sRdl1_category = new Category(UUID.randomUUID(), null, null);
    Category sRdl11_category = new Category(UUID.randomUUID(), null, null);

    this.mRdl.getDefinedCategory().add(mRdl_category);
    this.sRdl1.getDefinedCategory().add(sRdl1_category);
    this.sRdl11.getDefinedCategory().add(sRdl11_category);

    assertThat(this.mRdl.queryCategoriesFromChainOfRdls()).containsExactlyInAnyOrderElementsOf(
        Arrays.asList(mRdl_category, sRdl1_category, sRdl11_category));
  }

  @Test
  void verify_that_QueryParameterTypesFromChainOfRdls_returns_expected_result() {
    TextParameterType mRdl_TextParameterType = new TextParameterType(UUID.randomUUID(), null, null);
    TextParameterType sRdl1_TextParameterType = new TextParameterType(UUID.randomUUID(), null, null);
    TextParameterType sRdl11_TextParameterType = new TextParameterType(UUID.randomUUID(), null, null);

    this.mRdl.getParameterType().add(mRdl_TextParameterType);
    this.sRdl1.getParameterType().add(sRdl1_TextParameterType);
    this.sRdl11.getParameterType().add(sRdl11_TextParameterType);

    assertThat(this.mRdl.queryParameterTypesFromChainOfRdls()).containsExactlyInAnyOrderElementsOf(
        Arrays.asList(mRdl_TextParameterType, sRdl1_TextParameterType, sRdl11_TextParameterType));
  }

  @Test
  void verify_that_QueryMeasurementScalesFromChainOfRdls_returns_expected_result() {
    RatioScale mRdl_RatioScale = new RatioScale(UUID.randomUUID(), null, null);
    RatioScale sRdl1_RatioScale = new RatioScale(UUID.randomUUID(), null, null);
    RatioScale sRdl11_RatioScale = new RatioScale(UUID.randomUUID(), null, null);

    this.mRdl.getScale().add(mRdl_RatioScale);
    this.sRdl1.getScale().add(sRdl1_RatioScale);
    this.sRdl11.getScale().add(sRdl11_RatioScale);

    assertThat(this.mRdl.queryMeasurementScalesFromChainOfRdls())
        .containsExactlyInAnyOrderElementsOf(
            Arrays.asList(mRdl_RatioScale, sRdl1_RatioScale, sRdl11_RatioScale));
  }

  @Test
  void verify_that_QueryUnitPrefixesFromChainOfRdls_returns_expected_result() {
    UnitPrefix mRdl_UnitPrefix = new UnitPrefix(UUID.randomUUID(), null, null);
    UnitPrefix sRdl1_UnitPrefix = new UnitPrefix(UUID.randomUUID(), null, null);
    UnitPrefix sRdl11_UnitPrefix = new UnitPrefix(UUID.randomUUID(), null, null);

    this.mRdl.getUnitPrefix().add(mRdl_UnitPrefix);
    this.sRdl1.getUnitPrefix().add(sRdl1_UnitPrefix);
    this.sRdl11.getUnitPrefix().add(sRdl11_UnitPrefix);

    assertThat(this.mRdl.queryUnitPrefixesFromChainOfRdls()).containsExactlyInAnyOrderElementsOf(
        Arrays.asList(mRdl_UnitPrefix, sRdl1_UnitPrefix, sRdl11_UnitPrefix));
  }

  @Test
  void verify_that_QueryMeasurementUnitsFromChainOfRdls_returns_expected_result() {
    SimpleUnit mRdl_MeasurementUnit = new SimpleUnit(UUID.randomUUID(), null, null);
    SimpleUnit sRdl1_MeasurementUnit = new SimpleUnit(UUID.randomUUID(), null, null);
    SimpleUnit sRdl11_MeasurementUnit = new SimpleUnit(UUID.randomUUID(), null, null);

    this.mRdl.getUnit().add(mRdl_MeasurementUnit);
    this.sRdl1.getUnit().add(sRdl1_MeasurementUnit);
    this.sRdl11.getUnit().add(sRdl11_MeasurementUnit);

    assertThat(this.mRdl.queryMeasurementUnitsFromChainOfRdls())
        .containsExactlyInAnyOrderElementsOf(
            Arrays.asList(mRdl_MeasurementUnit, sRdl1_MeasurementUnit, sRdl11_MeasurementUnit));
  }

  @Test
  void verify_that_QueryFileTypesFromChainOfRdls_returns_expected_result() {
    FileType mRdl_FileType = new FileType(UUID.randomUUID(), null, null);
    FileType sRdl1_FileType = new FileType(UUID.randomUUID(), null, null);
    FileType sRdl11_FileType = new FileType(UUID.randomUUID(), null, null);

    this.mRdl.getFileType().add(mRdl_FileType);
    this.sRdl1.getFileType().add(sRdl1_FileType);
    this.sRdl11.getFileType().add(sRdl11_FileType);

    assertThat(this.mRdl.queryFileTypesFromChainOfRdls()).containsExactlyInAnyOrderElementsOf(
        Arrays.asList(mRdl_FileType, sRdl1_FileType, sRdl11_FileType));
  }

  @Test
  void verify_that_QueryGlossariesFromChainOfRdls_returns_expected_result() {
    Glossary mRdl_Glossary = new Glossary(UUID.randomUUID(), null, null);
    Glossary sRdl1_Glossary = new Glossary(UUID.randomUUID(), null, null);
    Glossary sRdl11_Glossary = new Glossary(UUID.randomUUID(), null, null);

    this.mRdl.getGlossary().add(mRdl_Glossary);
    this.sRdl1.getGlossary().add(sRdl1_Glossary);
    this.sRdl11.getGlossary().add(sRdl11_Glossary);

    assertThat(this.mRdl.queryGlossariesFromChainOfRdls()).containsExactlyInAnyOrderElementsOf(
        Arrays.asList(mRdl_Glossary, sRdl1_Glossary, sRdl11_Glossary));
  }

  @Test
  void verify_that_QueryReferenceSourcesFromChainOfRdls_returns_expected_result() {
    ReferenceSource mRdl_ReferenceSource = new ReferenceSource(UUID.randomUUID(), null, null);
    ReferenceSource sRdl1_ReferenceSource = new ReferenceSource(UUID.randomUUID(), null, null);
    ReferenceSource sRdl11_ReferenceSource = new ReferenceSource(UUID.randomUUID(), null, null);

    this.mRdl.getReferenceSource().add(mRdl_ReferenceSource);
    this.sRdl1.getReferenceSource().add(sRdl1_ReferenceSource);
    this.sRdl11.getReferenceSource().add(sRdl11_ReferenceSource);

    assertThat(this.mRdl.queryReferenceSourcesFromChainOfRdls())
        .containsExactlyInAnyOrderElementsOf(
            Arrays.asList(mRdl_ReferenceSource, sRdl1_ReferenceSource, sRdl11_ReferenceSource));
    ;
  }

  @Test
  void verify_that_QueryRulesFromChainOfRdls_returns_expected_result() {
    BinaryRelationshipRule mRdl_Rule = new BinaryRelationshipRule(UUID.randomUUID(), null, null);
    BinaryRelationshipRule sRdl1_Rule = new BinaryRelationshipRule(UUID.randomUUID(), null, null);
    BinaryRelationshipRule sRdl11_Rule = new BinaryRelationshipRule(UUID.randomUUID(), null, null);

    this.mRdl.getRule().add(mRdl_Rule);
    this.sRdl1.getRule().add(sRdl1_Rule);
    this.sRdl11.getRule().add(sRdl11_Rule);

    assertThat(this.mRdl.queryRulesFromChainOfRdls()).containsExactlyInAnyOrderElementsOf(
        Arrays.asList(mRdl_Rule, sRdl1_Rule, sRdl11_Rule));
  }

  @Test
  void verify_that_QueryConstantsFromChainOfRdls_returns_expected_result() {
    Constant mRdl_Constant = new Constant(UUID.randomUUID(), null, null);
    Constant sRdl1_Constant = new Constant(UUID.randomUUID(), null, null);
    Constant sRdl11_Constant = new Constant(UUID.randomUUID(), null, null);

    this.mRdl.getConstant().add(mRdl_Constant);
    this.sRdl1.getConstant().add(sRdl1_Constant);
    this.sRdl11.getConstant().add(sRdl11_Constant);

    assertThat(this.mRdl.queryConstantsFromChainOfRdls()).containsExactlyInAnyOrderElementsOf(
        Arrays.asList(mRdl_Constant, sRdl1_Constant, sRdl11_Constant));
  }
}
