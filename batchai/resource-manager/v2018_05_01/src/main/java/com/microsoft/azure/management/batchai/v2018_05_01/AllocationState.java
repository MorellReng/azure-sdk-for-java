/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.batchai.v2018_05_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for AllocationState.
 */
public final class AllocationState extends ExpandableStringEnum<AllocationState> {
    /** Static value steady for AllocationState. */
    public static final AllocationState STEADY = fromString("steady");

    /** Static value resizing for AllocationState. */
    public static final AllocationState RESIZING = fromString("resizing");

    /**
     * Creates or finds a AllocationState from its string representation.
     * @param name a name to look for
     * @return the corresponding AllocationState
     */
    @JsonCreator
    public static AllocationState fromString(String name) {
        return fromString(name, AllocationState.class);
    }

    /**
     * @return known AllocationState values
     */
    public static Collection<AllocationState> values() {
        return values(AllocationState.class);
    }
}