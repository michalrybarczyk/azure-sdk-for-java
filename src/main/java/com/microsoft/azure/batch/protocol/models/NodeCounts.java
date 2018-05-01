/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.azure.batch.protocol.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The number of nodes in each node state.
 */
public class NodeCounts {
    /**
     * The number of nodes in the creating state.
     */
    @JsonProperty(value = "creating", required = true)
    private int creating;

    /**
     * The number of nodes in the idle state.
     */
    @JsonProperty(value = "idle", required = true)
    private int idle;

    /**
     * The number of nodes in the offline state.
     */
    @JsonProperty(value = "offline", required = true)
    private int offline;

    /**
     * The number of nodes in the preempted state.
     */
    @JsonProperty(value = "preempted", required = true)
    private int preempted;

    /**
     * The count of nodes in the rebooting state.
     */
    @JsonProperty(value = "rebooting", required = true)
    private int rebooting;

    /**
     * The number of nodes in the reimaging state.
     */
    @JsonProperty(value = "reimaging", required = true)
    private int reimaging;

    /**
     * The number of nodes in the running state.
     */
    @JsonProperty(value = "running", required = true)
    private int running;

    /**
     * The number of nodes in the starting state.
     */
    @JsonProperty(value = "starting", required = true)
    private int starting;

    /**
     * The number of nodes in the startTaskFailed state.
     */
    @JsonProperty(value = "startTaskFailed", required = true)
    private int startTaskFailed;

    /**
     * The number of nodes in the leavingPool state.
     */
    @JsonProperty(value = "leavingPool", required = true)
    private int leavingPool;

    /**
     * The number of nodes in the unknown state.
     */
    @JsonProperty(value = "unknown", required = true)
    private int unknown;

    /**
     * The number of nodes in the unusable state.
     */
    @JsonProperty(value = "unusable", required = true)
    private int unusable;

    /**
     * The number of nodes in the waitingForStartTask state.
     */
    @JsonProperty(value = "waitingForStartTask", required = true)
    private int waitingForStartTask;

    /**
     * The total number of nodes.
     */
    @JsonProperty(value = "total", required = true)
    private int total;

    /**
     * Get the creating value.
     *
     * @return the creating value
     */
    public int creating() {
        return this.creating;
    }

    /**
     * Set the creating value.
     *
     * @param creating the creating value to set
     * @return the NodeCounts object itself.
     */
    public NodeCounts withCreating(int creating) {
        this.creating = creating;
        return this;
    }

    /**
     * Get the idle value.
     *
     * @return the idle value
     */
    public int idle() {
        return this.idle;
    }

    /**
     * Set the idle value.
     *
     * @param idle the idle value to set
     * @return the NodeCounts object itself.
     */
    public NodeCounts withIdle(int idle) {
        this.idle = idle;
        return this;
    }

    /**
     * Get the offline value.
     *
     * @return the offline value
     */
    public int offline() {
        return this.offline;
    }

    /**
     * Set the offline value.
     *
     * @param offline the offline value to set
     * @return the NodeCounts object itself.
     */
    public NodeCounts withOffline(int offline) {
        this.offline = offline;
        return this;
    }

    /**
     * Get the preempted value.
     *
     * @return the preempted value
     */
    public int preempted() {
        return this.preempted;
    }

    /**
     * Set the preempted value.
     *
     * @param preempted the preempted value to set
     * @return the NodeCounts object itself.
     */
    public NodeCounts withPreempted(int preempted) {
        this.preempted = preempted;
        return this;
    }

    /**
     * Get the rebooting value.
     *
     * @return the rebooting value
     */
    public int rebooting() {
        return this.rebooting;
    }

    /**
     * Set the rebooting value.
     *
     * @param rebooting the rebooting value to set
     * @return the NodeCounts object itself.
     */
    public NodeCounts withRebooting(int rebooting) {
        this.rebooting = rebooting;
        return this;
    }

    /**
     * Get the reimaging value.
     *
     * @return the reimaging value
     */
    public int reimaging() {
        return this.reimaging;
    }

    /**
     * Set the reimaging value.
     *
     * @param reimaging the reimaging value to set
     * @return the NodeCounts object itself.
     */
    public NodeCounts withReimaging(int reimaging) {
        this.reimaging = reimaging;
        return this;
    }

    /**
     * Get the running value.
     *
     * @return the running value
     */
    public int running() {
        return this.running;
    }

    /**
     * Set the running value.
     *
     * @param running the running value to set
     * @return the NodeCounts object itself.
     */
    public NodeCounts withRunning(int running) {
        this.running = running;
        return this;
    }

    /**
     * Get the starting value.
     *
     * @return the starting value
     */
    public int starting() {
        return this.starting;
    }

    /**
     * Set the starting value.
     *
     * @param starting the starting value to set
     * @return the NodeCounts object itself.
     */
    public NodeCounts withStarting(int starting) {
        this.starting = starting;
        return this;
    }

    /**
     * Get the startTaskFailed value.
     *
     * @return the startTaskFailed value
     */
    public int startTaskFailed() {
        return this.startTaskFailed;
    }

    /**
     * Set the startTaskFailed value.
     *
     * @param startTaskFailed the startTaskFailed value to set
     * @return the NodeCounts object itself.
     */
    public NodeCounts withStartTaskFailed(int startTaskFailed) {
        this.startTaskFailed = startTaskFailed;
        return this;
    }

    /**
     * Get the leavingPool value.
     *
     * @return the leavingPool value
     */
    public int leavingPool() {
        return this.leavingPool;
    }

    /**
     * Set the leavingPool value.
     *
     * @param leavingPool the leavingPool value to set
     * @return the NodeCounts object itself.
     */
    public NodeCounts withLeavingPool(int leavingPool) {
        this.leavingPool = leavingPool;
        return this;
    }

    /**
     * Get the unknown value.
     *
     * @return the unknown value
     */
    public int unknown() {
        return this.unknown;
    }

    /**
     * Set the unknown value.
     *
     * @param unknown the unknown value to set
     * @return the NodeCounts object itself.
     */
    public NodeCounts withUnknown(int unknown) {
        this.unknown = unknown;
        return this;
    }

    /**
     * Get the unusable value.
     *
     * @return the unusable value
     */
    public int unusable() {
        return this.unusable;
    }

    /**
     * Set the unusable value.
     *
     * @param unusable the unusable value to set
     * @return the NodeCounts object itself.
     */
    public NodeCounts withUnusable(int unusable) {
        this.unusable = unusable;
        return this;
    }

    /**
     * Get the waitingForStartTask value.
     *
     * @return the waitingForStartTask value
     */
    public int waitingForStartTask() {
        return this.waitingForStartTask;
    }

    /**
     * Set the waitingForStartTask value.
     *
     * @param waitingForStartTask the waitingForStartTask value to set
     * @return the NodeCounts object itself.
     */
    public NodeCounts withWaitingForStartTask(int waitingForStartTask) {
        this.waitingForStartTask = waitingForStartTask;
        return this;
    }

    /**
     * Get the total value.
     *
     * @return the total value
     */
    public int total() {
        return this.total;
    }

    /**
     * Set the total value.
     *
     * @param total the total value to set
     * @return the NodeCounts object itself.
     */
    public NodeCounts withTotal(int total) {
        this.total = total;
        return this;
    }

}
