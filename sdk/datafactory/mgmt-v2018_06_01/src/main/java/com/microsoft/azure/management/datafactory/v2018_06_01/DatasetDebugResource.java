/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactory.v2018_06_01;

import com.microsoft.azure.management.datafactory.v2018_06_01.implementation.DatasetInner;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Dataset debug resource.
 */
public class DatasetDebugResource extends SubResourceDebugResource {
    /**
     * Dataset properties.
     */
    @JsonProperty(value = "properties", required = true)
    private DatasetInner properties;

    /**
     * Get dataset properties.
     *
     * @return the properties value
     */
    public DatasetInner properties() {
        return this.properties;
    }

    /**
     * Set dataset properties.
     *
     * @param properties the properties value to set
     * @return the DatasetDebugResource object itself.
     */
    public DatasetDebugResource withProperties(DatasetInner properties) {
        this.properties = properties;
        return this;
    }

}