
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
 * 关系schema
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Entity
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "id",
    "type",
    "relationTime",
    "sourceId",
    "sourceType",
    "targetId",
    "targetType"
})
public class Relation {

    /**
     * 关系ID
     * 
     */
    @JsonProperty("id")
    @Id
    private String id;
    /**
     * 关系类型
     * (Required)
     * 
     */
    @NotNull
    @JsonProperty("type")
    private String type;
    /**
     * 产生关系时间
     * (Required)
     * 
     */
    @NotNull
    @JsonProperty("relationTime")
    private String relationTime;
    /**
     * 关系源ID
     * (Required)
     * 
     */
    @NotNull
    @JsonProperty("sourceId")
    private String sourceId;
    /**
     * 关系源类型
     * (Required)
     * 
     */
    @NotNull
    @JsonProperty("sourceType")
    private String sourceType;
    /**
     * 关系目标ID
     * (Required)
     * 
     */
    @NotNull
    @JsonProperty("targetId")
    private String targetId;
    /**
     * 关系目标类型
     * (Required)
     * 
     */
    @NotNull
    @JsonProperty("targetType")
    private String targetType;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 关系ID
     * 
     * @return
     *     The id
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * 关系ID
     * 
     * @param id
     *     The id
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public Relation withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 关系类型
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
     * 关系类型
     * (Required)
     * 
     * @param type
     *     The type
     */
    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    public Relation withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 产生关系时间
     * (Required)
     * 
     * @return
     *     The relationTime
     */
    @JsonProperty("relationTime")
    public String getRelationTime() {
        return relationTime;
    }

    /**
     * 产生关系时间
     * (Required)
     * 
     * @param relationTime
     *     The relationTime
     */
    @JsonProperty("relationTime")
    public void setRelationTime(String relationTime) {
        this.relationTime = relationTime;
    }

    public Relation withRelationTime(String relationTime) {
        this.relationTime = relationTime;
        return this;
    }

    /**
     * 关系源ID
     * (Required)
     * 
     * @return
     *     The sourceId
     */
    @JsonProperty("sourceId")
    public String getSourceId() {
        return sourceId;
    }

    /**
     * 关系源ID
     * (Required)
     * 
     * @param sourceId
     *     The sourceId
     */
    @JsonProperty("sourceId")
    public void setSourceId(String sourceId) {
        this.sourceId = sourceId;
    }

    public Relation withSourceId(String sourceId) {
        this.sourceId = sourceId;
        return this;
    }

    /**
     * 关系源类型
     * (Required)
     * 
     * @return
     *     The sourceType
     */
    @JsonProperty("sourceType")
    public String getSourceType() {
        return sourceType;
    }

    /**
     * 关系源类型
     * (Required)
     * 
     * @param sourceType
     *     The sourceType
     */
    @JsonProperty("sourceType")
    public void setSourceType(String sourceType) {
        this.sourceType = sourceType;
    }

    public Relation withSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }

    /**
     * 关系目标ID
     * (Required)
     * 
     * @return
     *     The targetId
     */
    @JsonProperty("targetId")
    public String getTargetId() {
        return targetId;
    }

    /**
     * 关系目标ID
     * (Required)
     * 
     * @param targetId
     *     The targetId
     */
    @JsonProperty("targetId")
    public void setTargetId(String targetId) {
        this.targetId = targetId;
    }

    public Relation withTargetId(String targetId) {
        this.targetId = targetId;
        return this;
    }

    /**
     * 关系目标类型
     * (Required)
     * 
     * @return
     *     The targetType
     */
    @JsonProperty("targetType")
    public String getTargetType() {
        return targetType;
    }

    /**
     * 关系目标类型
     * (Required)
     * 
     * @param targetType
     *     The targetType
     */
    @JsonProperty("targetType")
    public void setTargetType(String targetType) {
        this.targetType = targetType;
    }

    public Relation withTargetType(String targetType) {
        this.targetType = targetType;
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

    public Relation withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
