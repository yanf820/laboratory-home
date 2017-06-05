
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
 * 任务定义对象
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
    "desc",
    "status",
    "creationTime",
    "modifyTime",
    "completeTime",
    "assignee",
    "action"
})
public class Task {

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
     * 中文名称
     * 
     */
    @JsonProperty("title")
    private String title;
    /**
     * 描述
     * 
     */
    @JsonProperty("desc")
    private String desc;
    /**
     * 状态
     * (Required)
     * 
     */
    @NotNull
    @JsonProperty("status")
    private String status;
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
     * 完成时间
     * 
     */
    @JsonProperty("completeTime")
    private String completeTime;
    /**
     * 任务执行者ID
     * (Required)
     * 
     */
    @NotNull
    @JsonProperty("assignee")
    private String assignee;
    /**
     * 动作
     * 
     */
    @JsonProperty("action")
    private String action;
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

    public Task withId(String id) {
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

    public Task withType(String type) {
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

    public Task withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 中文名称
     * 
     * @return
     *     The title
     */
    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    /**
     * 中文名称
     * 
     * @param title
     *     The title
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    public Task withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * 描述
     * 
     * @return
     *     The desc
     */
    @JsonProperty("desc")
    public String getDesc() {
        return desc;
    }

    /**
     * 描述
     * 
     * @param desc
     *     The desc
     */
    @JsonProperty("desc")
    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Task withDesc(String desc) {
        this.desc = desc;
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

    public Task withStatus(String status) {
        this.status = status;
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

    public Task withCreationTime(String creationTime) {
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

    public Task withModifyTime(String modifyTime) {
        this.modifyTime = modifyTime;
        return this;
    }

    /**
     * 完成时间
     * 
     * @return
     *     The completeTime
     */
    @JsonProperty("completeTime")
    public String getCompleteTime() {
        return completeTime;
    }

    /**
     * 完成时间
     * 
     * @param completeTime
     *     The completeTime
     */
    @JsonProperty("completeTime")
    public void setCompleteTime(String completeTime) {
        this.completeTime = completeTime;
    }

    public Task withCompleteTime(String completeTime) {
        this.completeTime = completeTime;
        return this;
    }

    /**
     * 任务执行者ID
     * (Required)
     * 
     * @return
     *     The assignee
     */
    @JsonProperty("assignee")
    public String getAssignee() {
        return assignee;
    }

    /**
     * 任务执行者ID
     * (Required)
     * 
     * @param assignee
     *     The assignee
     */
    @JsonProperty("assignee")
    public void setAssignee(String assignee) {
        this.assignee = assignee;
    }

    public Task withAssignee(String assignee) {
        this.assignee = assignee;
        return this;
    }

    /**
     * 动作
     * 
     * @return
     *     The action
     */
    @JsonProperty("action")
    public String getAction() {
        return action;
    }

    /**
     * 动作
     * 
     * @param action
     *     The action
     */
    @JsonProperty("action")
    public void setAction(String action) {
        this.action = action;
    }

    public Task withAction(String action) {
        this.action = action;
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

    public Task withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
