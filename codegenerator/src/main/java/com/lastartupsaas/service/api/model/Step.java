
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


/**
 * 流程定义对象
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Entity
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "code",
    "type",
    "name",
    "title",
    "desc",
    "status",
    "creationTime",
    "taskIds",
    "nextStepCode",
    "previousCode"
})
public class Step {

    /**
     * ID
     * 
     */
    @JsonProperty("code")
    private String code;
    /**
     * 标记当前step下任务的关系,例如要求全部任务都完成，还是单一任务完成
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
     * 步骤关联的taskID
     * (Required)
     * 
     */
    @NotNull
    @JsonProperty("taskIds")
    @Embedded
    @Valid
    private List<String> taskIds = new ArrayList<String>();
    /**
     * 下一步步骤code
     * (Required)
     * 
     */
    @NotNull
    @JsonProperty("nextStepCode")
    private String nextStepCode;
    /**
     * 上一步步骤code
     * (Required)
     * 
     */
    @NotNull
    @JsonProperty("previousCode")
    private String previousCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * ID
     * 
     * @return
     *     The code
     */
    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    /**
     * ID
     * 
     * @param code
     *     The code
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    public Step withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * 标记当前step下任务的关系,例如要求全部任务都完成，还是单一任务完成
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
     * 标记当前step下任务的关系,例如要求全部任务都完成，还是单一任务完成
     * (Required)
     * 
     * @param type
     *     The type
     */
    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    public Step withType(String type) {
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

    public Step withName(String name) {
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

    public Step withTitle(String title) {
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

    public Step withDesc(String desc) {
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

    public Step withStatus(String status) {
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

    public Step withCreationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    /**
     * 步骤关联的taskID
     * (Required)
     * 
     * @return
     *     The taskIds
     */
    @JsonProperty("taskIds")
    public List<String> getTaskIds() {
        return taskIds;
    }

    /**
     * 步骤关联的taskID
     * (Required)
     * 
     * @param taskIds
     *     The taskIds
     */
    @JsonProperty("taskIds")
    public void setTaskIds(List<String> taskIds) {
        this.taskIds = taskIds;
    }

    public Step withTaskIds(List<String> taskIds) {
        this.taskIds = taskIds;
        return this;
    }

    /**
     * 下一步步骤code
     * (Required)
     * 
     * @return
     *     The nextStepCode
     */
    @JsonProperty("nextStepCode")
    public String getNextStepCode() {
        return nextStepCode;
    }

    /**
     * 下一步步骤code
     * (Required)
     * 
     * @param nextStepCode
     *     The nextStepCode
     */
    @JsonProperty("nextStepCode")
    public void setNextStepCode(String nextStepCode) {
        this.nextStepCode = nextStepCode;
    }

    public Step withNextStepCode(String nextStepCode) {
        this.nextStepCode = nextStepCode;
        return this;
    }

    /**
     * 上一步步骤code
     * (Required)
     * 
     * @return
     *     The previousCode
     */
    @JsonProperty("previousCode")
    public String getPreviousCode() {
        return previousCode;
    }

    /**
     * 上一步步骤code
     * (Required)
     * 
     * @param previousCode
     *     The previousCode
     */
    @JsonProperty("previousCode")
    public void setPreviousCode(String previousCode) {
        this.previousCode = previousCode;
    }

    public Step withPreviousCode(String previousCode) {
        this.previousCode = previousCode;
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

    public Step withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
