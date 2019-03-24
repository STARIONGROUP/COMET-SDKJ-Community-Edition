/* --------------------------------------------------------------------------------------------------------------------
 * ScalarParameterType.java
 * Copyright (c) 2015 - 2019 RHEA System S.A.
 *
 * This is an auto-generated DTO Class. Any manual changes to this file will be overwritten!
 * --------------------------------------------------------------------------------------------------------------------
 */

package cdp4common.dto;

import java.util.*;
import java.util.stream.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.io.*;
import java.net.URI;
import cdp4common.*;
import cdp4common.commondata.*;
import cdp4common.diagramdata.*;
import cdp4common.engineeringmodeldata.*;
import cdp4common.helpers.*;
import cdp4common.reportingdata.*;
import cdp4common.sitedirectorydata.*;
import cdp4common.types.*;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.MoreCollectors;
import com.google.common.cache.Cache;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.EqualsAndHashCode;

import javax.xml.bind.annotation.XmlTransient;

/**
 * A Data Transfer Object representation of the {@link "ScalarParameterType"} class.
 */
@Container(clazz = ReferenceDataLibrary.class, propertyName = "parameterType")
@ToString
@EqualsAndHashCode(callSuper = true)
public abstract class ScalarParameterType extends ParameterType implements Cloneable {
    /**
     * Initializes a new instance of the {@link "ScalarParameterType"} class.
     */
    protected ScalarParameterType() {
    }

    /**
     * Initializes a new instance of the {@link "ScalarParameterType"} class.
     *
     * @param iid The unique identifier.
     * @param rev The revision number.
     */
    protected ScalarParameterType(UUID iid, int rev) {
        super(iid, rev);
    }

    /**
     * Gets the route for the current {@link ScalarParameterType}.
     */
    @Override
    public String getRoute() {
        return this.computedRoute();
    }
}
