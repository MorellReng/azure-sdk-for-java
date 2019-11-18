/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.siterecovery.v2018_01_10;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * This class represents the vm NicUpdates task details.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "instanceType")
@JsonTypeName("VmNicUpdatesTaskDetails")
public class VmNicUpdatesTaskDetails extends TaskTypeDetails {
    /**
     * Virtual machine Id.
     */
    @JsonProperty(value = "vmId")
    private String vmId;

    /**
     * Nic Id.
     */
    @JsonProperty(value = "nicId")
    private String nicId;

    /**
     * Name of the Nic.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * Get virtual machine Id.
     *
     * @return the vmId value
     */
    public String vmId() {
        return this.vmId;
    }

    /**
     * Set virtual machine Id.
     *
     * @param vmId the vmId value to set
     * @return the VmNicUpdatesTaskDetails object itself.
     */
    public VmNicUpdatesTaskDetails withVmId(String vmId) {
        this.vmId = vmId;
        return this;
    }

    /**
     * Get nic Id.
     *
     * @return the nicId value
     */
    public String nicId() {
        return this.nicId;
    }

    /**
     * Set nic Id.
     *
     * @param nicId the nicId value to set
     * @return the VmNicUpdatesTaskDetails object itself.
     */
    public VmNicUpdatesTaskDetails withNicId(String nicId) {
        this.nicId = nicId;
        return this;
    }

    /**
     * Get name of the Nic.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set name of the Nic.
     *
     * @param name the name value to set
     * @return the VmNicUpdatesTaskDetails object itself.
     */
    public VmNicUpdatesTaskDetails withName(String name) {
        this.name = name;
        return this;
    }

}