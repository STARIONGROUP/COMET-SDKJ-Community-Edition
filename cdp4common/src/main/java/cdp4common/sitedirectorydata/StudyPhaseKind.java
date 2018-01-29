/* --------------------------------------------------------------------------------------------------------------------
 * StudyPhaseKind.java
 * Copyright (c) 2018 RHEA System S.A.
 *
 * This is an auto-generated Enumeration. Any manual changes to this file will be overwritten!
 * --------------------------------------------------------------------------------------------------------------------
 */

package cdp4common.sitedirectorydata;

/**
 * <!--StartFragment--><a id="ParameterValueKind">enumeration datatype that represents</a><!--EndFragment--> the different study phases that may apply to an EngineeringModelSetup / EngineeringModel
 */
public enum StudyPhaseKind
{
    /**
     * assertion that a model pertains to a study preparation phase
     */
    PREPARATION_PHASE,

    /**
     * assertion that a model pertains to a study design session phase
     */
    DESIGN_SESSION_PHASE,

    /**
     * assertion that a model pertains to a study reporting phase
     */
    REPORTING_PHASE,

    /**
     * assertion that a model pertains to a completed study
     */
    COMPLETED_STUDY,
}
