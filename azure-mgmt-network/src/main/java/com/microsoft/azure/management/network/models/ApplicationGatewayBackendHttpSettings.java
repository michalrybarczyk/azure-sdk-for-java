/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator 0.16.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.azure.management.network.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.azure.SubResource;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * Backend address pool settings of application gateway.
 */
@JsonFlatten
public class ApplicationGatewayBackendHttpSettings extends SubResource {
    /**
     * Gets or sets the port.
     */
    @JsonProperty(value = "properties.port")
    private Integer port;

    /**
     * Gets or sets the protocol. Possible values include: 'Http', 'Https'.
     */
    @JsonProperty(value = "properties.protocol")
    private String protocol;

    /**
     * Gets or sets the cookie affinity. Possible values include: 'Enabled',
     * 'Disabled'.
     */
    @JsonProperty(value = "properties.cookieBasedAffinity")
    private String cookieBasedAffinity;

    /**
     * Gets or sets request timeout.
     */
    @JsonProperty(value = "properties.requestTimeout")
    private Integer requestTimeout;

    /**
     * Gets or sets probe resource of application gateway.
     */
    @JsonProperty(value = "properties.probe")
    private SubResource probe;

    /**
     * Gets or sets Provisioning state of the backend http settings resource
     * Updating/Deleting/Failed.
     */
    @JsonProperty(value = "properties.provisioningState")
    private String provisioningState;

    /**
     * Gets name of the resource that is unique within a resource group. This
     * name can be used to access the resource.
     */
    private String name;

    /**
     * A unique read-only string that changes whenever the resource is updated.
     */
    private String etag;

    /**
     * Get the port value.
     *
     * @return the port value
     */
    public Integer getPort() {
        return this.port;
    }

    /**
     * Set the port value.
     *
     * @param port the port value to set
     */
    public void setPort(Integer port) {
        this.port = port;
    }

    /**
     * Get the protocol value.
     *
     * @return the protocol value
     */
    public String getProtocol() {
        return this.protocol;
    }

    /**
     * Set the protocol value.
     *
     * @param protocol the protocol value to set
     */
    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    /**
     * Get the cookieBasedAffinity value.
     *
     * @return the cookieBasedAffinity value
     */
    public String getCookieBasedAffinity() {
        return this.cookieBasedAffinity;
    }

    /**
     * Set the cookieBasedAffinity value.
     *
     * @param cookieBasedAffinity the cookieBasedAffinity value to set
     */
    public void setCookieBasedAffinity(String cookieBasedAffinity) {
        this.cookieBasedAffinity = cookieBasedAffinity;
    }

    /**
     * Get the requestTimeout value.
     *
     * @return the requestTimeout value
     */
    public Integer getRequestTimeout() {
        return this.requestTimeout;
    }

    /**
     * Set the requestTimeout value.
     *
     * @param requestTimeout the requestTimeout value to set
     */
    public void setRequestTimeout(Integer requestTimeout) {
        this.requestTimeout = requestTimeout;
    }

    /**
     * Get the probe value.
     *
     * @return the probe value
     */
    public SubResource getProbe() {
        return this.probe;
    }

    /**
     * Set the probe value.
     *
     * @param probe the probe value to set
     */
    public void setProbe(SubResource probe) {
        this.probe = probe;
    }

    /**
     * Get the provisioningState value.
     *
     * @return the provisioningState value
     */
    public String getProvisioningState() {
        return this.provisioningState;
    }

    /**
     * Set the provisioningState value.
     *
     * @param provisioningState the provisioningState value to set
     */
    public void setProvisioningState(String provisioningState) {
        this.provisioningState = provisioningState;
    }

    /**
     * Get the name value.
     *
     * @return the name value
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name value.
     *
     * @param name the name value to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get the etag value.
     *
     * @return the etag value
     */
    public String getEtag() {
        return this.etag;
    }

    /**
     * Set the etag value.
     *
     * @param etag the etag value to set
     */
    public void setEtag(String etag) {
        this.etag = etag;
    }

}
