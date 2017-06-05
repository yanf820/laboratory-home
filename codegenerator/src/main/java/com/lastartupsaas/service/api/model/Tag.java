
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
 * 标签
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Entity
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "id",
    "value",
    "type",
    "img",
    "status",
    "creationTime"
})
public class Tag {

    /**
     * 标签ID
     * 
     */
    @JsonProperty("id")
    @Id
    private String id;
    /**
     * 
     * (Required)
     * 
     */
    @NotNull
    @JsonProperty("value")
    private String value;
    /**
     * 标签类型
     * (Required)
     * 
     */
    @NotNull
    @JsonProperty("type")
    private String type;
    /**
     * 标签图片地址
     * 
     */
    @JsonProperty("img")
    private String img;
    /**
     * 标签状态
     * (Required)
     * 
     */
    @NotNull
    @JsonProperty("status")
    private String status;
    /**
     * 标签创建时间
     * (Required)
     * 
     */
    @NotNull
    @JsonProperty("creationTime")
    private String creationTime;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 标签ID
     * 
     * @return
     *     The id
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * 标签ID
     * 
     * @param id
     *     The id
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public Tag withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The value
     */
    @JsonProperty("value")
    public String getValue() {
        return value;
    }

    /**
     * 
     * (Required)
     * 
     * @param value
     *     The value
     */
    @JsonProperty("value")
    public void setValue(String value) {
        this.value = value;
    }

    public Tag withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * 标签类型
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
     * 标签类型
     * (Required)
     * 
     * @param type
     *     The type
     */
    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    public Tag withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 标签图片地址
     * 
     * @return
     *     The img
     */
    @JsonProperty("img")
    public String getImg() {
        return img;
    }

    /**
     * 标签图片地址
     * 
     * @param img
     *     The img
     */
    @JsonProperty("img")
    public void setImg(String img) {
        this.img = img;
    }

    public Tag withImg(String img) {
        this.img = img;
        return this;
    }

    /**
     * 标签状态
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
     * 标签状态
     * (Required)
     * 
     * @param status
     *     The status
     */
    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    public Tag withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 标签创建时间
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
     * 标签创建时间
     * (Required)
     * 
     * @param creationTime
     *     The creationTime
     */
    @JsonProperty("creationTime")
    public void setCreationTime(String creationTime) {
        this.creationTime = creationTime;
    }

    public Tag withCreationTime(String creationTime) {
        this.creationTime = creationTime;
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

    public Tag withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
