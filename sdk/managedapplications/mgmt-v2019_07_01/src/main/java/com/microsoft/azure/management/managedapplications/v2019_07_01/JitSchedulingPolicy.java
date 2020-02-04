/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.managedapplications.v2019_07_01;

import org.joda.time.Period;
import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The JIT scheduling policies.
 */
public class JitSchedulingPolicy {
    /**
     * The type of JIT schedule. Possible values include: 'NotSpecified',
     * 'Once', 'Recurring'.
     */
    @JsonProperty(value = "type", required = true)
    private JitSchedulingType type;

    /**
     * The required duration of the JIT request.
     */
    @JsonProperty(value = "duration", required = true)
    private Period duration;

    /**
     * The start time of the request.
     */
    @JsonProperty(value = "startTime", required = true)
    private DateTime startTime;

    /**
     * Get the type of JIT schedule. Possible values include: 'NotSpecified', 'Once', 'Recurring'.
     *
     * @return the type value
     */
    public JitSchedulingType type() {
        return this.type;
    }

    /**
     * Set the type of JIT schedule. Possible values include: 'NotSpecified', 'Once', 'Recurring'.
     *
     * @param type the type value to set
     * @return the JitSchedulingPolicy object itself.
     */
    public JitSchedulingPolicy withType(JitSchedulingType type) {
        this.type = type;
        return this;
    }

    /**
     * Get the duration value.
     *
     * @return the duration value
     */
    public Period duration() {
        return this.duration;
    }

    /**
     * Set the duration value.
     *
     * @param duration the duration value to set
     * @return the JitSchedulingPolicy object itself.
     */
    public JitSchedulingPolicy withDuration(Period duration) {
        this.duration = duration;
        return this;
    }

    /**
     * Get the start time of the request.
     *
     * @return the startTime value
     */
    public DateTime startTime() {
        return this.startTime;
    }

    /**
     * Set the start time of the request.
     *
     * @param startTime the startTime value to set
     * @return the JitSchedulingPolicy object itself.
     */
    public JitSchedulingPolicy withStartTime(DateTime startTime) {
        this.startTime = startTime;
        return this;
    }

}