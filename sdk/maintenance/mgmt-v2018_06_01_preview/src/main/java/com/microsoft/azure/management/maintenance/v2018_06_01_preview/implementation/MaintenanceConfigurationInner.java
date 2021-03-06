/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.maintenance.v2018_06_01_preview.implementation;

import java.util.Map;
import com.microsoft.azure.management.maintenance.v2018_06_01_preview.MaintenanceScope;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.Resource;

/**
 * Maintenance configuration record type.
 */
@JsonFlatten
public class MaintenanceConfigurationInner extends Resource {
    /**
     * Gets or sets location of the resource.
     */
    @JsonProperty(value = "location")
    private String location;

    /**
     * Gets or sets tags of the resource.
     */
    @JsonProperty(value = "tags")
    private Map<String, String> tags;

    /**
     * Gets or sets namespace of the resource.
     */
    @JsonProperty(value = "properties.namespace")
    private String namespace;

    /**
     * Gets or sets extensionProperties of the maintenanceConfiguration.
     */
    @JsonProperty(value = "properties.extensionProperties")
    private Map<String, String> extensionProperties;

    /**
     * Gets or sets maintenanceScope of the configuration. Possible values
     * include: 'All', 'Host', 'Resource', 'InResource'.
     */
    @JsonProperty(value = "properties.maintenanceScope")
    private MaintenanceScope maintenanceScope;

    /**
     * Get gets or sets location of the resource.
     *
     * @return the location value
     */
    public String location() {
        return this.location;
    }

    /**
     * Set gets or sets location of the resource.
     *
     * @param location the location value to set
     * @return the MaintenanceConfigurationInner object itself.
     */
    public MaintenanceConfigurationInner withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * Get gets or sets tags of the resource.
     *
     * @return the tags value
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set gets or sets tags of the resource.
     *
     * @param tags the tags value to set
     * @return the MaintenanceConfigurationInner object itself.
     */
    public MaintenanceConfigurationInner withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get gets or sets namespace of the resource.
     *
     * @return the namespace value
     */
    public String namespace() {
        return this.namespace;
    }

    /**
     * Set gets or sets namespace of the resource.
     *
     * @param namespace the namespace value to set
     * @return the MaintenanceConfigurationInner object itself.
     */
    public MaintenanceConfigurationInner withNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    /**
     * Get gets or sets extensionProperties of the maintenanceConfiguration.
     *
     * @return the extensionProperties value
     */
    public Map<String, String> extensionProperties() {
        return this.extensionProperties;
    }

    /**
     * Set gets or sets extensionProperties of the maintenanceConfiguration.
     *
     * @param extensionProperties the extensionProperties value to set
     * @return the MaintenanceConfigurationInner object itself.
     */
    public MaintenanceConfigurationInner withExtensionProperties(Map<String, String> extensionProperties) {
        this.extensionProperties = extensionProperties;
        return this;
    }

    /**
     * Get gets or sets maintenanceScope of the configuration. Possible values include: 'All', 'Host', 'Resource', 'InResource'.
     *
     * @return the maintenanceScope value
     */
    public MaintenanceScope maintenanceScope() {
        return this.maintenanceScope;
    }

    /**
     * Set gets or sets maintenanceScope of the configuration. Possible values include: 'All', 'Host', 'Resource', 'InResource'.
     *
     * @param maintenanceScope the maintenanceScope value to set
     * @return the MaintenanceConfigurationInner object itself.
     */
    public MaintenanceConfigurationInner withMaintenanceScope(MaintenanceScope maintenanceScope) {
        this.maintenanceScope = maintenanceScope;
        return this;
    }

}
