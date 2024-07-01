/*
 * PostOperation.java
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

package cdp4dal.operations;

import cdp4common.ClasslessDTO;
import cdp4common.dto.CopyInfo;
import cdp4common.dto.Thing;
import java.util.List;

/**
 * The interface which all POST operations implement.
 */
public interface PostOperation {

  /**
   * Gets the collection of DTOs to delete.
   */
  List<ClasslessDTO> getDelete();

  /**
   * Sets the collection of DTOs to delete.
   */
  void setDelete(List<ClasslessDTO> delete);


  /**
   * Gets the collection of DTOs to create.
   */
  List<Thing> getCreate();

  /**
   * Sets the collection of DTOs to create.
   */
  void setCreate(List<Thing> create);

  /**
   * Gets the collection of DTOs to update.
   */
  List<ClasslessDTO> getUpdate();

  /**
   * Sets the collection of DTOs to update.
   */
  void setUpdate(List<ClasslessDTO> update);

  /**
   * Gets the collection of DTOs to copy.
   */
  List<CopyInfo> getCopy();

  /**
   * Sets the collection of DTOs to copy.
   */
  void setCopy(List<CopyInfo> copy);

  /**
   * Populate the current {@link PostOperation} with the content based on the provided {@link
   * Operation}
   *
   * @param operation The {@link Operation} that contains all the {@link Thing}s that need to be
   * updated to the data-source
   */
  void constructFromOperation(Operation operation);
}
