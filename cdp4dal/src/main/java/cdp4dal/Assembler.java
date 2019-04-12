package cdp4dal;

import cdp4common.AggregationKind;
import cdp4common.ChangeKind;
import cdp4common.commondata.ClassKind;
//import cdp4common.types.CacheKey;
import cdp4dal.events.EventKind;
import com.google.common.base.Stopwatch;
import java.util.List;
import java.util.UUID;

/**
* The Assembler orchestrates the interaction with the DAL and the related Cache
*/
public class Assembler {
//  /**
//  * The {@link Uri} associated with this assembler
//  */
//  public readonly Uri IDalUri;
//
//  /**
//  * The current logger
//  */
//  private static Logger logger = LogManager.GetCurrentClassLogger();
//
//  /**
//  * The lock object
//  */
//  private SemaphoreSlim threadLock = new SemaphoreSlim(1);
//
//  /**
//  * The unique {@link SiteDirectory}
//  */
//  private SiteDirectory siteDirectory;
//
//  /**
//  * The list of {@link Thing} marked for deletion
//  */
//  private List<Thing> thingsMarkedForDeletion;
//
//  /**
//  * The {@link List{Dto}} not completely resolved that are in the cache
//  */
//  private List<Dto> unresolvedDtos;
//
//  /**
//  * Initializes a new instance of the {@link Assembler} class.
//  *
//  * @param urithe {@link Uri} associated with this {@link Assembler}
//   */
//  public Assembler(Uri uri)
//  {
//    Utils.AssertNotNull(uri, "The Uri may not be mull");
//
//    this.Cache = new ConcurrentDictionary<CacheKey, Lazy<Thing>>();
//    this.unresolvedDtos = new List<Dto>();
//    this.IDalUri = uri;
//  }
//
//  /**
//  * Gets the Cache that contains all the {@link Thing}s
//  */
//  public ConcurrentDictionary<CacheKey, Lazy<Thing>> Cache { get; private set; }
//
//  /**
//  * Gets or sets the list of {@link CDP4Common.DTO.Thing} to update
//  */
//  private List<CDP4Common.DTO.Thing> DtoThingToUpdate { get; set; }
//
//  /**
//  * Synchronize the Cache give an IEnumerable of DTO {@link Thing}
//  *
//  * @param dtoThings
//  * the DTOs
//  *
//  * @param activeMessageBus
//  * An optional value indicating whether the {@link CDPMessageBus} should publish {@link ObjectChangedEvent} or not.
//  * The default value is true
//  *
//  * @return
//  * The {@link Task} that can be awaited.
//  */
//  public async Task Synchronize(IEnumerable<CDP4Common.DTO.Thing> dtoThings, bool activeMessageBus = true)
//  {
//    if (dtoThings == null)
//    {
//      throw new ArgumentNullException(nameof(dtoThings), $"The {nameof(dtoThings)} may not be null");
//    }
//
//    await this.threadLock.WaitAsync().ConfigureAwait(false);
//    try
//    {
//      var synchronizeStopWatch = Stopwatch.StartNew();
//
//      logger.Info("Start Synchronization of {0}", this.IDalUri);
//
//      this.UpdateThingRevisions(dtoThings);
//
//      this.thingsMarkedForDeletion = new List<Thing>();
//
//      logger.Trace("Starting Clean-up Unused references");
//      var startwatch = Stopwatch.StartNew();
//
//      var existentUUID =
//          this.Cache.Select(
//              x => new Tuple<CacheKey, int>(x.Value.Value.CacheKey, x.Value.Value.RevisionNumber))
//                        .ToList();
//
//      this.DtoThingToUpdate = dtoThings.ToList();
//
//      // Add the unresolved thing to the things to resolved in case it is possible to fully resolve them with the current update
//      // an example would be Citation contained by SiteDirectory where its Source is contained by a Rdl that is not loaded yet
//      var unresolvedThingToUpdate = this.unresolvedDtos.Where(x => !this.DtoThingToUpdate.Select(y => y.Iid).Contains(x.Iid));
//      this.DtoThingToUpdate.AddRange(unresolvedThingToUpdate);
//      this.unresolvedDtos.Clear();
//
//      if (!this.Cache.IsEmpty)
//      {
//        // marks things for deletion
//        this.ComputeThingsToRemoveInUpdatedThings();
//        startwatch.Stop();
//        logger.Trace("Clean up Unused references took {0} [ms]", startwatch.ElapsedMilliseconds);
//      }
//
//      logger.Trace("Start Updating cache");
//      startwatch = Stopwatch.StartNew();
//      this.AddOrUpdateTheCache(this.DtoThingToUpdate);
//      startwatch.Stop();
//      logger.Trace("Updating cache took {0} [ms]", startwatch.ElapsedMilliseconds);
//
//      logger.Trace("Start Resolving properties");
//      startwatch = Stopwatch.StartNew();
//      PocoThingFactory.ResolveDependencies(this.DtoThingToUpdate, this.Cache);
//      startwatch.Stop();
//      logger.Trace("Resolving properties took {0} [ms]", startwatch.ElapsedMilliseconds);
//
//      // validate POCO's
//      logger.Trace("Start validating Things");
//      startwatch = Stopwatch.StartNew();
//      foreach (var dtoThing in this.DtoThingToUpdate)
//      {
//        Lazy<Thing> updatedLazyThing;
//        var cacheKey = new CacheKey(dtoThing.Iid, dtoThing.IterationContainerId);
//        var succeed = this.Cache.TryGetValue(cacheKey, out updatedLazyThing);
//
//        if (succeed)
//        {
//          var thingObject = updatedLazyThing.Value;
//          thingObject.ValidatePoco();
//
//          // add to the list of unresolved dtos if there is an error
//          if (thingObject.ValidationErrors.Any())
//          {
//            this.unresolvedDtos.Add(dtoThing);
//          }
//        }
//      }
//      startwatch.Stop();
//      logger.Trace("Validating {0} Things took {1} [ms]", this.DtoThingToUpdate.Count, startwatch.ElapsedMilliseconds);
//
//      // message added and updated POCO's
//      if (activeMessageBus)
//      {
//        logger.Trace("Start Messaging");
//        startwatch = Stopwatch.StartNew();
//
//        var messageCounter = 0;
//
//        foreach (var dtoThing in this.DtoThingToUpdate)
//        {
//          Lazy<Thing> updatedLazyThing;
//          var cacheKey = new CacheKey(dtoThing.Iid, dtoThing.IterationContainerId);
//          var succeed = this.Cache.TryGetValue(cacheKey, out updatedLazyThing);
//
//          if (succeed)
//          {
//            var thingObject = updatedLazyThing.Value;
//            var cacheId = new CacheKey(dtoThing.Iid, dtoThing.IterationContainerId);
//            if (!existentUUID.Select(x => x.Item1).Contains(cacheId))
//            {
//              CDPMessageBus.Current.SendObjectChangeEvent(thingObject, EventKind.Added);
//              messageCounter++;
//            }
//                            else if (dtoThing.RevisionNumber > existentUUID.Single(x => x.Item1.Equals(cacheId)).Item2)
//            {
//              // send event only if revision number has increased from the old cached version
//              CDPMessageBus.Current.SendObjectChangeEvent(thingObject, EventKind.Updated);
//              messageCounter++;
//            }
//          }
//        }
//
//        startwatch.Stop();
//        logger.Trace("Messaging {0} Things took {1} [ms]", messageCounter, startwatch.ElapsedMilliseconds);
//      }
//
//      logger.Trace("Start Deleting things");
//      startwatch = Stopwatch.StartNew();
//      foreach (var markedThing in this.thingsMarkedForDeletion.Where(x => x.ChangeKind == ChangeKind.Delete))
//      {
//        this.RemoveThingFromCache(markedThing);
//      }
//
//      var deletedIterationSetups = this.DtoThingToUpdate.OfType<CDP4Common.DTO.IterationSetup>().Where(x => x.IsDeleted).ToList();
//      var deletedModelSetups = this.thingsMarkedForDeletion.OfType<EngineeringModelSetup>().ToList();
//      this.thingsMarkedForDeletion.Clear();
//
//      if (deletedIterationSetups.Any())
//      {
//        foreach (var deletedIterationSetup in deletedIterationSetups)
//        {
//          this.MarkAndDelete(deletedIterationSetup.IterationIid);
//        }
//      }
//
//      if (deletedModelSetups.Any())
//      {
//        foreach (var deletedModelSetup in deletedModelSetups)
//        {
//          this.MarkAndDelete(deletedModelSetup.EngineeringModelIid);
//        }
//      }
//
//      startwatch.Stop();
//      logger.Trace("Deleting things took {0} [ms]", startwatch.ElapsedMilliseconds);
//
//      this.DtoThingToUpdate.Clear();
//
//      if (this.siteDirectory == null)
//      {
//        var keyvaluepair = this.Cache.Single(item => item.Value.Value.ClassKind == ClassKind.SiteDirectory);
//        this.siteDirectory = (SiteDirectory)keyvaluepair.Value.Value;
//      }
//
//      logger.Info("Finish Synchronization of {0} in {1} [ms]", this.IDalUri, synchronizeStopWatch.ElapsedMilliseconds);
//    }
//    catch (Exception e)
//    {
//      logger.Error(e.Message);
//    }
//    finally
//    {
//      this.threadLock.Release();
//      logger.Trace("Assembler thread released");
//    }
//  }
//
//  /**
//  * For each DTO that is coming from the data-source, create a clone of the associated cached POCO
//  * and store this clone in the {@link Thing.Revisions} dictionary
//  *
//  * @param dtoThings
//  * the DTO's coming from the data-source
//  *
//  *
//  * If the revision of the DTO is smaller that the revision of the the cached POCO, it is a DTO that represents
//  * the state of a DTO from the past.
//  */
//  private void UpdateThingRevisions(IEnumerable<CDP4Common.DTO.Thing> dtoThings)
//  {
//    // create and store a shallow clone of the a current cached Thing
//    var revisionCloneWatch = Stopwatch.StartNew();
//
//    foreach (var dto in dtoThings)
//    {
//      var cacheKey = new CacheKey(dto.Iid, dto.IterationContainerId);
//
//      if (this.Cache.TryGetValue(cacheKey, out var currentCachedThing))
//      {
//        var currentThing = currentCachedThing.Value;
//
//        if (dto.RevisionNumber > currentThing.RevisionNumber)
//        {
//          if (!currentThing.Revisions.ContainsKey(currentThing.RevisionNumber))
//          {
//            currentThing.Revisions.Add(currentThing.RevisionNumber, currentThing.Clone(false));
//            logger.Trace("Revision {0} added to Revisions of {1}:{2}", currentThing.RevisionNumber, currentThing.ClassKind, currentThing.Iid);
//          }
//          else
//          {
//            logger.Trace("Revision {0} of Thing {1}:{2} already exists in the Thing.Revisions cache", currentThing.RevisionNumber, currentThing.ClassKind, currentThing.Iid);
//          }
//
//          continue;
//        }
//
//        if (dto.RevisionNumber == currentThing.RevisionNumber)
//        {
//          logger.Trace("A DTO with revision {0} equal to the revision of the existing POCO {1}:{2}:{3} has been identified; The data-source has sent a revision of an object that is already present in the cache",
//              dto.RevisionNumber, currentThing.ClassKind, currentThing.CacheKey.Thing, currentThing.CacheKey.Iteration);
//
//          continue;
//        }
//
//        if (dto.RevisionNumber < currentThing.RevisionNumber)
//        {
//          logger.Trace("A DTO with revision {0} smaller than the revision {1} of the existing POCO {2}:{3} has been identified, the data; The data-source has sent a revision from the past",
//              dto.RevisionNumber, currentThing.RevisionNumber, currentThing.CacheKey.Thing, currentThing.CacheKey.Iteration);
//        }
//      }
//    }
//
//    logger.Info("Updating Thing.Revisions took {0} [ms]", revisionCloneWatch.ElapsedMilliseconds);
//  }
//
//  /**
//  * Clears the cache and sends removed event for the following classes:
//  * {@link EngineeringModel}, {@link EngineeringModelSetup}, {@link Iteration}, {@link IterationSetup}
//  *
//  * @returnThe {@link Task}
//   */
//  public async Task Clear()
//  {
//    await this.threadLock.WaitAsync().ConfigureAwait(false);
//    try
//    {
//      var iterations =
//          this.Cache.Select(x => x.Value)
//                        .Where(lazy => lazy.Value.ClassKind == ClassKind.Iteration)
//                        .Select(lazy => lazy.Value)
//                        .Cast<Iteration>();
//
//      foreach (var iteration in iterations)
//      {
//        if (iteration.IterationSetup != null)
//        {
//          CDPMessageBus.Current.SendObjectChangeEvent(iteration.IterationSetup, EventKind.Removed);
//          logger.Trace("IterationSetup with iid {0} removed", iteration.IterationSetup.Iid);
//        }
//
//        CDPMessageBus.Current.SendObjectChangeEvent(iteration, EventKind.Removed);
//        logger.Trace("Iteration with iid {0} removed", iteration.Iid);
//      }
//
//      var models =
//          this.Cache.Select(x => x.Value)
//                        .Where(lazy => lazy.Value.ClassKind == ClassKind.EngineeringModel)
//                        .Select(lazy => lazy.Value)
//                        .Cast<EngineeringModel>();
//
//      foreach (var model in models)
//      {
//        if (model.EngineeringModelSetup != null)
//        {
//          CDPMessageBus.Current.SendObjectChangeEvent(model.EngineeringModelSetup, EventKind.Removed);
//          logger.Trace("EngineeringModelSetup with iid {0} removed", model.EngineeringModelSetup.Iid);
//        }
//
//        CDPMessageBus.Current.SendObjectChangeEvent(model, EventKind.Removed);
//        logger.Trace("Model with iid {0} removed", model.Iid);
//      }
//
//      this.siteDirectory = null;
//      this.Cache.Clear();
//    }
//    catch (Exception e)
//    {
//      logger.Error(e.Message);
//    }
//    finally
//    {
//      this.threadLock.Release();
//    }
//  }
//
//  /**
//  * Close a {@link ReferenceDataLibrary} by clearing all its contained elements
//  *
//  * @param rdlThe {@link ReferenceDataLibrary} to close
//  * @returnThe async {@link Task}
//   */
//  public async Task CloseRdl(ReferenceDataLibrary rdl)
//  {
//    await this.threadLock.WaitAsync().ConfigureAwait(false);
//    try
//    {
//      var startwatch = Stopwatch.StartNew();
//      this.thingsMarkedForDeletion = new List<Thing>();
//      foreach (var category in rdl.DefinedCategory)
//      {
//        this.RecursivelyMarksForRemoval(category);
//      }
//
//      foreach (var parameterType in rdl.ParameterType)
//      {
//        this.RecursivelyMarksForRemoval(parameterType);
//      }
//
//      foreach (var measurementScale in rdl.Scale)
//      {
//        this.RecursivelyMarksForRemoval(measurementScale);
//      }
//
//      foreach (var unitPrefix in rdl.UnitPrefix)
//      {
//        this.RecursivelyMarksForRemoval(unitPrefix);
//      }
//
//      foreach (var measurementUnit in rdl.Unit)
//      {
//        this.RecursivelyMarksForRemoval(measurementUnit);
//      }
//
//      foreach (var filetype in rdl.FileType)
//      {
//        this.RecursivelyMarksForRemoval(filetype);
//      }
//
//      foreach (var glossary in rdl.Glossary)
//      {
//        this.RecursivelyMarksForRemoval(glossary);
//      }
//
//      foreach (var referenceSource in rdl.ReferenceSource)
//      {
//        this.RecursivelyMarksForRemoval(referenceSource);
//      }
//
//      foreach (var rule in rdl.Rule)
//      {
//        this.RecursivelyMarksForRemoval(rule);
//      }
//
//      foreach (var constant in rdl.Constant)
//      {
//        this.RecursivelyMarksForRemoval(constant);
//      }
//
//      rdl.DefinedCategory.Clear();
//      rdl.ParameterType.Clear();
//      rdl.Scale.Clear();
//      rdl.UnitPrefix.Clear();
//      rdl.Unit.Clear();
//      rdl.FileType.Clear();
//      rdl.Glossary.Clear();
//      rdl.ReferenceSource.Clear();
//      rdl.Rule.Clear();
//      rdl.Constant.Clear();
//      rdl.BaseQuantityKind.Clear();
//      rdl.BaseUnit.Clear();
//
//      foreach (var thing in this.thingsMarkedForDeletion)
//      {
//        this.RemoveThingFromCache(thing);
//      }
//
//      CDPMessageBus.Current.SendObjectChangeEvent(rdl, EventKind.Updated);
//
//      this.thingsMarkedForDeletion.Clear();
//      logger.Trace("Finish closing of {0} ({1}) in {2} [ms]", rdl.Name, this.IDalUri, startwatch.ElapsedMilliseconds);
//    }
//    catch (Exception e)
//    {
//      logger.Error(e.Message);
//    }
//    finally
//    {
//      this.threadLock.Release();
//    }
//  }
//
//  /**
//  * Close a {@link ReferenceDataLibrary} by clearing all its contained elements
//  *
//  * @param iterationSetup
//  * The {@link IterationSetup} to close
//  *
//  * @return
//  * The {@link Task}.
//  */
//  public async Task CloseIterationSetup(IterationSetup iterationSetup)
//  {
//    await this.threadLock.WaitAsync().ConfigureAwait(false);
//    try
//    {
//      Lazy<Thing> lazyIteration;
//      var cacheKey = new CacheKey(iterationSetup.IterationIid, null);
//
//      if (!this.Cache.TryGetValue(cacheKey, out lazyIteration))
//      {
//        this.threadLock.Release();
//        return;
//      }
//
//      var iteration = lazyIteration.Value as Iteration;
//      if (iteration == null)
//      {
//        this.threadLock.Release();
//        return;
//      }
//
//      // Delete from the cache all things contained by the iteration without blocking the UI
//      await this.ClearFromCacheThingsContainedByIteration(iteration);
//    }
//    catch (Exception e)
//    {
//      logger.Error(e.Message);
//    }
//    finally
//    {
//      this.threadLock.Release();
//    }
//  }
//
//  /**
//  * Clear from cache things contained by iteration.
//  *
//  * @param iteration
//  * The iteration.
//  *
//  * @return
//  * The {@link Task}.
//  */
//  private async Task ClearFromCacheThingsContainedByIteration(Iteration iteration)
//  {
//    var startwatch = Stopwatch.StartNew();
//
//    this.thingsMarkedForDeletion = new List<Thing>();
//    this.RecursivelyMarksForRemoval(iteration);
//    foreach (var thing in this.thingsMarkedForDeletion)
//    {
//      this.RemoveThingFromCache(thing);
//    }
//
//    this.thingsMarkedForDeletion.Clear();
//    logger.Trace("Finish closing iteration {0} ({1}) in {2} [ms]", iteration.Iid, this.IDalUri, startwatch.ElapsedMilliseconds);
//  }
//
//  /**
//  * Retrieves the single {@link SiteDirectory} of this {@link Assembler}
//  *
//  * @returnThe {@link SiteDirectory}
//   */
//  public SiteDirectory RetrieveSiteDirectory()
//  {
//    return this.siteDirectory;
//  }
//
//  /**
//  * Checks the status of the updated {@link Dto}s in the Cache
//  */
//  private void ComputeThingsToRemoveInUpdatedThings()
//  {
//    foreach (var dtoThing in this.DtoThingToUpdate)
//    {
//      this.ComputeThingsToRemove(dtoThing);
//    }
//  }
//
//  /**
//  * Removes {@link Thing}s part of a composition with the {@link Thing} associated to the {@link CDP4Common.DTO.Thing} if the references are no longer in the updated {@link CDP4Common.DTO.Thing}
//  *
//  * @param dtoThingthe {@link CDP4Common.DTO.Thing} to check
//   */
//  private void ComputeThingsToRemove(Dto dtoThing)
//  {
//    Lazy<Thing> cachedLazyThing;
//    var cacheKey = new CacheKey(dtoThing.Iid, dtoThing.IterationContainerId);
//    if (!this.Cache.TryGetValue(cacheKey, out cachedLazyThing))
//    {
//      return;
//    }
//
//    var dtoContainedUUID = this.ComputeContainedUUID(dtoThing);
//    var pocoContainedThing = this.ComputeContainedThing(cachedLazyThing.Value);
//
//    var thingsToRemove = pocoContainedThing.Where(poco => !dtoContainedUUID.Contains(poco.Iid)).ToList();
//    foreach (var thing in thingsToRemove)
//    {
//      // isPersistent
//      this.RecursivelyMarksForRemoval(thing);
//    }
//  }
//
//  /**
//  * Get the non-persistent property type in a {@link Thing}
//  *
//  * @param thingThe {@link Thing}
//  * @returnAn {@link List{Type}} containing the type of {@link Thing}s that are not persistent in the <paramref name="thing"/>
//   */
//  private List<Type> ComputeNonPersistentPropertyType(Thing thing)
//  {
//    var nonPersistentType = new List<Type>();
//
//    var propInfos = thing.GetType().GetProperties();
//    foreach (var propertyInfo in propInfos)
//    {
//      if(!propertyInfo.IsDefined(typeof(UmlInformationAttribute)))
//      {
//        continue;
//      }
//
//      var metadata = propertyInfo.GetCustomAttribute<UmlInformationAttribute>();
//      if (metadata.Aggregation == AggregationKind.Composite && !metadata.IsPersistent)
//      {
//        nonPersistentType.Add(propertyInfo.PropertyType.GetGenericArguments().Single());
//      }
//    }
//
//    return nonPersistentType;
//  }
//
//  /**
//  * Compute the contained {@link UUID} for a {@link Dto}
//  *
//  * @param dtoThe {@link Dto} to compute
//  * @returnAn {@link List{UUID}} containing all the contained {@link UUID}
//   */
//  private List<UUID> ComputeContainedUUID(Dto dto)
//  {
//    var containedUUID = new List<UUID>();
//    foreach (var container in dto.ContainerLists)
//    {
//      foreach (var obj in container)
//      {
//        var orderedItem = obj as OrderedItem;
//        if (orderedItem != null)
//        {
//          containedUUID.Add(new UUID(orderedItem.V.ToString()));
//        }
//        else
//        {
//          containedUUID.Add((UUID)obj);
//        }
//      }
//    }
//
//    return containedUUID;
//  }
//
//  /**
//  * Compute the contained {@link Thing} for a {@link Thing}
//  *
//  * @param thingThe {@link Thing} to compute
//  * @returnAn {@link List{Thing}} containing all the contained {@link Thing}
//   */
//  private List<Thing> ComputeContainedThing(Thing thing)
//  {
//    var containedUUID = new List<Thing>();
//    var nonPersistentType = this.ComputeNonPersistentPropertyType(thing);
//
//    foreach (var container in thing.ContainerLists)
//    {
//      var type = container.GetType();
//      var genericType = type.GetGenericArguments().Single();
//      if (nonPersistentType.Contains(genericType))
//      {
//        // non-persistent things are not added
//        continue;
//      }
//
//      containedUUID.AddRange(from Thing containedThing in container select containedThing);
//    }
//
//    return containedUUID;
//  }
//
//  /**
//  * Recursively marks a {@link Thing} for removal and all its contained {@link Thing}
//  *
//  * @param thingToRemovethe {@link Thing} to remove
//   */
//  private void RecursivelyMarksForRemoval(Thing thingToRemove)
//  {
//    foreach (var containerList in thingToRemove.ContainerLists)
//    {
//      foreach (Thing thing in containerList)
//      {
//        this.RecursivelyMarksForRemoval(thing);
//      }
//    }
//
//    // marks thing for deletion
//    thingToRemove.ChangeKind = ChangeKind.Delete;
//    this.thingsMarkedForDeletion.Add(thingToRemove);
//  }
//
//  /**
//  * Remove a {@link Thing} from the cache
//  *
//  * @param thingToRemoveThe {@link Thing} to remove
//  * @returnTrue if the operation succeeded
//   */
//  private bool RemoveThingFromCache(Thing thingToRemove)
//  {
//    Lazy<Thing> outLazy;
//    var succeed = this.Cache.TryRemove(thingToRemove.CacheKey, out outLazy);
//    if (succeed)
//    {
//      if (outLazy.Value is Relationship relationship)
//      {
//        relationship.CleanReferencedThingRelationship();
//      }
//
//      CDPMessageBus.Current.SendObjectChangeEvent(outLazy.Value, EventKind.Removed);
//    }
//
//    logger.Trace("Remove of thing with Iid {0} succeeded : {1}", thingToRemove, succeed);
//    return succeed;
//  }
//
//  /**
//  * Add/Update a set of {key, value} in the cache with POCO which referenced properties have not been resolved yet
//  *
//  * @param dtoThingsthe DTO {@link Thing} with data
//   */
//  private void AddOrUpdateTheCache(IEnumerable<CDP4Common.DTO.Thing> dtoThings)
//  {
//    var dtolist = dtoThings.ToList();
//
//    foreach (var dto in dtolist)
//    {
//      if (dto.Iid == UUID.Empty)
//      {
//        throw new ArgumentException($"Cannot add DTO with a UUID.Empty reference to the Cache: {dto.ClassKind}");
//      }
//
//      var cacheKey = new CacheKey(dto.Iid, dto.IterationContainerId);
//      this.Cache.AddOrUpdate(cacheKey, new Lazy<Thing>(() => dto.InstantiatePoco(this.Cache, this.IDalUri)), (key, oldValue) => oldValue);
//    }
//  }
//
//  /**
//  * Delete all {@link Thing}s contained the {@link Thing} with the given {@link UUID}
//  *
//  * @param guidThe {@link UUID}
//  *
//  * This is used to delete {@link Iteration} and {@link EngineeringModel} when thei respective setup was deleted
//  */
//  private void MarkAndDelete(UUID guid)
//  {
//    Lazy<Thing> lazy;
//    if (this.Cache.TryGetValue(new CacheKey(guid, null), out lazy))
//    {
//      this.thingsMarkedForDeletion.Clear();
//      this.RecursivelyMarksForRemoval(lazy.Value);
//      foreach (var markedThing in this.thingsMarkedForDeletion)
//      {
//        this.RemoveThingFromCache(markedThing);
//      }
//
//      this.thingsMarkedForDeletion.Clear();
//    }
//  }
}

