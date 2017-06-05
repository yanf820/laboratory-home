
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
 * 系统组集合
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Entity
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "groups"
})
public class SysGroups {

    /**
     * 系统组集合
     * (Required)
     * 
     */
    @NotNull
    @JsonProperty("groups")
    @Reference
    @Valid
    private List<SysGroup> groups = new ArrayList<SysGroup>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 系统组集合
     * (Required)
     * 
     * @return
     *     The groups
     */
    @JsonProperty("groups")
    public List<SysGroup> getGroups() {
        return groups;
    }

    /**
     * 系统组集合
     * (Required)
     * 
     * @param groups
     *     The groups
     */
    @JsonProperty("groups")
    public void setGroups(List<SysGroup> groups) {
        this.groups = groups;
    }

    public SysGroups withGroups(List<SysGroup> groups) {
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

    public SysGroups withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
