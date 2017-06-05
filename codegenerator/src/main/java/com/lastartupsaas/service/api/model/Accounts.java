
package com.lastartupsaas.service.api.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Reference;


/**
 * 账号集合
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Entity
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "accounts"
})
public class Accounts {

    /**
     * 账号集合
     * 
     */
    @JsonProperty("accounts")
    @Reference
    @Valid
    private List<Account> accounts = new ArrayList<Account>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 账号集合
     * 
     * @return
     *     The accounts
     */
    @JsonProperty("accounts")
    public List<Account> getAccounts() {
        return accounts;
    }

    /**
     * 账号集合
     * 
     * @param accounts
     *     The accounts
     */
    @JsonProperty("accounts")
    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }

    public Accounts withAccounts(List<Account> accounts) {
        this.accounts = accounts;
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

    public Accounts withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
