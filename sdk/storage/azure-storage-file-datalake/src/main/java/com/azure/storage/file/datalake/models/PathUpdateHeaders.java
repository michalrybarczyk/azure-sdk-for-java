// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.storage.file.datalake.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Defines headers for Update operation.
 */
@Fluent
public final class PathUpdateHeaders {
    /*
     * A UTC date/time value generated by the service that indicates the time
     * at which the response was initiated.
     */
    @JsonProperty(value = "Date")
    private String dateProperty;

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
    private String lastModified;

    /*
     * Indicates that the service supports requests for partial file content.
     */
    @JsonProperty(value = "Accept-Ranges")
    private String acceptRanges;

    /*
     * If the Cache-Control request header has previously been set for the
     * resource, that value is returned in this header.
     */
    @JsonProperty(value = "Cache-Control")
    private String cacheControl;

    /*
     * If the Content-Disposition request header has previously been set for
     * the resource, that value is returned in this header.
     */
    @JsonProperty(value = "Content-Disposition")
    private String contentDisposition;

    /*
     * If the Content-Encoding request header has previously been set for the
     * resource, that value is returned in this header.
     */
    @JsonProperty(value = "Content-Encoding")
    private String contentEncoding;

    /*
     * If the Content-Language request header has previously been set for the
     * resource, that value is returned in this header.
     */
    @JsonProperty(value = "Content-Language")
    private String contentLanguage;

    /*
     * The size of the resource in bytes.
     */
    @JsonProperty(value = "Content-Length")
    private Long contentLength;

    /*
     * Indicates the range of bytes returned in the event that the client
     * requested a subset of the file by setting the Range request header.
     */
    @JsonProperty(value = "Content-Range")
    private String contentRange;

    /*
     * The content type specified for the resource. If no content type was
     * specified, the default content type is application/octet-stream.
     */
    @JsonProperty(value = "Content-Type")
    private String contentType;

    /*
     * An MD5 hash of the request content. This header is only returned for
     * "Append" operation. This header is returned so that the client can check
     * for message content integrity. The value of this header is computed by
     * the service; it is not necessarily the same value specified in the
     * request headers.
     */
    @JsonProperty(value = "Content-MD5")
    private String contentMD5;

    /*
     * User-defined properties associated with the file or directory, in the
     * format of a comma-separated list of name and value pairs "n1=v1, n2=v2,
     * ...", where each value is a base64 encoded string. Note that the string
     * may only contain ASCII characters in the ISO-8859-1 character set.
     */
    @JsonProperty(value = "x-ms-properties")
    private String xMsProperties;

    /*
     * A server-generated UUID recorded in the analytics logs for
     * troubleshooting and correlation.
     */
    @JsonProperty(value = "x-ms-request-id")
    private String xMsRequestId;

    /*
     * The version of the REST protocol used to process the request.
     */
    @JsonProperty(value = "x-ms-version")
    private String xMsVersion;

    /**
     * Get the dateProperty property: A UTC date/time value generated by the
     * service that indicates the time at which the response was initiated.
     *
     * @return the dateProperty value.
     */
    public String getDateProperty() {
        return this.dateProperty;
    }

    /**
     * Set the dateProperty property: A UTC date/time value generated by the
     * service that indicates the time at which the response was initiated.
     *
     * @param dateProperty the dateProperty value to set.
     * @return the PathUpdateHeaders object itself.
     */
    public PathUpdateHeaders setDateProperty(String dateProperty) {
        this.dateProperty = dateProperty;
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
     * @return the PathUpdateHeaders object itself.
     */
    public PathUpdateHeaders setETag(String eTag) {
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
    public String getLastModified() {
        return this.lastModified;
    }

    /**
     * Set the lastModified property: The data and time the file or directory
     * was last modified.  Write operations on the file or directory update the
     * last modified time.
     *
     * @param lastModified the lastModified value to set.
     * @return the PathUpdateHeaders object itself.
     */
    public PathUpdateHeaders setLastModified(String lastModified) {
        this.lastModified = lastModified;
        return this;
    }

    /**
     * Get the acceptRanges property: Indicates that the service supports
     * requests for partial file content.
     *
     * @return the acceptRanges value.
     */
    public String getAcceptRanges() {
        return this.acceptRanges;
    }

    /**
     * Set the acceptRanges property: Indicates that the service supports
     * requests for partial file content.
     *
     * @param acceptRanges the acceptRanges value to set.
     * @return the PathUpdateHeaders object itself.
     */
    public PathUpdateHeaders setAcceptRanges(String acceptRanges) {
        this.acceptRanges = acceptRanges;
        return this;
    }

    /**
     * Get the cacheControl property: If the Cache-Control request header has
     * previously been set for the resource, that value is returned in this
     * header.
     *
     * @return the cacheControl value.
     */
    public String getCacheControl() {
        return this.cacheControl;
    }

    /**
     * Set the cacheControl property: If the Cache-Control request header has
     * previously been set for the resource, that value is returned in this
     * header.
     *
     * @param cacheControl the cacheControl value to set.
     * @return the PathUpdateHeaders object itself.
     */
    public PathUpdateHeaders setCacheControl(String cacheControl) {
        this.cacheControl = cacheControl;
        return this;
    }

    /**
     * Get the contentDisposition property: If the Content-Disposition request
     * header has previously been set for the resource, that value is returned
     * in this header.
     *
     * @return the contentDisposition value.
     */
    public String getContentDisposition() {
        return this.contentDisposition;
    }

    /**
     * Set the contentDisposition property: If the Content-Disposition request
     * header has previously been set for the resource, that value is returned
     * in this header.
     *
     * @param contentDisposition the contentDisposition value to set.
     * @return the PathUpdateHeaders object itself.
     */
    public PathUpdateHeaders setContentDisposition(String contentDisposition) {
        this.contentDisposition = contentDisposition;
        return this;
    }

    /**
     * Get the contentEncoding property: If the Content-Encoding request header
     * has previously been set for the resource, that value is returned in this
     * header.
     *
     * @return the contentEncoding value.
     */
    public String getContentEncoding() {
        return this.contentEncoding;
    }

    /**
     * Set the contentEncoding property: If the Content-Encoding request header
     * has previously been set for the resource, that value is returned in this
     * header.
     *
     * @param contentEncoding the contentEncoding value to set.
     * @return the PathUpdateHeaders object itself.
     */
    public PathUpdateHeaders setContentEncoding(String contentEncoding) {
        this.contentEncoding = contentEncoding;
        return this;
    }

    /**
     * Get the contentLanguage property: If the Content-Language request header
     * has previously been set for the resource, that value is returned in this
     * header.
     *
     * @return the contentLanguage value.
     */
    public String getContentLanguage() {
        return this.contentLanguage;
    }

    /**
     * Set the contentLanguage property: If the Content-Language request header
     * has previously been set for the resource, that value is returned in this
     * header.
     *
     * @param contentLanguage the contentLanguage value to set.
     * @return the PathUpdateHeaders object itself.
     */
    public PathUpdateHeaders setContentLanguage(String contentLanguage) {
        this.contentLanguage = contentLanguage;
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
     * @return the PathUpdateHeaders object itself.
     */
    public PathUpdateHeaders setContentLength(Long contentLength) {
        this.contentLength = contentLength;
        return this;
    }

    /**
     * Get the contentRange property: Indicates the range of bytes returned in
     * the event that the client requested a subset of the file by setting the
     * Range request header.
     *
     * @return the contentRange value.
     */
    public String getContentRange() {
        return this.contentRange;
    }

    /**
     * Set the contentRange property: Indicates the range of bytes returned in
     * the event that the client requested a subset of the file by setting the
     * Range request header.
     *
     * @param contentRange the contentRange value to set.
     * @return the PathUpdateHeaders object itself.
     */
    public PathUpdateHeaders setContentRange(String contentRange) {
        this.contentRange = contentRange;
        return this;
    }

    /**
     * Get the contentType property: The content type specified for the
     * resource. If no content type was specified, the default content type is
     * application/octet-stream.
     *
     * @return the contentType value.
     */
    public String getContentType() {
        return this.contentType;
    }

    /**
     * Set the contentType property: The content type specified for the
     * resource. If no content type was specified, the default content type is
     * application/octet-stream.
     *
     * @param contentType the contentType value to set.
     * @return the PathUpdateHeaders object itself.
     */
    public PathUpdateHeaders setContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }

    /**
     * Get the contentMD5 property: An MD5 hash of the request content. This
     * header is only returned for "Append" operation. This header is returned
     * so that the client can check for message content integrity. The value of
     * this header is computed by the service; it is not necessarily the same
     * value specified in the request headers.
     *
     * @return the contentMD5 value.
     */
    public String getContentMD5() {
        return this.contentMD5;
    }

    /**
     * Set the contentMD5 property: An MD5 hash of the request content. This
     * header is only returned for "Append" operation. This header is returned
     * so that the client can check for message content integrity. The value of
     * this header is computed by the service; it is not necessarily the same
     * value specified in the request headers.
     *
     * @param contentMD5 the contentMD5 value to set.
     * @return the PathUpdateHeaders object itself.
     */
    public PathUpdateHeaders setContentMD5(String contentMD5) {
        this.contentMD5 = contentMD5;
        return this;
    }

    /**
     * Get the xMsProperties property: User-defined properties associated with
     * the file or directory, in the format of a comma-separated list of name
     * and value pairs "n1=v1, n2=v2, ...", where each value is a base64
     * encoded string. Note that the string may only contain ASCII characters
     * in the ISO-8859-1 character set.
     *
     * @return the xMsProperties value.
     */
    public String getXMsProperties() {
        return this.xMsProperties;
    }

    /**
     * Set the xMsProperties property: User-defined properties associated with
     * the file or directory, in the format of a comma-separated list of name
     * and value pairs "n1=v1, n2=v2, ...", where each value is a base64
     * encoded string. Note that the string may only contain ASCII characters
     * in the ISO-8859-1 character set.
     *
     * @param xMsProperties the xMsProperties value to set.
     * @return the PathUpdateHeaders object itself.
     */
    public PathUpdateHeaders setXMsProperties(String xMsProperties) {
        this.xMsProperties = xMsProperties;
        return this;
    }

    /**
     * Get the xMsRequestId property: A server-generated UUID recorded in the
     * analytics logs for troubleshooting and correlation.
     *
     * @return the xMsRequestId value.
     */
    public String getXMsRequestId() {
        return this.xMsRequestId;
    }

    /**
     * Set the xMsRequestId property: A server-generated UUID recorded in the
     * analytics logs for troubleshooting and correlation.
     *
     * @param xMsRequestId the xMsRequestId value to set.
     * @return the PathUpdateHeaders object itself.
     */
    public PathUpdateHeaders setXMsRequestId(String xMsRequestId) {
        this.xMsRequestId = xMsRequestId;
        return this;
    }

    /**
     * Get the xMsVersion property: The version of the REST protocol used to
     * process the request.
     *
     * @return the xMsVersion value.
     */
    public String getXMsVersion() {
        return this.xMsVersion;
    }

    /**
     * Set the xMsVersion property: The version of the REST protocol used to
     * process the request.
     *
     * @param xMsVersion the xMsVersion value to set.
     * @return the PathUpdateHeaders object itself.
     */
    public PathUpdateHeaders setXMsVersion(String xMsVersion) {
        this.xMsVersion = xMsVersion;
        return this;
    }
}
