/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.devtestlab;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Notification settings for a schedule.
 */
public class NotificationSettings {
    /**
     * If notifications are enabled for this schedule (i.e. Enabled, Disabled).
     * Possible values include: 'Disabled', 'Enabled'.
     */
    @JsonProperty(value = "status")
    private NotificationStatus status;

    /**
     * Time in minutes before event at which notification will be sent.
     */
    @JsonProperty(value = "timeInMinutes")
    private Integer timeInMinutes;

    /**
     * The webhook URL to which the notification will be sent.
     */
    @JsonProperty(value = "webhookUrl")
    private String webhookUrl;

    /**
     * Get the status value.
     *
     * @return the status value
     */
    public NotificationStatus status() {
        return this.status;
    }

    /**
     * Set the status value.
     *
     * @param status the status value to set
     * @return the NotificationSettings object itself.
     */
    public NotificationSettings withStatus(NotificationStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get the timeInMinutes value.
     *
     * @return the timeInMinutes value
     */
    public Integer timeInMinutes() {
        return this.timeInMinutes;
    }

    /**
     * Set the timeInMinutes value.
     *
     * @param timeInMinutes the timeInMinutes value to set
     * @return the NotificationSettings object itself.
     */
    public NotificationSettings withTimeInMinutes(Integer timeInMinutes) {
        this.timeInMinutes = timeInMinutes;
        return this;
    }

    /**
     * Get the webhookUrl value.
     *
     * @return the webhookUrl value
     */
    public String webhookUrl() {
        return this.webhookUrl;
    }

    /**
     * Set the webhookUrl value.
     *
     * @param webhookUrl the webhookUrl value to set
     * @return the NotificationSettings object itself.
     */
    public NotificationSettings withWebhookUrl(String webhookUrl) {
        this.webhookUrl = webhookUrl;
        return this;
    }

}
