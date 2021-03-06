// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerregistry.models;

import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpPipelineBuilder;
import com.azure.core.http.policy.CookiePolicy;
import com.azure.core.http.policy.RetryPolicy;
import com.azure.core.http.policy.UserAgentPolicy;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.AzureServiceClient;

/** Initializes a new instance of the ContainerRegistryManagementClientImpl type. */
public final class ContainerRegistryManagementClientImpl extends AzureServiceClient {
    private final ClientLogger logger = new ClientLogger(ContainerRegistryManagementClientImpl.class);

    /** The Microsoft Azure subscription ID. */
    private String subscriptionId;

    /**
     * Gets The Microsoft Azure subscription ID.
     *
     * @return the subscriptionId value.
     */
    public String getSubscriptionId() {
        return this.subscriptionId;
    }

    /**
     * Sets The Microsoft Azure subscription ID.
     *
     * @param subscriptionId the subscriptionId value.
     * @return the service client itself.
     */
    public ContainerRegistryManagementClientImpl setSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
    }

    /** server parameter. */
    private String host;

    /**
     * Gets server parameter.
     *
     * @return the host value.
     */
    public String getHost() {
        return this.host;
    }

    /**
     * Sets server parameter.
     *
     * @param host the host value.
     * @return the service client itself.
     */
    public ContainerRegistryManagementClientImpl setHost(String host) {
        this.host = host;
        return this;
    }

    /** The HTTP pipeline to send requests through. */
    private final HttpPipeline httpPipeline;

    /**
     * Gets The HTTP pipeline to send requests through.
     *
     * @return the httpPipeline value.
     */
    public HttpPipeline getHttpPipeline() {
        return this.httpPipeline;
    }

    /** The RegistriesInner object to access its operations. */
    private final RegistriesInner registries;

    /**
     * Gets the RegistriesInner object to access its operations.
     *
     * @return the RegistriesInner object.
     */
    public RegistriesInner registries() {
        return this.registries;
    }

    /** The OperationsInner object to access its operations. */
    private final OperationsInner operations;

    /**
     * Gets the OperationsInner object to access its operations.
     *
     * @return the OperationsInner object.
     */
    public OperationsInner operations() {
        return this.operations;
    }

    /** The ReplicationsInner object to access its operations. */
    private final ReplicationsInner replications;

    /**
     * Gets the ReplicationsInner object to access its operations.
     *
     * @return the ReplicationsInner object.
     */
    public ReplicationsInner replications() {
        return this.replications;
    }

    /** The WebhooksInner object to access its operations. */
    private final WebhooksInner webhooks;

    /**
     * Gets the WebhooksInner object to access its operations.
     *
     * @return the WebhooksInner object.
     */
    public WebhooksInner webhooks() {
        return this.webhooks;
    }

    /** The RunsInner object to access its operations. */
    private final RunsInner runs;

    /**
     * Gets the RunsInner object to access its operations.
     *
     * @return the RunsInner object.
     */
    public RunsInner runs() {
        return this.runs;
    }

    /** The TasksInner object to access its operations. */
    private final TasksInner tasks;

    /**
     * Gets the TasksInner object to access its operations.
     *
     * @return the TasksInner object.
     */
    public TasksInner tasks() {
        return this.tasks;
    }

    /** Initializes an instance of ContainerRegistryManagementClient client. */
    public ContainerRegistryManagementClientImpl() {
        this(
            new HttpPipelineBuilder().policies(new UserAgentPolicy(), new RetryPolicy(), new CookiePolicy()).build(),
            AzureEnvironment.AZURE);
    }

    /**
     * Initializes an instance of ContainerRegistryManagementClient client.
     *
     * @param httpPipeline The HTTP pipeline to send requests through.
     */
    public ContainerRegistryManagementClientImpl(HttpPipeline httpPipeline) {
        this(httpPipeline, AzureEnvironment.AZURE);
    }

    /**
     * Initializes an instance of ContainerRegistryManagementClient client.
     *
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param environment The Azure environment.
     */
    public ContainerRegistryManagementClientImpl(HttpPipeline httpPipeline, AzureEnvironment environment) {
        super(httpPipeline, environment);
        this.httpPipeline = httpPipeline;
        this.registries = new RegistriesInner(this);
        this.operations = new OperationsInner(this);
        this.replications = new ReplicationsInner(this);
        this.webhooks = new WebhooksInner(this);
        this.runs = new RunsInner(this);
        this.tasks = new TasksInner(this);
    }
}
