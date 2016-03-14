/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator 0.16.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.azure.management.compute.models;

import java.util.List;

/**
 * Describes a virtual machine scale set extension profile.
 */
public class VirtualMachineScaleSetExtensionProfile {
    /**
     * Gets the virtual machine scale set child extension resources.
     */
    private List<VirtualMachineScaleSetExtension> extensions;

    /**
     * Get the extensions value.
     *
     * @return the extensions value
     */
    public List<VirtualMachineScaleSetExtension> getExtensions() {
        return this.extensions;
    }

    /**
     * Set the extensions value.
     *
     * @param extensions the extensions value to set
     */
    public void setExtensions(List<VirtualMachineScaleSetExtension> extensions) {
        this.extensions = extensions;
    }

}
