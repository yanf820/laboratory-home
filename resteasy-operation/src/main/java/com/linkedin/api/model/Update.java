
package com.linkedin.api.model;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import javax.validation.Valid;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "updateObjectId",
    "result",
    "updateTime"
})
public class Update {

    /**
     * 
     */
    @JsonProperty("updateObjectId")
    private Long updateObjectId;
    @JsonProperty("result")
    @Valid
    private Result result;
    /**
     * 
     */
    @JsonProperty("updateTime")
    private String updateTime;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The updateObjectId
     */
    @JsonProperty("updateObjectId")
    public Long getUpdateObjectId() {
        return updateObjectId;
    }

    /**
     * 
     * @param updateObjectId
     *     The updateObjectId
     */
    @JsonProperty("updateObjectId")
    public void setUpdateObjectId(Long updateObjectId) {
        this.updateObjectId = updateObjectId;
    }

    public Update withUpdateObjectId(Long updateObjectId) {
        this.updateObjectId = updateObjectId;
        return this;
    }

    /**
     * 
     * @return
     *     The result
     */
    @JsonProperty("result")
    public Result getResult() {
        return result;
    }

    /**
     * 
     * @param result
     *     The result
     */
    @JsonProperty("result")
    public void setResult(Result result) {
        this.result = result;
    }

    public Update withResult(Result result) {
        this.result = result;
        return this;
    }

    /**
     * 
     * @return
     *     The updateTime
     */
    @JsonProperty("updateTime")
    public String getUpdateTime() {
        return updateTime;
    }

    /**
     * 
     * @param updateTime
     *     The updateTime
     */
    @JsonProperty("updateTime")
    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public Update withUpdateTime(String updateTime) {
        this.updateTime = updateTime;
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

    public Update withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
