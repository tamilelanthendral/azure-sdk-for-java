// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.storage.file.datalake.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.DateTimeRfc1123;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;

/**
 * Defines headers for Create operation.
 */
@Fluent
public final class PathCreateHeaders {
    /*
     * A UTC date/time value generated by the service that indicates the time
     * at which the response was initiated.
     */
    @JsonProperty(value = "Date")
    private DateTimeRfc1123 dateProperty;

    /*
     * An HTTP entity tag associated with the file or directory.
     */
    @JsonProperty(value = "ETag")
    private String eTag;

    /*
     * The data and time the file or directory was last modified.  Write
     * operations on the file or directory update the last modified time.
     */
    @JsonProperty(value = "Last-Modified")
    private DateTimeRfc1123 lastModified;

    /*
     * A server-generated UUID recorded in the analytics logs for
     * troubleshooting and correlation.
     */
    @JsonProperty(value = "x-ms-request-id")
    private String requestId;

    /*
     * The version of the REST protocol used to process the request.
     */
    @JsonProperty(value = "x-ms-version")
    private String version;

    /*
     * When renaming a directory, the number of paths that are renamed with
     * each invocation is limited.  If the number of paths to be renamed
     * exceeds this limit, a continuation token is returned in this response
     * header.  When a continuation token is returned in the response, it must
     * be specified in a subsequent invocation of the rename operation to
     * continue renaming the directory.
     */
    @JsonProperty(value = "x-ms-continuation")
    private String continuation;

    /*
     * The size of the resource in bytes.
     */
    @JsonProperty(value = "Content-Length")
    private Long contentLength;

    /*
     * The errorCode property.
     */
    @JsonProperty(value = "x-ms-error-code")
    private String errorCode;

    /**
     * Get the dateProperty property: A UTC date/time value generated by the
     * service that indicates the time at which the response was initiated.
     *
     * @return the dateProperty value.
     */
    public OffsetDateTime getDateProperty() {
        if (this.dateProperty == null) {
            return null;
        }
        return this.dateProperty.getDateTime();
    }

    /**
     * Set the dateProperty property: A UTC date/time value generated by the
     * service that indicates the time at which the response was initiated.
     *
     * @param dateProperty the dateProperty value to set.
     * @return the PathCreateHeaders object itself.
     */
    public PathCreateHeaders setDateProperty(OffsetDateTime dateProperty) {
        if (dateProperty == null) {
            this.dateProperty = null;
        } else {
            this.dateProperty = new DateTimeRfc1123(dateProperty);
        }
        return this;
    }

    /**
     * Get the eTag property: An HTTP entity tag associated with the file or
     * directory.
     *
     * @return the eTag value.
     */
    public String getETag() {
        return this.eTag;
    }

    /**
     * Set the eTag property: An HTTP entity tag associated with the file or
     * directory.
     *
     * @param eTag the eTag value to set.
     * @return the PathCreateHeaders object itself.
     */
    public PathCreateHeaders setETag(String eTag) {
        this.eTag = eTag;
        return this;
    }

    /**
     * Get the lastModified property: The data and time the file or directory
     * was last modified.  Write operations on the file or directory update the
     * last modified time.
     *
     * @return the lastModified value.
     */
    public OffsetDateTime getLastModified() {
        if (this.lastModified == null) {
            return null;
        }
        return this.lastModified.getDateTime();
    }

    /**
     * Set the lastModified property: The data and time the file or directory
     * was last modified.  Write operations on the file or directory update the
     * last modified time.
     *
     * @param lastModified the lastModified value to set.
     * @return the PathCreateHeaders object itself.
     */
    public PathCreateHeaders setLastModified(OffsetDateTime lastModified) {
        if (lastModified == null) {
            this.lastModified = null;
        } else {
            this.lastModified = new DateTimeRfc1123(lastModified);
        }
        return this;
    }

    /**
     * Get the requestId property: A server-generated UUID recorded in the
     * analytics logs for troubleshooting and correlation.
     *
     * @return the requestId value.
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * Set the requestId property: A server-generated UUID recorded in the
     * analytics logs for troubleshooting and correlation.
     *
     * @param requestId the requestId value to set.
     * @return the PathCreateHeaders object itself.
     */
    public PathCreateHeaders setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * Get the version property: The version of the REST protocol used to
     * process the request.
     *
     * @return the version value.
     */
    public String getVersion() {
        return this.version;
    }

    /**
     * Set the version property: The version of the REST protocol used to
     * process the request.
     *
     * @param version the version value to set.
     * @return the PathCreateHeaders object itself.
     */
    public PathCreateHeaders setVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * Get the continuation property: When renaming a directory, the number of
     * paths that are renamed with each invocation is limited.  If the number
     * of paths to be renamed exceeds this limit, a continuation token is
     * returned in this response header.  When a continuation token is returned
     * in the response, it must be specified in a subsequent invocation of the
     * rename operation to continue renaming the directory.
     *
     * @return the continuation value.
     */
    public String getContinuation() {
        return this.continuation;
    }

    /**
     * Set the continuation property: When renaming a directory, the number of
     * paths that are renamed with each invocation is limited.  If the number
     * of paths to be renamed exceeds this limit, a continuation token is
     * returned in this response header.  When a continuation token is returned
     * in the response, it must be specified in a subsequent invocation of the
     * rename operation to continue renaming the directory.
     *
     * @param continuation the continuation value to set.
     * @return the PathCreateHeaders object itself.
     */
    public PathCreateHeaders setContinuation(String continuation) {
        this.continuation = continuation;
        return this;
    }

    /**
     * Get the contentLength property: The size of the resource in bytes.
     *
     * @return the contentLength value.
     */
    public Long getContentLength() {
        return this.contentLength;
    }

    /**
     * Set the contentLength property: The size of the resource in bytes.
     *
     * @param contentLength the contentLength value to set.
     * @return the PathCreateHeaders object itself.
     */
    public PathCreateHeaders setContentLength(Long contentLength) {
        this.contentLength = contentLength;
        return this;
    }

    /**
     * Get the errorCode property: The errorCode property.
     *
     * @return the errorCode value.
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * Set the errorCode property: The errorCode property.
     *
     * @param errorCode the errorCode value to set.
     * @return the PathCreateHeaders object itself.
     */
    public PathCreateHeaders setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
}
