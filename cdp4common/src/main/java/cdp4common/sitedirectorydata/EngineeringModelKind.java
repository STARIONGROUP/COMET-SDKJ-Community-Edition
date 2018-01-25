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
    S_T_U_D_Y__M_O_D_E_L,

    /**
     * assertion that an engineering model (represented by an EngineeringModelSetup and an EngineeringModel) is a template model intended to be used as the basis for new study modelsNote: A template model may have only one iteration (represented by a combination of IterationSetup and Iteration).
     */
    T_E_M_P_L_A_T_E__M_O_D_E_L,

    /**
     * assertion that an engineering model (represented by an EngineeringModelSetup and an EngineeringModel) is a catalogue of model components and/or patterns that can be re-used in the model of a studyNote: A catalogue may have only one iteration (represented by a combination of IterationSetup and Iteration), and one Option.
     */
    M_O_D_E_L__C_A_T_A_L_O_G_U_E,

    /**
     * assertion that an engineering model (represented by an EngineeringModelSetup and an EngineeringModel) is a scratch model to be used for preparation, training or experimentation purposes
     */
    S_C_R_A_T_C_H__M_O_D_E_L,
}
