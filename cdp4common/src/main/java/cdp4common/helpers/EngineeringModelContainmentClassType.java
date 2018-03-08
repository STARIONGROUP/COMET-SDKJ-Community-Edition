/* --------------------------------------------------------------------------------------------------------------------
 * EngineeringModelContainmentClassType.java
 * Copyright (c) 2018 RHEA System S.A.
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
