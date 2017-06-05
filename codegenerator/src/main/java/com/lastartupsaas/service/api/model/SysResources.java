
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
 * 系统资源集合
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Entity
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "resources"
})
public class SysResources {

    /**
     * 系统资源
     * (Required)
     * 
     */
    @NotNull
    @JsonProperty("resources")
    @Reference
    @Valid
    private List<SysResource> resources = new ArrayList<SysResource>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 系统资源
     * (Required)
     * 
     * @return
     *     The resources
     */
    @JsonProperty("resources")
    public List<SysResource> getResources() {
        return resources;
    }

    /**
     * 系统资源
     * (Required)
     * 
     * @param resources
     *     The resources
     */
    @JsonProperty("resources")
    public void setResources(List<SysResource> resources) {
        this.resources = resources;
    }

    public SysResources withResources(List<SysResource> resources) {
        this.resources = resources;
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

    public SysResources withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
