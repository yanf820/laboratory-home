
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
 * 供应商schema
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Entity
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "id",
    "name",
    "title",
    "desc",
    "status",
    "sMembersId"
})
public class Supplier {

    /**
     * 供应商ID
     * 
     */
    @JsonProperty("id")
    @Id
    private String id;
    /**
     * 供应商名称
     * (Required)
     * 
     */
    @NotNull
    @JsonProperty("name")
    private String name;
    /**
     * 供应商中文名称
     * 
     */
    @JsonProperty("title")
    private String title;
    /**
     * 供应商描述
     * 
     */
    @JsonProperty("desc")
    private String desc;
    /**
     * 供应商状态
     * (Required)
     * 
     */
    @NotNull
    @JsonProperty("status")
    private String status;
    /**
     * 供应商管理员ID
     * 
     */
    @JsonProperty("sMembersId")
    private String sMembersId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 供应商ID
     * 
     * @return
     *     The id
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * 供应商ID
     * 
     * @param id
     *     The id
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public Supplier withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 供应商名称
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
     * 供应商名称
     * (Required)
     * 
     * @param name
     *     The name
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public Supplier withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 供应商中文名称
     * 
     * @return
     *     The title
     */
    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    /**
     * 供应商中文名称
     * 
     * @param title
     *     The title
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    public Supplier withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * 供应商描述
     * 
     * @return
     *     The desc
     */
    @JsonProperty("desc")
    public String getDesc() {
        return desc;
    }

    /**
     * 供应商描述
     * 
     * @param desc
     *     The desc
     */
    @JsonProperty("desc")
    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Supplier withDesc(String desc) {
        this.desc = desc;
        return this;
    }

    /**
     * 供应商状态
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
     * 供应商状态
     * (Required)
     * 
     * @param status
     *     The status
     */
    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    public Supplier withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 供应商管理员ID
     * 
     * @return
     *     The sMembersId
     */
    @JsonProperty("sMembersId")
    public String getSMembersId() {
        return sMembersId;
    }

    /**
     * 供应商管理员ID
     * 
     * @param sMembersId
     *     The sMembersId
     */
    @JsonProperty("sMembersId")
    public void setSMembersId(String sMembersId) {
        this.sMembersId = sMembersId;
    }

    public Supplier withSMembersId(String sMembersId) {
        this.sMembersId = sMembersId;
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

    public Supplier withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
