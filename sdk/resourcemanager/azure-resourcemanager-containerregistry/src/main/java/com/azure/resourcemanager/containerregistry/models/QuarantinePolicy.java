// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerregistry.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** An object that represents quarantine policy for a container registry. */
@Fluent
public final class QuarantinePolicy {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(QuarantinePolicy.class);

    /*
     * The value that indicates whether the policy is enabled or not.
     */
    @JsonProperty(value = "status")
    private PolicyStatus status;

    /**
     * Get the status property: The value that indicates whether the policy is enabled or not.
     *
     * @return the status value.
     */
    public PolicyStatus status() {
        return this.status;
    }

    /**
     * Set the status property: The value that indicates whether the policy is enabled or not.
     *
     * @param status the status value to set.
     * @return the QuarantinePolicy object itself.
     */
    public QuarantinePolicy withStatus(PolicyStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
