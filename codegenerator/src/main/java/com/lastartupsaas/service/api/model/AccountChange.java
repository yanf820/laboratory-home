
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
 * 账号变更记录
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Entity
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "id",
    "accountID",
    "changesTime",
    "changeApplyId",
    "frozenChangeId",
    "direction"
})
public class AccountChange {

    /**
     * 变更ID
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
     * 变更时间
     * (Required)
     * 
     */
    @NotNull
    @JsonProperty("changesTime")
    private String changesTime;
    /**
     * 变更申请ID
     * (Required)
     * 
     */
    @NotNull
    @JsonProperty("changeApplyId")
    private String changeApplyId;
    /**
     * 冻结记录ID
     * 
     */
    @JsonProperty("frozenChangeId")
    private String frozenChangeId;
    /**
     * 资金方向
     * (Required)
     * 
     */
    @NotNull
    @JsonProperty("direction")
    private String direction;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 变更ID
     * 
     * @return
     *     The id
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * 变更ID
     * 
     * @param id
     *     The id
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public AccountChange withId(String id) {
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

    public AccountChange withAccountID(String accountID) {
        this.accountID = accountID;
        return this;
    }

    /**
     * 变更时间
     * (Required)
     * 
     * @return
     *     The changesTime
     */
    @JsonProperty("changesTime")
    public String getChangesTime() {
        return changesTime;
    }

    /**
     * 变更时间
     * (Required)
     * 
     * @param changesTime
     *     The changesTime
     */
    @JsonProperty("changesTime")
    public void setChangesTime(String changesTime) {
        this.changesTime = changesTime;
    }

    public AccountChange withChangesTime(String changesTime) {
        this.changesTime = changesTime;
        return this;
    }

    /**
     * 变更申请ID
     * (Required)
     * 
     * @return
     *     The changeApplyId
     */
    @JsonProperty("changeApplyId")
    public String getChangeApplyId() {
        return changeApplyId;
    }

    /**
     * 变更申请ID
     * (Required)
     * 
     * @param changeApplyId
     *     The changeApplyId
     */
    @JsonProperty("changeApplyId")
    public void setChangeApplyId(String changeApplyId) {
        this.changeApplyId = changeApplyId;
    }

    public AccountChange withChangeApplyId(String changeApplyId) {
        this.changeApplyId = changeApplyId;
        return this;
    }

    /**
     * 冻结记录ID
     * 
     * @return
     *     The frozenChangeId
     */
    @JsonProperty("frozenChangeId")
    public String getFrozenChangeId() {
        return frozenChangeId;
    }

    /**
     * 冻结记录ID
     * 
     * @param frozenChangeId
     *     The frozenChangeId
     */
    @JsonProperty("frozenChangeId")
    public void setFrozenChangeId(String frozenChangeId) {
        this.frozenChangeId = frozenChangeId;
    }

    public AccountChange withFrozenChangeId(String frozenChangeId) {
        this.frozenChangeId = frozenChangeId;
        return this;
    }

    /**
     * 资金方向
     * (Required)
     * 
     * @return
     *     The direction
     */
    @JsonProperty("direction")
    public String getDirection() {
        return direction;
    }

    /**
     * 资金方向
     * (Required)
     * 
     * @param direction
     *     The direction
     */
    @JsonProperty("direction")
    public void setDirection(String direction) {
        this.direction = direction;
    }

    public AccountChange withDirection(String direction) {
        this.direction = direction;
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

    public AccountChange withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
