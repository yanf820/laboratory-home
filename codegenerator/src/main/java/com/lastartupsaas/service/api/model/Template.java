
package com.lastartupsaas.service.api.model;

import java.util.HashMap;
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
 * 模板
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Entity
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "id",
    "templateType",
    "channelId",
    "value",
    "status"
})
public class Template {

    /**
     * ID
     * 
     */
    @JsonProperty("id")
    @Id
    private String id;
    /**
     * 业务类型
     * (Required)
     * 
     */
    @NotNull
    @JsonProperty("templateType")
    private String templateType;
    /**
     * 通道ID
     * 
     */
    @JsonProperty("channelId")
    private String channelId;
    /**
     * 值
     * (Required)
     * 
     */
    @NotNull
    @JsonProperty("value")
    @Embedded
    @Valid
    private Value value;
    /**
     * 状态
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

    public Template withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 业务类型
     * (Required)
     * 
     * @return
     *     The templateType
     */
    @JsonProperty("templateType")
    public String getTemplateType() {
        return templateType;
    }

    /**
     * 业务类型
     * (Required)
     * 
     * @param templateType
     *     The templateType
     */
    @JsonProperty("templateType")
    public void setTemplateType(String templateType) {
        this.templateType = templateType;
    }

    public Template withTemplateType(String templateType) {
        this.templateType = templateType;
        return this;
    }

    /**
     * 通道ID
     * 
     * @return
     *     The channelId
     */
    @JsonProperty("channelId")
    public String getChannelId() {
        return channelId;
    }

    /**
     * 通道ID
     * 
     * @param channelId
     *     The channelId
     */
    @JsonProperty("channelId")
    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

    public Template withChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }

    /**
     * 值
     * (Required)
     * 
     * @return
     *     The value
     */
    @JsonProperty("value")
    public Value getValue() {
        return value;
    }

    /**
     * 值
     * (Required)
     * 
     * @param value
     *     The value
     */
    @JsonProperty("value")
    public void setValue(Value value) {
        this.value = value;
    }

    public Template withValue(Value value) {
        this.value = value;
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

    public Template withStatus(String status) {
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

    public Template withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
