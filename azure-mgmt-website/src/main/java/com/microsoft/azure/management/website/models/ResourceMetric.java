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

import org.joda.time.DateTime;
import java.util.List;

/**
 * Object representing a metric for any resource.
 */
public class ResourceMetric {
    /**
     * Name of metric.
     */
    private ResourceMetricName name;

    /**
     * Metric unit.
     */
    private String unit;

    /**
     * Metric granularity. E.g PT1H, PT5M, P1D.
     */
    private String timeGrain;

    /**
     * Metric start time.
     */
    private DateTime startTime;

    /**
     * Metric end time.
     */
    private DateTime endTime;

    /**
     * Metric resource Id.
     */
    private String resourceId;

    /**
     * Metric values.
     */
    private List<ResourceMetricValue> metricValues;

    /**
     * Properties.
     */
    private List<KeyValuePairStringString> properties;

    /**
     * Get the name value.
     *
     * @return the name value
     */
    public ResourceMetricName getName() {
        return this.name;
    }

    /**
     * Set the name value.
     *
     * @param name the name value to set
     */
    public void setName(ResourceMetricName name) {
        this.name = name;
    }

    /**
     * Get the unit value.
     *
     * @return the unit value
     */
    public String getUnit() {
        return this.unit;
    }

    /**
     * Set the unit value.
     *
     * @param unit the unit value to set
     */
    public void setUnit(String unit) {
        this.unit = unit;
    }

    /**
     * Get the timeGrain value.
     *
     * @return the timeGrain value
     */
    public String getTimeGrain() {
        return this.timeGrain;
    }

    /**
     * Set the timeGrain value.
     *
     * @param timeGrain the timeGrain value to set
     */
    public void setTimeGrain(String timeGrain) {
        this.timeGrain = timeGrain;
    }

    /**
     * Get the startTime value.
     *
     * @return the startTime value
     */
    public DateTime getStartTime() {
        return this.startTime;
    }

    /**
     * Set the startTime value.
     *
     * @param startTime the startTime value to set
     */
    public void setStartTime(DateTime startTime) {
        this.startTime = startTime;
    }

    /**
     * Get the endTime value.
     *
     * @return the endTime value
     */
    public DateTime getEndTime() {
        return this.endTime;
    }

    /**
     * Set the endTime value.
     *
     * @param endTime the endTime value to set
     */
    public void setEndTime(DateTime endTime) {
        this.endTime = endTime;
    }

    /**
     * Get the resourceId value.
     *
     * @return the resourceId value
     */
    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * Set the resourceId value.
     *
     * @param resourceId the resourceId value to set
     */
    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * Get the metricValues value.
     *
     * @return the metricValues value
     */
    public List<ResourceMetricValue> getMetricValues() {
        return this.metricValues;
    }

    /**
     * Set the metricValues value.
     *
     * @param metricValues the metricValues value to set
     */
    public void setMetricValues(List<ResourceMetricValue> metricValues) {
        this.metricValues = metricValues;
    }

    /**
     * Get the properties value.
     *
     * @return the properties value
     */
    public List<KeyValuePairStringString> getProperties() {
        return this.properties;
    }

    /**
     * Set the properties value.
     *
     * @param properties the properties value to set
     */
    public void setProperties(List<KeyValuePairStringString> properties) {
        this.properties = properties;
    }

}
