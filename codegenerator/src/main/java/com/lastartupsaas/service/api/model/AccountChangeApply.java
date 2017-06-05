
package com.lastartupsaas.service.api.model;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;


/**
 * 账号变更申请
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Entity
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "id",
    "accountID",
    "changeAmount",
    "creationTime",
    "modifyTime",
    "status"
})
public class AccountChangeApply {

    /**
     * 变更申请ID
     * 
     */
    @JsonProperty("id")
    @Id
    private String id;
    /**
     * 相关账户ID
     * (Required)
     * 
     */
    @NotNull
    @JsonProperty("accountID")
    private String accountID;
    /**
     * 变更金额
     * (Required)
     * 
     */
    @NotNull
    @JsonProperty("changeAmount")
    private String changeAmount;
    /**
     * 变更申请时间
     * (Required)
     * 
     */
    @NotNull
    @JsonProperty("creationTime")
    private String creationTime;
    /**
     * 变更申请修改时间
     * 
     */
    @JsonProperty("modifyTime")
    private String modifyTime;
    /**
     * 申请状态
     * (Required)
     * 
     */
    @NotNull
    @JsonProperty("status")
    private String status;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 变更申请ID
     * 
     * @return
     *     The id
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * 变更申请ID
     * 
     * @param id
     *     The id
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public AccountChangeApply withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 相关账户ID
     * (Required)
     * 
     * @return
     *     The accountID
     */
    @JsonProperty("accountID")
    public String getAccountID() {
        return accountID;
    }

    /**
     * 相关账户ID
     * (Required)
     * 
     * @param accountID
     *     The accountID
     */
    @JsonProperty("accountID")
    public void setAccountID(String accountID) {
        this.accountID = accountID;
    }

    public AccountChangeApply withAccountID(String accountID) {
        this.accountID = accountID;
        return this;
    }

    /**
     * 变更金额
     * (Required)
     * 
     * @return
     *     The changeAmount
     */
    @JsonProperty("changeAmount")
    public String getChangeAmount() {
        return changeAmount;
    }

    /**
     * 变更金额
     * (Required)
     * 
     * @param changeAmount
     *     The changeAmount
     */
    @JsonProperty("changeAmount")
    public void setChangeAmount(String changeAmount) {
        this.changeAmount = changeAmount;
    }

    public AccountChangeApply withChangeAmount(String changeAmount) {
        this.changeAmount = changeAmount;
        return this;
    }

    /**
     * 变更申请时间
     * (Required)
     * 
     * @return
     *     The creationTime
     */
    @JsonProperty("creationTime")
    public String getCreationTime() {
        return creationTime;
    }

    /**
     * 变更申请时间
     * (Required)
     * 
     * @param creationTime
     *     The creationTime
     */
    @JsonProperty("creationTime")
    public void setCreationTime(String creationTime) {
        this.creationTime = creationTime;
    }

    public AccountChangeApply withCreationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    /**
     * 变更申请修改时间
     * 
     * @return
     *     The modifyTime
     */
    @JsonProperty("modifyTime")
    public String getModifyTime() {
        return modifyTime;
    }

    /**
     * 变更申请修改时间
     * 
     * @param modifyTime
     *     The modifyTime
     */
    @JsonProperty("modifyTime")
    public void setModifyTime(String modifyTime) {
        this.modifyTime = modifyTime;
    }

    public AccountChangeApply withModifyTime(String modifyTime) {
        this.modifyTime = modifyTime;
        return this;
    }

    /**
     * 申请状态
     * (Required)
     * 
     * @return
     *     The status
     */
    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    /**
     * 申请状态
     * (Required)
     * 
     * @param status
     *     The status
     */
    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    public AccountChangeApply withStatus(String status) {
        this.status = status;
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

    public AccountChangeApply withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
