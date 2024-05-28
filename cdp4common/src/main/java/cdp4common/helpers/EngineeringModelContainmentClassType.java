/* --------------------------------------------------------------------------------------------------------------------
 * EngineeringModelContainmentClassType.java
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
 *
 * This is an auto-generated EngineeringModelContainmentClassType class. Any manual changes to this file will be overwritten!
 * --------------------------------------------------------------------------------------------------------------------
 */

package cdp4common.helpers;

import cdp4common.commondata.ClassKind;
import cdp4common.engineeringmodeldata.EngineeringModel;
import cdp4common.engineeringmodeldata.Iteration;

/**
 * Class representing the Array of {@link ClassKind}'s contained by {@link EngineeringModel}
 */
public class EngineeringModelContainmentClassType
{
    /**
     * Array consisting of {@link ClassKind}'s which are contained through a composite aggregation by {@link EngineeringModel} and 
     * it's subtree, excluding the subtree of the {@link Iteration} class
     *
     * The array does not contain any ClassKinds of abstract classes
     */
    public static final ClassKind[] CLASS_KIND_ARRAY = new ClassKind[] {
        ClassKind.ActionItem,
        ClassKind.Approval,
        ClassKind.BinaryNote,
        ClassKind.Book,
        ClassKind.ChangeProposal,
        ClassKind.ChangeRequest,
        ClassKind.CommonFileStore,
        ClassKind.ContractChangeNotice,
        ClassKind.EngineeringModelDataDiscussionItem,
        ClassKind.EngineeringModelDataNote,
        ClassKind.File,
        ClassKind.FileRevision,
        ClassKind.Folder,
        ClassKind.Iteration,
        ClassKind.LogEntryChangelogItem,
        ClassKind.ModellingThingReference,
        ClassKind.ModelLogEntry,
        ClassKind.Page,
        ClassKind.RequestForDeviation,
        ClassKind.RequestForWaiver,
        ClassKind.ReviewItemDiscrepancy,
        ClassKind.Section,
        ClassKind.Solution,
        ClassKind.TextualNote,
        ClassKind.EngineeringModel
    };
}
