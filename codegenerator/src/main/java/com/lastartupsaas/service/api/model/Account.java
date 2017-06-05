
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
 * 账号
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Entity
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "id",
    "type",
    "totalAmount",
    "frozenAmount",
    "prepaidAmount",
    "balance",
    "status",
    "memberId"
})
public class Account {

    /**
     * 账号ID
     * 
     */
    @JsonProperty("id")
    @Id
    private String id;
    /**
     * 账号类型
     * (Required)
     * 
     */
    @NotNull
    @JsonProperty("type")
    private String type;
    /**
     * 总金额
     * (Required)
     * 
     */
    @NotNull
    @JsonProperty("totalAmount")
    private Double totalAmount;
    /**
     * 冻结金额
     * 
     */
    @JsonProperty("frozenAmount")
    private Double frozenAmount;
    /**
     * 预授权金额
     * 
     */
    @JsonProperty("prepaidAmount")
    private Double prepaidAmount;
    /**
     * 余额
     * (Required)
     * 
     */
    @NotNull
    @JsonProperty("balance")
    private Double balance;
    /**
     * 账户状态
     * (Required)
     * 
     */
    @NotNull
    @JsonProperty("status")
    private String status;
    /**
     * 账户所属会员
     * (Required)
     * 
     */
    @NotNull
    @JsonProperty("memberId")
    private String memberId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 账号ID
     * 
     * @return
     *     The id
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * 账号ID
     * 
     * @param id
     *     The id
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public Account withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 账号类型
     * (Required)
     * 
     * @return
     *     The type
     */
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    /**
     * 账号类型
     * (Required)
     * 
     * @param type
     *     The type
     */
    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    public Account withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 总金额
     * (Required)
     * 
     * @return
     *     The totalAmount
     */
    @JsonProperty("totalAmount")
    public Double getTotalAmount() {
        return totalAmount;
    }

    /**
     * 总金额
     * (Required)
     * 
     * @param totalAmount
     *     The totalAmount
     */
    @JsonProperty("totalAmount")
    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Account withTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
        return this;
    }

    /**
     * 冻结金额
     * 
     * @return
     *     The frozenAmount
     */
    @JsonProperty("frozenAmount")
    public Double getFrozenAmount() {
        return frozenAmount;
    }

    /**
     * 冻结金额
     * 
     * @param frozenAmount
     *     The frozenAmount
     */
    @JsonProperty("frozenAmount")
    public void setFrozenAmount(Double frozenAmount) {
        this.frozenAmount = frozenAmount;
    }

    public Account withFrozenAmount(Double frozenAmount) {
        this.frozenAmount = frozenAmount;
        return this;
    }

    /**
     * 预授权金额
     * 
     * @return
     *     The prepaidAmount
     */
    @JsonProperty("prepaidAmount")
    public Double getPrepaidAmount() {
        return prepaidAmount;
    }

    /**
     * 预授权金额
     * 
     * @param prepaidAmount
     *     The prepaidAmount
     */
    @JsonProperty("prepaidAmount")
    public void setPrepaidAmount(Double prepaidAmount) {
        this.prepaidAmount = prepaidAmount;
    }

    public Account withPrepaidAmount(Double prepaidAmount) {
        this.prepaidAmount = prepaidAmount;
        return this;
    }

    /**
     * 余额
     * (Required)
     * 
     * @return
     *     The balance
     */
    @JsonProperty("balance")
    public Double getBalance() {
        return balance;
    }

    /**
     * 余额
     * (Required)
     * 
     * @param balance
     *     The balance
     */
    @JsonProperty("balance")
    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Account withBalance(Double balance) {
        this.balance = balance;
        return this;
    }

    /**
     * 账户状态
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
     * 账户状态
     * (Required)
     * 
     * @param status
     *     The status
     */
    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    public Account withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 账户所属会员
     * (Required)
     * 
     * @return
     *     The memberId
     */
    @JsonProperty("memberId")
    public String getMemberId() {
        return memberId;
    }

    /**
     * 账户所属会员
     * (Required)
     * 
     * @param memberId
     *     The memberId
     */
    @JsonProperty("memberId")
    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public Account withMemberId(String memberId) {
        this.memberId = memberId;
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

    public Account withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
