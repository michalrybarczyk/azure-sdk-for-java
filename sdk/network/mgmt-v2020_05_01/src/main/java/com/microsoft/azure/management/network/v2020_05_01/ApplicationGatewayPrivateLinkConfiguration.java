/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_05_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.SubResource;

/**
 * Private Link Configuration on an application gateway.
 */
@JsonFlatten
public class ApplicationGatewayPrivateLinkConfiguration extends SubResource {
    /**
     * An array of application gateway private link ip configurations.
     */
    @JsonProperty(value = "properties.ipConfigurations")
    private List<ApplicationGatewayPrivateLinkIpConfiguration> ipConfigurations;

    /**
     * The provisioning state of the application gateway private link
     * configuration. Possible values include: 'Succeeded', 'Updating',
     * 'Deleting', 'Failed'.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /**
     * Name of the private link configuration that is unique within an
     * Application Gateway.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /**
     * Type of the resource.
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /**
     * Get an array of application gateway private link ip configurations.
     *
     * @return the ipConfigurations value
     */
    public List<ApplicationGatewayPrivateLinkIpConfiguration> ipConfigurations() {
        return this.ipConfigurations;
    }

    /**
     * Set an array of application gateway private link ip configurations.
     *
     * @param ipConfigurations the ipConfigurations value to set
     * @return the ApplicationGatewayPrivateLinkConfiguration object itself.
     */
    public ApplicationGatewayPrivateLinkConfiguration withIpConfigurations(List<ApplicationGatewayPrivateLinkIpConfiguration> ipConfigurations) {
        this.ipConfigurations = ipConfigurations;
        return this;
    }

    /**
     * Get the provisioning state of the application gateway private link configuration. Possible values include: 'Succeeded', 'Updating', 'Deleting', 'Failed'.
     *
     * @return the provisioningState value
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get name of the private link configuration that is unique within an Application Gateway.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set name of the private link configuration that is unique within an Application Gateway.
     *
     * @param name the name value to set
     * @return the ApplicationGatewayPrivateLinkConfiguration object itself.
     */
    public ApplicationGatewayPrivateLinkConfiguration withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get a unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Get type of the resource.
     *
     * @return the type value
     */
    public String type() {
        return this.type;
    }

}
