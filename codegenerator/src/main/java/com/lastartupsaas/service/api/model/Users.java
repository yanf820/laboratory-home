
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
 * 内容集合
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Entity
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "users",
    "totalCount"
})
public class Users {

    /**
     * 内容集合
     * 
     */
    @JsonProperty("users")
    @Reference
    @Valid
    private List<User> users = new ArrayList<User>();
    /**
     * 记录总数
     * (Required)
     * 
     */
    @NotNull
    @JsonProperty("totalCount")
    private Long totalCount;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 内容集合
     * 
     * @return
     *     The users
     */
    @JsonProperty("users")
    public List<User> getUsers() {
        return users;
    }

    /**
     * 内容集合
     * 
     * @param users
     *     The users
     */
    @JsonProperty("users")
    public void setUsers(List<User> users) {
        this.users = users;
    }

    public Users withUsers(List<User> users) {
        this.users = users;
        return this;
    }

    /**
     * 记录总数
     * (Required)
     * 
     * @return
     *     The totalCount
     */
    @JsonProperty("totalCount")
    public Long getTotalCount() {
        return totalCount;
    }

    /**
     * 记录总数
     * (Required)
     * 
     * @param totalCount
     *     The totalCount
     */
    @JsonProperty("totalCount")
    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
    }

    public Users withTotalCount(Long totalCount) {
        this.totalCount = totalCount;
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

    public Users withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
