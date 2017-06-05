
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
 * 分类schema
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Entity
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "id",
    "type",
    "title",
    "name",
    "parentId",
    "status"
})
public class Category {

    /**
     * 分类ID
     * 
     */
    @JsonProperty("id")
    @Id
    private String id;
    /**
     * 分类类型
     * (Required)
     * 
     */
    @NotNull
    @JsonProperty("type")
    private String type;
    /**
     * 分类标题
     * (Required)
     * 
     */
    @NotNull
    @JsonProperty("title")
    private String title;
    /**
     * 分类名称
     * (Required)
     * 
     */
    @NotNull
    @JsonProperty("name")
    private String name;
    /**
     * 父分类ID
     * 
     */
    @JsonProperty("parentId")
    private String parentId;
    /**
     * 分类状态
     * (Required)
     * 
     */
    @NotNull
    @JsonProperty("status")
    private String status;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 分类ID
     * 
     * @return
     *     The id
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * 分类ID
     * 
     * @param id
     *     The id
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public Category withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 分类类型
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
     * 分类类型
     * (Required)
     * 
     * @param type
     *     The type
     */
    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    public Category withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 分类标题
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
     * 分类标题
     * (Required)
     * 
     * @param title
     *     The title
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    public Category withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * 分类名称
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
     * 分类名称
     * (Required)
     * 
     * @param name
     *     The name
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public Category withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 父分类ID
     * 
     * @return
     *     The parentId
     */
    @JsonProperty("parentId")
    public String getParentId() {
        return parentId;
    }

    /**
     * 父分类ID
     * 
     * @param parentId
     *     The parentId
     */
    @JsonProperty("parentId")
    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public Category withParentId(String parentId) {
        this.parentId = parentId;
        return this;
    }

    /**
     * 分类状态
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
     * 分类状态
     * (Required)
     * 
     * @param status
     *     The status
     */
    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    public Category withStatus(String status) {
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

    public Category withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
