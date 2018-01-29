/* --------------------------------------------------------------------------------------------------------------------
 * EngineeringModelKind.java
 * Copyright (c) 2018 RHEA System S.A.
 *
 * This is an auto-generated Enumeration. Any manual changes to this file will be overwritten!
 * --------------------------------------------------------------------------------------------------------------------
 */

package cdp4common.sitedirectorydata;

/**
 * enumeration datatype that represents the different possible kinds ofEngineeringModel
 */
public enum EngineeringModelKind
{
    /**
     * assertion that an engineering model (represented by an EngineeringModelSetup and an EngineeringModel) is the model of a concrete study
     */
    STUDY_MODEL,

    /**
     * assertion that an engineering model (represented by an EngineeringModelSetup and an EngineeringModel) is a template model intended to be used as the basis for new study modelsNote: A template model may have only one iteration (represented by a combination of IterationSetup and Iteration).
     */
    TEMPLATE_MODEL,

    /**
     * assertion that an engineering model (represented by an EngineeringModelSetup and an EngineeringModel) is a catalogue of model components and/or patterns that can be re-used in the model of a studyNote: A catalogue may have only one iteration (represented by a combination of IterationSetup and Iteration), and one Option.
     */
    MODEL_CATALOGUE,

    /**
     * assertion that an engineering model (represented by an EngineeringModelSetup and an EngineeringModel) is a scratch model to be used for preparation, training or experimentation purposes
     */
    SCRATCH_MODEL,
}
