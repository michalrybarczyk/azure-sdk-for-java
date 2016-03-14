/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator 0.16.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.azure.management.website.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.Resource;

/**
 * VNETInfo contract. This contract is public and is a stripped down version
 * of VNETInfoInternal.
 */
@JsonFlatten
public class VnetInfo extends Resource {
    /**
     * The vnet resource id.
     */
    @JsonProperty(value = "properties.vnetResourceId")
    private String vnetResourceId;

    /**
     * The client certificate thumbprint.
     */
    @JsonProperty(value = "properties.certThumbprint")
    private String certThumbprint;

    /**
     * A certificate file (.cer) blob containing the public key of the private
     * key used to authenticate a
     * Point-To-Site VPN connection.
     */
    @JsonProperty(value = "properties.certBlob")
    private String certBlob;

    /**
     * The routes that this virtual network connection uses.
     */
    @JsonProperty(value = "properties.routes")
    private List<VnetRoute> routes;

    /**
     * Get the vnetResourceId value.
     *
     * @return the vnetResourceId value
     */
    public String getVnetResourceId() {
        return this.vnetResourceId;
    }

    /**
     * Set the vnetResourceId value.
     *
     * @param vnetResourceId the vnetResourceId value to set
     */
    public void setVnetResourceId(String vnetResourceId) {
        this.vnetResourceId = vnetResourceId;
    }

    /**
     * Get the certThumbprint value.
     *
     * @return the certThumbprint value
     */
    public String getCertThumbprint() {
        return this.certThumbprint;
    }

    /**
     * Set the certThumbprint value.
     *
     * @param certThumbprint the certThumbprint value to set
     */
    public void setCertThumbprint(String certThumbprint) {
        this.certThumbprint = certThumbprint;
    }

    /**
     * Get the certBlob value.
     *
     * @return the certBlob value
     */
    public String getCertBlob() {
        return this.certBlob;
    }

    /**
     * Set the certBlob value.
     *
     * @param certBlob the certBlob value to set
     */
    public void setCertBlob(String certBlob) {
        this.certBlob = certBlob;
    }

    /**
     * Get the routes value.
     *
     * @return the routes value
     */
    public List<VnetRoute> getRoutes() {
        return this.routes;
    }

    /**
     * Set the routes value.
     *
     * @param routes the routes value to set
     */
    public void setRoutes(List<VnetRoute> routes) {
        this.routes = routes;
    }

}
