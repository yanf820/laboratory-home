
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
 * 系统角色
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Entity
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "roles"
})
public class SysRoles {

    /**
     * 系统角色
     * (Required)
     * 
     */
    @NotNull
    @JsonProperty("roles")
    @Reference
    @Valid
    private List<SysRole> roles = new ArrayList<SysRole>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 系统角色
     * (Required)
     * 
     * @return
     *     The roles
     */
    @JsonProperty("roles")
    public List<SysRole> getRoles() {
        return roles;
    }

    /**
     * 系统角色
     * (Required)
     * 
     * @param roles
     *     The roles
     */
    @JsonProperty("roles")
    public void setRoles(List<SysRole> roles) {
        this.roles = roles;
    }

    public SysRoles withRoles(List<SysRole> roles) {
        this.roles = roles;
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

    public SysRoles withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
