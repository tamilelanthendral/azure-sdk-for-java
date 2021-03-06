// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
package com.azure.resourcemanager.containerregistry.implementation;

import com.azure.resourcemanager.containerregistry.EventRequestMessage;
import com.azure.resourcemanager.containerregistry.EventResponseMessage;
import com.azure.resourcemanager.containerregistry.WebhookEventInfo;
import com.azure.resourcemanager.containerregistry.models.EventInner;
import com.azure.resourcemanager.resources.fluentcore.model.implementation.WrapperImpl;

/** Response containing the webhook event info. */
public class WebhookEventInfoImpl extends WrapperImpl<EventInner> implements WebhookEventInfo {
    protected WebhookEventInfoImpl(EventInner innerObject) {
        super(innerObject);
    }

    @Override
    public EventRequestMessage eventRequestMessage() {
        return this.inner().eventRequestMessage();
    }

    @Override
    public EventResponseMessage eventResponseMessage() {
        return this.inner().eventResponseMessage();
    }
}
