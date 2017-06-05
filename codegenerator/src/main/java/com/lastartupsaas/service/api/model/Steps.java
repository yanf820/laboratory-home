
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
 * 流程步骤集合
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Entity
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "groups"
})
public class Steps {

    /**
     * 流程步骤集合
     * (Required)
     * 
     */
    @NotNull
    @JsonProperty("groups")
    @Reference
    @Valid
    private List<Graph> groups = new ArrayList<Graph>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 流程步骤集合
     * (Required)
     * 
     * @return
     *     The groups
     */
    @JsonProperty("groups")
    public List<Graph> getGroups() {
        return groups;
    }

    /**
     * 流程步骤集合
     * (Required)
     * 
     * @param groups
     *     The groups
     */
    @JsonProperty("groups")
    public void setGroups(List<Graph> groups) {
        this.groups = groups;
    }

    public Steps withGroups(List<Graph> groups) {
        this.groups = groups;
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

    public Steps withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
