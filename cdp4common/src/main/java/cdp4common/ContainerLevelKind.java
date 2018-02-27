/*
 * ContainerLevelKind.java
 * Copyright (c) 2018 RHEA System S.A.
 */

package cdp4common;

/**
 * Enumeration that specifies at what level in the containment hierarchy an instance is located.
 */
public enum ContainerLevelKind {
    /**
     * Assertion that the level cannot be set, this is applicable for Abstract classes
     */
    INVALID,

    /**
     * Assertion that it is not yet determined where the instance is located in the containment hierarchy.
     */
    INCONCLUSIVE,

    /**
     * Assertion that the instance is contained by a {@link cdp4common.sitedirectorydata.SiteDirectory}
     */
    SITE_DIRECTORY,

    /**
     * Assertion that the instance is contained by a {@link cdp4common.engineeringmodeldata.EngineeringModel}.
     * This exlcudes containment by {@link cdp4common.engineeringmodeldata.Iteration}
     */
    ENGINEERING_MODEL,

    /**
     * Assertion that the instance is contained by a {@link cdp4common.engineeringmodeldata.Iteration}.
     * This excludes containment by {@link cdp4common.engineeringmodeldata.Iteration}
     */
    ITERATION
}
