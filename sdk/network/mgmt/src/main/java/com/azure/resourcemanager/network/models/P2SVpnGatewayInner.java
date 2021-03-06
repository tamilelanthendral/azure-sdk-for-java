// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.Resource;
import com.azure.core.management.SubResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.AddressSpace;
import com.azure.resourcemanager.network.ProvisioningState;
import com.azure.resourcemanager.network.VpnClientConnectionHealth;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The P2SVpnGateway model. */
@JsonFlatten
@Fluent
public class P2SVpnGatewayInner extends Resource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(P2SVpnGatewayInner.class);

    /*
     * Gets a unique read-only string that changes whenever the resource is
     * updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /*
     * The VirtualHub to which the gateway belongs.
     */
    @JsonProperty(value = "properties.virtualHub")
    private SubResource virtualHub;

    /*
     * The provisioning state of the resource.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /*
     * The scale unit for this p2s vpn gateway.
     */
    @JsonProperty(value = "properties.vpnGatewayScaleUnit")
    private Integer vpnGatewayScaleUnit;

    /*
     * The P2SVpnServerConfiguration to which the p2sVpnGateway is attached to.
     */
    @JsonProperty(value = "properties.p2SVpnServerConfiguration")
    private SubResource p2SVpnServerConfiguration;

    /*
     * The reference of the address space resource which represents Address
     * space for P2S VpnClient.
     */
    @JsonProperty(value = "properties.vpnClientAddressPool")
    private AddressSpace vpnClientAddressPool;

    /*
     * The reference of the address space resource which represents the custom
     * routes specified by the customer for P2SVpnGateway and P2S VpnClient.
     */
    @JsonProperty(value = "properties.customRoutes")
    private AddressSpace customRoutes;

    /*
     * All P2S VPN clients' connection health status.
     */
    @JsonProperty(value = "properties.vpnClientConnectionHealth", access = JsonProperty.Access.WRITE_ONLY)
    private VpnClientConnectionHealth vpnClientConnectionHealth;

    /*
     * Resource ID.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Get the etag property: Gets a unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Get the virtualHub property: The VirtualHub to which the gateway belongs.
     *
     * @return the virtualHub value.
     */
    public SubResource virtualHub() {
        return this.virtualHub;
    }

    /**
     * Set the virtualHub property: The VirtualHub to which the gateway belongs.
     *
     * @param virtualHub the virtualHub value to set.
     * @return the P2SVpnGatewayInner object itself.
     */
    public P2SVpnGatewayInner withVirtualHub(SubResource virtualHub) {
        this.virtualHub = virtualHub;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the vpnGatewayScaleUnit property: The scale unit for this p2s vpn gateway.
     *
     * @return the vpnGatewayScaleUnit value.
     */
    public Integer vpnGatewayScaleUnit() {
        return this.vpnGatewayScaleUnit;
    }

    /**
     * Set the vpnGatewayScaleUnit property: The scale unit for this p2s vpn gateway.
     *
     * @param vpnGatewayScaleUnit the vpnGatewayScaleUnit value to set.
     * @return the P2SVpnGatewayInner object itself.
     */
    public P2SVpnGatewayInner withVpnGatewayScaleUnit(Integer vpnGatewayScaleUnit) {
        this.vpnGatewayScaleUnit = vpnGatewayScaleUnit;
        return this;
    }

    /**
     * Get the p2SVpnServerConfiguration property: The P2SVpnServerConfiguration to which the p2sVpnGateway is attached
     * to.
     *
     * @return the p2SVpnServerConfiguration value.
     */
    public SubResource p2SVpnServerConfiguration() {
        return this.p2SVpnServerConfiguration;
    }

    /**
     * Set the p2SVpnServerConfiguration property: The P2SVpnServerConfiguration to which the p2sVpnGateway is attached
     * to.
     *
     * @param p2SVpnServerConfiguration the p2SVpnServerConfiguration value to set.
     * @return the P2SVpnGatewayInner object itself.
     */
    public P2SVpnGatewayInner withP2SVpnServerConfiguration(SubResource p2SVpnServerConfiguration) {
        this.p2SVpnServerConfiguration = p2SVpnServerConfiguration;
        return this;
    }

    /**
     * Get the vpnClientAddressPool property: The reference of the address space resource which represents Address space
     * for P2S VpnClient.
     *
     * @return the vpnClientAddressPool value.
     */
    public AddressSpace vpnClientAddressPool() {
        return this.vpnClientAddressPool;
    }

    /**
     * Set the vpnClientAddressPool property: The reference of the address space resource which represents Address space
     * for P2S VpnClient.
     *
     * @param vpnClientAddressPool the vpnClientAddressPool value to set.
     * @return the P2SVpnGatewayInner object itself.
     */
    public P2SVpnGatewayInner withVpnClientAddressPool(AddressSpace vpnClientAddressPool) {
        this.vpnClientAddressPool = vpnClientAddressPool;
        return this;
    }

    /**
     * Get the customRoutes property: The reference of the address space resource which represents the custom routes
     * specified by the customer for P2SVpnGateway and P2S VpnClient.
     *
     * @return the customRoutes value.
     */
    public AddressSpace customRoutes() {
        return this.customRoutes;
    }

    /**
     * Set the customRoutes property: The reference of the address space resource which represents the custom routes
     * specified by the customer for P2SVpnGateway and P2S VpnClient.
     *
     * @param customRoutes the customRoutes value to set.
     * @return the P2SVpnGatewayInner object itself.
     */
    public P2SVpnGatewayInner withCustomRoutes(AddressSpace customRoutes) {
        this.customRoutes = customRoutes;
        return this;
    }

    /**
     * Get the vpnClientConnectionHealth property: All P2S VPN clients' connection health status.
     *
     * @return the vpnClientConnectionHealth value.
     */
    public VpnClientConnectionHealth vpnClientConnectionHealth() {
        return this.vpnClientConnectionHealth;
    }

    /**
     * Get the id property: Resource ID.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: Resource ID.
     *
     * @param id the id value to set.
     * @return the P2SVpnGatewayInner object itself.
     */
    public P2SVpnGatewayInner withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (vpnClientAddressPool() != null) {
            vpnClientAddressPool().validate();
        }
        if (customRoutes() != null) {
            customRoutes().validate();
        }
        if (vpnClientConnectionHealth() != null) {
            vpnClientConnectionHealth().validate();
        }
    }
}
