/* --------------------------------------------------------------------------------------------------------------------
 * DtoThingMixIn.java
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
 *
 * This is an auto-generated DtoThingMixIn class. Any manual changes to this file will be overwritten!
 * --------------------------------------------------------------------------------------------------------------------
 */

package cdp4jsonserializer;

import cdp4common.commondata.ClassKind;
import cdp4common.dto.ActionItem;
import cdp4common.dto.ActualFiniteState;
import cdp4common.dto.ActualFiniteStateList;
import cdp4common.dto.Alias;
import cdp4common.dto.AndExpression;
import cdp4common.dto.Approval;
import cdp4common.dto.ArrayParameterType;
import cdp4common.dto.BinaryNote;
import cdp4common.dto.BinaryRelationship;
import cdp4common.dto.BinaryRelationshipRule;
import cdp4common.dto.Book;
import cdp4common.dto.BooleanParameterType;
import cdp4common.dto.Bounds;
import cdp4common.dto.BuiltInRuleVerification;
import cdp4common.dto.Category;
import cdp4common.dto.ChangeProposal;
import cdp4common.dto.ChangeRequest;
import cdp4common.dto.Citation;
import cdp4common.dto.Color;
import cdp4common.dto.CommonFileStore;
import cdp4common.dto.CompoundParameterType;
import cdp4common.dto.Constant;
import cdp4common.dto.ContractChangeNotice;
import cdp4common.dto.CyclicRatioScale;
import cdp4common.dto.DateParameterType;
import cdp4common.dto.DateTimeParameterType;
import cdp4common.dto.DecompositionRule;
import cdp4common.dto.Definition;
import cdp4common.dto.DerivedQuantityKind;
import cdp4common.dto.DerivedUnit;
import cdp4common.dto.DiagramCanvas;
import cdp4common.dto.DiagramEdge;
import cdp4common.dto.DiagramObject;
import cdp4common.dto.DomainFileStore;
import cdp4common.dto.DomainOfExpertise;
import cdp4common.dto.DomainOfExpertiseGroup;
import cdp4common.dto.ElementDefinition;
import cdp4common.dto.ElementUsage;
import cdp4common.dto.EmailAddress;
import cdp4common.dto.EngineeringModel;
import cdp4common.dto.EngineeringModelDataDiscussionItem;
import cdp4common.dto.EngineeringModelDataNote;
import cdp4common.dto.EngineeringModelSetup;
import cdp4common.dto.EnumerationParameterType;
import cdp4common.dto.EnumerationValueDefinition;
import cdp4common.dto.ExclusiveOrExpression;
import cdp4common.dto.ExternalIdentifierMap;
import cdp4common.dto.File;
import cdp4common.dto.FileRevision;
import cdp4common.dto.FileType;
import cdp4common.dto.Folder;
import cdp4common.dto.Glossary;
import cdp4common.dto.Goal;
import cdp4common.dto.HyperLink;
import cdp4common.dto.IdCorrespondence;
import cdp4common.dto.IntervalScale;
import cdp4common.dto.Iteration;
import cdp4common.dto.IterationSetup;
import cdp4common.dto.LinearConversionUnit;
import cdp4common.dto.LogarithmicScale;
import cdp4common.dto.MappingToReferenceScale;
import cdp4common.dto.ModelLogEntry;
import cdp4common.dto.ModelReferenceDataLibrary;
import cdp4common.dto.ModellingThingReference;
import cdp4common.dto.MultiRelationship;
import cdp4common.dto.MultiRelationshipRule;
import cdp4common.dto.NaturalLanguage;
import cdp4common.dto.NestedElement;
import cdp4common.dto.NestedParameter;
import cdp4common.dto.NotExpression;
import cdp4common.dto.Option;
import cdp4common.dto.OrExpression;
import cdp4common.dto.OrdinalScale;
import cdp4common.dto.Organization;
import cdp4common.dto.OwnedStyle;
import cdp4common.dto.Page;
import cdp4common.dto.Parameter;
import cdp4common.dto.ParameterGroup;
import cdp4common.dto.ParameterOverride;
import cdp4common.dto.ParameterOverrideValueSet;
import cdp4common.dto.ParameterSubscription;
import cdp4common.dto.ParameterSubscriptionValueSet;
import cdp4common.dto.ParameterTypeComponent;
import cdp4common.dto.ParameterValueSet;
import cdp4common.dto.ParameterizedCategoryRule;
import cdp4common.dto.ParametricConstraint;
import cdp4common.dto.Participant;
import cdp4common.dto.ParticipantPermission;
import cdp4common.dto.ParticipantRole;
import cdp4common.dto.Person;
import cdp4common.dto.PersonPermission;
import cdp4common.dto.PersonRole;
import cdp4common.dto.Point;
import cdp4common.dto.PossibleFiniteState;
import cdp4common.dto.PossibleFiniteStateList;
import cdp4common.dto.PrefixedUnit;
import cdp4common.dto.Publication;
import cdp4common.dto.QuantityKindFactor;
import cdp4common.dto.RatioScale;
import cdp4common.dto.ReferenceSource;
import cdp4common.dto.ReferencerRule;
import cdp4common.dto.RelationalExpression;
import cdp4common.dto.RelationshipParameterValue;
import cdp4common.dto.RequestForDeviation;
import cdp4common.dto.RequestForWaiver;
import cdp4common.dto.Requirement;
import cdp4common.dto.RequirementsContainerParameterValue;
import cdp4common.dto.RequirementsGroup;
import cdp4common.dto.RequirementsSpecification;
import cdp4common.dto.ReviewItemDiscrepancy;
import cdp4common.dto.RuleVerificationList;
import cdp4common.dto.RuleViolation;
import cdp4common.dto.ScaleReferenceQuantityValue;
import cdp4common.dto.ScaleValueDefinition;
import cdp4common.dto.Section;
import cdp4common.dto.SharedStyle;
import cdp4common.dto.SimpleParameterValue;
import cdp4common.dto.SimpleQuantityKind;
import cdp4common.dto.SimpleUnit;
import cdp4common.dto.SiteDirectory;
import cdp4common.dto.SiteDirectoryDataAnnotation;
import cdp4common.dto.SiteDirectoryDataDiscussionItem;
import cdp4common.dto.SiteDirectoryThingReference;
import cdp4common.dto.SiteLogEntry;
import cdp4common.dto.SiteReferenceDataLibrary;
import cdp4common.dto.Solution;
import cdp4common.dto.SpecializedQuantityKind;
import cdp4common.dto.StakeHolderValueMap;
import cdp4common.dto.StakeHolderValueMapSettings;
import cdp4common.dto.Stakeholder;
import cdp4common.dto.StakeholderValue;
import cdp4common.dto.TelephoneNumber;
import cdp4common.dto.Term;
import cdp4common.dto.TextParameterType;
import cdp4common.dto.TextualNote;
import cdp4common.dto.Thing;
import cdp4common.dto.TimeOfDayParameterType;
import cdp4common.dto.UnitFactor;
import cdp4common.dto.UnitPrefix;
import cdp4common.dto.UserPreference;
import cdp4common.dto.UserRuleVerification;
import cdp4common.dto.ValueGroup;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.List;
import java.util.UUID;

/**
 * Class representing a mixin for {@link Thing} that is used by {@link ObjectMapper}.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    property = "classKind")
@JsonSubTypes({
    @JsonSubTypes.Type(value = ActionItem.class, name = "ActionItem"),
    @JsonSubTypes.Type(value = ActualFiniteState.class, name = "ActualFiniteState"),
    @JsonSubTypes.Type(value = ActualFiniteStateList.class, name = "ActualFiniteStateList"),
    @JsonSubTypes.Type(value = Alias.class, name = "Alias"),
    @JsonSubTypes.Type(value = AndExpression.class, name = "AndExpression"),
    @JsonSubTypes.Type(value = Approval.class, name = "Approval"),
    @JsonSubTypes.Type(value = ArrayParameterType.class, name = "ArrayParameterType"),
    @JsonSubTypes.Type(value = BinaryNote.class, name = "BinaryNote"),
    @JsonSubTypes.Type(value = BinaryRelationship.class, name = "BinaryRelationship"),
    @JsonSubTypes.Type(value = BinaryRelationshipRule.class, name = "BinaryRelationshipRule"),
    @JsonSubTypes.Type(value = Book.class, name = "Book"),
    @JsonSubTypes.Type(value = BooleanParameterType.class, name = "BooleanParameterType"),
    @JsonSubTypes.Type(value = Bounds.class, name = "Bounds"),
    @JsonSubTypes.Type(value = BuiltInRuleVerification.class, name = "BuiltInRuleVerification"),
    @JsonSubTypes.Type(value = Category.class, name = "Category"),
    @JsonSubTypes.Type(value = ChangeProposal.class, name = "ChangeProposal"),
    @JsonSubTypes.Type(value = ChangeRequest.class, name = "ChangeRequest"),
    @JsonSubTypes.Type(value = Citation.class, name = "Citation"),
    @JsonSubTypes.Type(value = Color.class, name = "Color"),
    @JsonSubTypes.Type(value = CommonFileStore.class, name = "CommonFileStore"),
    @JsonSubTypes.Type(value = CompoundParameterType.class, name = "CompoundParameterType"),
    @JsonSubTypes.Type(value = Constant.class, name = "Constant"),
    @JsonSubTypes.Type(value = ContractChangeNotice.class, name = "ContractChangeNotice"),
    @JsonSubTypes.Type(value = CyclicRatioScale.class, name = "CyclicRatioScale"),
    @JsonSubTypes.Type(value = DateParameterType.class, name = "DateParameterType"),
    @JsonSubTypes.Type(value = DateTimeParameterType.class, name = "DateTimeParameterType"),
    @JsonSubTypes.Type(value = DecompositionRule.class, name = "DecompositionRule"),
    @JsonSubTypes.Type(value = Definition.class, name = "Definition"),
    @JsonSubTypes.Type(value = DerivedQuantityKind.class, name = "DerivedQuantityKind"),
    @JsonSubTypes.Type(value = DerivedUnit.class, name = "DerivedUnit"),
    @JsonSubTypes.Type(value = DiagramCanvas.class, name = "DiagramCanvas"),
    @JsonSubTypes.Type(value = DiagramEdge.class, name = "DiagramEdge"),
    @JsonSubTypes.Type(value = DiagramObject.class, name = "DiagramObject"),
    @JsonSubTypes.Type(value = DomainFileStore.class, name = "DomainFileStore"),
    @JsonSubTypes.Type(value = DomainOfExpertise.class, name = "DomainOfExpertise"),
    @JsonSubTypes.Type(value = DomainOfExpertiseGroup.class, name = "DomainOfExpertiseGroup"),
    @JsonSubTypes.Type(value = ElementDefinition.class, name = "ElementDefinition"),
    @JsonSubTypes.Type(value = ElementUsage.class, name = "ElementUsage"),
    @JsonSubTypes.Type(value = EmailAddress.class, name = "EmailAddress"),
    @JsonSubTypes.Type(value = EngineeringModel.class, name = "EngineeringModel"),
    @JsonSubTypes.Type(value = EngineeringModelDataDiscussionItem.class, name = "EngineeringModelDataDiscussionItem"),
    @JsonSubTypes.Type(value = EngineeringModelDataNote.class, name = "EngineeringModelDataNote"),
    @JsonSubTypes.Type(value = EngineeringModelSetup.class, name = "EngineeringModelSetup"),
    @JsonSubTypes.Type(value = EnumerationParameterType.class, name = "EnumerationParameterType"),
    @JsonSubTypes.Type(value = EnumerationValueDefinition.class, name = "EnumerationValueDefinition"),
    @JsonSubTypes.Type(value = ExclusiveOrExpression.class, name = "ExclusiveOrExpression"),
    @JsonSubTypes.Type(value = ExternalIdentifierMap.class, name = "ExternalIdentifierMap"),
    @JsonSubTypes.Type(value = File.class, name = "File"),
    @JsonSubTypes.Type(value = FileRevision.class, name = "FileRevision"),
    @JsonSubTypes.Type(value = FileType.class, name = "FileType"),
    @JsonSubTypes.Type(value = Folder.class, name = "Folder"),
    @JsonSubTypes.Type(value = Glossary.class, name = "Glossary"),
    @JsonSubTypes.Type(value = Goal.class, name = "Goal"),
    @JsonSubTypes.Type(value = HyperLink.class, name = "HyperLink"),
    @JsonSubTypes.Type(value = IdCorrespondence.class, name = "IdCorrespondence"),
    @JsonSubTypes.Type(value = IntervalScale.class, name = "IntervalScale"),
    @JsonSubTypes.Type(value = Iteration.class, name = "Iteration"),
    @JsonSubTypes.Type(value = IterationSetup.class, name = "IterationSetup"),
    @JsonSubTypes.Type(value = LinearConversionUnit.class, name = "LinearConversionUnit"),
    @JsonSubTypes.Type(value = LogarithmicScale.class, name = "LogarithmicScale"),
    @JsonSubTypes.Type(value = MappingToReferenceScale.class, name = "MappingToReferenceScale"),
    @JsonSubTypes.Type(value = ModellingThingReference.class, name = "ModellingThingReference"),
    @JsonSubTypes.Type(value = ModelLogEntry.class, name = "ModelLogEntry"),
    @JsonSubTypes.Type(value = ModelReferenceDataLibrary.class, name = "ModelReferenceDataLibrary"),
    @JsonSubTypes.Type(value = MultiRelationship.class, name = "MultiRelationship"),
    @JsonSubTypes.Type(value = MultiRelationshipRule.class, name = "MultiRelationshipRule"),
    @JsonSubTypes.Type(value = NaturalLanguage.class, name = "NaturalLanguage"),
    @JsonSubTypes.Type(value = NestedElement.class, name = "NestedElement"),
    @JsonSubTypes.Type(value = NestedParameter.class, name = "NestedParameter"),
    @JsonSubTypes.Type(value = NotExpression.class, name = "NotExpression"),
    @JsonSubTypes.Type(value = Option.class, name = "Option"),
    @JsonSubTypes.Type(value = OrdinalScale.class, name = "OrdinalScale"),
    @JsonSubTypes.Type(value = OrExpression.class, name = "OrExpression"),
    @JsonSubTypes.Type(value = Organization.class, name = "Organization"),
    @JsonSubTypes.Type(value = OwnedStyle.class, name = "OwnedStyle"),
    @JsonSubTypes.Type(value = Page.class, name = "Page"),
    @JsonSubTypes.Type(value = Parameter.class, name = "Parameter"),
    @JsonSubTypes.Type(value = ParameterGroup.class, name = "ParameterGroup"),
    @JsonSubTypes.Type(value = ParameterizedCategoryRule.class, name = "ParameterizedCategoryRule"),
    @JsonSubTypes.Type(value = ParameterOverride.class, name = "ParameterOverride"),
    @JsonSubTypes.Type(value = ParameterOverrideValueSet.class, name = "ParameterOverrideValueSet"),
    @JsonSubTypes.Type(value = ParameterSubscription.class, name = "ParameterSubscription"),
    @JsonSubTypes.Type(value = ParameterSubscriptionValueSet.class, name = "ParameterSubscriptionValueSet"),
    @JsonSubTypes.Type(value = ParameterTypeComponent.class, name = "ParameterTypeComponent"),
    @JsonSubTypes.Type(value = ParameterValueSet.class, name = "ParameterValueSet"),
    @JsonSubTypes.Type(value = ParametricConstraint.class, name = "ParametricConstraint"),
    @JsonSubTypes.Type(value = Participant.class, name = "Participant"),
    @JsonSubTypes.Type(value = ParticipantPermission.class, name = "ParticipantPermission"),
    @JsonSubTypes.Type(value = ParticipantRole.class, name = "ParticipantRole"),
    @JsonSubTypes.Type(value = Person.class, name = "Person"),
    @JsonSubTypes.Type(value = PersonPermission.class, name = "PersonPermission"),
    @JsonSubTypes.Type(value = PersonRole.class, name = "PersonRole"),
    @JsonSubTypes.Type(value = Point.class, name = "Point"),
    @JsonSubTypes.Type(value = PossibleFiniteState.class, name = "PossibleFiniteState"),
    @JsonSubTypes.Type(value = PossibleFiniteStateList.class, name = "PossibleFiniteStateList"),
    @JsonSubTypes.Type(value = PrefixedUnit.class, name = "PrefixedUnit"),
    @JsonSubTypes.Type(value = Publication.class, name = "Publication"),
    @JsonSubTypes.Type(value = QuantityKindFactor.class, name = "QuantityKindFactor"),
    @JsonSubTypes.Type(value = RatioScale.class, name = "RatioScale"),
    @JsonSubTypes.Type(value = ReferencerRule.class, name = "ReferencerRule"),
    @JsonSubTypes.Type(value = ReferenceSource.class, name = "ReferenceSource"),
    @JsonSubTypes.Type(value = RelationalExpression.class, name = "RelationalExpression"),
    @JsonSubTypes.Type(value = RelationshipParameterValue.class, name = "RelationshipParameterValue"),
    @JsonSubTypes.Type(value = RequestForDeviation.class, name = "RequestForDeviation"),
    @JsonSubTypes.Type(value = RequestForWaiver.class, name = "RequestForWaiver"),
    @JsonSubTypes.Type(value = Requirement.class, name = "Requirement"),
    @JsonSubTypes.Type(value = RequirementsContainerParameterValue.class, name = "RequirementsContainerParameterValue"),
    @JsonSubTypes.Type(value = RequirementsGroup.class, name = "RequirementsGroup"),
    @JsonSubTypes.Type(value = RequirementsSpecification.class, name = "RequirementsSpecification"),
    @JsonSubTypes.Type(value = ReviewItemDiscrepancy.class, name = "ReviewItemDiscrepancy"),
    @JsonSubTypes.Type(value = RuleVerificationList.class, name = "RuleVerificationList"),
    @JsonSubTypes.Type(value = RuleViolation.class, name = "RuleViolation"),
    @JsonSubTypes.Type(value = ScaleReferenceQuantityValue.class, name = "ScaleReferenceQuantityValue"),
    @JsonSubTypes.Type(value = ScaleValueDefinition.class, name = "ScaleValueDefinition"),
    @JsonSubTypes.Type(value = Section.class, name = "Section"),
    @JsonSubTypes.Type(value = SharedStyle.class, name = "SharedStyle"),
    @JsonSubTypes.Type(value = SimpleParameterValue.class, name = "SimpleParameterValue"),
    @JsonSubTypes.Type(value = SimpleQuantityKind.class, name = "SimpleQuantityKind"),
    @JsonSubTypes.Type(value = SimpleUnit.class, name = "SimpleUnit"),
    @JsonSubTypes.Type(value = SiteDirectory.class, name = "SiteDirectory"),
    @JsonSubTypes.Type(value = SiteDirectoryDataAnnotation.class, name = "SiteDirectoryDataAnnotation"),
    @JsonSubTypes.Type(value = SiteDirectoryDataDiscussionItem.class, name = "SiteDirectoryDataDiscussionItem"),
    @JsonSubTypes.Type(value = SiteDirectoryThingReference.class, name = "SiteDirectoryThingReference"),
    @JsonSubTypes.Type(value = SiteLogEntry.class, name = "SiteLogEntry"),
    @JsonSubTypes.Type(value = SiteReferenceDataLibrary.class, name = "SiteReferenceDataLibrary"),
    @JsonSubTypes.Type(value = Solution.class, name = "Solution"),
    @JsonSubTypes.Type(value = SpecializedQuantityKind.class, name = "SpecializedQuantityKind"),
    @JsonSubTypes.Type(value = Stakeholder.class, name = "Stakeholder"),
    @JsonSubTypes.Type(value = StakeholderValue.class, name = "StakeholderValue"),
    @JsonSubTypes.Type(value = StakeHolderValueMap.class, name = "StakeHolderValueMap"),
    @JsonSubTypes.Type(value = StakeHolderValueMapSettings.class, name = "StakeHolderValueMapSettings"),
    @JsonSubTypes.Type(value = TelephoneNumber.class, name = "TelephoneNumber"),
    @JsonSubTypes.Type(value = Term.class, name = "Term"),
    @JsonSubTypes.Type(value = TextParameterType.class, name = "TextParameterType"),
    @JsonSubTypes.Type(value = TextualNote.class, name = "TextualNote"),
    @JsonSubTypes.Type(value = TimeOfDayParameterType.class, name = "TimeOfDayParameterType"),
    @JsonSubTypes.Type(value = UnitFactor.class, name = "UnitFactor"),
    @JsonSubTypes.Type(value = UnitPrefix.class, name = "UnitPrefix"),
    @JsonSubTypes.Type(value = UserPreference.class, name = "UserPreference"),
    @JsonSubTypes.Type(value = UserRuleVerification.class, name = "UserRuleVerification"),
    @JsonSubTypes.Type(value = ValueGroup.class, name = "ValueGroup"),
})
abstract class DtoThingMixIn {
  @JsonIgnore
  private ClassKind classKind;
  @JsonIgnore
  private List<ClassKind> partialClassKindRoute;
  @JsonIgnore
  private cdp4common.commondata.Thing sourceThing;
  @JsonIgnore
  private List<String> partialRoutes;
  @JsonIgnore
  private UUID iterationContainerId;
  @JsonIgnore
  private Iterable<Iterable> containerLists;
  @JsonIgnore
  public abstract cdp4common.commondata.Thing querySourceThing();
  @JsonIgnore
  private String route;
  @JsonIgnore
  public abstract String getTopContainerRoute();
}
