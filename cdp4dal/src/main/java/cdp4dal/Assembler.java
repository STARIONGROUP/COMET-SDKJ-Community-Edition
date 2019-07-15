/*
 * Assembler.java
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

import static cdp4common.helpers.Utils.as;

import cdp4common.AggregationKind;
import cdp4common.ChangeKind;
import cdp4common.UmlInformation;
import cdp4common.commondata.ClassKind;
import cdp4common.commondata.Thing;
import cdp4common.dto.IterationSetup;
import cdp4common.engineeringmodeldata.EngineeringModel;
import cdp4common.engineeringmodeldata.Iteration;
import cdp4common.engineeringmodeldata.Relationship;
import cdp4common.helpers.PojoThingFactory;
import cdp4common.sitedirectorydata.EngineeringModelSetup;
import cdp4common.sitedirectorydata.ReferenceDataLibrary;
import cdp4common.sitedirectorydata.SiteDirectory;
import cdp4common.types.CacheKey;
import cdp4common.types.OrderedItem;
import cdp4dal.events.EventKind;
import cdp4dal.events.ObjectChangedEvent;
import com.google.common.base.Stopwatch;
import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import com.google.common.collect.Lists;
import com.google.common.collect.MoreCollectors;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.log4j.Log4j2;
import org.apache.commons.lang3.reflect.FieldUtils;
import org.apache.commons.lang3.tuple.Pair;

/**
 * The Assembler orchestrates the interaction with the DAL and the related Cache
 */
@Log4j2
public class Assembler {

  /**
   * The {@link URI} associated with this assembler
   */
  @Getter
  private final URI dalUri;

  /**
   * The lock object
   */
  private Semaphore threadLock = new Semaphore(1);

  /**
   * The unique {@link SiteDirectory}
   */
  private SiteDirectory siteDirectory;

  /**
   * The list of {@link Thing} marked for deletion
   */
  private List<Thing> thingsMarkedForDeletion;

  /**
   * The {@link List} not completely resolved that are in the cache.
   */
  private List<cdp4common.dto.Thing> unresolvedDtos;

  /**
   * Initializes a new instance of the {@link Assembler} class.
   *
   * @param uri The {@link URI} associated with this {@link Assembler}.
   */
  public Assembler(URI uri) {
    Utils.assertNotNull(uri, "The URI may not be null");

    this.cache = CacheBuilder.newBuilder().build();
    this.unresolvedDtos = new ArrayList<>();
    this.dalUri = uri;
  }

  /**
   * Gets the Cache that contains all the {@link Thing}s
   */
  @Getter
  private Cache<CacheKey, Thing> cache;

  /**
   * Gets or sets the list of {@link cdp4common.dto.Thing} to update
   */
  @Getter
  @Setter
  private List<cdp4common.dto.Thing> dtoThingToUpdate;

  /**
   * Synchronize the Cache give a {@link List} of DTO {@link Thing}.
   *
   * @param dtoThings The DTOs.
   * @param activeMessageBus An optional value indicating whether the {@link CDPMessageBus} should
   * publish {@link ObjectChangedEvent} or not. By default should be set to {@code true}.
   * @return The {@link CompletableFuture} that can be awaited.
   */
  public CompletableFuture<Void> synchronize(List<cdp4common.dto.Thing> dtoThings,
      boolean activeMessageBus) {
    if (dtoThings == null) {
      throw new NullPointerException("The dtoThings may not be null.");
    }

    return CompletableFuture.runAsync(() -> {
      try {
        this.threadLock.acquire();
        var synchronizeStopWatch = Stopwatch.createStarted();

        log.info("Start Synchronization of {}", this.dalUri);

        this.updateThingRevisions(dtoThings);

        this.thingsMarkedForDeletion = new ArrayList<>();

        log.trace("Starting Clean-up Unused references");
        var startWatch = Stopwatch.createStarted();

        var existentUUID =
            this.cache
                .asMap()
                .entrySet()
                .stream()
                .map(x -> Pair.of(x.getKey(), x.getValue().getRevisionNumber()))
                .collect(Collectors.toList());

        this.dtoThingToUpdate = Lists.newArrayList(dtoThings);

        // Add the unresolved thing to the things to resolved in case it is possible to fully resolve
        // them with the current update. An example would be Citation contained by SiteDirectory
        // where its Source is contained by a Rdl that is not loaded yet
        var unresolvedThingToUpdate = this.unresolvedDtos
            .stream()
            .filter(x -> !this.dtoThingToUpdate.stream().map(cdp4common.dto.Thing::getIid)
                .collect(Collectors.toList()).contains(x.getIid()))
            .collect(Collectors.toList());

        this.dtoThingToUpdate.addAll(unresolvedThingToUpdate);
        this.unresolvedDtos.clear();

        if (this.cache.size() != 0) {
          // marks things for deletion
          this.computeThingsToRemoveInUpdatedThings();
          startWatch.stop();
          log.trace("Clean up Unused references took {} [ms]",
              startWatch.elapsed(TimeUnit.MILLISECONDS));
        }

        log.trace("Start Updating cache");
        startWatch = Stopwatch.createStarted();
        this.addOrUpdateTheCache(this.dtoThingToUpdate);
        startWatch.stop();
        log.trace("Updating cache took {} [ms]", startWatch.elapsed(TimeUnit.MILLISECONDS));

        log.trace("Start Resolving properties");
        startWatch = Stopwatch.createStarted();
        PojoThingFactory.resolveDependencies(this.dtoThingToUpdate, this.cache);
        startWatch.stop();
        log.trace("Resolving properties took {} [ms]", startWatch.elapsed(TimeUnit.MILLISECONDS));

        // validate POJO's
        log.trace("Start validating Things");
        startWatch = Stopwatch.createStarted();
        for (var dtoThing : this.dtoThingToUpdate) {
          var cacheKey = new CacheKey(dtoThing.getIid(), dtoThing.getIterationContainerId());
          var updatedThing = this.cache.getIfPresent(cacheKey);

          if (updatedThing != null) {
            updatedThing.validatePojo();

            // add to the list of unresolved dtos if there is an error
            if (!updatedThing.getValidationErrors().isEmpty()) {
              this.unresolvedDtos.add(dtoThing);
            }
          }
        }
        startWatch.stop();
        log.trace("Validating {} Things took {} [ms]", this.dtoThingToUpdate.size(),
            startWatch.elapsed(TimeUnit.MILLISECONDS));

        // message added and updated POJO's
        if (activeMessageBus) {
          log.trace("Start Messaging");
          startWatch = Stopwatch.createStarted();

          var messageCounter = 0;

          for (var dtoThing : this.dtoThingToUpdate) {
            var cacheKey = new CacheKey(dtoThing.getIid(), dtoThing.getIterationContainerId());
            var updatedThing = this.cache.getIfPresent(cacheKey);

            if (updatedThing != null) {
              var cacheId = new CacheKey(dtoThing.getIid(), dtoThing.getIterationContainerId());
              if (!existentUUID.stream().map(Pair::getLeft).collect(Collectors.toList())
                  .contains(cacheId)) {
                CDPMessageBus.getCurrent().sendObjectChangeEvent(updatedThing, EventKind.ADDED);
                messageCounter++;
              } else if (dtoThing.getRevisionNumber() > existentUUID.stream()
                  .filter(x -> x.getLeft().equals(cacheId)).collect(
                      MoreCollectors.onlyElement()).getRight()) {
                // send event only if revision number has increased from the old cached version
                CDPMessageBus.getCurrent().sendObjectChangeEvent(updatedThing, EventKind.UPDATED);
                messageCounter++;
              }
            }
          }

          startWatch.stop();
          log.trace("Messaging {} Things took {} [ms]", messageCounter,
              startWatch.elapsed(TimeUnit.MILLISECONDS));
        }

        log.trace("Start Deleting things");
        startWatch = Stopwatch.createStarted();
        for (var markedThing : this.thingsMarkedForDeletion.stream()
            .filter(x -> x.getChangeKind() == ChangeKind.DELETE).collect(Collectors.toList())) {
          this.removeThingFromCache(markedThing);
        }

        List<IterationSetup> deletedIterationSetups = this.dtoThingToUpdate
            .stream()
            .filter(x -> x instanceof cdp4common.dto.IterationSetup)
            .map(x -> (IterationSetup) x)
            .filter(IterationSetup::isDeleted)
            .collect(Collectors.toList());

        var deletedModelSetups = this.thingsMarkedForDeletion
            .stream()
            .filter(x -> x instanceof EngineeringModelSetup)
            .map(x -> (EngineeringModelSetup) x)
            .collect(Collectors.toList());

        this.thingsMarkedForDeletion.clear();

        if (deletedIterationSetups.size() > 0) {
          for (var deletedIterationSetup : deletedIterationSetups) {
            this.markAndDelete(deletedIterationSetup.getIterationIid());
          }
        }

        if (deletedModelSetups.size() > 0) {
          for (var deletedModelSetup : deletedModelSetups) {
            this.markAndDelete(deletedModelSetup.getEngineeringModelIid());
          }
        }

        startWatch.stop();
        log.trace("Deleting things took {} [ms]", startWatch.elapsed(TimeUnit.MILLISECONDS));

        this.dtoThingToUpdate.clear();

        if (this.siteDirectory == null) {
          var keyValuePair =
              this.cache.asMap().entrySet()
                  .stream()
                  .filter(item -> item.getValue().getClassKind() == ClassKind.SiteDirectory)
                  .collect(
                      MoreCollectors.onlyElement());

          this.siteDirectory = (SiteDirectory) keyValuePair.getValue();
        }

        log.info("Finish Synchronization of {} in {} [ms]", this.dalUri,
            synchronizeStopWatch.elapsed(TimeUnit.MILLISECONDS));
      } catch (InterruptedException e) {
        log.error("Unexpectedly synchronization thread was interrupted with message: {}",
            e.getMessage());
      } catch (Exception e) {
        log.error(e.getMessage());
      } finally {
        this.threadLock.release();
        log.trace("Assembler thread released");
      }
    });
  }

  /**
   * For each DTO that is coming from the data-source, create a clone of the associated cached POJO
   * and store this clone in the {@link Thing#getRevisions()} dictionary. If the revision of the DTO
   * is smaller that the revision of the the cached POJO, it is a DTO that represents the state of a
   * DTO from the past.
   *
   * @param dtoThings the DTO's coming from the data-source.
   */
  private void updateThingRevisions(List<cdp4common.dto.Thing> dtoThings) {
    // create and store a shallow clone of the a current cached Thing
    var revisionCloneWatch = Stopwatch.createStarted();

    for (var dto : dtoThings) {
      var cacheKey = new CacheKey(dto.getIid(), dto.getIterationContainerId());

      var currentThing = this.cache.getIfPresent(cacheKey);
      if (currentThing != null) {
        if (dto.getRevisionNumber() > currentThing.getRevisionNumber()) {
          if (!currentThing.getRevisions().containsKey(currentThing.getRevisionNumber())) {
            currentThing.getRevisions()
                .put(currentThing.getRevisionNumber(), currentThing.clone(false));
            log.trace("Revision {} added to Revisions of {}:{}", currentThing.getRevisionNumber(),
                currentThing.getClassKind(), currentThing.getIid());
          } else {
            log.trace("Revision {} of Thing {}:{} already exists in the Thing.Revisions cache",
                currentThing.getRevisionNumber(), currentThing.getClassKind(),
                currentThing.getIid());
          }

          continue;
        }

        if (dto.getRevisionNumber() == currentThing.getRevisionNumber()) {
          log.trace(
              "A DTO with revision {} equal to the revision of the existing POJO {}:{}:{} has been identified; The data-source has sent a revision of an object that is already present in the cache",
              dto.getRevisionNumber(), currentThing.getClassKind(),
              currentThing.getCacheKey().getThing(), currentThing.getCacheKey().getIteration());

          continue;
        }

        if (dto.getRevisionNumber() < currentThing.getRevisionNumber()) {
          log.trace(
              "A DTO with revision {} smaller than the revision {} of the existing POJO {}:{} has been identified, the data; The data-source has sent a revision from the past",
              dto.getRevisionNumber(), currentThing.getRevisionNumber(),
              currentThing.getCacheKey().getThing(), currentThing.getCacheKey().getIteration());
        }
      }
    }

    log.info("Updating Thing.Revisions took {} [ms]",
        revisionCloneWatch.elapsed(TimeUnit.MILLISECONDS));
  }

  /**
   * Clears the cache and sends removed event for the following classes: {@link EngineeringModel},
   * {@link EngineeringModelSetup}, {@link Iteration}, {@link IterationSetup}
   *
   * @return The {@link CompletableFuture}.
   */
  public CompletableFuture<Void> clear() {
    return CompletableFuture.runAsync(() -> {
      try {
        this.threadLock.acquire();
        var iterations =
            this.cache
                .asMap()
                .values()
                .stream()
                .filter(x -> x.getClassKind() == ClassKind.Iteration)
                .map(x -> (Iteration) x)
                .collect(Collectors.toList());

        for (var iteration : iterations) {
          if (iteration.getIterationSetup() != null) {
            CDPMessageBus.getCurrent()
                .sendObjectChangeEvent(iteration.getIterationSetup(), EventKind.REMOVED);
            log.trace("IterationSetup with iid {} removed", iteration.getIterationSetup().getIid());
          }

          CDPMessageBus.getCurrent().sendObjectChangeEvent(iteration, EventKind.REMOVED);
          log.trace("Iteration with iid {} removed", iteration.getIid());
        }

        var models =
            this.cache
                .asMap()
                .values()
                .stream()
                .filter(x -> x.getClassKind() == ClassKind.EngineeringModel)
                .map(x -> (EngineeringModel) x)
                .collect(Collectors.toList());

        for (var model : models) {
          if (model.getEngineeringModelSetup() != null) {
            CDPMessageBus.getCurrent()
                .sendObjectChangeEvent(model.getEngineeringModelSetup(), EventKind.REMOVED);
            log.trace("EngineeringModelSetup with iid {} removed",
                model.getEngineeringModelSetup().getIid());
          }

          CDPMessageBus.getCurrent().sendObjectChangeEvent(model, EventKind.REMOVED);
          log.trace("Model with iid {} removed", model.getIid());
        }

        this.siteDirectory = null;
        this.cache.invalidateAll();
      } catch (InterruptedException e) {
        log.error("Unexpectedly clear thread was interrupted with message: {}", e.getMessage());
      } catch (Exception e) {
        log.error(e.getMessage());
      } finally {
        this.threadLock.release();
      }
    });
  }

  /**
   * Close a {@link ReferenceDataLibrary} by clearing all its contained elements.
   *
   * @param rdl The {@link ReferenceDataLibrary} to close.
   * @return The {@link CompletableFuture}.
   */
  public CompletableFuture<Void> closeRdl(ReferenceDataLibrary rdl) {
    return CompletableFuture.runAsync(() -> {
      try {
        this.threadLock.acquire();
        var startWatch = Stopwatch.createStarted();
        this.thingsMarkedForDeletion = new ArrayList<>();

        rdl.getDefinedCategory().forEach(this::recursivelyMarksForRemoval);
        rdl.getParameterType().forEach(this::recursivelyMarksForRemoval);
        rdl.getScale().forEach(this::recursivelyMarksForRemoval);
        rdl.getUnitPrefix().forEach(this::recursivelyMarksForRemoval);
        rdl.getUnit().forEach(this::recursivelyMarksForRemoval);
        rdl.getFileType().forEach(this::recursivelyMarksForRemoval);
        rdl.getGlossary().forEach(this::recursivelyMarksForRemoval);
        rdl.getReferenceSource().forEach(this::recursivelyMarksForRemoval);
        rdl.getRule().forEach(this::recursivelyMarksForRemoval);
        rdl.getConstant().forEach(this::recursivelyMarksForRemoval);

        rdl.getDefinedCategory().clear();
        rdl.getParameterType().clear();
        rdl.getScale().clear();
        rdl.getUnitPrefix().clear();
        rdl.getUnit().clear();
        rdl.getFileType().clear();
        rdl.getGlossary().clear();
        rdl.getReferenceSource().clear();
        rdl.getRule().clear();
        rdl.getConstant().clear();
        rdl.getBaseQuantityKind().clear();
        rdl.getBaseUnit().clear();

        for (var thing : this.thingsMarkedForDeletion) {
          this.removeThingFromCache(thing);
        }

        CDPMessageBus.getCurrent().sendObjectChangeEvent(rdl, EventKind.UPDATED);

        this.thingsMarkedForDeletion.clear();
        log.trace("Finish closing of {} ({}) in {} [ms]", rdl.getName(), this.dalUri,
            startWatch.elapsed(TimeUnit.MILLISECONDS));
      } catch (InterruptedException e) {
        log.error("Unexpectedly close RDL thread was interrupted with message: {}", e.getMessage());
      } catch (Exception e) {
        log.error(e.getMessage());
      } finally {
        this.threadLock.release();
      }
    });
  }

  /**
   * Close a {@link ReferenceDataLibrary} by clearing all its contained elements.
   *
   * @param iterationSetup The {@link IterationSetup} to close.
   * @return The {@link CompletableFuture}.
   */
  public CompletableFuture<Void> closeIterationSetup(
      cdp4common.sitedirectorydata.IterationSetup iterationSetup) {
    return CompletableFuture.runAsync(() -> {
      try {
        this.threadLock.acquire();
        var cacheKey = new CacheKey(iterationSetup.getIterationIid(), null);
        var iterationFromCache = this.cache.getIfPresent(cacheKey);

        if (iterationFromCache == null) {
          this.threadLock.release();
          return;
        }

        var iteration = as(iterationFromCache, Iteration.class);
        if (iteration == null) {
          this.threadLock.release();
          return;
        }

        // Delete from the cache all things contained by the iteration without blocking the UI
        this.clearFromCacheThingsContainedByIteration(iteration);
      } catch (InterruptedException e) {
        log.error("Unexpectedly close RDL thread was interrupted with message: {}", e.getMessage());
      } catch (Exception e) {
        log.error(e.getMessage());
      } finally {
        this.threadLock.release();
      }
    });
  }

  /**
   * Clear from cache things contained by iteration.
   *
   * @param iteration The iteration.
   */
  private void clearFromCacheThingsContainedByIteration(Iteration iteration) {
    var startWatch = Stopwatch.createStarted();

    this.thingsMarkedForDeletion = new ArrayList<>();
    this.recursivelyMarksForRemoval(iteration);
    this.thingsMarkedForDeletion.forEach(this::removeThingFromCache);
    this.thingsMarkedForDeletion.clear();
    log.trace("Finish closing iteration {} ({}) in {} [ms]", iteration.getIid(), this.dalUri,
        startWatch.elapsed(TimeUnit.MILLISECONDS));
  }

  /**
   * Retrieves the single {@link SiteDirectory} of this {@link Assembler}.
   *
   * @return The {@link SiteDirectory}.
   */
  public SiteDirectory retrieveSiteDirectory() {
    return this.siteDirectory;
  }

  /**
   * Checks the status of the updated {@code DTO}s in the Cache.
   */
  private void computeThingsToRemoveInUpdatedThings() {
    for (var dtoThing : this.dtoThingToUpdate) {
      this.computeThingsToRemove(dtoThing);
    }
  }

  /**
   * Removes {@link Thing}s part of a composition with the {@link Thing} associated to the {@link
   * cdp4common.dto.Thing} if the references are no longer in the updated {@link
   * cdp4common.dto.Thing}
   *
   * @param dtoThing The {@link cdp4common.dto.Thing} to check.
   */
  private void computeThingsToRemove(cdp4common.dto.Thing dtoThing) {
    var cacheKey = new CacheKey(dtoThing.getIid(), dtoThing.getIterationContainerId());
    var cachedThing = this.cache.getIfPresent(cacheKey);
    if (cachedThing == null) {
      return;
    }

    var dtoContainedUUID = this.computeContainedUUID(dtoThing);
    var pojoContainedThing = this.computeContainedThing(cachedThing);

    var thingsToRemove = pojoContainedThing
        .stream()
        .filter(pojo -> !dtoContainedUUID.contains(pojo.getIid()))
        .collect(Collectors.toList());
    for (var thing : thingsToRemove) {
      // isPersistent
      this.recursivelyMarksForRemoval(thing);
    }
  }

  /**
   * Get the non-persistent property type in a {@link Thing}.
   *
   * @param thing The {@link Thing}.
   * @return An {@link List<Class>} containing the type of {@link Thing}s that are not persistent in
   * the {@code thing}.
   */
  private List<Class> computeNonPersistentPropertyType(Thing thing) {
    var nonPersistentType = new ArrayList<Class>();

    var fields = FieldUtils.getFieldsWithAnnotation(thing.getClass(), UmlInformation.class);
    for (var field : fields) {
      var metadata = field.getAnnotation(UmlInformation.class);
      if (metadata.aggregation() == AggregationKind.COMPOSITE && !metadata.isPersistent()) {
        Type genericFieldType = field.getGenericType();
        if (genericFieldType instanceof ParameterizedType) {
          ParameterizedType aType = (ParameterizedType) genericFieldType;
          Type[] fieldArgTypes = aType.getActualTypeArguments();
          if (fieldArgTypes.length > 1) {
            throw new IllegalArgumentException(
                "Non persistent property type must not contain more than 1 generic type.");
          }

          Class fieldArgClass = (Class) fieldArgTypes[0];
          nonPersistentType.add(fieldArgClass);
        }
      }
    }

    return nonPersistentType;
  }

  /**
   * Compute the contained {@link UUID} for a {@link cdp4common.dto.Thing}.
   *
   * @param dto The {@link cdp4common.dto.Thing} to compute.
   * @return A {@link List<UUID>} containing all the contained {@link UUID}.
   */
  private List<UUID> computeContainedUUID(cdp4common.dto.Thing dto) {
    var containedUUID = new ArrayList<UUID>();
    for (var container : dto.getContainerLists()) {
      for (var obj : container) {
        var orderedItem = as(obj, OrderedItem.class);
        if (orderedItem != null) {
          containedUUID.add(UUID.fromString(orderedItem.getV().toString()));
        } else {
          containedUUID.add((UUID) obj);
        }
      }
    }

    return containedUUID;
  }

  /**
   * Compute the contained {@link Thing} for a {@link Thing}.
   *
   * @param thing The {@link Thing} to compute.
   * @return A {@link List<Thing>} containing all the contained {@link Thing}.
   */
  private List<Thing> computeContainedThing(Thing thing) {
    var containedUUID = new ArrayList<Thing>();
    var nonPersistentType = this.computeNonPersistentPropertyType(thing);

    for (var container : thing.getContainerLists()) {
      if (container == null || container.isEmpty()) {
        continue;
      }

      var type = ((List) container).get(0).getClass();
      if (nonPersistentType.contains(type)) {
        // non-persistent things are not added
        continue;
      }

      containedUUID.addAll(container);
    }

    return containedUUID;
  }

  /**
   * Recursively marks a {@link Thing} for removal and all its contained {@link Thing}.
   *
   * @param thingToRemove The {@link Thing} to remove.
   */
  private void recursivelyMarksForRemoval(Thing thingToRemove) {
    for (var containerList : thingToRemove.getContainerLists()) {
      for (var thing : containerList) {
        this.recursivelyMarksForRemoval((Thing) thing);
      }
    }

    // marks thing for deletion
    thingToRemove.setChangeKind(ChangeKind.DELETE);
    this.thingsMarkedForDeletion.add(thingToRemove);
  }

  /**
   * Remove a {@link Thing} from the cache.
   *
   * @param thingToRemove The {@link Thing} to remove.
   * @return True if the operation succeeded, otherwise false.
   */
  private boolean removeThingFromCache(Thing thingToRemove) {
    var thing = this.cache.getIfPresent(thingToRemove.getCacheKey());
    var succeed = thing != null;
    if (succeed) {
      this.cache.invalidate(thingToRemove.getCacheKey());
      if (thing instanceof Relationship) {
        ((Relationship) thing).cleanReferencedThingRelationship();
      }

      CDPMessageBus.getCurrent().sendObjectChangeEvent(thing, EventKind.REMOVED);
    } else {
      log.trace("Remove of thing with getIid() {} succeeded : {}", thingToRemove, succeed);
    }
    return succeed;
  }

  /**
   * Add/Update a set of {key, value} in the cache with POJO which referenced properties have not
   * been resolved yet.
   *
   * @param dtoThings The DTO {@link Thing} with data.
   */
  private void addOrUpdateTheCache(List<cdp4common.dto.Thing> dtoThings) {
    var dtoList = Lists.newArrayList(dtoThings);

    for (var dto : dtoList) {
      if (dto.getIid() == null || dto.getIid().equals(new UUID(0L, 0L))) {
        throw new IllegalArgumentException(
            "Cannot add DTO with a null UUID or UUID(0L, 0L) reference to the Cache:"
                + dto.getClassKind());
      }

      var cacheKey = new CacheKey(dto.getIid(), dto.getIterationContainerId());
      try {
        this.cache.get(cacheKey, () -> dto.instantiatePojo(this.cache, this.dalUri));
      } catch (ExecutionException e) {
        log.error("Unexpected ExecutionException during add/update cache with message: " + e
            .getMessage());
      }
    }
  }

  /**
   * Delete all {@link Thing}s contained the {@link Thing} with the given {@link UUID}. This is used
   * to delete {@link Iteration} and {@link EngineeringModel} when their respective setup was
   * deleted.
   *
   * @param guid The {@link UUID}.
   */
  private void markAndDelete(UUID guid) {
    var cachedThing = this.cache.getIfPresent(new CacheKey(guid, null));
    if (cachedThing != null) {
      this.thingsMarkedForDeletion.clear();
      this.recursivelyMarksForRemoval(cachedThing);
      for (var markedThing : this.thingsMarkedForDeletion) {
        this.removeThingFromCache(markedThing);
      }

      this.thingsMarkedForDeletion.clear();
    }
  }
}

