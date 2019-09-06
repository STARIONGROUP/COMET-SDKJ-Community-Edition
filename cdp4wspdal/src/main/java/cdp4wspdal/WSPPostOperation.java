/*
 * WSPPostOperation.java
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

package cdp4wspdal;

import static cdp4common.helpers.Utils.as;

import cdp4common.ClasslessDTO;
import cdp4common.ClasslessDtoFactory;
import cdp4common.commondata.ClassKind;
import cdp4common.commondata.Thing;
import cdp4common.dto.CopyInfo;
import cdp4common.sitedirectorydata.VcardTelephoneNumberKind;
import cdp4common.types.OrderedItem;
import cdp4common.types.ValueArray;
import cdp4dal.operations.Operation;
import cdp4dal.operations.OperationKind;
import cdp4dal.operations.PostOperation;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 * Class containing the form of the official WSP post request.
 */
@JsonIgnoreProperties(value = { "_copy" })
class WSPPostOperation implements PostOperation {

  /**
   * Initializes a new instance of the {@link WSPPostOperation} class.
   */
  WSPPostOperation() {
    this.delete = new ArrayList<>();
    this.create = new ArrayList<>();
    this.update = new ArrayList<>();
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
   * Populate this {@link WSPPostOperation} with the correct setup for the OCDT protocol.
   *
   * @param operation The {@link Operation} that contains all the {@link Thing}s that need to be
   * updated to the data-source.
   */
  @Override
  public void constructFromOperation(Operation operation) {
    if (operation.getModifiedThing() == null) {
      throw new NullPointerException("The operation may not be null");
    }

    if (operation.getOperationKind() == OperationKind.UPDATE
        && operation.getOriginalThing() == null) {
      throw new IllegalArgumentException(
          "When OperationKind is an Update the OriginalThing of the operation may not be null");
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
      case COPY:
        throw new UnsupportedOperationException("The WSP Post operations do not support a Copy");
      case MOVE:
        throw new UnsupportedOperationException("The WSP Post operations do not support a Move");
    }
  }

  /**
   * Resolves the Update container of the {@link Operation}.
   *
   * @param operation The operation.
   */
  private void resolveUpdate(Operation operation) {
    var original = ClasslessDtoFactory.fullFromThing(operation.getOriginalThing());
    var modifiedFull = ClasslessDtoFactory.fullFromThing(operation.getModifiedThing());
    var modified = ClasslessDtoFactory.fullFromThing(operation.getModifiedThing());

    Map<String, List<Object>> listsToDelete = new HashMap<>();
    Map<String, List<Object>> listsToAdd = new HashMap<>();

    for (var key : original.keySet()) {
      var originalIterable = as(original.get(key), Iterable.class);
      if (originalIterable != null) {
        var modifiedIterable = (Iterable) modifiedFull.get(key);

        // value array case
        if (originalIterable instanceof ValueArray
            && ((ValueArray) originalIterable).getItemType() == String.class) {
          var originalValue = (ValueArray<String>) originalIterable;
          var modifiedValue = (ValueArray<String>) modifiedIterable;

          if (originalValue.toString().equals(modifiedValue.toString())) {
            modified.remove(key);
          }
        } else {
          var possibleAdditions = new ArrayList<>();

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
            var sameItems = Lists.newArrayList(originalPropertyOrdered);
            sameItems.retainAll(modifiedPropertyOrdered);

            for (var sameItem : sameItems) {
              var orItem = originalPropertyOrdered
                  .stream()
                  .filter(o -> o.getV().equals((sameItem.getV())))
                  .findFirst();

              var modItem = modifiedPropertyOrdered
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

          var exceptModifiedList = Lists.newArrayList(modifiedProperty);
          exceptModifiedList.removeAll(originalProperty);
          possibleAdditions.addAll(exceptModifiedList);

          if (possibleAdditions.size() > 0) {
            // this part will be added to the update
            listsToAdd.put(key, possibleAdditions);
          }

          var possibleDeletions = Lists.newArrayList(originalProperty);
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
        if (key.equals("iid") || key.equals("classKind")) {
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
      var deleteDto = ClasslessDtoFactory.fromThing(operation.getModifiedThing(), null);

      for (var kvp : listsToDelete.entrySet()) {
        deleteDto.put(kvp.getKey(), kvp.getValue());
      }

      // add a delete container
      // Add to the list of deleted thing, WSP will compute what references were removed for the current Thing
      // example: a category was removed from an ElementDefinition => add a operation in the Delete Operation with the removed category
      this.delete.add(deleteDto);
    }

    if (listsToAdd.size() > 0) {
      var updateDto = modified;
      for (var kvp : listsToAdd.entrySet()) {
        updateDto.put(kvp.getKey(), kvp.getValue());
      }
    }

    // if more than just Iid and Classkind have changed then add it to update
    if (modified.size() > 2) {
      this.update.add(modified);
    }
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
