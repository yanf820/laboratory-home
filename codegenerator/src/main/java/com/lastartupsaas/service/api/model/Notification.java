
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
 * 通知
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Entity
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "id",
    "type",
    "templateId",
    "status"
})
public class Notification {

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
     * 关联模板ID
     * (Required)
     * 
     */
    @NotNull
    @JsonProperty("templateId")
    private String templateId;
    /**
     * 通知状态
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

    public Notification withId(String id) {
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

    public Notification withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 关联模板ID
     * (Required)
     * 
     * @return
     *     The templateId
     */
    @JsonProperty("templateId")
    public String getTemplateId() {
        return templateId;
    }

    /**
     * 关联模板ID
     * (Required)
     * 
     * @param templateId
     *     The templateId
     */
    @JsonProperty("templateId")
    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    public Notification withTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }

    /**
     * 通知状态
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
     * 通知状态
     * (Required)
     * 
     * @param status
     *     The status
     */
    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    public Notification withStatus(String status) {
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

    public Notification withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
