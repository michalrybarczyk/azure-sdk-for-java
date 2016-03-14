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


/**
 * Describes a diagnostics profile.
 */
public class DiagnosticsProfile {
    /**
     * Gets or sets the boot diagnostics.
     */
    private BootDiagnostics bootDiagnostics;

    /**
     * Get the bootDiagnostics value.
     *
     * @return the bootDiagnostics value
     */
    public BootDiagnostics getBootDiagnostics() {
        return this.bootDiagnostics;
    }

    /**
     * Set the bootDiagnostics value.
     *
     * @param bootDiagnostics the bootDiagnostics value to set
     */
    public void setBootDiagnostics(BootDiagnostics bootDiagnostics) {
        this.bootDiagnostics = bootDiagnostics;
    }

}
