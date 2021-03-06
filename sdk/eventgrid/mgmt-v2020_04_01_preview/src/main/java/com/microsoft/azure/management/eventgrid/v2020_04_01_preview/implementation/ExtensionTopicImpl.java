/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.eventgrid.v2020_04_01_preview.implementation;

import com.microsoft.azure.management.eventgrid.v2020_04_01_preview.ExtensionTopic;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;

class ExtensionTopicImpl extends WrapperImpl<ExtensionTopicInner> implements ExtensionTopic {
    private final EventGridManager manager;
    ExtensionTopicImpl(ExtensionTopicInner inner, EventGridManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public EventGridManager manager() {
        return this.manager;
    }

    @Override
    public String description() {
        return this.inner().description();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public String systemTopic() {
        return this.inner().systemTopic();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

}
