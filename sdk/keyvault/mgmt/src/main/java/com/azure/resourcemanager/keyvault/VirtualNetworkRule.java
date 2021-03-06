// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.keyvault;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The VirtualNetworkRule model. */
@Fluent
public final class VirtualNetworkRule {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(VirtualNetworkRule.class);

    /*
     * Full resource id of a vnet subnet, such as
     * '/subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/virtualNetworks/test-vnet/subnets/subnet1'.
     */
    @JsonProperty(value = "id", required = true)
    private String id;

    /**
     * Get the id property: Full resource id of a vnet subnet, such as
     * '/subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/virtualNetworks/test-vnet/subnets/subnet1'.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: Full resource id of a vnet subnet, such as
     * '/subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/virtualNetworks/test-vnet/subnets/subnet1'.
     *
     * @param id the id value to set.
     * @return the VirtualNetworkRule object itself.
     */
    public VirtualNetworkRule withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (id() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property id in model VirtualNetworkRule"));
        }
    }
}
