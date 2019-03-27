/* --------------------------------------------------------------------------------------------------------------------
 * EngineeringModelContainmentClassType.java
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
        ClassKind.ACTION_ITEM,
        ClassKind.APPROVAL,
        ClassKind.BINARY_NOTE,
        ClassKind.BOOK,
        ClassKind.CHANGE_PROPOSAL,
        ClassKind.CHANGE_REQUEST,
        ClassKind.COMMON_FILE_STORE,
        ClassKind.CONTRACT_CHANGE_NOTICE,
        ClassKind.ENGINEERING_MODEL_DATA_DISCUSSION_ITEM,
        ClassKind.ENGINEERING_MODEL_DATA_NOTE,
        ClassKind.FILE,
        ClassKind.FILE_REVISION,
        ClassKind.FOLDER,
        ClassKind.ITERATION,
        ClassKind.MODELLING_THING_REFERENCE,
        ClassKind.MODEL_LOG_ENTRY,
        ClassKind.PAGE,
        ClassKind.REQUEST_FOR_DEVIATION,
        ClassKind.REQUEST_FOR_WAIVER,
        ClassKind.REVIEW_ITEM_DISCREPANCY,
        ClassKind.SECTION,
        ClassKind.SOLUTION,
        ClassKind.TEXTUAL_NOTE,
        ClassKind.ENGINEERING_MODEL
    };
}
