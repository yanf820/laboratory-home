
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
 * 产品
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Entity
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "id",
    "type",
    "name",
    "title",
    "logo",
    "detail",
    "creationTime",
    "modifyTime",
    "status",
    "categoryId",
    "tagIds",
    "creatorId",
    "onlineTime",
    "offlineTime",
    "supplierId",
    "attachmentIds"
})
public class Product {

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
     * 名称
     * (Required)
     * 
     */
    @NotNull
    @JsonProperty("name")
    private String name;
    /**
     * 标题
     * (Required)
     * 
     */
    @NotNull
    @JsonProperty("title")
    private String title;
    /**
     * 头图、logo等图片地址
     * 
     */
    @JsonProperty("logo")
    private String logo;
    /**
     * 详情
     * 
     */
    @JsonProperty("detail")
    @Embedded
    @Valid
    private List<ProductDetail> detail = new ArrayList<ProductDetail>();
    /**
     * 创建时间
     * (Required)
     * 
     */
    @NotNull
    @JsonProperty("creationTime")
    private String creationTime;
    /**
     * 修改时间
     * 
     */
    @JsonProperty("modifyTime")
    private String modifyTime;
    /**
     * 状态
     * (Required)
     * 
     */
    @NotNull
    @JsonProperty("status")
    private String status;
    /**
     * 分类ID
     * 
     */
    @JsonProperty("categoryId")
    private String categoryId;
    /**
     * 标签ID列表
     * 
     */
    @JsonProperty("tagIds")
    @Embedded
    @Valid
    private List<String> tagIds = new ArrayList<String>();
    /**
     * 创建人ID
     * (Required)
     * 
     */
    @NotNull
    @JsonProperty("creatorId")
    private String creatorId;
    /**
     * 上线时间
     * 
     */
    @JsonProperty("onlineTime")
    private String onlineTime;
    /**
     * 下线时间
     * 
     */
    @JsonProperty("offlineTime")
    private String offlineTime;
    /**
     * 供应商ID
     * (Required)
     * 
     */
    @NotNull
    @JsonProperty("supplierId")
    private String supplierId;
    /**
     * 附件信息
     * 
     */
    @JsonProperty("attachmentIds")
    @Embedded
    @Valid
    private List<String> attachmentIds = new ArrayList<String>();
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

    public Product withId(String id) {
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

    public Product withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 名称
     * (Required)
     * 
     * @return
     *     The name
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * 名称
     * (Required)
     * 
     * @param name
     *     The name
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public Product withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 标题
     * (Required)
     * 
     * @return
     *     The title
     */
    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    /**
     * 标题
     * (Required)
     * 
     * @param title
     *     The title
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    public Product withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * 头图、logo等图片地址
     * 
     * @return
     *     The logo
     */
    @JsonProperty("logo")
    public String getLogo() {
        return logo;
    }

    /**
     * 头图、logo等图片地址
     * 
     * @param logo
     *     The logo
     */
    @JsonProperty("logo")
    public void setLogo(String logo) {
        this.logo = logo;
    }

    public Product withLogo(String logo) {
        this.logo = logo;
        return this;
    }

    /**
     * 详情
     * 
     * @return
     *     The detail
     */
    @JsonProperty("detail")
    public List<ProductDetail> getDetail() {
        return detail;
    }

    /**
     * 详情
     * 
     * @param detail
     *     The detail
     */
    @JsonProperty("detail")
    public void setDetail(List<ProductDetail> detail) {
        this.detail = detail;
    }

    public Product withDetail(List<ProductDetail> detail) {
        this.detail = detail;
        return this;
    }

    /**
     * 创建时间
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
     * 创建时间
     * (Required)
     * 
     * @param creationTime
     *     The creationTime
     */
    @JsonProperty("creationTime")
    public void setCreationTime(String creationTime) {
        this.creationTime = creationTime;
    }

    public Product withCreationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    /**
     * 修改时间
     * 
     * @return
     *     The modifyTime
     */
    @JsonProperty("modifyTime")
    public String getModifyTime() {
        return modifyTime;
    }

    /**
     * 修改时间
     * 
     * @param modifyTime
     *     The modifyTime
     */
    @JsonProperty("modifyTime")
    public void setModifyTime(String modifyTime) {
        this.modifyTime = modifyTime;
    }

    public Product withModifyTime(String modifyTime) {
        this.modifyTime = modifyTime;
        return this;
    }

    /**
     * 状态
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
     * 状态
     * (Required)
     * 
     * @param status
     *     The status
     */
    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    public Product withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 分类ID
     * 
     * @return
     *     The categoryId
     */
    @JsonProperty("categoryId")
    public String getCategoryId() {
        return categoryId;
    }

    /**
     * 分类ID
     * 
     * @param categoryId
     *     The categoryId
     */
    @JsonProperty("categoryId")
    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public Product withCategoryId(String categoryId) {
        this.categoryId = categoryId;
        return this;
    }

    /**
     * 标签ID列表
     * 
     * @return
     *     The tagIds
     */
    @JsonProperty("tagIds")
    public List<String> getTagIds() {
        return tagIds;
    }

    /**
     * 标签ID列表
     * 
     * @param tagIds
     *     The tagIds
     */
    @JsonProperty("tagIds")
    public void setTagIds(List<String> tagIds) {
        this.tagIds = tagIds;
    }

    public Product withTagIds(List<String> tagIds) {
        this.tagIds = tagIds;
        return this;
    }

    /**
     * 创建人ID
     * (Required)
     * 
     * @return
     *     The creatorId
     */
    @JsonProperty("creatorId")
    public String getCreatorId() {
        return creatorId;
    }

    /**
     * 创建人ID
     * (Required)
     * 
     * @param creatorId
     *     The creatorId
     */
    @JsonProperty("creatorId")
    public void setCreatorId(String creatorId) {
        this.creatorId = creatorId;
    }

    public Product withCreatorId(String creatorId) {
        this.creatorId = creatorId;
        return this;
    }

    /**
     * 上线时间
     * 
     * @return
     *     The onlineTime
     */
    @JsonProperty("onlineTime")
    public String getOnlineTime() {
        return onlineTime;
    }

    /**
     * 上线时间
     * 
     * @param onlineTime
     *     The onlineTime
     */
    @JsonProperty("onlineTime")
    public void setOnlineTime(String onlineTime) {
        this.onlineTime = onlineTime;
    }

    public Product withOnlineTime(String onlineTime) {
        this.onlineTime = onlineTime;
        return this;
    }

    /**
     * 下线时间
     * 
     * @return
     *     The offlineTime
     */
    @JsonProperty("offlineTime")
    public String getOfflineTime() {
        return offlineTime;
    }

    /**
     * 下线时间
     * 
     * @param offlineTime
     *     The offlineTime
     */
    @JsonProperty("offlineTime")
    public void setOfflineTime(String offlineTime) {
        this.offlineTime = offlineTime;
    }

    public Product withOfflineTime(String offlineTime) {
        this.offlineTime = offlineTime;
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

    public Product withSupplierId(String supplierId) {
        this.supplierId = supplierId;
        return this;
    }

    /**
     * 附件信息
     * 
     * @return
     *     The attachmentIds
     */
    @JsonProperty("attachmentIds")
    public List<String> getAttachmentIds() {
        return attachmentIds;
    }

    /**
     * 附件信息
     * 
     * @param attachmentIds
     *     The attachmentIds
     */
    @JsonProperty("attachmentIds")
    public void setAttachmentIds(List<String> attachmentIds) {
        this.attachmentIds = attachmentIds;
    }

    public Product withAttachmentIds(List<String> attachmentIds) {
        this.attachmentIds = attachmentIds;
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

    public Product withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
