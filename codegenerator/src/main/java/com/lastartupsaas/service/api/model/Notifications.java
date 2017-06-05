
package com.lastartupsaas.service.api.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Reference;


/**
 * 通知集合schema
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Entity
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "notifications"
})
public class Notifications {

    /**
     * 通知集合
     * (Required)
     * 
     */
    @NotNull
    @JsonProperty("notifications")
    @Reference
    @Valid
    private List<Notification> notifications = new ArrayList<Notification>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 通知集合
     * (Required)
     * 
     * @return
     *     The notifications
     */
    @JsonProperty("notifications")
    public List<Notification> getNotifications() {
        return notifications;
    }

    /**
     * 通知集合
     * (Required)
     * 
     * @param notifications
     *     The notifications
     */
    @JsonProperty("notifications")
    public void setNotifications(List<Notification> notifications) {
        this.notifications = notifications;
    }

    public Notifications withNotifications(List<Notification> notifications) {
        this.notifications = notifications;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public Notifications withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
