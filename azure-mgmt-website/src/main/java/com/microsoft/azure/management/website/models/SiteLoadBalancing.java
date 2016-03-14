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

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for SiteLoadBalancing.
 */
public enum SiteLoadBalancing {
    /** Enum value WeightedRoundRobin. */
    WEIGHTEDROUNDROBIN("WeightedRoundRobin"),

    /** Enum value LeastRequests. */
    LEASTREQUESTS("LeastRequests"),

    /** Enum value LeastResponseTime. */
    LEASTRESPONSETIME("LeastResponseTime"),

    /** Enum value WeightedTotalTraffic. */
    WEIGHTEDTOTALTRAFFIC("WeightedTotalTraffic"),

    /** Enum value RequestHash. */
    REQUESTHASH("RequestHash");

    /** The actual serialized value for a SiteLoadBalancing instance. */
    private String value;

    SiteLoadBalancing(String value) {
        this.value = value;
    }

    /**
     * Gets the serialized value for a SiteLoadBalancing instance.
     *
     * @return the serialized value.
     */
    @JsonValue
    public String toValue() {
        return this.value;
    }

    /**
     * Parses a serialized value to a SiteLoadBalancing instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed SiteLoadBalancing object, or null if unable to parse.
     */
    @JsonCreator
    public static SiteLoadBalancing fromValue(String value) {
        SiteLoadBalancing[] items = SiteLoadBalancing.values();
        for (SiteLoadBalancing item : items) {
            if (item.toValue().equals(value)) {
                return item;
            }
        }
        return null;
    }
}
