// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.search.documents.indexes.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/**
 * Provides the ability to override other stemming filters with custom
 * dictionary-based stemming. Any dictionary-stemmed terms will be marked as
 * keywords so that they will not be stemmed with stemmers down the chain. Must
 * be placed before any stemming filters. This token filter is implemented
 * using Apache Lucene.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@odata.type")
@JsonTypeName("#Microsoft.Azure.Search.StemmerOverrideTokenFilter")
@Fluent
public final class StemmerOverrideTokenFilter extends TokenFilter {
    /*
     * A list of stemming rules in the following format: "word => stem", for
     * example: "ran => run".
     */
    @JsonProperty(value = "rules", required = true)
    private List<String> rules;

    /**
     * Get the rules property: A list of stemming rules in the following
     * format: "word =&gt; stem", for example: "ran =&gt; run".
     *
     * @return the rules value.
     */
    public List<String> getRules() {
        return this.rules;
    }

    /**
     * Set the rules property: A list of stemming rules in the following
     * format: "word =&gt; stem", for example: "ran =&gt; run".
     *
     * @param rules the rules value to set.
     * @return the StemmerOverrideTokenFilter object itself.
     */
    public StemmerOverrideTokenFilter setRules(List<String> rules) {
        this.rules = rules;
        return this;
    }
}
