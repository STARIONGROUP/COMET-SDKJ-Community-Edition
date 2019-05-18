/*
 * CDPMessageBus.java
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

import cdp4common.commondata.Thing;
import cdp4common.helpers.TypeResolver;
import cdp4dal.events.CdpEventSubject;
import cdp4dal.events.EventKind;
import cdp4dal.events.EventTypeTarget;
import cdp4dal.events.ObjectChangedEvent;
import io.reactivex.Observable;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.Disposables;
import io.reactivex.subjects.PublishSubject;
import io.reactivex.subjects.Subject;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/**
 * The CDP specific MessageBus implementation.
 */
public class CDPMessageBus {

  /**
   * The {@link ConcurrentMap} holding the subscriptions.
   */
  private final ConcurrentMap<EventTypeTarget, CdpEventSubject> messageBus = new ConcurrentHashMap<>();

  /**
   * Singleton pattern private filed of the instance.
   */
  private static final CDPMessageBus instance = new CDPMessageBus();

  /**
   * Gets the Current MessageBus.
   */
  public static CDPMessageBus getCurrent() {
    return instance;
  }

  /**
   * Prevents a default instance of the {@link CDPMessageBus} class from being created.
   */
  private CDPMessageBus() {
  }

  /**
   * Listen provides an Observable that will fire whenever a Message is provided for this object via
   * RegisterMessageSource or SendMessage.
   *
   * @param <T> The type of the message to listen to.
   * @param eventType The {@link Class} representing the type at runtime.
   * @param target The target {@link Object} to subscribe to.
   * @param contract A unique String to distinguish messages with identical types (i.e.
   * "MyCoolViewModel") - if the message type is only used for one purpose, leave this as null.
   * @return A {@link Observable} representing the notifications posted to the message bus.
   */
  public <T> Observable<T> listen(Class<T> eventType, Object target, String contract) {
    return Observable.defer(
        () -> this.getOrAddObservable(eventType, new EventTypeTarget(eventType, target)));
  }

  /**
   * Gets or adds (if not existent) the {@link Observable<T>} to the {@link ConcurrentMap}.
   *
   * @param <T> The {@link Thing} that has changed.
   * @param eventType The {@link Class} representing the event type at runtime.
   * @param eventTypeTarget The {@link EventTypeTarget} pertaining to this {@link Observable<T>}.
   * @return The {@link Observable<T>} connected to the target.
   */
  private <T> Observable<T> getOrAddObservable(Class<T> eventType,
      EventTypeTarget eventTypeTarget) {
    var cdpEventSubject = this.messageBus.putIfAbsent(
        eventTypeTarget,
        this.composeEventSubject(eventType, eventTypeTarget));

    return (Observable<T>) cdpEventSubject.getObservable();
  }

  /**
   * Composes the observable subject of the {@link EventTypeTarget}.
   *
   * @param <T> The {@link Thing} POJO.
   * @param eventType The {@link Class} representing the type at runtime.
   * @param eventTypeTarget The {@link EventTypeTarget} to create the {@link Subject{T}} from
   * @return The {@link CdpEventSubject} describing the subscription.
   */
  private <T> CdpEventSubject composeEventSubject(Class<T> eventType,
      EventTypeTarget eventTypeTarget) {
    PublishSubject<T> subject = PublishSubject.create();

    var observable = Observable
        .create(o -> new CompositeDisposable(subject.subscribe(ob -> {}),
            createDisposableFromEvent(eventTypeTarget))).publish().refCount();

    return new CdpEventSubject(subject, observable);
  }

  /**
   * Creates a {@link Disposable} object from the {@link EventTypeTarget} with the delegate to run
   * once the object is disposed.
   *
   * @param eventTypeTarget The {@link EventTypeTarget} to process.
   * @return The {@link Disposable}.
   */
  private Disposable createDisposableFromEvent(EventTypeTarget eventTypeTarget) {
    return Disposables.fromRunnable(() -> this.disposableDelegate(eventTypeTarget));
  }

  /**
   * The method that executes when {@link EventTypeTarget} needs to be disposed.
   *
   * @param eventTypeTarget The {@link EventTypeTarget} that the dispose needs to handle.
   */
  private void disposableDelegate(EventTypeTarget eventTypeTarget) {
    this.messageBus.remove(eventTypeTarget);
  }

  /**
   * Sends a single message using the specified Type and contract. Consider using
   * RegisterMessageSource instead if you will be sending messages in response to other changes such
   * as property changes or events.
   *
   * @param <T> The type of the message to send.
   * @param message The actual event to send.
   * @param target The target type that the notification belongs to.
   * @param contract A unique String to distinguish messages with identical types (i.e.
   * "MyCoolViewModel") - if the message type is only used for one purpose, leave this as null.
   */
  public <T> void sendMessage(
      T message, Object
      target,
      String contract) {
    var cdpEventSubject = this.messageBus
        .get(new EventTypeTarget(message.getClass(), target));

    if (cdpEventSubject != null) {
      ((Subject<T>) cdpEventSubject.getSubject()).onNext(message);
    }
  }

  /**
   * Send the necessary messages about a {@link Thing} being changed. Includes the sending of a
   * message with the embedded type change.
   *
   * @param thing The {@link Thing} that has changed.
   * @param eventKind The event kind.
   */
  public void sendObjectChangeEvent(Thing thing, EventKind eventKind) {
    // send the object message
    this.sendMessage(new ObjectChangedEvent(thing, eventKind), thing, null);

    // send the typeof messages
    this.sendTypedObjectChangeEvent(thing, eventKind);
  }

  /**
   * Send the necessary messages about a {@link Thing}s type (and all supertpes) being changed.
   *
   * @param thing The {@link Thing} that has changed.
   * @param eventKind The event kind.
   */
  private void sendTypedObjectChangeEvent(Thing thing, EventKind eventKind) {
    for (var type : TypeResolver.getAllSuperTypes(thing)) {
      this.sendMessage(new ObjectChangedEvent(thing, eventKind), type, null);
    }
  }

  /**
   * Clears all the subscriptions that exist on the Message Bus.
   */
  public void clearSubscriptions() {
    this.messageBus.clear();
  }
}
