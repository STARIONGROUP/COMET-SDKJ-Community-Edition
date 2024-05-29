/*
 * CdpPostOperation.java
 *
 * Copyright (c) 2015-2024 Starion Group S.A.
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

package cdp4servicesdal;

import static cdp4common.helpers.Utils.as;

import cdp4common.ClasslessDTO;
import cdp4common.ClasslessDtoFactory;
import cdp4common.commondata.ClassKind;
import cdp4common.commondata.Thing;
import cdp4common.dto.CopyInfo;
import cdp4common.dto.CopyInfoOptions;
import cdp4common.dto.CopyKind;
import cdp4common.dto.CopyReference;
import cdp4common.dto.CopySource;
import cdp4common.dto.CopyTarget;
import cdp4common.engineeringmodeldata.Iteration;
import cdp4common.sitedirectorydata.DomainOfExpertise;
import cdp4common.sitedirectorydata.Participant;
import cdp4common.sitedirectorydata.VcardTelephoneNumberKind;
import cdp4common.types.OrderedItem;
import cdp4common.types.ValueArray;
import cdp4dal.Session;
import cdp4dal.operations.Operation;
import cdp4dal.operations.OperationKind;
import cdp4dal.operations.OperationUtils;
import cdp4dal.operations.PostOperation;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.UUID;
import org.apache.commons.lang3.NotImplementedException;
import org.apache.commons.lang3.tuple.Pair;

/**
 * The CDP POST operation. See also {@link PostOperation}.
 */
class CdpPostOperation implements PostOperation {

  /**
   * The property name that stores the unique identifier of a {@link Thing}.
   */
  @JsonIgnore
  private final String IID_KEY = "iid";

  /**
   * The property name that stores the classkind of a {@link Thing}.
   */
  @JsonIgnore
  private final String CLASSKIND_KEY = "classKind";

  /**
   * The {@link Session}.
   */
  @JsonIgnore
  private final Session session;

  /**
   * Initializes a new instance of the {@link CdpPostOperation} class.
   */
  CdpPostOperation() {
    this.session = null;
    this.delete = new ArrayList<>();
    this.create = new ArrayList<>();
    this.update = new ArrayList<>();
    this.copy = new ArrayList<>();
  }

  /**
   * Initializes a new instance of the {@link CdpPostOperation} class.
   *
   * @param session The {@link Session}.
   */
  CdpPostOperation(Session session) {
    this.session = session;
    this.delete = new ArrayList<>();
    this.create = new ArrayList<>();
    this.update = new ArrayList<>();
    this.copy = new ArrayList<>();
  }

  /**
   * The collection of DTOs to delete.
   */
  @JsonProperty("_delete")
  private List<ClasslessDTO> delete;

  /**
   * The collection of DTOs to create.
   */
  @JsonProperty("_create")
  private List<cdp4common.dto.Thing> create;

  /**
   * The collection of DTOs to update.
   */
  @JsonProperty("_update")
  private List<ClasslessDTO> update;

  /**
   * Gets or sets the collection of DTOs to copy.
   */
  @JsonProperty("_copy")
  private List<CopyInfo> copy;

  /**
   * Populate the current {@link PostOperation} with the content based on the provided {@link
   * Operation}.
   *
   * @param operation The {@link Operation} that contains all the {@link Thing}s that need to be
   * updated to the data-source.
   */
  @Override
  public void constructFromOperation(Operation operation) {
    if (operation.getModifiedThing() == null) {
      throw new NullPointerException("The operation may not be null");
    }

    switch (operation.getOperationKind()) {
      case CREATE:
        this.create.add(operation.getModifiedThing());
        break;
      case DELETE:
        this.delete.add(ClasslessDtoFactory.fromThing(operation.getModifiedThing(), null));
        break;
      case UPDATE:
        this.resolveUpdate(operation);
        break;
      case MOVE:
        throw new NotImplementedException("Operation kind MOVE is not implemented yet.");
      default:
        this.resolveCopy(operation);
        break;
    }
  }

  /**
   * Resolves the Update container of the {@link Operation}.
   *
   * @param operation The operation.
   */
  private void resolveUpdate(Operation operation) {
    ClasslessDTO original = ClasslessDtoFactory.fullFromThing(operation.getOriginalThing());
    ClasslessDTO modifiedFull = ClasslessDtoFactory.fullFromThing(operation.getModifiedThing());
    ClasslessDTO modified = ClasslessDtoFactory.fullFromThing(operation.getModifiedThing());

    Map<String, List<Object>> listsToDelete = new HashMap<>();
    Map<String, List<Object>> listsToAdd = new HashMap<>();

    for (String key : original.keySet()) {
      Iterable originalIterable = as(original.get(key), Iterable.class);
      if (originalIterable != null) {
        Iterable modifiedIterable = (Iterable) modifiedFull.get(key);

        // value array case
        if (originalIterable instanceof ValueArray
            && ((ValueArray) originalIterable).getItemType() == String.class) {
          ValueArray<String> originalValue = (ValueArray<String>) originalIterable;
          ValueArray<String> modifiedValue = (ValueArray<String>) modifiedIterable;

          if (originalValue.toString().equals(modifiedValue.toString())) {
            modified.remove(key);
          }
        } else {
          ArrayList<Object> possibleAdditions = new ArrayList<>();

          List originalProperty;
          List modifiedProperty;

          // Try to get a generic type
          Class genericTypeArgument = null;
          if (((List) original.get(key)).isEmpty()) {
            if (!((List) modified.get(key)).isEmpty()) {
              genericTypeArgument = ((List) modified.get(key)).get(0).getClass();
            }
          } else {
            genericTypeArgument = ((List) original.get(key)).get(0).getClass();
          }

          if (genericTypeArgument == UUID.class || genericTypeArgument == ClassKind.class
              || genericTypeArgument == VcardTelephoneNumberKind.class) {
            originalProperty = Lists.newArrayList(originalIterable);
            modifiedProperty = Lists.newArrayList(modifiedIterable);
          } else if (genericTypeArgument == OrderedItem.class) {
            originalProperty = Lists.newArrayList(originalIterable);
            modifiedProperty = Lists.newArrayList(modifiedIterable);

            List<OrderedItem> originalPropertyOrdered = Lists
                .newArrayList((Iterable) original.get(key));
            List<OrderedItem> modifiedPropertyOrdered = Lists
                .newArrayList((Iterable) modifiedFull.get(key));

            // move property using intersection
            ArrayList<OrderedItem> sameItems = Lists.newArrayList(originalPropertyOrdered);
            sameItems.retainAll(modifiedPropertyOrdered);

            for (OrderedItem sameItem : sameItems) {
              Optional<OrderedItem> orItem = originalPropertyOrdered
                  .stream()
                  .filter(o -> o.getV().equals((sameItem.getV())))
                  .findFirst();

              Optional<OrderedItem> modItem = modifiedPropertyOrdered
                  .stream()
                  .filter(m -> m.getV().equals((sameItem.getV())))
                  .findFirst();

              if (orItem.isPresent() && modItem.isPresent() && orItem.get().getK() != modItem.get()
                  .getK()) {
                modItem.get().moveItem(orItem.get().getK(), modItem.get().getK());
                possibleAdditions.add(modItem.get());
              }
            }
          } else {
            // either way remove key in case the generic type is not one of the expected ones
            modified.remove(key);
            continue;
          }

          ArrayList exceptModifiedList = Lists.newArrayList(modifiedProperty);
          exceptModifiedList.removeAll(originalProperty);
          possibleAdditions.addAll(exceptModifiedList);

          if (possibleAdditions.size() > 0) {
            // this part will be added to the update
            listsToAdd.put(key, possibleAdditions);
          }

          ArrayList possibleDeletions = Lists.newArrayList(originalProperty);
          possibleDeletions.removeAll(modifiedProperty);

          if (possibleDeletions.size() > 0) {
            // this part will be added to the delete
            listsToDelete.put(key, possibleDeletions);
          }

          // either way remove key
          modified.remove(key);
        }
      } else {
        // whatever outputs here has to be an update
        // remove the properties that have not changed
        if (key.equals(IID_KEY) || key.equals(CLASSKIND_KEY)) {
          continue;
        }

        if (original.get(key) == null) {
          if (original.get(key) == modifiedFull.get(key)) {
            modified.remove(key);
          }
        } else {
          if (original.get(key).equals(modifiedFull.get(key))) {
            modified.remove(key);
          }
        }
      }
    }

    if (listsToDelete.size() > 0) {
      ClasslessDTO deleteDto = ClasslessDtoFactory.fromThing(operation.getModifiedThing(), null);

      for (Entry<String, List<Object>> kvp : listsToDelete.entrySet()) {
        deleteDto.put(kvp.getKey(), kvp.getValue());
      }

      // add a delete container
      // Add to the list of deleted thing, WSP will compute what references were removed for the current Thing
      // example: a category was removed from an ElementDefinition => add a operation in the Delete Operation with the removed category
      this.delete.add(deleteDto);
    }

    if (listsToAdd.size() > 0) {
      ClasslessDTO updateDto = modified;
      for (Entry<String, List<Object>> kvp : listsToAdd.entrySet()) {
        updateDto.put(kvp.getKey(), kvp.getValue());
      }
    }

    // if more than just Iid and Classkind have changed then add it to update
    if (modified.size() > 2) {
      this.update.add(modified);
    }
  }

  /**
   * Resolves the copy operations.
   *
   * @param operation The {@link Operation}.
   */
  private void resolveCopy(Operation operation) {
    if (!OperationUtils.isCopyOperation(operation.getOperationKind())) {
      return;
    }

    CopyInfoOptions options = new CopyInfoOptions();
    options.setCopyKind(CopyKind.Deep);
    options.setKeepOwner(operation.getOperationKind() == OperationKind.COPY
        || operation.getOperationKind() == OperationKind.COPY_KEEP_VALUES);
    options.setKeepValues(operation.getOperationKind() == OperationKind.COPY_KEEP_VALUES
        || operation.getOperationKind() == OperationKind.COPY_KEEP_VALUES_CHANGE_OWNER);

    Thing sourcePojo = operation.getOriginalThing().querySourceThing();
    Iteration sourceIteration = sourcePojo.getContainerOfType(Iteration.class);

    CopySource source = new CopySource();
    CopyReference thingCopyReference = new CopyReference();
    thingCopyReference.setIid(operation.getOriginalThing().getIid());
    thingCopyReference.setClassKind(operation.getOriginalThing().getClassKind());
    source.setThing(thingCopyReference);
    CopyReference topContainerCopyReference = new CopyReference();
    topContainerCopyReference.setIid(sourcePojo.getTopContainer().getIid());
    topContainerCopyReference.setClassKind(sourcePojo.getTopContainer().getClassKind());
    source.setTopContainer(topContainerCopyReference);
    source.setIterationId(sourceIteration != null ? sourceIteration.getIid() : null);

    Thing pojo = operation.getModifiedThing().querySourceThing();
    if (pojo.getContainer() == null) {
      throw new IllegalArgumentException("The container cannot be null.");
    }

    Iteration targetIteration = pojo.getContainerOfType(Iteration.class);
    CopyTarget target = new CopyTarget();
    CopyReference containerCopyReference = new CopyReference();
    containerCopyReference.setIid(pojo.getContainer().getIid());
    containerCopyReference.setClassKind(pojo.getContainer().getClassKind());
    target.setContainer(containerCopyReference);
    CopyReference targetTopContainerCopyReference = new CopyReference();
    targetTopContainerCopyReference.setIid(pojo.getTopContainer().getIid());
    targetTopContainerCopyReference.setClassKind(pojo.getTopContainer().getClassKind());
    target.setTopContainer(targetTopContainerCopyReference);
    target.setIterationId(targetIteration != null ? targetIteration.getIid() : null);

    CopyInfo copyInfo = new CopyInfo();
    copyInfo.setSource(source);
    copyInfo.setTarget(target);
    copyInfo.setOptions(options);

    if (targetIteration != null) {
      Pair<DomainOfExpertise, Participant> participation = this.session.getOpenIterations()
          .entrySet()
          .stream()
          .filter(x -> x.getKey().getIid().equals(targetIteration.getIid()))
          .map(x -> x.getValue())
          .findFirst()
          .orElse(null);

      copyInfo.setActiveOwner(
          participation != null ? (participation.getLeft() != null ? participation.getLeft()
              .getIid() : null) : null);
    }

    this.copy.add(copyInfo);
  }

  @Override
  public List<ClasslessDTO> getDelete() {
    return this.delete;
  }

  @Override
  public List<cdp4common.dto.Thing> getCreate() {
    return this.create;
  }

  @Override
  public List<ClasslessDTO> getUpdate() {
    return this.update;
  }

  @Override
  public List<CopyInfo> getCopy() {
    return this.copy;
  }

  @Override
  public void setDelete(List<ClasslessDTO> delete) {
    this.delete = delete;
  }

  @Override
  public void setCreate(List<cdp4common.dto.Thing> create) {
    this.create = create;
  }

  @Override
  public void setUpdate(List<ClasslessDTO> update) {
    this.update = update;
  }

  @Override
  public void setCopy(List<CopyInfo> copy) {
    this.copy = copy;
  }
}
