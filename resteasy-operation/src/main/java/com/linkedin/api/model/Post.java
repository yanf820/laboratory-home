
package com.linkedin.api.model;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "id",
    "createTime",
    "status",
    "content",
    "poster",
    "topic",
    "review",
    "likes"
})
public class Post {

    /**
     * ID
     * 
     */
    @JsonProperty("id")
    private String id;
    /**
     * 创建时间
     * 
     */
    @JsonProperty("createTime")
    private String createTime;
    /**
     * 当前状态
     * 
     */
    @JsonProperty("status")
    private String status;
    /**
     * 
     * (Required)
     * 
     */
    @NotNull
    @JsonProperty("content")
    @Valid
    private Content content;
    /**
     * 
     * (Required)
     * 
     */
    @NotNull
    @JsonProperty("poster")
    @Valid
    private Poster poster;
    /**
     * 
     * (Required)
     * 
     */
    @NotNull
    @JsonProperty("topic")
    @Valid
    private Topic topic;
    /**
     * 评论集合
     * 
     */
    @JsonProperty("review")
    @Valid
    private List<Review> review = new ArrayList<Review>();
    /**
     * 点赞集合
     * 
     */
    @JsonProperty("likes")
    @Valid
    private List<Like> likes = new ArrayList<Like>();
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

    public Post withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 创建时间
     * 
     * @return
     *     The createTime
     */
    @JsonProperty("createTime")
    public String getCreateTime() {
        return createTime;
    }

    /**
     * 创建时间
     * 
     * @param createTime
     *     The createTime
     */
    @JsonProperty("createTime")
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public Post withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 当前状态
     * 
     * @return
     *     The status
     */
    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    /**
     * 当前状态
     * 
     * @param status
     *     The status
     */
    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    public Post withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The content
     */
    @JsonProperty("content")
    public Content getContent() {
        return content;
    }

    /**
     * 
     * (Required)
     * 
     * @param content
     *     The content
     */
    @JsonProperty("content")
    public void setContent(Content content) {
        this.content = content;
    }

    public Post withContent(Content content) {
        this.content = content;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The poster
     */
    @JsonProperty("poster")
    public Poster getPoster() {
        return poster;
    }

    /**
     * 
     * (Required)
     * 
     * @param poster
     *     The poster
     */
    @JsonProperty("poster")
    public void setPoster(Poster poster) {
        this.poster = poster;
    }

    public Post withPoster(Poster poster) {
        this.poster = poster;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The topic
     */
    @JsonProperty("topic")
    public Topic getTopic() {
        return topic;
    }

    /**
     * 
     * (Required)
     * 
     * @param topic
     *     The topic
     */
    @JsonProperty("topic")
    public void setTopic(Topic topic) {
        this.topic = topic;
    }

    public Post withTopic(Topic topic) {
        this.topic = topic;
        return this;
    }

    /**
     * 评论集合
     * 
     * @return
     *     The review
     */
    @JsonProperty("review")
    public List<Review> getReview() {
        return review;
    }

    /**
     * 评论集合
     * 
     * @param review
     *     The review
     */
    @JsonProperty("review")
    public void setReview(List<Review> review) {
        this.review = review;
    }

    public Post withReview(List<Review> review) {
        this.review = review;
        return this;
    }

    /**
     * 点赞集合
     * 
     * @return
     *     The likes
     */
    @JsonProperty("likes")
    public List<Like> getLikes() {
        return likes;
    }

    /**
     * 点赞集合
     * 
     * @param likes
     *     The likes
     */
    @JsonProperty("likes")
    public void setLikes(List<Like> likes) {
        this.likes = likes;
    }

    public Post withLikes(List<Like> likes) {
        this.likes = likes;
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

    public Post withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
