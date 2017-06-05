
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
 * 流程对象
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
    "steps",
    "graphId",
    "businessId"
})
public class Flow {

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
     * 流程步骤ID集合
     * (Required)
     * 
     */
    @NotNull
    @JsonProperty("steps")
    @Embedded
    @Valid
    private List<String> steps = new ArrayList<String>();
    /**
     * 流程图ID
     * (Required)
     * 
     */
    @NotNull
    @JsonProperty("graphId")
    private String graphId;
    /**
     * 关联业务对象ID
     * (Required)
     * 
     */
    @NotNull
    @JsonProperty("businessId")
    private String businessId;
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

    public Flow withId(String id) {
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

    public Flow withType(String type) {
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

    public Flow withName(String name) {
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

    public Flow withTitle(String title) {
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

    public Flow withDesc(String desc) {
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

    public Flow withStatus(String status) {
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

    public Flow withCreationTime(String creationTime) {
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

    public Flow withModifyTime(String modifyTime) {
        this.modifyTime = modifyTime;
        return this;
    }

    /**
     * 流程步骤ID集合
     * (Required)
     * 
     * @return
     *     The steps
     */
    @JsonProperty("steps")
    public List<String> getSteps() {
        return steps;
    }

    /**
     * 流程步骤ID集合
     * (Required)
     * 
     * @param steps
     *     The steps
     */
    @JsonProperty("steps")
    public void setSteps(List<String> steps) {
        this.steps = steps;
    }

    public Flow withSteps(List<String> steps) {
        this.steps = steps;
        return this;
    }

    /**
     * 流程图ID
     * (Required)
     * 
     * @return
     *     The graphId
     */
    @JsonProperty("graphId")
    public String getGraphId() {
        return graphId;
    }

    /**
     * 流程图ID
     * (Required)
     * 
     * @param graphId
     *     The graphId
     */
    @JsonProperty("graphId")
    public void setGraphId(String graphId) {
        this.graphId = graphId;
    }

    public Flow withGraphId(String graphId) {
        this.graphId = graphId;
        return this;
    }

    /**
     * 关联业务对象ID
     * (Required)
     * 
     * @return
     *     The businessId
     */
    @JsonProperty("businessId")
    public String getBusinessId() {
        return businessId;
    }

    /**
     * 关联业务对象ID
     * (Required)
     * 
     * @param businessId
     *     The businessId
     */
    @JsonProperty("businessId")
    public void setBusinessId(String businessId) {
        this.businessId = businessId;
    }

    public Flow withBusinessId(String businessId) {
        this.businessId = businessId;
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

    public Flow withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
