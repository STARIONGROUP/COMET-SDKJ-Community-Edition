/*
 * ThingTransactionImplTest.java
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
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import cdp4common.commondata.ClassKind;
import cdp4common.commondata.Definition;
import cdp4common.commondata.Thing;
import cdp4common.engineeringmodeldata.ElementDefinition;
import cdp4common.engineeringmodeldata.EngineeringModel;
import cdp4common.engineeringmodeldata.Iteration;
import cdp4common.engineeringmodeldata.Option;
import cdp4common.sitedirectorydata.BinaryRelationshipRule;
import cdp4common.sitedirectorydata.DerivedUnit;
import cdp4common.sitedirectorydata.EmailAddress;
import cdp4common.sitedirectorydata.EnumerationParameterType;
import cdp4common.sitedirectorydata.EnumerationValueDefinition;
import cdp4common.sitedirectorydata.IterationSetup;
import cdp4common.sitedirectorydata.Person;
import cdp4common.sitedirectorydata.SiteDirectory;
import cdp4common.sitedirectorydata.SiteReferenceDataLibrary;
import cdp4common.sitedirectorydata.TelephoneNumber;
import cdp4common.sitedirectorydata.UnitFactor;
import cdp4common.types.CacheKey;
import cdp4dal.exceptions.TransactionException;
import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import com.google.common.collect.MoreCollectors;
import java.net.URI;
import java.util.UUID;
import java.util.stream.Collectors;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ThingTransactionImplTest {

  private SiteDirectory siteDirectory;
  private EngineeringModel engineeringModel;
  private Iteration iteration;

  private Cache<CacheKey, Thing> cache;

  private URI uri = URI.create("http://www.rheagroup.com");


  @BeforeEach
  void setup() {
    this.cache = CacheBuilder.newBuilder().build();
    this.siteDirectory = new SiteDirectory(UUID.randomUUID(), this.cache, this.uri);
    this.engineeringModel = new EngineeringModel(UUID.randomUUID(), this.cache, this.uri);

    this.iteration = new Iteration(UUID.randomUUID(), this.cache, this.uri);
    var iterationSetup = new IterationSetup(UUID.randomUUID(), this.cache, this.uri);
    iterationSetup.setRevisionNumber(1);
    this.iteration.setIterationSetup(iterationSetup);
    iterationSetup.setIterationIid(this.iteration.getIid());

    this.engineeringModel.getIteration().add(this.iteration);

    this.cache.put(new CacheKey(this.siteDirectory.getIid(), null), this.siteDirectory);
    this.cache.put(new CacheKey(this.engineeringModel.getIid(), null), this.engineeringModel);
    this.cache.put(new CacheKey(this.iteration.getIid(), null), this.iteration);
  }

  @Test
  void verifyThatCanOnlyUseThingTransactionOnOneTopContainer() throws TransactionException {
    var transactionContext = TransactionContextResolver.resolveContext(this.siteDirectory);

    var person = new Person(UUID.randomUUID(), this.cache, this.uri);
    person.setContainer(this.siteDirectory);
    var transaction = new ThingTransactionImpl(transactionContext, person);

    var duplicateSiteDirectory = new SiteDirectory(this.siteDirectory.getIid(), this.cache,
        this.uri);
    var anotherPerson = new Person(UUID.randomUUID(), this.cache, this.uri);
    anotherPerson.setContainer(duplicateSiteDirectory);
    transaction.createOrUpdate(anotherPerson);

    var operationContainer = transaction.finalizeTransaction();

    assertEquals(2, operationContainer.getOperations().size());
  }

  @Test
  void verifyThatCreateThingWorks() throws TransactionException {
    var person = new Person(UUID.randomUUID(), this.cache, this.uri);
    person.setContainer(this.siteDirectory);
    this.cache.put(new CacheKey(person.getIid(), null), person);

    var clonePerson = person.clone(false);

    var transactionContext = TransactionContextResolver.resolveContext(this.siteDirectory);
    var transaction = new ThingTransactionImpl(transactionContext, clonePerson);

    var phone = new TelephoneNumber();
    transaction.create(phone, clonePerson);

    assertEquals(1, transaction.getAddedThing().size());
    assertEquals(1, transaction.getUpdatedThing().size());
  }

  @Test
  void verifyThatCreateThingWorksWithAbstractContainer() throws TransactionException {
    var siteRdl = new SiteReferenceDataLibrary(UUID.randomUUID(), this.cache, this.uri);
    siteRdl.setContainer(this.siteDirectory);
    this.cache.put(new CacheKey(siteRdl.getIid(), null), siteRdl);

    var cloneRdl = siteRdl.clone(false);

    var transactionContext = TransactionContextResolver.resolveContext(this.siteDirectory);
    var transaction = new ThingTransactionImpl(transactionContext, cloneRdl);

    var binaryRelationshipRule = new BinaryRelationshipRule(UUID.randomUUID(), null, null);

    transaction.create(binaryRelationshipRule, cloneRdl);

    assertEquals(1, transaction.getAddedThing().size());
    assertEquals(1, transaction.getUpdatedThing().size());
  }

  @Test
  void verifyThatCreateModelDoesNotWorks() {
    var newModel = new EngineeringModel(UUID.randomUUID(), this.cache, this.uri);

    var transactionContext = TransactionContextResolver.resolveContext(this.siteDirectory);

    assertThrows(IllegalArgumentException.class,
        () -> new ThingTransactionImpl(transactionContext, newModel));
  }

  @Test
  void verifyThatCreateSiteDirDoesNotWorks() {
    var newSiteDirectory = new SiteDirectory(UUID.randomUUID(), this.cache, this.uri);

    var transactionContext = TransactionContextResolver.resolveContext(this.siteDirectory);

    assertThrows(IllegalArgumentException.class,
        () -> new ThingTransactionImpl(transactionContext, newSiteDirectory));
  }

  @Test
  void verifyThatCreateIterationDoesNotWorks() {
    var newIteration = new Iteration(UUID.randomUUID(), this.cache, this.uri);

    var transactionContext = TransactionContextResolver.resolveContext(this.siteDirectory);

    assertThrows(IllegalArgumentException.class,
        () -> new ThingTransactionImpl(transactionContext, newIteration));
  }

  @Test
  void verifyThatCreateThingTwiceDoesntThrowException() throws TransactionException {
    var transactionContext = TransactionContextResolver.resolveContext(this.siteDirectory);
    var transaction = new ThingTransactionImpl(transactionContext, this.siteDirectory.clone(false));
    var phone = new TelephoneNumber(UUID.randomUUID(), this.cache, this.uri);
    transaction.create(phone, null);
    transaction.create(phone, null);
  }

  @Test
  void verifyThatUpdateThingWorks() throws TransactionException {
    var phone = new TelephoneNumber(UUID.randomUUID(), this.cache, this.uri);
    this.cache.put(new CacheKey(phone.getIid(), null), phone);

    var clone = phone.clone(false);

    var transactionContext = TransactionContextResolver.resolveContext(this.siteDirectory);
    var transaction = new ThingTransactionImpl(transactionContext, clone);

    transaction.createOrUpdate(clone);
    assertEquals(1, transaction.getUpdatedThing().size());
  }

  @Test
  void verifyThatUpdateThingThrowsExceptionUponUpdatingExistingCloneWithAnotherClone()
      throws TransactionException {
    var phone = new TelephoneNumber(UUID.randomUUID(), this.cache, this.uri);
    this.cache.put(new CacheKey(phone.getIid(), null), phone);

    var clone1 = phone.clone(false);
    var clone2 = phone.clone(false);

    var transactionContext = TransactionContextResolver.resolveContext(this.siteDirectory);
    var transaction = new ThingTransactionImpl(transactionContext, clone1);

    transaction.createOrUpdate(clone1);
    transaction.createOrUpdate(clone2);

    assertTrue(transaction.getUpdatedThing().containsValue(clone1));
    assertFalse(transaction.getUpdatedThing().containsValue(clone2));
  }

  @Test
  void verifyThatDeleteThingAlreadyDeletedWorks() throws TransactionException {
    var person = new Person(UUID.randomUUID(), this.cache, this.uri);
    var email = new EmailAddress(UUID.randomUUID(), this.cache, this.uri);
    this.siteDirectory.getPerson().add(person);
    person.getEmailAddress().add(email);

    this.cache.put(new CacheKey(person.getIid(), null), person);
    this.cache.put(new CacheKey(email.getIid(), null), email);

    var transactionContext = TransactionContextResolver.resolveContext(this.siteDirectory);
    var transaction = new ThingTransactionImpl(transactionContext, person.clone(false));
    transaction.delete(email.clone(false), null);
    transaction.delete(email.clone(false), null);

    assertEquals(1, transaction.getDeletedThing().size());
  }

  @Test
  void verifyThatUpdateContainerWorks() throws TransactionException {

    var iterationClone = this.iteration.clone(false);
    var option1 = new Option(UUID.randomUUID(), this.cache, this.uri);

    var transactionContext = TransactionContextResolver.resolveContext(this.iteration);
    var transaction = new ThingTransactionImpl(transactionContext, iterationClone);
    transaction.createOrUpdate(iterationClone);

    // Add new option
    var optionTransaction = new ThingTransactionImpl(option1, transaction, iterationClone);
    optionTransaction.create(option1, null);
    optionTransaction.finalizeSubTransaction(option1, iterationClone, null);

    var clone = (Iteration) transaction.getClone(this.iteration);
    assertEquals(1, clone.getOption().size());
    assertEquals(0, iteration.getOption().size());

    // insert an option
    var option2 = new Option(UUID.randomUUID(), this.cache, this.uri);

    optionTransaction = new ThingTransactionImpl(option2, transaction, iterationClone);
    optionTransaction.create(option2, null);
    optionTransaction.finalizeSubTransaction(option2, iterationClone, option1);
    assertEquals(0, this.iteration.getOption().size());
    assertEquals(2, clone.getOption().size());
  }

  /**
   * create a containment tree under site directory and update
   */
  @Test
  void functionalTestCase1() throws TransactionException {
    var person1 = new Person();
    var phone = new TelephoneNumber();
    var cloneSiteDir = this.siteDirectory.clone(false);

    var transactionContext = TransactionContextResolver.resolveContext(this.siteDirectory);
    var rootTransaction = new ThingTransactionImpl(transactionContext, cloneSiteDir);
    rootTransaction.createOrUpdate(cloneSiteDir);

    var personTransaction = new ThingTransactionImpl(person1, rootTransaction, cloneSiteDir);
    personTransaction.create(person1, null);

    assertEquals(1, personTransaction.getAddedThing().size());
    assertEquals(1, personTransaction.getUpdatedThing().size());

    // phone dialog
    var phoneTransaction = new ThingTransactionImpl(phone, personTransaction, person1);
    phoneTransaction.create(phone, null);
    assertEquals(2, phoneTransaction.getAddedThing().size());
    assertEquals(0, phoneTransaction.getUpdatedThing().size());

    // ok phone, verify that phone is added to the person and to the transaction
    phoneTransaction.finalizeSubTransaction(phone, person1, null);

    assertEquals(2, personTransaction.getAddedThing().size());
    assertTrue(personTransaction.getAddedThing().stream().anyMatch(x -> x == person1));
    assertTrue(personTransaction.getAddedThing().stream().anyMatch(x -> x == phone));

    // ok person1, verify that SiteDir contains the person
    personTransaction.finalizeSubTransaction(person1, cloneSiteDir, null);

    assertTrue(cloneSiteDir.getPerson().contains(person1));

    assertEquals(2, rootTransaction.getAddedThing().size());
    assertEquals(1, rootTransaction.getUpdatedThing().size());

    // update person1
    var person1_1 = person1.clone(false);
    var person1_1Tr = new ThingTransactionImpl(person1_1, rootTransaction, cloneSiteDir);
    person1_1Tr.createOrUpdate(person1_1);

    assertEquals(1, person1_1Tr.getAddedThing().size());
    assertEquals(1, person1_1Tr.getUpdatedThing().size());

    // add email
    var email = new EmailAddress();
    var emailTrans = new ThingTransactionImpl(email, person1_1Tr, person1_1);
    emailTrans.create(email, null);

    emailTrans.finalizeSubTransaction(email, person1_1, null);
    // end add email, verify that email is added to person1_1, (the clone of person1)

    assertEquals(2, person1_1Tr.getAddedThing().size());
    assertEquals(1, person1_1Tr.getUpdatedThing().size());
    assertTrue(person1_1.getEmailAddress().contains(email));

    // update phone
    var phone_1 = phone.clone(false);
    var phone_1Trans = new ThingTransactionImpl(phone_1, person1_1Tr, person1_1);
    phone_1Trans.createOrUpdate(phone_1);
    phone_1Trans.finalizeSubTransaction(phone_1, person1_1, null);
    // end update phone

    // verify that the new reference is used
    assertFalse(person1_1.getTelephoneNumber().contains(phone));
    assertTrue(person1_1.getTelephoneNumber().contains(phone_1));

    person1_1Tr.finalizeSubTransaction(person1_1, cloneSiteDir, null);

    assertEquals(3, rootTransaction.getAddedThing().size());
    assertEquals(1, rootTransaction.getUpdatedThing().size());
    assertTrue(rootTransaction.getAddedThing().stream().anyMatch(x -> x == person1_1));
    assertTrue(cloneSiteDir.getPerson().contains(person1_1));
    assertTrue(rootTransaction.getAddedThing().contains(phone_1));
    assertEquals(1, cloneSiteDir.getPerson().size());

    // create new person
    var person2 = new Person();
    var person2Trans = new ThingTransactionImpl(person2, rootTransaction, cloneSiteDir);
    person2Trans.create(person2, null);
    person2Trans.finalizeSubTransaction(person2, cloneSiteDir, null);

    assertEquals(4, rootTransaction.getAddedThing().size());
    assertEquals(2, cloneSiteDir.getPerson().size());

    // update person1
    var person1_2 = person1_1.clone(false);
    var person1_2Trans = new ThingTransactionImpl(person1_2, rootTransaction, cloneSiteDir);
    person1_2Trans.createOrUpdate(person1_2);

    // create email2
    var email2 = new EmailAddress();
    var email2Trans = new ThingTransactionImpl(email2, person1_2Trans, person1_2);
    email2Trans.create(email2, null);

    // verify that current Person is in the transaction
    var persons = email2Trans.getAddedThing().stream().filter(x -> x instanceof Person)
        .collect(Collectors.toList());
    assertEquals(1, persons.size());
    assertTrue(persons.contains(person1_2));
    assertFalse(persons.stream().anyMatch(x -> x.getIid().equals(person2.getIid())));

    email2Trans.finalizeSubTransaction(email2, person1_2, null);

    // update phone
    var phone_2 = phone_1.clone(false);
    var phone_2Trans = new ThingTransactionImpl(phone_2, person1_2Trans, person1_2);
    phone_2Trans.createOrUpdate(phone_2);

    assertNull(phone_2Trans.getClone(person2));

    var person2clone = person2.clone(false);
    phone_2Trans.finalizeSubTransaction(phone_2, person2clone, null);
    assertTrue(phone_2Trans.getAddedThing().contains(person2clone));
    assertEquals(0, phone_2Trans.getUpdatedThing().size());
    assertTrue(person2clone.getTelephoneNumber().contains(phone_2));
    assertFalse(person1_2.getTelephoneNumber().contains(phone_2));

    person1_2Trans.finalizeSubTransaction(person1_2, cloneSiteDir, null);

    assertTrue(cloneSiteDir.getPerson().contains(person2clone));
    assertTrue(cloneSiteDir.getPerson().contains(person1_2));
    assertEquals(2, cloneSiteDir.getPerson().size());
    assertEquals(2, person1_2.getEmailAddress().size());

    assertEquals(5, rootTransaction.getAddedThing().size());
    assertEquals(1, rootTransaction.getUpdatedThing().size());
    var per1 = (Person) rootTransaction.getAddedThing().stream()
        .filter(x -> x.getIid().equals(person1.getIid())).collect(MoreCollectors.onlyElement());
    var per2 = (Person) rootTransaction.getAddedThing().stream()
        .filter(x -> x.getIid().equals(person2.getIid())).collect(MoreCollectors.onlyElement());
    var emailad1 = rootTransaction.getAddedThing().stream()
        .filter(x -> x.getIid().equals(email.getIid())).collect(MoreCollectors.onlyElement());
    var emailad2 = rootTransaction.getAddedThing().stream()
        .filter(x -> x.getIid().equals(email2.getIid())).collect(MoreCollectors.onlyElement());
    var tel = rootTransaction.getAddedThing().stream()
        .filter(x -> x.getIid().equals(phone.getIid())).collect(MoreCollectors.onlyElement());

    assertTrue(per1.getEmailAddress().contains(emailad1));
    assertTrue(per1.getEmailAddress().contains(emailad2));
    assertFalse(per1.getTelephoneNumber().contains(tel));

    assertTrue(per2.getTelephoneNumber().contains(tel));

    var sitedir = (SiteDirectory) rootTransaction.getUpdatedThing().entrySet().stream()
        .collect(MoreCollectors.onlyElement()).getValue();
    assertSame(sitedir, cloneSiteDir);
    assertTrue(sitedir.getPerson().contains(per1));
    assertTrue(sitedir.getPerson().contains(per2));
  }

  /**
   * Updating existing things
   */
  @Test
  void functionalTestCase2() throws TransactionException {
    var siterdl = new SiteReferenceDataLibrary(UUID.randomUUID(), this.cache, this.uri);
    this.siteDirectory.getSiteReferenceDataLibrary().add(siterdl);

    var unit1 = new DerivedUnit(UUID.randomUUID(), this.cache, this.uri);
    siterdl.getUnit().add(unit1);

    var unitFactor1 = new UnitFactor(UUID.randomUUID(), this.cache, this.uri);
    unit1.getUnitFactor().add(unitFactor1);

    this.cache.put(new CacheKey(siterdl.getIid(), null), siterdl);
    this.cache.put(new CacheKey(unit1.getIid(), null), unit1);
    this.cache.put(new CacheKey(unitFactor1.getIid(), null), unitFactor1);

    // *******************************************************************
    var siteDirClone = this.siteDirectory.clone(false);

    var transactionContext = TransactionContextResolver.resolveContext(this.siteDirectory);
    var rootTransaction = new ThingTransactionImpl(transactionContext, siteDirClone);
    rootTransaction.createOrUpdate(siteDirClone);

    var siterdlC1 = siterdl.clone(false);
    var siterdlC1Trans = new ThingTransactionImpl(siterdlC1, rootTransaction, siteDirClone);
    siterdlC1Trans.createOrUpdate(siterdlC1);

    var unit1C1 = unit1.clone(false);
    var unit1C1Trans = new ThingTransactionImpl(unit1C1, siterdlC1Trans, siterdlC1);
    unit1C1Trans.createOrUpdate(unit1C1);

    var unitFactor1C1 = unitFactor1.clone(false);
    var unitFactor1C1Trans = new ThingTransactionImpl(unitFactor1C1, unit1C1Trans, unit1C1);
    unitFactor1C1Trans.createOrUpdate(unitFactor1C1);

    unitFactor1C1Trans.finalizeSubTransaction(unitFactor1C1, unit1C1, null);

    // Add unitfactor
    var unitFactor2 = new UnitFactor();
    var unitFactor2Trans = new ThingTransactionImpl(unitFactor2, unit1C1Trans, unit1C1);
    unitFactor2Trans.create(unitFactor2, null);
    unitFactor2Trans.finalizeSubTransaction(unitFactor2, unit1C1, null);

    unit1C1Trans.finalizeSubTransaction(unit1C1, siterdlC1, null);

    siterdlC1Trans.finalizeSubTransaction(siterdlC1, siteDirClone, null);

    assertTrue(rootTransaction.getAddedThing().contains(unitFactor2));
    assertEquals(4, rootTransaction.getUpdatedThing().size());

    assertEquals(2, unit1C1.getUnitFactor().size());
    assertTrue(unit1C1.getUnitFactor().contains(unitFactor2));
    assertTrue(unit1C1.getUnitFactor().contains(unitFactor1C1));

    // Add srdl2
    var srdl2 = new SiteReferenceDataLibrary();
    var srdl2Trans = new ThingTransactionImpl(srdl2, rootTransaction, siteDirClone);
    srdl2Trans.create(srdl2, null);

    // add unit
    var unit2 = new DerivedUnit();
    var unit2Trans = new ThingTransactionImpl(unit2, srdl2Trans, srdl2);
    unit2Trans.create(unit2, null);
    unit2Trans.finalizeSubTransaction(unit2, srdl2, null);

    srdl2Trans.finalizeSubTransaction(srdl2, siteDirClone, null);

    assertTrue(siteDirClone.getSiteReferenceDataLibrary().contains(srdl2));
    assertTrue(srdl2.getUnit().contains(unit2));

    // update site rdl1
    var srdlC2 = siterdlC1.clone(false);
    var srdlC2TRans = new ThingTransactionImpl(srdlC2, rootTransaction, siteDirClone);
    srdlC2TRans.createOrUpdate(srdlC2);

    // update unit1
    var unit1C2 = unit1C1.clone(false);
    var unit1C2Trans = new ThingTransactionImpl(unit1C2, srdlC2TRans, srdlC2);
    unit1C2Trans.createOrUpdate(unit1C2);

    // update container of unitfactor1
    var unitfactor1C2 = unitFactor1C1.clone(false);
    var factor1C2Trans = new ThingTransactionImpl(unitfactor1C2, unit1C2Trans, unit1C2);
    factor1C2Trans.createOrUpdate(unitfactor1C2);

    var unit2clone = unit2.clone(false);
    factor1C2Trans.finalizeSubTransaction(unitfactor1C2, unit2clone, null);

    assertEquals(2, unit1C2Trans.getAddedThing().size());
    assertEquals(3, unit1C2Trans.getUpdatedThing().size());
    assertTrue(unit2clone.getUnitFactor().contains(unitfactor1C2));
    assertFalse(unit1C2.getUnitFactor().contains(unitfactor1C2));

    // update container of unitfactor2
    var unitfactor2C1 = unitFactor2.clone(false);
    var factor2C2Trans = new ThingTransactionImpl(unitfactor2C1, unit1C2Trans, unit1C2);
    factor2C2Trans.createOrUpdate(unitfactor2C1);

    var unit2clone2 = unit2clone.clone(false);
    factor2C2Trans.finalizeSubTransaction(unitfactor2C1, unit2clone2, null);

    assertEquals(3, unit1C2Trans.getAddedThing().size());
    assertTrue(unit1C2Trans.getAddedThing().contains(unit2clone2));
    assertFalse(unit1C2Trans.getAddedThing().contains(unit2clone));

    assertEquals(3, unit1C2Trans.getUpdatedThing().size());
    assertTrue(unit2clone.getUnitFactor().contains(unitfactor1C2));
    assertFalse(unit1C2.getUnitFactor().contains(unitfactor1C2));

    unit1C2Trans.finalizeSubTransaction(unit1C2, srdlC2, null);
    srdlC2TRans.finalizeSubTransaction(srdlC2, siteDirClone, null);

    // final transaction
    assertEquals(3, rootTransaction.getAddedThing().size());
    assertEquals(4, rootTransaction.getUpdatedThing().size());
    assertTrue(rootTransaction.getAddedThing().contains(unitfactor2C1));
    assertTrue(rootTransaction.getAddedThing().contains(unit2clone2));

    var srdl2lastclone = (SiteReferenceDataLibrary) rootTransaction.getClone(srdl2);
    assertTrue(siteDirClone.getSiteReferenceDataLibrary().contains(srdl2lastclone));
    assertTrue(srdl2lastclone.getUnit().contains(unit2clone2));

    var updatedThingValues = rootTransaction.getUpdatedThing().values();
    assertTrue(updatedThingValues.contains(siteDirClone));
    assertTrue(updatedThingValues.contains(srdlC2));
    assertTrue(updatedThingValues.contains(unit1C2));
    assertTrue(updatedThingValues.contains(unitfactor1C2));
  }

  @Test
  void verifyThatNewThingWithCacheDoesNotCrash() throws TransactionException {
    var person = new Person(UUID.randomUUID(), this.cache, this.uri);

    var transactionContext = TransactionContextResolver.resolveContext(this.siteDirectory);
    var transaction = new ThingTransactionImpl(transactionContext, person);
    assertEquals(1, transaction.getAddedThing().size());
  }

  @Test
  void verifyThatCreateDeepWorks() throws TransactionException {
    var enumPt = new EnumerationParameterType();
    var enumPtDef = new Definition();

    enumPt.getDefinition().add(enumPtDef);

    var enumValue = new EnumerationValueDefinition();
    var enumValueDef = new Definition();
    enumValue.getDefinition().add(enumValueDef);

    enumPt.getValueDefinition().add(enumValue);

    var transactionContext = TransactionContextResolver.resolveContext(this.siteDirectory);
    var transaction = new ThingTransactionImpl(transactionContext, null);
    transaction.createDeep(enumPt, null);
    assertEquals(4, transaction.getAddedThing().size());
  }

  @Test
  void verifyThatCopyDeepWorks() throws TransactionException {
    var enumPt = new EnumerationParameterType();
    var enumPtDef = new Definition();

    enumPt.getDefinition().add(enumPtDef);

    var enumValue = new EnumerationValueDefinition(UUID.randomUUID(), null, null);
    var enumValueDef = new Definition();
    enumValue.getDefinition().add(enumValueDef);

    enumPt.getValueDefinition().add(enumValue);

    var transactionContext = TransactionContextResolver.resolveContext(this.siteDirectory);
    var transaction = new ThingTransactionImpl(transactionContext, null);
    transaction.copyDeep(enumPt.clone(true), null);
    assertEquals(4, transaction.getAddedThing().size());

    var valueDefInTransaction =
        (EnumerationValueDefinition) transaction.getAddedThing().stream()
            .filter(x -> x.getClassKind() == ClassKind.ENUMERATION_VALUE_DEFINITION)
            .collect(MoreCollectors.onlyElement());

    assertNotEquals(enumValue.getIid(), valueDefInTransaction.getIid());
  }

  /**
   * create email in person and directly delete it
   */
  @Test
  void verifyThatDeleteAddedThingWorksWithinSameSubTransaction() throws TransactionException {
    var sitedir1 = this.siteDirectory.clone(false);

    var transactionContext = TransactionContextResolver.resolveContext(this.siteDirectory);
    var transaction = new ThingTransactionImpl(transactionContext, sitedir1);

    var person = new Person();
    var personTransaction = new ThingTransactionImpl(person, transaction, sitedir1);
    personTransaction.create(person, null);

    var email = new EmailAddress();
    var emailTransaction = new ThingTransactionImpl(email, personTransaction, person);
    emailTransaction.create(email, null);
    emailTransaction.finalizeSubTransaction(email, person, null);

    var deletedEmail = email.clone(false);
    personTransaction.delete(deletedEmail, person);
    assertTrue(person.getEmailAddress().isEmpty());

    assertTrue(personTransaction.getDeletedThing().contains(deletedEmail));

    personTransaction.finalizeSubTransaction(person, sitedir1, null);
    var operationContainer = transaction.finalizeTransaction();

    // sitedir and person
    assertEquals(2, operationContainer.getOperations().size());
  }

  /**
   * create email in person, validate person, edit it again to delete email
   */
  @Test
  void verifyThatDeleteAddedThingWorksWithinDifferentSubTransaction() throws TransactionException {
    var sitedir1 = this.siteDirectory.clone(false);

    var transactionContext = TransactionContextResolver.resolveContext(this.siteDirectory);
    var transaction = new ThingTransactionImpl(transactionContext, sitedir1);

    var person = new Person();
    var personTransaction = new ThingTransactionImpl(person, transaction, sitedir1);
    personTransaction.create(person, null);

    var email = new EmailAddress();
    var emailTransaction = new ThingTransactionImpl(email, personTransaction, person);
    emailTransaction.create(email, null);
    emailTransaction.finalizeSubTransaction(email, person, null);
    personTransaction.finalizeSubTransaction(person, sitedir1, null);

    // edit person
    var person1 = person.clone(false);
    var person1Transaction = new ThingTransactionImpl(person1, transaction, sitedir1);
    person1Transaction.createOrUpdate(person1);

    var deletedEmail = email.clone(false);
    person1Transaction.delete(deletedEmail, person1);

    assertTrue(person1.getEmailAddress().isEmpty());
    assertTrue(person1Transaction.getDeletedThing().contains(deletedEmail));

    person1Transaction.finalizeSubTransaction(person1, sitedir1, null);
    var operationContainer = transaction.finalizeTransaction();

    // sitedir and person
    assertEquals(2, operationContainer.getOperations().size());
  }

  /**
   * delete email in sub-transaction context
   */
  @Test
  void verifyThatDeleteExistingThingWorks() throws TransactionException {
    var person = new Person(UUID.randomUUID(), this.cache, this.uri);
    var email = new EmailAddress(UUID.randomUUID(), this.cache, this.uri);
    this.siteDirectory.getPerson().add(person);
    person.getEmailAddress().add(email);

    this.cache.put(new CacheKey(person.getIid(), null), person);
    this.cache.put(new CacheKey(email.getIid(), null), email);

    var sitedir1 = this.siteDirectory.clone(false);

    var transactionContext = TransactionContextResolver.resolveContext(this.siteDirectory);
    var transaction = new ThingTransactionImpl(transactionContext, sitedir1);

    var person1 = person.clone(false);
    var person1Transaction = new ThingTransactionImpl(person1, transaction, sitedir1);
    person1Transaction.createOrUpdate(person1);

    var deletedEmail = email.clone(false);
    person1Transaction.delete(deletedEmail, person1);
    assertTrue(person1.getEmailAddress().contains(deletedEmail));
    assertTrue(person1Transaction.getDeletedThing().contains(deletedEmail));

    person1Transaction.finalizeSubTransaction(person1, sitedir1, null);
    var operationContainer = transaction.finalizeTransaction();

    // sitedir and person
    assertEquals(3, operationContainer.getOperations().size());
  }

  /**
   * update email, then delete
   */
  @Test
  void verifyThatDeleteUpdatedThingWorksWithinSameSubTransaction() throws TransactionException {
    var person = new Person(UUID.randomUUID(), this.cache, this.uri);
    var email = new EmailAddress(UUID.randomUUID(), this.cache, this.uri);
    this.siteDirectory.getPerson().add(person);
    person.getEmailAddress().add(email);

    this.cache.put(new CacheKey(person.getIid(), null), person);
    this.cache.put(new CacheKey(email.getIid(), null), email);

    var sitedir1 = this.siteDirectory.clone(false);

    var transactionContext = TransactionContextResolver.resolveContext(this.siteDirectory);
    var transaction = new ThingTransactionImpl(transactionContext, sitedir1);

    var person1 = person.clone(false);
    var person1Transaction = new ThingTransactionImpl(person1, transaction, sitedir1);
    person1Transaction.createOrUpdate(person1);

    var email1 = email.clone(false);
    var email1Transaction = new ThingTransactionImpl(email1, person1Transaction, person1);
    email1Transaction.createOrUpdate(email1);
    email1Transaction.finalizeSubTransaction(email1, person1, null);

    var email2 = email1.clone(false);
    person1Transaction.delete(email2, person1);

    assertTrue(person1.getEmailAddress().contains(email2));
    assertTrue(person1Transaction.getDeletedThing().contains(email2));

    person1Transaction.finalizeSubTransaction(person1, sitedir1, null);
    var operationContainer = transaction.finalizeTransaction();

    // sitedir and person
    assertEquals(3, operationContainer.getOperations().size());
  }

  /**
   * update email and person, update person then delete email
   */
  @Test
  void verifyThatDeleteUpdatedThingWorksInDifferentTransaction() throws TransactionException {
    var person = new Person(UUID.randomUUID(), this.cache, this.uri);
    var email = new EmailAddress(UUID.randomUUID(), this.cache, this.uri);
    this.siteDirectory.getPerson().add(person);
    person.getEmailAddress().add(email);

    this.cache.put(new CacheKey(person.getIid(), null), person);
    this.cache.put(new CacheKey(email.getIid(), null), email);

    var sitedir1 = this.siteDirectory.clone(false);

    var transactionContext = TransactionContextResolver.resolveContext(this.siteDirectory);
    var transaction = new ThingTransactionImpl(transactionContext, sitedir1);

    var person1 = person.clone(false);
    var person1Transaction = new ThingTransactionImpl(person1, transaction, sitedir1);
    person1Transaction.createOrUpdate(person1);

    var email1 = email.clone(false);
    var email1Transaction = new ThingTransactionImpl(email1, person1Transaction, person1);
    email1Transaction.createOrUpdate(email1);
    email1Transaction.finalizeSubTransaction(email1, person1, null);
    person1Transaction.finalizeSubTransaction(person1, sitedir1, null);

    var person2 = person1.clone(false);
    var person2Transaction = new ThingTransactionImpl(person2, transaction, sitedir1);
    person2Transaction.createOrUpdate(person2);

    var email2 = email1.clone(false);
    person2Transaction.delete(email2, person2);

    assertTrue(person2.getEmailAddress().contains(email2));
    assertTrue(person2Transaction.getDeletedThing().contains(email2));

    person2Transaction.finalizeSubTransaction(person2, sitedir1, null);
    var operationContainer = transaction.finalizeTransaction();

    // sitedir and person
    assertEquals(3, operationContainer.getOperations().size());
  }

  /**
   * Verify that deleting an added thing remove all its contained things from the lists of
   * getOperations()
   */
  @Test
  void verifyThatCascadeDeleteWorksOnAddedThing() throws TransactionException {
    var sitedir1 = this.siteDirectory.clone(false);

    var transactionContext = TransactionContextResolver.resolveContext(this.siteDirectory);
    var transaction = new ThingTransactionImpl(transactionContext, sitedir1);

    var person = new Person();
    var personTransaction = new ThingTransactionImpl(person, transaction, sitedir1);
    personTransaction.create(person, null);

    var email = new EmailAddress();
    var emailTransaction = new ThingTransactionImpl(email, personTransaction, person);
    emailTransaction.create(email, null);
    emailTransaction.finalizeSubTransaction(email, person, null);
    personTransaction.finalizeSubTransaction(person, sitedir1, null);

    transaction.delete(person.clone(false), null);

    var operationContainer = transaction.finalizeTransaction();
    // Update sitedir
    assertEquals(1, operationContainer.getOperations().size());
  }

  @Test
  void verifyThatDryCopyWorks() throws TransactionException {
    var sourceModel = new EngineeringModel(UUID.randomUUID(), this.cache, this.uri);
    var sourceIteration = new Iteration(UUID.randomUUID(), this.cache, this.uri);
    var targetModel = new EngineeringModel(UUID.randomUUID(), this.cache, this.uri);
    var targetIteration = new Iteration(UUID.randomUUID(), this.cache, this.uri);
    var elementDefinition = new ElementDefinition(UUID.randomUUID(), this.cache, this.uri);

    sourceModel.getIteration().add(sourceIteration);
    targetModel.getIteration().add(targetIteration);
    sourceIteration.getElement().add(elementDefinition);

    this.cache.put(sourceModel.getCacheKey(), sourceModel);
    this.cache.put(sourceIteration.getCacheKey(), sourceIteration);
    this.cache.put(targetModel.getCacheKey(), targetModel);
    this.cache.put(targetIteration.getCacheKey(), targetIteration);
    this.cache.put(elementDefinition.getCacheKey(), elementDefinition);

    var elementDefinitionClone = elementDefinition.clone(false);
    var targetIterationClone = targetIteration.clone(false);

    var transactionContext = TransactionContextResolver.resolveContext(targetIteration);
    var transaction = new ThingTransactionImpl(transactionContext, null);
    transaction.copy(elementDefinitionClone, targetIterationClone,
        OperationKind.COPY_DEFAULT_VALUES_CHANGE_OWNER);

    var copyPair = transaction.getCopiedThing().entrySet().stream()
        .collect(MoreCollectors.onlyElement());
    assertNotEquals(copyPair.getKey().getLeft().getIid(), copyPair.getKey().getRight().getIid());

    var operationContainer = transaction.finalizeTransaction();
    assertEquals(1, operationContainer.getOperations().stream()
        .filter(x -> x.getOperationKind() == OperationKind.COPY_DEFAULT_VALUES_CHANGE_OWNER)
        .count());
    assertEquals(1, operationContainer.getOperations().stream()
        .filter(x -> x.getOperationKind() == OperationKind.UPDATE).count());
  }

  @Test
  void verifyThatCtrlCopyWorks() throws TransactionException {
    var sourceModel = new EngineeringModel(UUID.randomUUID(), this.cache, this.uri);
    var sourceIteration = new Iteration(UUID.randomUUID(), this.cache, this.uri);
    var targetModel = new EngineeringModel(UUID.randomUUID(), this.cache, this.uri);
    var targetIteration = new Iteration(UUID.randomUUID(), this.cache, this.uri);
    var elementDefinition = new ElementDefinition(UUID.randomUUID(), this.cache, this.uri);

    sourceModel.getIteration().add(sourceIteration);
    targetModel.getIteration().add(targetIteration);
    sourceIteration.getElement().add(elementDefinition);

    this.cache.put(sourceModel.getCacheKey(), sourceModel);
    this.cache.put(sourceIteration.getCacheKey(), sourceIteration);
    this.cache.put(targetModel.getCacheKey(), targetModel);
    this.cache.put(targetIteration.getCacheKey(), targetIteration);
    this.cache.put(elementDefinition.getCacheKey(), elementDefinition);

    var elementDefinitionClone = elementDefinition.clone(false);
    var targetIterationClone = targetIteration.clone(false);

    var transactionContext = TransactionContextResolver.resolveContext(targetIteration);
    var transaction = new ThingTransactionImpl(transactionContext, null);
    transaction.copy(elementDefinitionClone, targetIterationClone,
        OperationKind.COPY_KEEP_VALUES_CHANGE_OWNER);

    var copyPair = transaction.getCopiedThing().entrySet().stream()
        .collect(MoreCollectors.onlyElement());
    assertNotEquals(copyPair.getKey().getLeft().getIid(), copyPair.getKey().getRight().getIid());

    var operationContainer = transaction.finalizeTransaction();
    assertEquals(1, operationContainer.getOperations().stream()
        .filter(x -> x.getOperationKind() == OperationKind.COPY_KEEP_VALUES_CHANGE_OWNER).count());
    assertEquals(1, operationContainer.getOperations().stream()
        .filter(x -> x.getOperationKind() == OperationKind.UPDATE).count());
  }

  @Test
  void verifyThatShiftCopyWorks() throws TransactionException {
    var sourceModel = new EngineeringModel(UUID.randomUUID(), this.cache, this.uri);
    var sourceIteration = new Iteration(UUID.randomUUID(), this.cache, this.uri);
    var targetModel = new EngineeringModel(UUID.randomUUID(), this.cache, this.uri);
    var targetIteration = new Iteration(UUID.randomUUID(), this.cache, this.uri);
    var sourceElementDefinition = new ElementDefinition(UUID.randomUUID(), this.cache, this.uri);

    sourceModel.getIteration().add(sourceIteration);
    targetModel.getIteration().add(targetIteration);
    sourceIteration.getElement().add(sourceElementDefinition);

    this.cache.put(sourceModel.getCacheKey(), sourceModel);
    this.cache.put(sourceIteration.getCacheKey(), sourceIteration);
    this.cache.put(targetModel.getCacheKey(), targetModel);
    this.cache.put(targetIteration.getCacheKey(), targetIteration);
    this.cache.put(sourceElementDefinition.getCacheKey(), sourceElementDefinition);

    var elementDefinitionClone = sourceElementDefinition.clone(false);
    var targetIterationClone = targetIteration.clone(false);

    var transactionContext = TransactionContextResolver.resolveContext(targetIteration);
    var transaction = new ThingTransactionImpl(transactionContext, null);
    transaction.copy(elementDefinitionClone, targetIterationClone, OperationKind.COPY);

    var copyPair = transaction.getCopiedThing().entrySet().stream()
        .collect(MoreCollectors.onlyElement());
    assertNotEquals(copyPair.getKey().getLeft().getIid(), copyPair.getKey().getRight().getIid());

    var operationContainer = transaction.finalizeTransaction();
    assertEquals(1, operationContainer.getOperations().stream()
        .filter(x -> x.getOperationKind() == OperationKind.COPY).count());
    assertEquals(1, operationContainer.getOperations().stream()
        .filter(x -> x.getOperationKind() == OperationKind.UPDATE).count());
  }

  @Test
  void verifyThatCtrlShiftCopyWorks() throws TransactionException {
    var sourceModel = new EngineeringModel(UUID.randomUUID(), this.cache, this.uri);
    var sourceIteration = new Iteration(UUID.randomUUID(), this.cache, this.uri);
    var targetModel = new EngineeringModel(UUID.randomUUID(), this.cache, this.uri);
    var targetIteration = new Iteration(UUID.randomUUID(), this.cache, this.uri);
    var elementDefinition = new ElementDefinition(UUID.randomUUID(), this.cache, this.uri);

    sourceModel.getIteration().add(sourceIteration);
    targetModel.getIteration().add(targetIteration);
    sourceIteration.getElement().add(elementDefinition);

    this.cache.put(sourceModel.getCacheKey(), sourceModel);
    this.cache.put(sourceIteration.getCacheKey(), sourceIteration);
    this.cache.put(targetModel.getCacheKey(), targetModel);
    this.cache.put(targetIteration.getCacheKey(), targetIteration);
    this.cache.put(elementDefinition.getCacheKey(), elementDefinition);

    var elementDefinitionClone = elementDefinition.clone(false);
    var targetIterationClone = targetIteration.clone(false);

    var transactionContext = TransactionContextResolver.resolveContext(targetIteration);
    var transaction = new ThingTransactionImpl(transactionContext, null);
    transaction.copy(elementDefinitionClone, targetIterationClone, OperationKind.COPY_KEEP_VALUES);

    var copyPair = transaction.getCopiedThing().entrySet().stream()
        .collect(MoreCollectors.onlyElement());
    assertNotEquals(copyPair.getKey().getLeft().getIid(), copyPair.getKey().getRight().getIid());

    var operationContainer = transaction.finalizeTransaction();
    assertEquals(1, operationContainer.getOperations().stream()
        .filter(x -> x.getOperationKind() == OperationKind.COPY_KEEP_VALUES).count());
    assertEquals(1, operationContainer.getOperations().stream()
        .filter(x -> x.getOperationKind() == OperationKind.UPDATE).count());
  }

  @Test
  void verifyThatWhenCopyOperationIsInvokedWithNonCopyOperationExceptionIsThrown()
      throws TransactionException {
    var sourceModel = new EngineeringModel(UUID.randomUUID(), this.cache, this.uri);
    var sourceIteration = new Iteration(UUID.randomUUID(), this.cache, this.uri);
    var targetModel = new EngineeringModel(UUID.randomUUID(), this.cache, this.uri);
    var targetIteration = new Iteration(UUID.randomUUID(), this.cache, this.uri);
    var elementDefinition = new ElementDefinition(UUID.randomUUID(), this.cache, this.uri);

    sourceModel.getIteration().add(sourceIteration);
    targetModel.getIteration().add(targetIteration);
    sourceIteration.getElement().add(elementDefinition);

    this.cache.put(sourceModel.getCacheKey(), sourceModel);
    this.cache.put(sourceIteration.getCacheKey(), sourceIteration);
    this.cache.put(targetModel.getCacheKey(), targetModel);
    this.cache.put(targetIteration.getCacheKey(), targetIteration);
    this.cache.put(elementDefinition.getCacheKey(), elementDefinition);

    var elementDefinitionClone = elementDefinition.clone(false);
    var targetIterationClone = targetIteration.clone(false);

    var transactionContext = TransactionContextResolver.resolveContext(targetIteration);
    var transaction = new ThingTransactionImpl(transactionContext, null);
    assertThrows(IllegalArgumentException.class,
        () -> transaction.copy(elementDefinitionClone, targetIterationClone, OperationKind.CREATE));
  }

  @Test
  void verifyThatCopyThrowsExceptionCloneThatIsToBeCopiedIsNull() throws TransactionException {
    var sourceModel = new EngineeringModel(UUID.randomUUID(), this.cache, this.uri);
    var sourceIteration = new Iteration(UUID.randomUUID(), this.cache, this.uri);
    var targetModel = new EngineeringModel(UUID.randomUUID(), this.cache, this.uri);
    var targetIteration = new Iteration(UUID.randomUUID(), this.cache, this.uri);
    var elementDefinition = new ElementDefinition(UUID.randomUUID(), this.cache, this.uri);

    sourceModel.getIteration().add(sourceIteration);
    targetModel.getIteration().add(targetIteration);
    sourceIteration.getElement().add(elementDefinition);

    this.cache.put(sourceModel.getCacheKey(), sourceModel);
    this.cache.put(sourceIteration.getCacheKey(), sourceIteration);
    this.cache.put(targetModel.getCacheKey(), targetModel);
    this.cache.put(targetIteration.getCacheKey(), targetIteration);
    this.cache.put(elementDefinition.getCacheKey(), elementDefinition);

    var transactionContext = TransactionContextResolver.resolveContext(targetIteration);
    var transaction = new ThingTransactionImpl(transactionContext, null);

    assertThrows(NullPointerException.class, () -> transaction.copy(null, OperationKind.COPY));
  }

  @Test
  void verifyThatCopyThrowsExceptionWhenDestinationIsNull() throws TransactionException {
    var sourceModel = new EngineeringModel(UUID.randomUUID(), this.cache, this.uri);
    var sourceIteration = new Iteration(UUID.randomUUID(), this.cache, this.uri);
    var targetModel = new EngineeringModel(UUID.randomUUID(), this.cache, this.uri);
    var targetIteration = new Iteration(UUID.randomUUID(), this.cache, this.uri);
    var elementDefinition = new ElementDefinition(UUID.randomUUID(), this.cache, this.uri);

    sourceModel.getIteration().add(sourceIteration);
    targetModel.getIteration().add(targetIteration);
    sourceIteration.getElement().add(elementDefinition);

    this.cache.put(sourceModel.getCacheKey(), sourceModel);
    this.cache.put(sourceIteration.getCacheKey(), sourceIteration);
    this.cache.put(targetModel.getCacheKey(), targetModel);
    this.cache.put(targetIteration.getCacheKey(), targetIteration);
    this.cache.put(elementDefinition.getCacheKey(), elementDefinition);

    var elementDefinitionClone = elementDefinition.clone(false);

    var transactionContext = TransactionContextResolver.resolveContext(sourceIteration);
    var transaction = new ThingTransactionImpl(transactionContext, null);
    assertThrows(NullPointerException.class,
        () -> transaction.copy(elementDefinitionClone, null, OperationKind.COPY));
  }

  @Test
  void verifyThatGetLastCloneCreatedThrowsExceptionWhenThingIsNullOrGuidIsEmptyGuid()
      throws TransactionException {
    var model = new EngineeringModel(UUID.randomUUID(), this.cache, this.uri);
    var iteration = new Iteration(UUID.randomUUID(), this.cache, this.uri);

    model.getIteration().add(iteration);

    var transactionContext = TransactionContextResolver.resolveContext(iteration);
    var transaction = new ThingTransactionImpl(transactionContext, null);

    assertThrows(NullPointerException.class, () -> transaction.getLastCloneCreated(null));

    var elementDefinition = new ElementDefinition(new UUID(0L, 0L), this.cache, this.uri);

    assertThrows(IllegalArgumentException.class,
        () -> transaction.getLastCloneCreated(elementDefinition));
  }

  @Test
  void verifyThatArgumentNullExceptionIsThrownWhenContextIsNull() {
    assertThrows(NullPointerException.class, () -> new ThingTransactionImpl(null, null));
  }

  @Test
  void verifyThatArgumentNullExceptionIsThrownWhenCloneIsNull() {
    var model = new EngineeringModel(UUID.randomUUID(), this.cache, this.uri);
    var iteration = new Iteration(UUID.randomUUID(), this.cache, this.uri);
    var elementDefinition = new ElementDefinition(UUID.randomUUID(), this.cache, this.uri);

    model.getIteration().add(iteration);
    iteration.getElement().add(elementDefinition);

    var transactionContext = TransactionContextResolver.resolveContext(elementDefinition);

    var iterationClone = iteration.clone(false);
    var elementDefinitionClone = elementDefinition.clone(false);

    assertThrows(NullPointerException.class,
        () -> new ThingTransactionImpl(null, null, iterationClone));
  }
}
