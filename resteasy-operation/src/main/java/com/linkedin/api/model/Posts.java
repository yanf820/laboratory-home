
package com.linkedin.api.model;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import javax.validation.Valid;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "posts",
    "totalResult"
})
public class Posts {

    @JsonProperty("posts")
    @Valid
    private List<Post> posts = new ArrayList<Post>();
    /**
     * 
     */
    @JsonProperty("totalResult")
    private Long totalResult;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The posts
     */
    @JsonProperty("posts")
    public List<Post> getPosts() {
        return posts;
    }

    /**
     * 
     * @param posts
     *     The posts
     */
    @JsonProperty("posts")
    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }

    public Posts withPosts(List<Post> posts) {
        this.posts = posts;
        return this;
    }

    /**
     * 
     * @return
     *     The totalResult
     */
    @JsonProperty("totalResult")
    public Long getTotalResult() {
        return totalResult;
    }

    /**
     * 
     * @param totalResult
     *     The totalResult
     */
    @JsonProperty("totalResult")
    public void setTotalResult(Long totalResult) {
        this.totalResult = totalResult;
    }

    public Posts withTotalResult(Long totalResult) {
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

    public Posts withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
