
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
import org.mongodb.morphia.annotations.Embedded;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;


/**
 * 订单
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Entity
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "id",
    "type",
    "amount",
    "supplierId",
    "productIds",
    "memberId",
    "creationTime",
    "modifyTime",
    "status"
})
public class Order {

    /**
     * ID
     * 
     */
    @JsonProperty("id")
    @Id
    private String id;
    /**
     * 类型
     * (Required)
     * 
     */
    @NotNull
    @JsonProperty("type")
    private String type;
    /**
     * 订单总金额
     * (Required)
     * 
     */
    @NotNull
    @JsonProperty("amount")
    private Double amount;
    /**
     * 供应商ID
     * (Required)
     * 
     */
    @NotNull
    @JsonProperty("supplierId")
    private String supplierId;
    /**
     * 商品ID列表
     * (Required)
     * 
     */
    @NotNull
    @JsonProperty("productIds")
    @Embedded
    @Valid
    private List<String> productIds = new ArrayList<String>();
    /**
     * 会员ID
     * (Required)
     * 
     */
    @NotNull
    @JsonProperty("memberId")
    private String memberId;
    /**
     * 订单创建时间
     * (Required)
     * 
     */
    @NotNull
    @JsonProperty("creationTime")
    private String creationTime;
    /**
     * 订单修改时间
     * 
     */
    @JsonProperty("modifyTime")
    private String modifyTime;
    /**
     * 订单状态
     * (Required)
     * 
     */
    @NotNull
    @JsonProperty("status")
    private String status;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * ID
     * 
     * @return
     *     The id
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * ID
     * 
     * @param id
     *     The id
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public Order withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 类型
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
     * 类型
     * (Required)
     * 
     * @param type
     *     The type
     */
    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    public Order withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 订单总金额
     * (Required)
     * 
     * @return
     *     The amount
     */
    @JsonProperty("amount")
    public Double getAmount() {
        return amount;
    }

    /**
     * 订单总金额
     * (Required)
     * 
     * @param amount
     *     The amount
     */
    @JsonProperty("amount")
    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Order withAmount(Double amount) {
        this.amount = amount;
        return this;
    }

    /**
     * 供应商ID
     * (Required)
     * 
     * @return
     *     The supplierId
     */
    @JsonProperty("supplierId")
    public String getSupplierId() {
        return supplierId;
    }

    /**
     * 供应商ID
     * (Required)
     * 
     * @param supplierId
     *     The supplierId
     */
    @JsonProperty("supplierId")
    public void setSupplierId(String supplierId) {
        this.supplierId = supplierId;
    }

    public Order withSupplierId(String supplierId) {
        this.supplierId = supplierId;
        return this;
    }

    /**
     * 商品ID列表
     * (Required)
     * 
     * @return
     *     The productIds
     */
    @JsonProperty("productIds")
    public List<String> getProductIds() {
        return productIds;
    }

    /**
     * 商品ID列表
     * (Required)
     * 
     * @param productIds
     *     The productIds
     */
    @JsonProperty("productIds")
    public void setProductIds(List<String> productIds) {
        this.productIds = productIds;
    }

    public Order withProductIds(List<String> productIds) {
        this.productIds = productIds;
        return this;
    }

    /**
     * 会员ID
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
     * 会员ID
     * (Required)
     * 
     * @param memberId
     *     The memberId
     */
    @JsonProperty("memberId")
    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public Order withMemberId(String memberId) {
        this.memberId = memberId;
        return this;
    }

    /**
     * 订单创建时间
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
     * 订单创建时间
     * (Required)
     * 
     * @param creationTime
     *     The creationTime
     */
    @JsonProperty("creationTime")
    public void setCreationTime(String creationTime) {
        this.creationTime = creationTime;
    }

    public Order withCreationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    /**
     * 订单修改时间
     * 
     * @return
     *     The modifyTime
     */
    @JsonProperty("modifyTime")
    public String getModifyTime() {
        return modifyTime;
    }

    /**
     * 订单修改时间
     * 
     * @param modifyTime
     *     The modifyTime
     */
    @JsonProperty("modifyTime")
    public void setModifyTime(String modifyTime) {
        this.modifyTime = modifyTime;
    }

    public Order withModifyTime(String modifyTime) {
        this.modifyTime = modifyTime;
        return this;
    }

    /**
     * 订单状态
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
     * 订单状态
     * (Required)
     * 
     * @param status
     *     The status
     */
    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    public Order withStatus(String status) {
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

    public Order withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
