package cdp4dal;

//import cdp4common.types.CacheKey;
import cdp4dal.dal.Credentials;
import com.google.common.base.Stopwatch;
import cdp4dal.events.DomainChangedEvent;
import cdp4dal.events.SessionEvent;
import cdp4dal.events.SessionStatus;
import java.util.UUID;
import lombok.extern.log4j.Log4j2;
import org.checkerframework.checker.units.qual.A;

/**
* The {@link cdp4dal.Session} class encapsulates the {@link DAL.Credentials}, {@link IDal} and {@link CDP4Dal.Assembler}
* that constitute a user session with a data-source
*/
@Log4j2
public class SessionImpl {
//
//  /**
//  * Backing field for {@link ActivePerson}
//  */
//  private Person activePerson;
//
//  /**
//  * The cancelation token source.
//  */
//  private CancellationTokenSource cancelationTokenSource;
//
//  /**
//  * Backing field for {@link OpenReferenceDataLibraries}
//  */
//  private readonly List<ReferenceDataLibrary> openReferenceDataLibraries;
//
//  /**
//  * Contains the open {@link Iteration} along with the active {@link DomainOfExpertise} and {@link Participant}
//  */
//  private readonly Dictionary<Iteration, Tuple<DomainOfExpertise, Participant>> openIterations;
//
//  /**
//  * Initializes a new instance of the {@link cdp4dal.Session} class.
//  *
//  * @param dal
//  * the associated {@link IDal} that is used to communicate with the data-source
//  *
//  * @param credentials
//  * the {@link DAL.Credentials} associated to the {@link IDal}
//  */
//  public Session(IDal dal, Credentials credentials)
//  {
//    this.Credentials = credentials;
//    this.Dal = dal;
//    this.Dal.Session = this;
//    this.Assembler = new Assembler(credentials.Uri);
//    this.PermissionService = new PermissionService(this);
//    this.openReferenceDataLibraries = new List<ReferenceDataLibrary>();
//    this.openIterations = new Dictionary<Iteration, Tuple<DomainOfExpertise, Participant>>();
//  }
//
//  /**
//  * Gets the {@link Credentials} that are use to connect to the data source
//  */
//  public cdp4dal.dal.Credentials Credentials { get; private set; }
//
//  /**
//  * Gets the {@link IPermissionService} that handles access permissions for this {@link ISession}.
//  */
//  public IPermissionService PermissionService { get; private set; }
//
//  /**
//  * Gets the {@link IDal} that the current {@link cdp4dal.Session} communicates with
//  */
//  public IDal Dal { get; private set; }
//
//  /**
//  * Gets the version of the data-model that is supported by the associated {@link Dal}
//  */
//  public Version DalVersion
//  {
//    get { return this.Dal.DalVersion; }
//  }
//
//  /**
//  * Asserts whether the {@link Version} is supported by the connected {@link ISession.Dal}
//  *
//  * @param version
//  * The {@link Version} that is checked
//  *
//  * @return
//  * true if the version is supported, false if not
//  *
//  *
//  * A
//*
//  {@link Version} is supported when it is lower or equal than the {@link Version} of the connected {@link ISession.Dal}
//  */
//  public bool IsVersionSupported(Version version)
//  {
//    var comparison = version.CompareTo(this.DalVersion);
//    return comparison <= 0;
//  }
//
//  /**
//  * Gets the active {@link Person} in this {@link cdp4dal.Session}
//  */
//  public Person ActivePerson
//  {
//    get
//    {
//      if (this.activePerson != null)
//      {
//        return this.activePerson;
//      }
//
//      this.activePerson = this.Assembler.Cache.Select(x => x.Value)
//                    .Select(lazy => lazy.Value)
//                    .OfType<Person>()
//        .SingleOrDefault(pers => pers.ShortName == this.Credentials.UserName);
//
//      return this.activePerson;
//    }
//  }
//
//  /**
//  * Retrieves the {@link Participant}s from the {@link Iteration}s that are currently open
//  * and that the current active {@link Person} is associated to.
//  */
//  public IEnumerable<Participant> ActivePersonParticipants
//  {
//    get
//    {
//      foreach (var openIteration in this.openIterations)
//      {
//        yield return openIteration.Value.Item2;
//      }
//    }
//  }
//
//  /**
//  * Gets the {@link CDP4Dal.Assembler} associated with the current {@link cdp4dal.Session} containing the Cache
//  */
//  public Assembler Assembler { get; private set; }
//
//  /**
//  * Gets the uri of the connected data-source
//  */
//  public string DataSourceUri
//  {
//    get
//    {
//      if (this.Credentials != null)
//      {
//        return this.Credentials.Uri.ToString();
//      }
//
//      return string.Empty;
//    }
//  }
//
//  /**
//  * Gets the name of the session which is the concatentation of the data-source uri and the active person
//  */
//  public string Name
//  {
//    get
//    {
//      var personName = this.ActivePerson != null ? this.ActivePerson.Name : string.Empty;
//      return $"{this.DataSourceUri} - {personName}";
//    }
//  }
//
//  /**
//  * Gets the list of {@link ReferenceDataLibrary} that are currently open in the running application.
//  */
//  public IEnumerable<ReferenceDataLibrary> OpenReferenceDataLibraries
//  {
//    get { return this.openReferenceDataLibraries; }
//  }
//
//  /**
//  * Gets the list of {@link Iteration}s that are currently open with the active {@link DomainOfExpertise} and {@link Participant}
//  */
//  public IReadOnlyDictionary<Iteration, Tuple<DomainOfExpertise, Participant>> OpenIterations
//  {
//    get { return this.openIterations; }
//  }
//
//  /**
//  * Retrieves the {@link SiteDirectory} in the context of the current session
//  *
//  * @return
//  * The instance {@link SiteDirectory} that is loaded in the {@link cdp4dal.Session}
//  */
//  public SiteDirectory RetrieveSiteDirectory()
//  {
//    return this.Assembler.RetrieveSiteDirectory();
//  }
//
//  /**
//  * Queries the selected {@link DomainOfExpertise} from the session for provided current {@link Iteration}
//  *
//  * @param iteration
//  * The {@link Iteration} for which the selected {@link DomainOfExpertise} is queried.
//  *
//  * @return
//  * A {@link DomainOfExpertise} if has been selected for the {@link Iteration}, null otherwise.
//  */
//  public DomainOfExpertise QuerySelectedDomainOfExpertise(Iteration iteration)
//  {
//    var iterationDomainPair = this.OpenIterations.SingleOrDefault(x => x.Key.Iid == iteration.Iid);
//    if (iterationDomainPair.Equals(default(KeyValuePair<Iteration, Tuple<DomainOfExpertise, Participant>>)))
//    {
//      return null;
//    }
//
//    return (iterationDomainPair.Value == null || iterationDomainPair.Value.Item1 == null) ? null : iterationDomainPair.Value.Item1;
//  }
//
//  /**
//  * Convenience function to get the required reference data library chain for the passed in engineeringModel.
//  *
//  * @param engineeringModel
//  * The engineering model.
//  *
//  * @return
//  * Chain of required reference data libraries for this {@link EngineeringModel}.
//  */
//  public IEnumerable<ReferenceDataLibrary> GetEngineeringModelRdlChain(EngineeringModel engineeringModel)
//  {
//    return this.GetEngineeringModelSetupRdlChain(engineeringModel.EngineeringModelSetup);
//  }
//
//  /**
//  * Convenience function to get the required reference data library chain for the passed in engineeringModel.
//  *
//  * @param engineeringModelSetup
//  * The engineering model setup.
//  *
//  * @return
//  * Chain of required reference data libraries for this {@link EngineeringModelSetup}.
//  */
//  public IEnumerable<ReferenceDataLibrary> GetEngineeringModelSetupRdlChain(EngineeringModelSetup engineeringModelSetup)
//  {
//    var requiredRdl = engineeringModelSetup.RequiredRdl.SingleOrDefault();
//    yield return requiredRdl;
//
//    if (requiredRdl == null)
//    {
//      yield break;
//    }
//
//    foreach (var chainedRdl in requiredRdl.GetRequiredRdls())
//    {
//      yield return chainedRdl;
//    }
//  }
//
//  /**
//  * Open the underlying {@link IDal} and update the Cache with the retrieved objects.
//  *
//  * @return
//  * an await-able {@link Task}
//  *
//  *
//  * The {@link CDPMessageBus} is used to send messages to notify listeners of {@link Thing}s that
//  * have been added to the cache.
//  */
//  public async Task Open()
//  {
//    var sw = new Stopwatch();
//    sw.Start();
//    logger.Info("Open request {0}", this.DataSourceUri);
//
//    // Create the token source
//    this.cancelationTokenSource = new CancellationTokenSource();
//    IReadOnlyList<CDP4Common.DTO.Thing> dtoThings;
//    try
//    {
//      dtoThings = (await this.Dal.Open(this.Credentials, this.cancelationTokenSource.Token)).ToList();
//    }
//    catch (OperationCanceledException)
//    {
//      logger.Info("Open request cancelled {0}", this.DataSourceUri);
//      this.cancelationTokenSource = null;
//      return;
//    }
//
//    if (!dtoThings.Any())
//    {
//      logger.Warn("no data returned upon Open on {0}", this.DataSourceUri);
//    }
//
//    CDPMessageBus.Current.SendMessage(new SessionEvent(this, SessionStatus.BeginUpdate));
//    await this.Assembler.Synchronize(dtoThings);
//    CDPMessageBus.Current.SendMessage(new SessionEvent(this, SessionStatus.EndUpdate));
//
//    logger.Info("Synchronization with the {0} server done in {1} [ms]", this.DataSourceUri, sw.ElapsedMilliseconds);
//
//    var sessionChange = new SessionEvent(this, SessionStatus.Open);
//    CDPMessageBus.Current.SendMessage(sessionChange);
//
//    logger.Info("cdp4dal.Session {0} opened successfully in {1} [ms]", this.DataSourceUri, sw.ElapsedMilliseconds);
//  }
//
//  /**
//  * Switches the current domain for an iteration
//  *
//  * @param iterationIdThe iteration identifier</param>
//  * @param domainThe domain
//   */
//  public void SwitchDomain(UUID iterationId, DomainOfExpertise domain)
//  {
//    var iterationPair = this.openIterations.SingleOrDefault(x => x.Key.Iid == iterationId);
//    if (iterationPair.Key != null && iterationPair.Value.Item1 != domain)
//    {
//      var selectedParticipation = new Tuple<DomainOfExpertise, Participant>(domain, iterationPair.Value.Item2);
//      this.openIterations.Remove(iterationPair.Key);
//      this.openIterations.Add(iterationPair.Key, selectedParticipation);
//      CDPMessageBus.Current.SendMessage(new DomainChangedEvent(iterationPair.Key, domain));
//    }
//  }
//
//  /**
//  * Read an {@link Iteration} from the underlying {@link IDal} and set the active {@link DomainOfExpertise} for the {@link Iteration}.
//  *
//  * @param iterationThe {@link Iteration} to read</param>
//  * @param domainThe active {@link DomainOfExpertise} for the {@link Iteration}</param>
//  * @return
//  * an await-able {@link Task}
//  *
//  *
//  * The Cache is updated with the returned objects and the {@link CDPMessageBus} is used to send messages to notify listeners of updates to the Cache
//  */
//  public async Task Read(Iteration iteration, DomainOfExpertise domain)
//  {
//    // check if iteration is already open
//    // if so check that the domain is not different
//    var iterationDomainPair = this.openIterations.SingleOrDefault(x => x.Key.Iid == iteration.Iid);
//    if (!iterationDomainPair.Equals(default(KeyValuePair<Iteration, Tuple<DomainOfExpertise,Participant>>)))
//    {
//      if (iterationDomainPair.Value.Item1 != domain)
//      {
//        throw new IllegalArgumentException("The iteration is already open with another domain.");
//      }
//    }
//
//    // Create the token source
//    this.cancelationTokenSource = new CancellationTokenSource();
//    IEnumerable<CDP4Common.DTO.Thing> dtoThings;
//    try
//    {
//      var iterationDto = (CDP4Common.DTO.Iteration)iteration.ToDto();
//      this.Dal.Session = this;
//      dtoThings = await this.Dal.Read(iterationDto, this.cancelationTokenSource.Token);
//    }
//    catch (OperationCanceledException)
//    {
//      logger.Info("cdp4dal.Session.Read {0} {1} cancelled", iteration.ClassKind, iteration.Iid);
//      this.cancelationTokenSource = null;
//      return;
//    }
//
//    // proceed if no problem
//    var enumerable = dtoThings as IList<CDP4Common.DTO.Thing> ?? dtoThings.ToList();
//    if (!enumerable.Any())
//    {
//      logger.Warn("no data returned upon Read on {0}", this.DataSourceUri);
//    }
//
//    CDPMessageBus.Current.SendMessage(new SessionEvent(this, SessionStatus.BeginUpdate));
//    await this.Assembler.Synchronize(enumerable);
//
//    this.AddIterationToOpenList(iteration.Iid, domain);
//
//    CDPMessageBus.Current.SendMessage(new SessionEvent(this, SessionStatus.EndUpdate));
//    logger.Info("Synchronization with the {0} server done", this.DataSourceUri);
//  }
//
//  /**
//  * Read a {@link ReferenceDataLibrary} from the underlying {@link IDal}
//  *
//  * @param rdlThe {@link ReferenceDataLibrary} to read</param>
//  * @return
//  * an await-able {@link Task}
//  *
//  *
//  * The Cache is updated with the returned objects and the {@link CDPMessageBus} is used to send messages to notify listeners of updates to the Cache
//  */
//  public async Task Read(ReferenceDataLibrary rdl)
//  {
//    await this.Read((Thing)rdl);
//    this.AddRdlToOpenList(rdl);
//  }
//
//  /**
//  * Read a {@link Thing} in the associated {@link IDal}
//  *
//  * @param thingThe {@link Thing} to read</param>
//  * @return
//  * an await-able {@link Task}
//  */
//  public async Task Read(Thing thing)
//  {
//    logger.Info("cdp4dal.Session.Read {0} {1}", thing.ClassKind, thing.Iid);
//    var dto = thing.ToDto();
//
//    // Create the token source
//    this.cancelationTokenSource = new CancellationTokenSource();
//    IEnumerable<CDP4Common.DTO.Thing> dtoThings;
//    try
//    {
//      dtoThings = await this.Dal.Read(dto, this.cancelationTokenSource.Token);
//    }
//    catch (OperationCanceledException)
//    {
//      logger.Info("cdp4dal.Session.Read {0} {1} cancelled", thing.ClassKind, thing.Iid);
//      this.cancelationTokenSource = null;
//      return;
//    }
//
//    // proceed if no problem
//    var enumerable = dtoThings as IList<CDP4Common.DTO.Thing> ?? dtoThings.ToList();
//    if (!enumerable.Any())
//    {
//      logger.Warn("no data returned upon Read on {0}", this.DataSourceUri);
//    }
//
//    var sw = new Stopwatch();
//    logger.Info("Synchronization of DTOs for Read from server {0} started", this.DataSourceUri);
//    CDPMessageBus.Current.SendMessage(new SessionEvent(this, SessionStatus.BeginUpdate));
//    await this.Assembler.Synchronize(enumerable);
//    CDPMessageBus.Current.SendMessage(new SessionEvent(this, SessionStatus.EndUpdate));
//    logger.Info("Synchronization of DTOs for Read from server {0} done in {1} [ms]", this.DataSourceUri, sw.ElapsedMilliseconds);
//  }
//
//  /**
//  * Write all the {@link Operation}s from an {@link OperationContainer} asynchronously.
//  *
//  * @param operationContainer
//  * The provided {@link OperationContainer} to write
//  *
//  * @return
//  * an await-able {@link Task}
//  */
//  public async Task Write(OperationContainer operationContainer)
//  {
//    this.Dal.Session = this;
//    var dtoThings = await this.Dal.Write(operationContainer);
//
//    var enumerable = dtoThings as IList<CDP4Common.DTO.Thing> ?? dtoThings.ToList();
//    if (!enumerable.Any())
//    {
//      logger.Warn("no data returned upon Write on {0}", this.DataSourceUri);
//    }
//
//    var sw = new Stopwatch();
//    logger.Info("Synchronization of DTOs for Write to server {0} started", this.DataSourceUri);
//    CDPMessageBus.Current.SendMessage(new SessionEvent(this, SessionStatus.BeginUpdate));
//    await this.Assembler.Synchronize(enumerable);
//    CDPMessageBus.Current.SendMessage(new SessionEvent(this, SessionStatus.EndUpdate));
//    logger.Info("Synchronization of DTOs for Write to server {0} done in {1} [ms]", this.DataSourceUri, sw.ElapsedMilliseconds);
//  }
//
//  /**
//  * Refreshes all the {@link TopContainer}s in the cache
//  *
//  * * @return
//  * an await-able {@link Task}
//  */
//  public async Task Refresh()
//  {
//    foreach (var topContainer in this.GetSiteDirectoryAndActiveIterations())
//    {
//      await this.Update(topContainer);
//    }
//  }
//
//  /**
//  * Reloads all the {@link TopContainer}s the in cache
//  *
//  * @return
//  * an await-able {@link Task}
//  */
//  public async Task Reload()
//  {
//    foreach (var topContainer in this.GetSiteDirectoryAndActiveIterations())
//    {
//      await this.Update(topContainer, false);
//    }
//  }
//
//  /**
//  * Cancel any Read or Open operation.
//  */
//  public void Cancel()
//  {
//    if (this.cancelationTokenSource != null)
//    {
//      this.cancelationTokenSource.Cancel();
//    }
//  }
//
//  /**
//  * Close the underlying {@link IDal} and clears the encapsulated {@link Assembler}
//  */
//  public async Task Close()
//  {
//    this.Dal.Close();
//    await this.Assembler.Clear();
//
//    var sessionChange = new SessionEvent(this, SessionStatus.Closed);
//    CDPMessageBus.Current.SendMessage(sessionChange);
//
//    logger.Info("cdp4dal.Session {0} closed successfully", this.DataSourceUri);
//    this.openReferenceDataLibraries.Clear();
//  }
//
//  /**
//  * Close a {@link SiteReferenceDataLibrary} and all {@link SiteDirectory} that depends on it
//  *
//  * @param sRdlThe {@link SiteReferenceDataLibrary} to close</param>
//  * @returnThe async {@link Task}
//   */
//  public async Task CloseRdl(SiteReferenceDataLibrary sRdl)
//  {
//    // add a delay for the loading panel to appear
//    await Task.Delay(10);
//
//    if (!this.openReferenceDataLibraries.Contains(sRdl))
//    {
//      return;
//    }
//
//    // Cannot close a SiteRdl that is required by a ModelRdl
//    var mRdls = this.openReferenceDataLibraries.OfType<ModelReferenceDataLibrary>().ToList();
//    if (mRdls.Any(modelReferenceDataLibrary => modelReferenceDataLibrary.GetRequiredRdls().Contains(sRdl)))
//    {
//      return;
//    }
//
//    // close all SiteRdl that Requires this SiteRdl
//    var sRdls = this.openReferenceDataLibraries.OfType<SiteReferenceDataLibrary>().ToList();
//    var sRdlsToClose = sRdls.Where(rdl => rdl.GetRequiredRdls().Contains(sRdl)).ToList();
//    sRdlsToClose.Add(sRdl);
//
//    // close from bottom to top
//    var orderedRdlsToClose = sRdlsToClose.OrderByDescending(x => x.GetRequiredRdls().Count());
//
//    var tasks = new List<Task>();
//    foreach (var siteReferenceDataLibrary in orderedRdlsToClose)
//    {
//      tasks.Add(this.Assembler.CloseRdl(siteReferenceDataLibrary));
//    }
//
//    CDPMessageBus.Current.SendMessage(new SessionEvent(this, SessionStatus.BeginUpdate));
//    await Task.WhenAll(tasks);
//    CDPMessageBus.Current.SendMessage(new SessionEvent(this, SessionStatus.EndUpdate));
//
//    foreach (var siteReferenceDataLibrary in orderedRdlsToClose)
//    {
//      this.openReferenceDataLibraries.Remove(siteReferenceDataLibrary);
//    }
//
//    CDPMessageBus.Current.SendMessage(new SessionEvent(this, SessionStatus.RdlClosed));
//  }
//
//  /**
//  * Read the new content of the {@link IDal}
//  *
//  * @param thing
//  * The instance of {@link Thing} that is to be updated
//  *
//  * @param isRefreshis True if the RevisionNumber is taken into account in the update</param>
//  * @return
//  * a {@link Task} that can be used with await
//  */
//  private async Task Update(Thing thing, bool isRefresh = true)
//  {
//    var revisionNumber = isRefresh ? thing.RevisionNumber : 0;
//
//    var queryAttribute = new DalQueryAttributes { RevisionNumber = revisionNumber };
//
//    // Create the token source
//    this.cancelationTokenSource = new CancellationTokenSource();
//    IEnumerable<CDP4Common.DTO.Thing> dtoThings;
//    try
//    {
//      dtoThings = await this.Dal.Read(thing.ToDto(), this.cancelationTokenSource.Token, queryAttribute);
//    }
//    catch (OperationCanceledException)
//    {
//      this.cancelationTokenSource = null;
//      return;
//    }
//
//    var enumerable = dtoThings as IList<CDP4Common.DTO.Thing> ?? dtoThings.ToList();
//    if (!enumerable.Any())
//    {
//      logger.Warn("no data returned upon Read on {0}", this.DataSourceUri);
//    }
//
//    var sw = new Stopwatch();
//    logger.Info("Synchronization of DTOs for Update to server {0} started", this.DataSourceUri);
//    CDPMessageBus.Current.SendMessage(new SessionEvent(this, SessionStatus.BeginUpdate));
//    await this.Assembler.Synchronize(enumerable);
//    CDPMessageBus.Current.SendMessage(new SessionEvent(this, SessionStatus.EndUpdate));
//    logger.Info("Synchronization of DTOs for Update to server {0} done in {1} [ms]", this.DataSourceUri, sw.ElapsedMilliseconds);
//  }
//
//  /**
//  * Close a {@link ModelReferenceDataLibrary}
//  *
//  * @param modelRdl
//  * The model RDL.
//  *
//  * @return
//  * The {@link Task}.
//  */
//  public async Task CloseModelRdl(ModelReferenceDataLibrary modelRdl)
//  {
//    CDPMessageBus.Current.SendMessage(new SessionEvent(this, SessionStatus.BeginUpdate));
//    await this.Assembler.CloseRdl(modelRdl);
//    CDPMessageBus.Current.SendMessage(new SessionEvent(this, SessionStatus.EndUpdate));
//    this.openReferenceDataLibraries.Remove(modelRdl);
//    CDPMessageBus.Current.SendMessage(new SessionEvent(this, SessionStatus.RdlClosed));
//  }
//
//  /**
//  * Close a {@link Iteration} and its {@link ModelReferenceDataLibrary}
//  *
//  * @param iterationSetup
//  * The iteration setup.
//  */
//  public async Task CloseIterationSetup(IterationSetup iterationSetup)
//  {
//    CDPMessageBus.Current.SendMessage(new SessionEvent(this, SessionStatus.BeginUpdate));
//
//    await this.Assembler.CloseIterationSetup(iterationSetup);
//
//    var iterationToRemove = this.openIterations.Select(x => x.Key).SingleOrDefault(x => x.Iid == iterationSetup.IterationIid);
//    if (iterationToRemove != null)
//    {
//      this.openIterations.Remove(iterationToRemove);
//    }
//
//    CDPMessageBus.Current.SendMessage(new SessionEvent(this, SessionStatus.EndUpdate));
//  }
//
//  /**
//  * Gets the {@link SiteDirectory} and all active {@link Iteration}s from the Assembler's cache for this {@link cdp4dal.Session}
//  *
//  * @returnthe {@link List{T}} of the collected {@link SiteDirectory} and all {@link Iteration}s from the Assembler's cache for this {@link cdp4dal.Session}
//   */
//  private IEnumerable<Thing> GetSiteDirectoryAndActiveIterations()
//  {
//    return this.Assembler.Cache
//        .Select(x => x.Value.Value)
//                .Where(x =>
//      x is SiteDirectory
//                    || (x is Iteration && ((Iteration)x).IterationSetup.FrozenOn == null && this.OpenIterations.ContainsKey((Iteration)x))
//                )
//                .ToList();
//  }
//
//  /**
//  * Add RDL to the openReferenceDataLibraries list.
//  *
//  * @param thing
//  * The RDL thing to add.
//  */
//  private void AddRdlToOpenList(Thing thing)
//  {
//    Lazy<Thing> lazyThing;
//    this.Assembler.Cache.TryGetValue(new CacheKey(thing.Iid, null), out lazyThing);
//    if (lazyThing == null)
//    {
//      return;
//    }
//
//    var rdl = lazyThing.Value as ReferenceDataLibrary;
//
//    if (rdl == null)
//    {
//      return;
//    }
//
//    if (this.openReferenceDataLibraries.Contains(rdl))
//    {
//      return;
//    }
//
//    this.openReferenceDataLibraries.Add(rdl);
//    this.openReferenceDataLibraries.AddRange(rdl.GetRequiredRdls().Except(this.openReferenceDataLibraries));
//
//    CDPMessageBus.Current.SendMessage(new SessionEvent(this, SessionStatus.RdlOpened));
//  }
//
//  /**
//  * Add an open {@link Iteration} along its active {@link DomainOfExpertise}
//  *
//  * @param iterationIdThe {@link UUID} of the open {@link Iteration}</param>
//  * @param activeDomainThe active {@link DomainOfExpertise} in this {@link cdp4dal.Session}
//   */
//  private void AddIterationToOpenList(UUID iterationId, DomainOfExpertise activeDomain)
//  {
//    Lazy<Thing> lazyIteraion;
//    this.Assembler.Cache.TryGetValue(new CacheKey(iterationId, null), out lazyIteraion);
//    if (lazyIteraion == null)
//    {
//      return;
//    }
//
//    var iteration = lazyIteraion.Value as Iteration;
//    if (iteration == null)
//    {
//      return;
//    }
//
//    if (this.openIterations.ContainsKey(iteration))
//    {
//      return;
//    }
//
//    var activeParticipant = ((EngineeringModel)iteration.Container).EngineeringModelSetup.Participant.Where(p => p.Person == this.ActivePerson).SingleOrDefault();
//
//    if (activeParticipant == null)
//    {
//      throw new IllegalArgumentException("The iteration does not have an active participant associated.");
//    }
//
//    this.openIterations.Add(iteration, new Tuple<DomainOfExpertise, Participant>(activeDomain, activeParticipant));
//
//    var modelRdl = ((EngineeringModel)iteration.Container).EngineeringModelSetup.RequiredRdl.Single();
//    this.AddRdlToOpenList(modelRdl);
//  }
}
