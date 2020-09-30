/*
 * CDPMessageBusTest.java
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

package cdp4dal;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;

import cdp4common.commondata.Thing;
import cdp4common.dto.SiteDirectory;
import cdp4common.dto.TelephoneNumber;
import cdp4common.engineeringmodeldata.ElementUsage;
import cdp4common.sitedirectorydata.MeasurementUnit;
import cdp4common.sitedirectorydata.Person;
import cdp4common.sitedirectorydata.VcardTelephoneNumberKind;
import cdp4dal.dal.Credentials;
import cdp4dal.dal.Dal;
import cdp4dal.events.EventKind;
import cdp4dal.events.EventTypeTarget;
import cdp4dal.events.ObjectChangedEvent;
import cdp4dal.events.SessionEvent;
import cdp4dal.events.SessionStatus;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CDPMessageBusTest {

  private URI uri;
  private int messagesReceivedCounter;

  private List<Thing> cache;

  private List<cdp4common.dto.Thing> testInput;
  private cdp4common.dto.Person person;
  private cdp4common.dto.Person person2;

  private cdp4common.dto.ConversionBasedUnit conversionBasedUnitType;
  private cdp4common.dto.LinearConversionUnit linearConversionUnitType;
  private cdp4common.dto.PrefixedUnit prefixedUnitType;
  private cdp4common.dto.DerivedUnit derivedUnitType;
  private cdp4common.dto.SimpleUnit simpleUnitUnitType;

  @BeforeEach
  void setUp() {
    this.uri = URI.create("http://www.rheagroup.com");
    this.cache = new ArrayList<>();
    this.testInput = new ArrayList<>();

    this.person = new cdp4common.dto.Person(UUID.randomUUID(), 0);
    this.person.setSurname("test");
    this.person.setPassword("test2");
    this.person.setActive(true);
    this.person2 = new cdp4common.dto.Person(UUID.randomUUID(), 0);
    this.person2.setSurname("test2");
    this.person2.setPassword("test4");
    this.person2.setActive(true);
    TelephoneNumber phone1 = new cdp4common.dto.TelephoneNumber(UUID.randomUUID(), 0);
    phone1.setValue("123");
    phone1.getVcardType().add(VcardTelephoneNumberKind.HOME);
    TelephoneNumber phone2 = new cdp4common.dto.TelephoneNumber(UUID.randomUUID(), 0);
    phone2.setValue("456");
    phone2.getVcardType().add(VcardTelephoneNumberKind.WORK);
    TelephoneNumber phone3 = new cdp4common.dto.TelephoneNumber(UUID.randomUUID(), 0);
    phone3.setValue("789");
    phone3.getVcardType().add(VcardTelephoneNumberKind.FAX);

    this.linearConversionUnitType = new cdp4common.dto.LinearConversionUnit(UUID.randomUUID(), 0);
    this.prefixedUnitType = new cdp4common.dto.PrefixedUnit(UUID.randomUUID(), 0);
    this.derivedUnitType = new cdp4common.dto.DerivedUnit(UUID.randomUUID(), 0);
    this.simpleUnitUnitType = new cdp4common.dto.SimpleUnit(UUID.randomUUID(), 0);

    this.person.getTelephoneNumber().add(phone1.getIid());
    this.person.getTelephoneNumber().add(phone2.getIid());
    this.person.getTelephoneNumber().add(phone3.getIid());

    this.testInput.add(new SiteDirectory(UUID.randomUUID(), 1));
    this.testInput.add(this.person);
    this.testInput.add(this.person2);
    this.testInput.add(phone1);
    this.testInput.add(phone2);
    this.testInput.add(phone3);

    this.testInput.add(this.linearConversionUnitType);
    this.testInput.add(this.prefixedUnitType);
    this.testInput.add(this.derivedUnitType);
    this.testInput.add(this.simpleUnitUnitType);
  }

  @AfterEach
  void tearDown() {
    CDPMessageBus.getCurrent().clearSubscriptions();
    this.cache.clear();
    this.messagesReceivedCounter = 0;
  }

  @Test
  void verifyThatSubscribeToTypeGetsEvent() throws ExecutionException, InterruptedException {
    // The ViewModel subscribes to events
    CDPMessageBus.getCurrent().listen(ObjectChangedEvent.class, Person.class, null)
        .subscribe(x -> this.onEvent(x.getChangedThing()));

    // The assembler will raise an event when something changes
    Assembler assembler = new Assembler(this.uri);
    assembler.synchronize(this.testInput, true).get();

    // Check that the viewModel catches the event
    assertEquals(2, this.cache.size());

    assertTrue(this.cache.stream().anyMatch(p -> p.getIid() == this.person.getIid()));
    assertTrue(this.cache.stream().anyMatch(p -> p.getIid() == this.person2.getIid()));
  }

  @Test
  void verifyThatSubscribeToTypeSuperclassGetsEvent()
      throws ExecutionException, InterruptedException {
    // The ViewModel subscribes to events
    CDPMessageBus.getCurrent().listen(ObjectChangedEvent.class, MeasurementUnit.class, null)
        .subscribe(x -> this.onEvent(x.getChangedThing()));

    // The assembler will raise and event when something changes
    Assembler assembler = new Assembler(this.uri);
    assembler.synchronize(this.testInput, true).get();

    // Check that the viewModel catches the event
    assertEquals(4, this.cache.size());

    assertTrue(
        this.cache.stream().anyMatch(p -> p.getIid() == this.linearConversionUnitType.getIid()));
    assertTrue(this.cache.stream().anyMatch(p -> p.getIid() == this.prefixedUnitType.getIid()));
    assertTrue(this.cache.stream().anyMatch(p -> p.getIid() == this.derivedUnitType.getIid()));
    assertTrue(this.cache.stream().anyMatch(p -> p.getIid() == this.simpleUnitUnitType.getIid()));
  }

  @Test
  void verifyThatSubscribeToObjectWorks() {
    ElementUsage eu1 = new cdp4common.engineeringmodeldata.ElementUsage();
    ElementUsage eu2 = new cdp4common.engineeringmodeldata.ElementUsage();

    // The ViewModel subscribes to events
    CDPMessageBus.getCurrent().listen(ObjectChangedEvent.class, eu1, null)
        .subscribe(x -> this.onEvent(x.getChangedThing()));

    CDPMessageBus.getCurrent().sendMessage(new ObjectChangedEvent(eu1), eu1, null);
    CDPMessageBus.getCurrent().sendMessage(new ObjectChangedEvent(eu1), eu1.getClass(), null);

    CDPMessageBus.getCurrent().sendMessage(new ObjectChangedEvent(eu2), eu2, null);
    CDPMessageBus.getCurrent().sendMessage(new ObjectChangedEvent(eu2), eu2.getClass(), null);

    assertEquals(1, this.cache.size());

    this.cache.clear();

    CDPMessageBus.getCurrent().listen(ObjectChangedEvent.class, ElementUsage.class, null)
        .subscribe(x -> this.onEvent(x.getChangedThing()));

    CDPMessageBus.getCurrent().sendObjectChangeEvent(eu1, EventKind.UPDATED);
    CDPMessageBus.getCurrent().sendObjectChangeEvent(eu2, EventKind.UPDATED);

    // 3 because the top subscription still exists.
    assertEquals(3, this.cache.size());
  }

  @Test
  void verifyThatAnyObjectCanServeAsAMessageAndBeReceived() {
    Dal mockedDal = mock(Dal.class);
    Credentials credentials = new Credentials(" ", " ", this.uri, null);
    SessionImpl session = new SessionImpl(mockedDal, credentials);
    SessionEvent sessionEvent = new SessionEvent(session, SessionStatus.OPEN);
    assertEquals(0, this.messagesReceivedCounter);
    CDPMessageBus.getCurrent().listen(SessionEvent.class, null, null)
        .subscribe(x -> messageReceived());
    CDPMessageBus.getCurrent().sendMessage(sessionEvent, null, null);
    assertEquals(1, this.messagesReceivedCounter);
  }

  @Test
  void verifyNullEventTypeTargetIsFalse() {
    EventTypeTarget ett = new EventTypeTarget(SessionEvent.class, null);

    EventTypeTarget test = null;

    assertFalse(ett.equals(test));
  }

  private void messageReceived() {
    this.messagesReceivedCounter++;
  }

  private void onEvent(Thing thing) {
    this.cache.add(thing);
  }
}
