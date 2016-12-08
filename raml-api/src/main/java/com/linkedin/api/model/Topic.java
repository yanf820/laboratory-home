
package com.linkedin.api.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "title",
    "image",
    "desc",
    "status",
    "publisher",
    "tags",
    "funs",
    "posters"
})
public class Topic {

    /**
     * 
     */
    @JsonProperty("id")
    private String id;
    /**
     * 
     */
    @JsonProperty("title")
    private String title;
    /**
     * 
     */
    @JsonProperty("image")
    private String image;
    @JsonProperty("desc")
    private String desc;
    /**
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
    @JsonProperty("publisher")
    @Valid
    private Publisher publisher;
    /**
     * 
     */
    @JsonProperty("tags")
    private String tags;
    @JsonProperty("funs")
    @Valid
    private List<Fun> funs = new ArrayList<Fun>();
    @JsonProperty("posters")
    @Valid
    private List<Poster> posters = new ArrayList<Poster>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The id
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public Topic withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 
     * @return
     *     The title
     */
    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    /**
     * 
     * @param title
     *     The title
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    public Topic withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * 
     * @return
     *     The image
     */
    @JsonProperty("image")
    public String getImage() {
        return image;
    }

    /**
     * 
     * @param image
     *     The image
     */
    @JsonProperty("image")
    public void setImage(String image) {
        this.image = image;
    }

    public Topic withImage(String image) {
        this.image = image;
        return this;
    }

    /**
     * 
     * @return
     *     The desc
     */
    @JsonProperty("desc")
    public String getDesc() {
        return desc;
    }

    /**
     * 
     * @param desc
     *     The desc
     */
    @JsonProperty("desc")
    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Topic withDesc(String desc) {
        this.desc = desc;
        return this;
    }

    /**
     * 
     * @return
     *     The status
     */
    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    /**
     * 
     * @param status
     *     The status
     */
    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    public Topic withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The publisher
     */
    @JsonProperty("publisher")
    public Publisher getPublisher() {
        return publisher;
    }

    /**
     * 
     * (Required)
     * 
     * @param publisher
     *     The publisher
     */
    @JsonProperty("publisher")
    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    public Topic withPublisher(Publisher publisher) {
        this.publisher = publisher;
        return this;
    }

    /**
     * 
     * @return
     *     The tags
     */
    @JsonProperty("tags")
    public String getTags() {
        return tags;
    }

    /**
     * 
     * @param tags
     *     The tags
     */
    @JsonProperty("tags")
    public void setTags(String tags) {
        this.tags = tags;
    }

    public Topic withTags(String tags) {
        this.tags = tags;
        return this;
    }

    /**
     * 
     * @return
     *     The funs
     */
    @JsonProperty("funs")
    public List<Fun> getFuns() {
        return funs;
    }

    /**
     * 
     * @param funs
     *     The funs
     */
    @JsonProperty("funs")
    public void setFuns(List<Fun> funs) {
        this.funs = funs;
    }

    public Topic withFuns(List<Fun> funs) {
        this.funs = funs;
        return this;
    }

    /**
     * 
     * @return
     *     The posters
     */
    @JsonProperty("posters")
    public List<Poster> getPosters() {
        return posters;
    }

    /**
     * 
     * @param posters
     *     The posters
     */
    @JsonProperty("posters")
    public void setPosters(List<Poster> posters) {
        this.posters = posters;
    }

    public Topic withPosters(List<Poster> posters) {
        this.posters = posters;
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

    public Topic withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
