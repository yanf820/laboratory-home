
package com.linkedin.api.model;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import javax.validation.Valid;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * 主题集合
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "topics",
    "totalResult"
})
public class Topics {

    /**
     * 集合
     * 
     */
    @JsonProperty("topics")
    @Valid
    private List<Topic> topics = new ArrayList<Topic>();
    /**
     * 主题数量
     * 
     */
    @JsonProperty("totalResult")
    private Long totalResult;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 集合
     * 
     * @return
     *     The topics
     */
    @JsonProperty("topics")
    public List<Topic> getTopics() {
        return topics;
    }

    /**
     * 集合
     * 
     * @param topics
     *     The topics
     */
    @JsonProperty("topics")
    public void setTopics(List<Topic> topics) {
        this.topics = topics;
    }

    public Topics withTopics(List<Topic> topics) {
        this.topics = topics;
        return this;
    }

    /**
     * 主题数量
     * 
     * @return
     *     The totalResult
     */
    @JsonProperty("totalResult")
    public Long getTotalResult() {
        return totalResult;
    }

    /**
     * 主题数量
     * 
     * @param totalResult
     *     The totalResult
     */
    @JsonProperty("totalResult")
    public void setTotalResult(Long totalResult) {
        this.totalResult = totalResult;
    }

    public Topics withTotalResult(Long totalResult) {
        this.totalResult = totalResult;
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

    public Topics withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
