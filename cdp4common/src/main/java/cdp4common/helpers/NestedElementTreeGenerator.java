/*
 * NestedElementTreeGenerator.java
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

package cdp4common.helpers;

import cdp4common.commondata.Thing;
import cdp4common.engineeringmodeldata.*;
import cdp4common.exceptions.NestedElementTreeException;
import cdp4common.sitedirectorydata.*;
import cdp4common.types.CacheKey;
import com.google.common.cache.Cache;
import com.google.common.collect.MoreCollectors;
import lombok.extern.log4j.Log4j2;

import java.net.URI;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

/**
 * The purpose of the {@link NestedElementTreeGenerator} class is to generate the {@link NestedElement}s
 * and {@link NestedParameter}s for an {@link Option} where the {@link NestedParameter}s
 * are owned by a specific {@link DomainOfExpertise}
 * The {@link NestedParameter}s represent the owned {@link Parameter}s, {@link ParameterOverride}s,
 * and {@link ParameterSubscription}s. Each {@link ParameterTypeComponent} of a {@link CompoundParameterType} is
 * represented by a unique {@link NestedParameter}.
 */
@Log4j2
public class NestedElementTreeGenerator {
    /**
     * Creates the {@link NestedParameter}s in a flat list from {@link NestedElement}s list for the of {@link NestedElement}s.
     *
     * @param option            The {@link Option} for which the {@link NestedParameter}s flat list is created. When the {@link Option}
     *                          is null then none of the {@link ElementUsage}s are filtered.
     * @param domainOfExpertise The {@link DomainOfExpertise} for which the {@link NestedParameter}s flat list needs to be generated. Only the {@link Parameter}s, {@link ParameterOverride}s and
     *                          {@link ParameterSubscription}s that are owned by the {@link DomainOfExpertise} will be taken into account.
     * @param updateOption      Value indicating whether the {@link Option} shall be updated with the created {@link NestedElement}s or not.
     * @return An {@link List} that contains the generated {@link NestedParameter}s
     * @throws NullPointerException thrown when the {@code domainOfExpertise} is null or thrown when the {@code option} is null
     */
    public List<NestedParameter> getNestedParameters(Option option, DomainOfExpertise domainOfExpertise, boolean updateOption) {
        if (option == null) {
            throw new NullPointerException("The option may not be null");
        }

        if (domainOfExpertise == null) {
            throw new NullPointerException("The domainOfExpertise may not be null");
        }

        var iteration = (Iteration) option.getContainer();

        log.debug(String.format("Generating NestedElement for Iteration %s, Option: %s, DomainOfExpertise %s", iteration.getIid(), option.getShortName(), domainOfExpertise.getShortName()));

        var nestedElements = this.generate(option, domainOfExpertise, updateOption);

        log.debug(String.format("Creating NestedParameters Iteration: %s, Option: %s, DomainOfExpertise %s", iteration.getIid(), option.getShortName(), domainOfExpertise.getShortName()));

        var flatNestedParameters = nestedElements.stream().flatMap(nestedElement -> nestedElement.getNestedParameter().stream());

        return flatNestedParameters.collect(Collectors.toList());
    }

    /**
     * Generates the {@link NestedElement}s and {@link NestedParameter}s for the specified {@link Option}
     *
     * @param option            The {@link Option} for which the {@link NestedElement} tree needs to be generated.
     * @param domainOfExpertise The {@link DomainOfExpertise} for which the {@link NestedElement} tree needs to be generated.
     *                          Only the {@link Parameter}s, {@link ParameterOverride}s and {@link ParameterSubscription}s that are owned by
     *                          the {@link DomainOfExpertise} will be taken into account when generating {@link NestedParameter}s
     * @param updateOption      Value indicating whether the {@link Option} shall be updated with the created {@link NestedElement}s or not.
     * @return An {@link Collection} that contains the generated {@link NestedElement}s filtered based on the provided {@link Option}
     * @throws NullPointerException thrown when the {@code domainOfExpertise} is null thrown when the {@code option} is null
     */
    public Collection<NestedElement> generate(Option option, DomainOfExpertise domainOfExpertise, boolean updateOption) {
        if (option == null) {
            throw new NullPointerException("The option may not be null");
        }

        if (domainOfExpertise == null) {
            throw new NullPointerException("The domainOfExpertise may not be null");
        }

        Iteration iteration = (Iteration) option.getContainer();
        ElementDefinition rootElement = iteration.getTopElement();

        if (rootElement == null) {
            throw new NestedElementTreeException(String.format("The container Iteration of Option %s does not have a TopElement specified", option.getShortName()));
        }

        log.debug(String.format("Generating NestedElement for Iteration %s, Option: %s, DomainOfExpertise %s", iteration.getIid(), option.getShortName(), domainOfExpertise.getShortName()));

        Collection<NestedElement> createNestedElements = this.generateNestedElements(option, domainOfExpertise, rootElement, updateOption);

        return createNestedElements;
    }

    /**
     * Generates the {@link NestedElement}s starting at the {@code rootElement}
     *
     * @param option            The {@link Option} for which the {@link NestedElement} tree is created. When the {@link Option}
     *                          is null then none of the {@link ElementUsage}s are filtered.
     * @param domainOfExpertise The {@link DomainOfExpertise} for which the {@link NestedElement} tree needs to be generated.
     *                          Only the {@link Parameter}s, {@link ParameterOverride}s and
     *                          {@link ParameterSubscription}s that are owned by the {@link DomainOfExpertise}
     *                          will be taken into account when generating {@link NestedParameter}s
     * @param updateOption      Value indicating whether the {@link Option} shall be updated with the created {@link NestedElement}s or not.
     * @param rootElement       The {@link ElementDefinition} that serves as the root of the generated {@link NestedElement} tree.
     * @return An {@link Collection} that contains the generated {@link NestedElement}s
     * @throws NullPointerException thrown when the {@code domainOfExpertise} is null
     *                              thrown when the {@code option} is null
     *                              thrown when the {@code rootElement} is null
     */
    public Collection<NestedElement> generateNestedElements(Option option, DomainOfExpertise domainOfExpertise, ElementDefinition rootElement, boolean updateOption) {
        if (option == null) {
            throw new NullPointerException("The option may not be null");
        }

        if (domainOfExpertise == null) {
            throw new NullPointerException("The domainOfExpertise may not be null");
        }

        if (rootElement == null) {
            throw new NullPointerException("The rootElement may not be null");
        }

        List<NestedElement> nestedElements = new ArrayList<>();

        NestedElement rootNestedElement = this.createNestedElementAndNestedParametersForRootElement(rootElement, domainOfExpertise, option, updateOption);
        nestedElements.add(rootNestedElement);

        List<ElementUsage> elementUsages = new ArrayList<>();
        Collection<NestedElement> recursedNestedElements = this.recursivelyCreateNestedElements(rootElement, rootElement, domainOfExpertise, elementUsages, option, updateOption);
        nestedElements.addAll(recursedNestedElements);

        return nestedElements;
    }

    /**
     * Recursively Create {@link NestedElement}s
     *
     * @param elementDefinition The {@link ElementDefinition} that contains {@link ElementUsage}s that
     * @param rootElement       The {@link ElementDefinition} that is the root of the {@link NestedElement} tree.
     * @param domainOfExpertise The {@link DomainOfExpertise} for which the {@link NestedElement} tree needs to be generated.
     *                          Only the {@link Parameter}s, {@link ParameterOverride}s and {@link ParameterSubscription}s
     *                          that are owned by the {@link DomainOfExpertise} will be taken into account when generating {@link NestedParameter}s
     * @param elementUsages     A {@link List} that contains the {@link ElementUsage} that define the containment tree
     *                          for the {@link NestedElement}s at the level of the {@code elementDefinition}.
     * @param option            The {@link Option} for which the {@link NestedElement} tree is created. When the {@link Option}
     *                          is null then none of the {@link ElementUsage}s are filtered.
     * @param updateOption      Value indicating whether the {@link Option} shall be updated with the created {@link NestedElement}s or not.
     * @return The {@link Collection} that have been created.
     */
    private Collection<NestedElement> recursivelyCreateNestedElements(ElementDefinition elementDefinition, ElementDefinition rootElement, DomainOfExpertise domainOfExpertise, List<ElementUsage> elementUsages, Option option, boolean updateOption) {
        Cache<CacheKey, Thing> cache = elementDefinition.getCache();
        URI uri = elementDefinition.getIDalUri();
        Collection<NestedElement> nestedElementsFormed = new ArrayList<>();

        for (ElementUsage elementUsage : elementDefinition.getContainedElement()) {
            // comparison is done based on unique identifiers, not on object level. The provided option may be a clone
            if (elementUsage.getExcludeOption().stream().anyMatch(x -> x.getIid() == option.getIid())) {
                log.debug(String.format("ElementUsage %s:%s is excluded from the Nested Elements.", elementUsage.getIid(), elementUsage.getShortName()));
                continue;
            }

            NestedElement nestedElement = new NestedElement(UUID.randomUUID(), cache, uri);
            nestedElement.setRootElement(rootElement);
            nestedElement.setVolatile(true);

            if (updateOption) {
                option.getNestedElement().add(nestedElement);
            } else {
                nestedElement.setContainer(option);
            }

            Collection<NestedParameter> nestedParameters = this.createNestedParameters(elementUsage, domainOfExpertise, option);
            for (NestedParameter nestedParameter : nestedParameters) {
                nestedElement.getNestedParameter().add(nestedParameter);
            }

            List<ElementUsage> containmentUsages = new ArrayList<>();
            for (ElementUsage usage : elementUsages) {
                nestedElement.getElementUsage().add(usage);
                containmentUsages.add(usage);
            }

            nestedElement.getElementUsage().add(elementUsage);
            containmentUsages.add(elementUsage);

            ElementDefinition referencedElementDefinition = elementUsage.getElementDefinition();

            Collection<NestedElement> nestedElements = this.recursivelyCreateNestedElements(referencedElementDefinition, rootElement, domainOfExpertise, containmentUsages, option, updateOption);
            nestedElementsFormed.addAll(nestedElements);

            nestedElementsFormed.add(nestedElement);
        }

        return nestedElementsFormed;
    }

    /**
     * Creates The {@link NestedElement} and contained {@link NestedParameter} that represents the {@code rootElement}
     *
     * @param rootElement       The {@link ElementDefinition} that is the root of the {@link NestedElement} tree.
     * @param domainOfExpertise The {@link DomainOfExpertise} for which the {@link NestedElement} tree needs to be generated. Only the {@link Parameter}s, {@link ParameterOverride}s and
     *                          {@link ParameterSubscription}s that are owned by the {@link DomainOfExpertise} will be taken into account when generating {@link NestedParameter}s
     * @param option            The {@link Option} for which the {@link NestedElement} tree is created. When the {@link Option}
     *                          is null then none of the {@link ElementUsage}s are filtered.
     * @param updateOption      Value indicating whether the {@link Option} shall be updated with the created {@link NestedElement}s or not.
     * @return The {@link NestedElement} that have been created.
     */
    private NestedElement createNestedElementAndNestedParametersForRootElement(ElementDefinition rootElement, DomainOfExpertise domainOfExpertise, Option option, boolean updateOption) {
        NestedElement nestedElement = new NestedElement(UUID.randomUUID(), rootElement.getCache(), rootElement.getIDalUri());
        nestedElement.setRootElement(rootElement);
        nestedElement.setVolatile(true);
        nestedElement.setIsRootElement(true);

        if (updateOption) {
            option.getNestedElement().add(nestedElement);
        } else {
            nestedElement.setContainer(option);
        }

        for (Parameter parameter : rootElement.getParameter()) {
            CompoundParameterType compoundParameterType = parameter.getParameterType() instanceof CompoundParameterType ? (CompoundParameterType) (parameter.getParameterType()) : null;

            if (parameter.getOwner().equals(domainOfExpertise)) {
                Collection<ParameterValueSet> valueSets = parameter.isOptionDependent() ? parameter.getValueSet().stream().filter(vs -> vs.getActualOption().equals(option)).collect(Collectors.toList())
                        : parameter.getValueSet();

                for (ParameterValueSet parameterValueSet : valueSets) {
                    if (compoundParameterType == null) {
                        NestedParameter nestedParameter = this.createdNestedParameter(parameter, null, parameterValueSet, option);
                        nestedElement.getNestedParameter().add(nestedParameter);
                    } else {
                        for (ParameterTypeComponent component : compoundParameterType.getComponent()) {
                            NestedParameter nestedParameter = this.createdNestedParameter(parameter, component, parameterValueSet, option);
                            nestedElement.getNestedParameter().add(nestedParameter);
                        }
                    }
                }
            } else {
                ParameterSubscription subscription = parameter.getParameterSubscription().stream().filter(ps -> ps.getOwner().equals(domainOfExpertise)).collect(MoreCollectors.toOptional()).orElse(null);
                if (subscription != null) {
                    Collection<NestedParameter> nestedParameters = this.createdNestedParameters(subscription, option, compoundParameterType);
                    for (NestedParameter nestedParameter : nestedParameters) {
                        nestedElement.getNestedParameter().add(nestedParameter);
                    }
                }
            }
        }

        return nestedElement;
    }

    /**
     * Creates {@link NestedParameter}s based on the {@link Parameter} that are contained by the {@link ElementDefinition}
     * that is referenced by the {@code elementUsage} as well as {@link NestedParameter}s that are based on the {@link ParameterOverride}
     * that are contained by the {@code elementUsage} itself.
     *
     * @param elementUsage      The {@link ElementUsage} that corresponds to the {@link NestedElement} for which {@link NestedParameter}s need to be created
     * @param domainOfExpertise The {@link DomainOfExpertise} for which the {@link NestedElement} tree needs to be generated. Only the {@link Parameter}s, {@link ParameterOverride}s and
     *                          {@link ParameterSubscription}s that are owned by the {@link DomainOfExpertise} will be taken into account when generating {@link NestedParameter}s
     * @param option            The {@link Option} for which the {@link NestedElement} tree is created.
     * @return An {@link Collection}.
     */
    private Collection<NestedParameter> createNestedParameters(ElementUsage elementUsage, DomainOfExpertise domainOfExpertise, Option option) {
        ElementDefinition elementDefinition = elementUsage.getElementDefinition();
        List<NestedParameter> nestedParameters = new ArrayList<>();

        for (Parameter parameter : elementDefinition.getParameter()) {
            CompoundParameterType compoundParameterType = parameter.getParameterType() instanceof CompoundParameterType ? (CompoundParameterType) (parameter.getParameterType()) : null;

            ParameterOverride parameterOverride = elementUsage.getParameterOverride().stream().filter(po -> po.getParameter().equals(parameter)).collect(MoreCollectors.toOptional()).orElse(null);
            if (parameterOverride == null) {
                if (parameter.getOwner().equals(domainOfExpertise)) {
                    Collection<ParameterValueSet> valueSets = parameter.isOptionDependent() ? parameter.getValueSet().stream().filter(vs -> vs.getActualOption().equals(option)).collect(Collectors.toList()) : parameter.getValueSet();

                    for (ParameterValueSet parameterValueSet : valueSets) {
                        if (compoundParameterType == null) {
                            NestedParameter nestedParameter = this.createdNestedParameter(parameter, null, parameterValueSet, option);
                            nestedParameters.add(nestedParameter);
                        } else {
                            for (ParameterTypeComponent component : compoundParameterType.getComponent()) {
                                NestedParameter nestedParameter = this.createdNestedParameter(parameter, component, parameterValueSet, option);

                                nestedParameters.add(nestedParameter);
                            }
                        }
                    }
                } else {
                    ParameterSubscription subscription = parameter.getParameterSubscription().stream().filter(ps -> ps.getOwner().equals(domainOfExpertise)).collect(MoreCollectors.toOptional()).orElse(null);
                    if (subscription != null) {
                        Collection<NestedParameter> createdNestedParameters = this.createdNestedParameters(subscription, option, compoundParameterType);
                        nestedParameters.addAll(createdNestedParameters);
                    }
                }
            } else {
                if (parameterOverride.getOwner().equals(domainOfExpertise)) {
                    Collection<ParameterOverrideValueSet> valueSets = parameterOverride.isOptionDependent() ? parameterOverride.getValueSet().stream().filter(vs -> vs.getActualOption().equals(option)).collect(Collectors.toList()) : parameterOverride.getValueSet();
                    for (ParameterOverrideValueSet parameterOverrideValueSet : valueSets) {
                        if (compoundParameterType == null) {
                            NestedParameter nestedParameter = this.createdNestedParameter(parameter, null, parameterOverrideValueSet, option);
                            nestedParameters.add(nestedParameter);
                        } else {
                            for (ParameterTypeComponent component : compoundParameterType.getComponent()) {
                                NestedParameter nestedParameter = this.createdNestedParameter(parameter, component, parameterOverrideValueSet, option);
                                nestedParameters.add(nestedParameter);
                            }
                        }
                    }
                } else {
                    ParameterSubscription subscription = parameterOverride.getParameterSubscription().stream().filter(ps -> ps.getOwner().equals(domainOfExpertise)).collect(MoreCollectors.toOptional()).orElse(null);
                    if (subscription != null) {
                        Collection<NestedParameter> createdNestedParameters = this.createdNestedParameters(subscription, option, compoundParameterType);
                        nestedParameters.addAll(createdNestedParameters);
                    }
                }
            }
        }

        return nestedParameters;
    }

    /**
     * Creates a {@link NestedParameter} based on the provided {@link ParameterOrOverrideBase} and {@link ParameterValueSetBase}
     *
     * @param subscription          The {@link ParameterSubscription} that contains the {@link ParameterSubscriptionValueSet} based on which the
     *                              {@link NestedParameter} is created.
     * @param option                The {@link Option} for which the {@link NestedElement} tree is created.
     * @param compoundParameterType The {@link CompoundParameterType} that contains the {@link ParameterTypeComponent} for which distinct {@link NestedParameter}
     *                              are created.
     * @return An instance of a non-volatile {@link NestedParameter}
     */
    private Collection<NestedParameter> createdNestedParameters(ParameterSubscription subscription, Option option, CompoundParameterType compoundParameterType) {
        Collection<ParameterSubscriptionValueSet> valueSets = subscription.isOptionDependent() ? subscription.getValueSet().stream().filter(vs -> vs.getActualOption().equals(option)).collect(Collectors.toList()) : subscription.getValueSet();
        List<NestedParameter> nestedParameters = new ArrayList<>();

        for (ParameterSubscriptionValueSet parameterSubscriptionValueSet : valueSets) {
            if (compoundParameterType == null) {
                NestedParameter nestedParameter = this.createNestedParameter(subscription, null, parameterSubscriptionValueSet, option);
                nestedParameters.add(nestedParameter);
            } else {
                for (ParameterTypeComponent component : compoundParameterType.getComponent()) {
                    NestedParameter nestedParameter = this.createNestedParameter(subscription, component, parameterSubscriptionValueSet, option);
                    nestedParameters.add(nestedParameter);
                }
            }
        }

        return nestedParameters;
    }

    /**
     * Creates a {@link NestedParameter} based on the provided {@link ParameterOrOverrideBase} and {@link ParameterValueSetBase}
     *
     * @param parameter The {@link ParameterOrOverrideBase} that contains the {@link ParameterValueSetBase} based on which the
     *                  {@link NestedParameter} is created.
     * @param component The {@link ParameterTypeComponent} that this {@link NestedParameter} is associated to. This may be null in case the {@link ParameterType}
     *                  of the associated {@link Parameter} is a {@link ScalarParameterType}.
     * @param valueSet  The {@link ParameterValueSetBase} that provides the reference to the {@link ActualFiniteState} and values
     *                  to create the {@link NestedParameter}
     * @param option    The {@link Option} that this {@link NestedParameter} is associated to
     * @return An instance of a non-volatile {@link NestedParameter}
     */
    private NestedParameter createdNestedParameter(ParameterOrOverrideBase parameter, ParameterTypeComponent component, ParameterValueSetBase valueSet, Option option) {
        int componentIndex = component == null ? 0 : component.getIndex();
        String actualValue = valueSet.getActualValue().get(componentIndex);
        String formula = valueSet.getFormula().get(componentIndex);

        NestedParameter nestedParameter = new NestedParameter(UUID.randomUUID(), parameter.getCache(), parameter.getIDalUri());
        nestedParameter.setVolatile(true);
        nestedParameter.setAssociatedParameter(parameter);
        nestedParameter.setOwner(parameter.getOwner());
        nestedParameter.setComponent(component);
        nestedParameter.setActualState(valueSet.getActualState());
        nestedParameter.setActualValue(actualValue);
        nestedParameter.setFormula(formula);
        nestedParameter.setValueSet(valueSet);
        nestedParameter.setOption(option);

        return nestedParameter;
    }

    /**
     * Creates a {@link NestedParameter} based on the provided {@link ParameterOrOverrideBase} and {@link ParameterValueSetBase}
     *
     * @param subscription The {@link ParameterSubscription} that contains the {@link ParameterSubscriptionValueSet} based on which the
     *                     {@link NestedParameter} is created.
     * @param component    The {@link ParameterTypeComponent} that this {@link NestedParameter} is associated to. This may be null in case the {@link ParameterType}
     *                     of the associated {@link Parameter} is a {@link ScalarParameterType}.
     * @param valueSet     The {@link ParameterSubscriptionValueSet} that provides the reference to the {@link ActualFiniteState} and values
     *                     to create the {@link NestedParameter}
     * @param option       The {@link Option} that this {@link NestedParameter} is associated to
     * @return An instance of a non-volatile {@link NestedParameter}
     */
    private NestedParameter createNestedParameter(ParameterSubscription subscription, ParameterTypeComponent component, ParameterSubscriptionValueSet valueSet, Option option) {
        int componentIndex = component == null ? 0 : component.getIndex();
        String actualValue = valueSet.getActualValue().get(componentIndex);

        NestedParameter nestedParameter = new NestedParameter(UUID.randomUUID(), subscription.getCache(), subscription.getIDalUri());
        nestedParameter.setVolatile(true);
        nestedParameter.setAssociatedParameter(subscription);
        nestedParameter.setOwner(subscription.getOwner());
        nestedParameter.setComponent(component);
        nestedParameter.setActualState(valueSet.getActualState());
        nestedParameter.setActualValue(actualValue);
        nestedParameter.setValueSet(valueSet);
        nestedParameter.setOption(option);

        return nestedParameter;
    }
}
