/* --------------------------------------------------------------------------------------------------------------------
 * AbstractContractChangeNotice.java
 * Copyright (c) 2018 RHEA System S.A.
 *
 * This is an auto-generated POJO Class. Any manual changes to this file will be overwritten!
 * --------------------------------------------------------------------------------------------------------------------
 */

package cdp4common.reportingdata;

import java.util.*;
import java.util.concurrent.*;
import java.util.stream.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.io.*;
import java.net.URI;
import cdp4common.*;
import cdp4common.commondata.*;
import cdp4common.diagramdata.*;
import cdp4common.engineeringmodeldata.*;
import cdp4common.helpers.*;
import cdp4common.reportingdata.*;
import cdp4common.sitedirectorydata.*;
import cdp4common.types.*;
import org.apache.commons.lang3.tuple.Pair;

/**
 * The ContractChangeNotice is the vehicle for notifying a contract change following a ChangeProposal
 */
@CDPVersion(version = "1.1.0")
@Container(clazz = EngineeringModel.class, propertyName = "modellingAnnotation")
public abstract class AbstractContractChangeNotice extends AbstractModellingAnnotationItem  {
    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    public final PersonAccessRightKind defaultPersonAccess = PersonAccessRightKind.N_O_T__A_P_P_L_I_C_A_B_L_E;

    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    public final ParticipantAccessRightKind defaultParticipantAccess = ParticipantAccessRightKind.N_O_N_E;

    /**
     * Initializes a new instance of the <code>ContractChangeNotice<code/> class.
     *
     * @see ContractChangeNotice
     */
    public AbstractContractChangeNotice() {
    }

    /**
     * Initializes a new instance of the <code>ContractChangeNotice<code/> class.
     * @param iid The unique identifier.
     * @param cache The <code>ConcurrentHashMap<K,V></code> where the current thing is stored.
     * The <code>Pair<L,R><code/> of <code>UUID<code/> is the key used to store this thing.
     * The key is a combination of this thing's identifier and the identifier of its <code>Iteration<code/> container if applicable or null.
     * @param iDalUri The <code>URI</code> of this thing
     *
     * @see ConcurrentHashMap
     * @see URI
     * @see UUID
     * @see Pair
     * @see Iteration
     * @see ContractChangeNotice
     */
    public AbstractContractChangeNotice(UUID iid, ConcurrentHashMap<Pair<UUID, UUID>, Lazy<Thing>> cache, URI iDalUri) {
    }

    /**
     * Property changeProposal.
     * The ChangeProposal that is at the origin of this ContractChangeNotice
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private ChangeProposal changeProposal;

    /**
     * Gets the changeProposal.
     * The ChangeProposal that is at the origin of this ContractChangeNotice
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public ChangeProposal getChangeProposal(){
         return this.changeProposal;
    }

    /**
     * Sets the changeProposal.
     * The ChangeProposal that is at the origin of this ContractChangeNotice
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setChangeProposal(ChangeProposal changeProposal){
        this.changeProposal = changeProposal;
    }

    /**
     * Creates and returns a copy of this <code>ContractChangeNotice<code/> for edit purpose.
     *
     * @param cloneContainedThings A value that indicates whether the contained <code>Thing<code/>s should be cloned or not.
     *
     * @return A cloned instance of <code>ContractChangeNotice<code/>.
     *
     * @see ContractChangeNotice
     * @see Thing
     */
    @Override
    protected Thing genericClone(boolean cloneContainedThings) throws CloneNotSupportedException {
        ContractChangeNotice clone = (ContractChangeNotice)this.clone();
        clone.setApprovedBy(cloneContainedThings ? new ContainerList<Approval>(clone) : new ContainerList<Approval>(this.approvedBy, clone));
        clone.setCategory(new List<Category>(this.category));
        clone.setDiscussion(cloneContainedThings ? new ContainerList<EngineeringModelDataDiscussionItem>(clone) : new ContainerList<EngineeringModelDataDiscussionItem>(this.discussion, clone));
        clone.setExcludedDomain(new List<DomainOfExpertise>(this.excludedDomain));
        clone.setExcludedPerson(new List<Person>(this.excludedPerson));
        clone.setRelatedThing(cloneContainedThings ? new ContainerList<ModellingThingReference>(clone) : new ContainerList<ModellingThingReference>(this.relatedThing, clone));
        clone.setSourceAnnotation(new List<ModellingAnnotationItem>(this.sourceAnnotation));

        if (cloneContainedThings) {
            clone.getApprovedBy().addAll(this.approvedBy.stream().map(x -> x.Clone(true)).collect(Collectors.toList());
            clone.getDiscussion().addAll(this.discussion.stream().map(x -> x.Clone(true)).collect(Collectors.toList());
            clone.getRelatedThing().addAll(this.relatedThing.stream().map(x -> x.Clone(true)).collect(Collectors.toList());
        }

        clone.setOriginal(this);
        clone.ResetCacheId();

        return clone;
    }

    /**
     * Creates and returns a copy of this <code>ContractChangeNotice<code/> for edit purpose.
     * @param cloneContainedThings A value that indicates whether the contained <code>Thing<code/>s should be cloned or not.
     *
     * @return A cloned instance of <code>ContractChangeNotice<code/>.
     * 
     * @see ContractChangeNotice
     */
    @Override
    public ContractChangeNotice clone(boolean cloneContainedThings) throws CloneNotSupportedException {
        this.setChangeKind(ChangeKind.UPDATE);

        return (ContractChangeNotice)this.genericClone(cloneContainedThings);
    }

    /**
     * Validates the cardinalities of the properties of this <clone>ContractChangeNotice<code/>.
     *
     * @return A list of potential errors.
     *
     * @see ContractChangeNotice
     */
    protected Iterable<String> validatePocoCardinality() {
        List<String> errorList = new ArrayList<String>(super.validatePojoCardinality());

        if (this.changeProposal == null || this.changeProposal.getIid().equals(new UUID(0L, 0L))) {
            errorList.add("The property changeProposal is null.");
            this.changeProposal = SentinelThingProvider.getSentinel<ChangeProposal>();
            this.sentinelResetMap["changeProposal"] = () -> this.changeProposal = null;
        }

        return errorList;
    }

    /**
     * Resolve the properties of the current <code>ContractChangeNotice<code/> from its <code>cdp4common.dto.Thing<code/> counter-part
     *
     * @param dtoThing The source <code>cdp4common.dto.Thing<code/>
     *
     * @see ContractChangeNotice
     * @see cdp4common.dto.Thing
     */
    @Override
    void resolveProperties(cdp4common.dto.Thing dtoThing) {
        if (dtoThing == null) {
            throw new IllegalArgumentException("dtoThing");
        }

        cdp4common.dto.ContractChangeNotice dto = (cdp4common.dto.ContractChangeNotice)dtoThing;

        this.approvedBy.resolveList(dto.getApprovedBy(), dto.getIterationContainerId(), this.cache);
        this.author = this.cache.get<Participant>(dto.getAuthor(), dto.getIterationContainerId()) ?? SentinelThingProvider.getSentinel<Participant>();
        this.category.resolveList(dto.getCategory(), dto.getIterationContainerId(), this.cache);
        this.changeProposal = this.cache.get<ChangeProposal>(dto.getChangeProposal(), dto.getIterationContainerId()) ?? SentinelThingProvider.getSentinel<ChangeProposal>();
        this.classification = dto.getClassification();
        this.content = dto.getContent();
        this.createdOn = dto.getCreatedOn();
        this.discussion.resolveList(dto.getDiscussion(), dto.getIterationContainerId(), this.cache);
        this.excludedDomain.resolveList(dto.getExcludedDomain(), dto.getIterationContainerId(), this.cache);
        this.excludedPerson.resolveList(dto.getExcludedPerson(), dto.getIterationContainerId(), this.cache);
        this.languageCode = dto.getLanguageCode();
        this.modifiedOn = dto.getModifiedOn();
        this.owner = this.cache.get<DomainOfExpertise>(dto.getOwner(), dto.getIterationContainerId()) ?? SentinelThingProvider.getSentinel<DomainOfExpertise>();
        this.primaryAnnotatedThing = (dto.getPrimaryAnnotatedThing() != null) ? this.cache.get<ModellingThingReference>(dto.getPrimaryAnnotatedThing.getValue(), dto.getIterationContainerId()) : null;
        this.relatedThing.resolveList(dto.getRelatedThing(), dto.getIterationContainerId(), this.cache);
        this.revisionNumber = dto.getRevisionNumber();
        this.shortName = dto.getShortName();
        this.sourceAnnotation.resolveList(dto.getSourceAnnotation(), dto.getIterationContainerId(), this.cache);
        this.status = dto.getStatus();
        this.title = dto.getTitle();

        this.resolveExtraProperties();
    }

    /**
     * Generates a <code>cdp4common.dto.Thing<code/> from the current <code>ContractChangeNotice<code/>
     *
     * @return Generated <code>cdp4common.dto.Thing<code/>
     *
     * @see cdp4common.dto.Thing
     * @see ContractChangeNotice
     */
    @Override
    public cdp4common.dto.Thing toDto() {
        cdp4common.dto.ContractChangeNotice dto = new cdp4common.dto.ContractChangeNotice(this.iid, this.revisionNumber);

        dto.getApprovedBy().add(this.approvedBy.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.setAuthor(this.author != null ? this.author.getIid() : new UUID(0L, 0L));
        dto.getCategory().add(this.category.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.setChangeProposal(this.changeProposal != null ? this.changeProposal.getIid() : new UUID(0L, 0L));
        dto.setClassification(this.classification);
        dto.setContent(this.content);
        dto.setCreatedOn(this.createdOn);
        dto.getDiscussion().add(this.discussion.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.getExcludedDomain().add(this.excludedDomain.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.getExcludedPerson().add(this.excludedPerson.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.setLanguageCode(this.languageCode);
        dto.setModifiedOn(this.modifiedOn);
        dto.setOwner(this.owner != null ? this.owner.getIid() : new UUID(0L, 0L));
        dto.setPrimaryAnnotatedThing(this.primaryAnnotatedThing != null ? (UUID)this.primaryAnnotatedThing.getIid() : null);
        dto.getRelatedThing().add(this.relatedThing.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.setRevisionNumber(this.revisionNumber);
        dto.setShortName(this.shortName);
        dto.getSourceAnnotation().add(this.sourceAnnotation.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.setStatus(this.status);
        dto.setTitle(this.title);

        dto.setIterationContainerId(this.CacheId.Item2);
        dto.RegisterSourceThing(this);
        this.BuildDtoPartialRoutes(dto);

        return dto;
    }
}
