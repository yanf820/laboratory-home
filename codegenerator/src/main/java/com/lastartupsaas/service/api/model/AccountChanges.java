
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
 * 账号独立schema
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Entity
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "accountChanges"
})
public class AccountChanges {

    /**
     * 账号变更列表
     * (Required)
     * 
     */
    @NotNull
    @JsonProperty("accountChanges")
    @Reference
    @Valid
    private List<AccountChange> accountChanges = new ArrayList<AccountChange>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 账号变更列表
     * (Required)
     * 
     * @return
     *     The accountChanges
     */
    @JsonProperty("accountChanges")
    public List<AccountChange> getAccountChanges() {
        return accountChanges;
    }

    /**
     * 账号变更列表
     * (Required)
     * 
     * @param accountChanges
     *     The accountChanges
     */
    @JsonProperty("accountChanges")
    public void setAccountChanges(List<AccountChange> accountChanges) {
        this.accountChanges = accountChanges;
    }

    public AccountChanges withAccountChanges(List<AccountChange> accountChanges) {
        this.accountChanges = accountChanges;
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

    public AccountChanges withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
