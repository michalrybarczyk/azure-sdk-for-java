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
 * Defines values for HostingEnvironmentStatus.
 */
public enum HostingEnvironmentStatus {
    /** Enum value Preparing. */
    PREPARING("Preparing"),

    /** Enum value Ready. */
    READY("Ready"),

    /** Enum value Scaling. */
    SCALING("Scaling"),

    /** Enum value Deleting. */
    DELETING("Deleting");

    /** The actual serialized value for a HostingEnvironmentStatus instance. */
    private String value;

    HostingEnvironmentStatus(String value) {
        this.value = value;
    }

    /**
     * Gets the serialized value for a HostingEnvironmentStatus instance.
     *
     * @return the serialized value.
     */
    @JsonValue
    public String toValue() {
        return this.value;
    }

    /**
     * Parses a serialized value to a HostingEnvironmentStatus instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed HostingEnvironmentStatus object, or null if unable to parse.
     */
    @JsonCreator
    public static HostingEnvironmentStatus fromValue(String value) {
        HostingEnvironmentStatus[] items = HostingEnvironmentStatus.values();
        for (HostingEnvironmentStatus item : items) {
            if (item.toValue().equals(value)) {
                return item;
            }
        }
        return null;
    }
}
