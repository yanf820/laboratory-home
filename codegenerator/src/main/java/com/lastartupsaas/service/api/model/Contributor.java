
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


/**
 * 创建者
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Entity
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "contributorId",
    "type",
    "source"
})
public class Contributor {

    /**
     * contributorId
     * (Required)
     * 
     */
    @NotNull
    @JsonProperty("contributorId")
    private String contributorId;
    /**
     * type
     * (Required)
     * 
     */
    @NotNull
    @JsonProperty("type")
    private String type;
    /**
     * 创建者来源
     * (Required)
     * 
     */
    @NotNull
    @JsonProperty("source")
    private String source;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * contributorId
     * (Required)
     * 
     * @return
     *     The contributorId
     */
    @JsonProperty("contributorId")
    public String getContributorId() {
        return contributorId;
    }

    /**
     * contributorId
     * (Required)
     * 
     * @param contributorId
     *     The contributorId
     */
    @JsonProperty("contributorId")
    public void setContributorId(String contributorId) {
        this.contributorId = contributorId;
    }

    public Contributor withContributorId(String contributorId) {
        this.contributorId = contributorId;
        return this;
    }

    /**
     * type
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
     * type
     * (Required)
     * 
     * @param type
     *     The type
     */
    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    public Contributor withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 创建者来源
     * (Required)
     * 
     * @return
     *     The source
     */
    @JsonProperty("source")
    public String getSource() {
        return source;
    }

    /**
     * 创建者来源
     * (Required)
     * 
     * @param source
     *     The source
     */
    @JsonProperty("source")
    public void setSource(String source) {
        this.source = source;
    }

    public Contributor withSource(String source) {
        this.source = source;
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

    public Contributor withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
