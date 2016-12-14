
package com.linkedin.api.model;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "topicId",
    "follower",
    "followType",
    "followTime"
})
public class Follow {

    /**
     * 
     */
    @JsonProperty("topicId")
    private Long topicId;
    /**
     * 
     * (Required)
     * 
     */
    @NotNull
    @JsonProperty("follower")
    @Valid
    private Fan follower;
    /**
     * 
     */
    @JsonProperty("followType")
    private String followType;
    /**
     * 
     */
    @JsonProperty("followTime")
    private String followTime;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The topicId
     */
    @JsonProperty("topicId")
    public Long getTopicId() {
        return topicId;
    }

    /**
     * 
     * @param topicId
     *     The topicId
     */
    @JsonProperty("topicId")
    public void setTopicId(Long topicId) {
        this.topicId = topicId;
    }

    public Follow withTopicId(Long topicId) {
        this.topicId = topicId;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The follower
     */
    @JsonProperty("follower")
    public Fan getFollower() {
        return follower;
    }

    /**
     * 
     * (Required)
     * 
     * @param follower
     *     The follower
     */
    @JsonProperty("follower")
    public void setFollower(Fan follower) {
        this.follower = follower;
    }

    public Follow withFollower(Fan follower) {
        this.follower = follower;
        return this;
    }

    /**
     * 
     * @return
     *     The followType
     */
    @JsonProperty("followType")
    public String getFollowType() {
        return followType;
    }

    /**
     * 
     * @param followType
     *     The followType
     */
    @JsonProperty("followType")
    public void setFollowType(String followType) {
        this.followType = followType;
    }

    public Follow withFollowType(String followType) {
        this.followType = followType;
        return this;
    }

    /**
     * 
     * @return
     *     The followTime
     */
    @JsonProperty("followTime")
    public String getFollowTime() {
        return followTime;
    }

    /**
     * 
     * @param followTime
     *     The followTime
     */
    @JsonProperty("followTime")
    public void setFollowTime(String followTime) {
        this.followTime = followTime;
    }

    public Follow withFollowTime(String followTime) {
        this.followTime = followTime;
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

    public Follow withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
