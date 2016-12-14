
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
    "id",
    "content",
    "reviewer",
    "postId",
    "reviewId"
})
public class Review {

    /**
     * 
     */
    @JsonProperty("id")
    private Long id;
    /**
     * 
     */
    @JsonProperty("content")
    private String content;
    /**
     * 
     * (Required)
     * 
     */
    @NotNull
    @JsonProperty("reviewer")
    @Valid
    private Reviewer reviewer;
    /**
     * 
     */
    @JsonProperty("postId")
    private Long postId;
    /**
     * 
     */
    @JsonProperty("reviewId")
    private Long reviewId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The id
     */
    @JsonProperty("id")
    public Long getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    @JsonProperty("id")
    public void setId(Long id) {
        this.id = id;
    }

    public Review withId(Long id) {
        this.id = id;
        return this;
    }

    /**
     * 
     * @return
     *     The content
     */
    @JsonProperty("content")
    public String getContent() {
        return content;
    }

    /**
     * 
     * @param content
     *     The content
     */
    @JsonProperty("content")
    public void setContent(String content) {
        this.content = content;
    }

    public Review withContent(String content) {
        this.content = content;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The reviewer
     */
    @JsonProperty("reviewer")
    public Reviewer getReviewer() {
        return reviewer;
    }

    /**
     * 
     * (Required)
     * 
     * @param reviewer
     *     The reviewer
     */
    @JsonProperty("reviewer")
    public void setReviewer(Reviewer reviewer) {
        this.reviewer = reviewer;
    }

    public Review withReviewer(Reviewer reviewer) {
        this.reviewer = reviewer;
        return this;
    }

    /**
     * 
     * @return
     *     The postId
     */
    @JsonProperty("postId")
    public Long getPostId() {
        return postId;
    }

    /**
     * 
     * @param postId
     *     The postId
     */
    @JsonProperty("postId")
    public void setPostId(Long postId) {
        this.postId = postId;
    }

    public Review withPostId(Long postId) {
        this.postId = postId;
        return this;
    }

    /**
     * 
     * @return
     *     The reviewId
     */
    @JsonProperty("reviewId")
    public Long getReviewId() {
        return reviewId;
    }

    /**
     * 
     * @param reviewId
     *     The reviewId
     */
    @JsonProperty("reviewId")
    public void setReviewId(Long reviewId) {
        this.reviewId = reviewId;
    }

    public Review withReviewId(Long reviewId) {
        this.reviewId = reviewId;
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

    public Review withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
