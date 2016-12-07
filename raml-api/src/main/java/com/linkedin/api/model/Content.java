
package com.linkedin.api.model;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "submitted-url",
    "title",
    "description",
    "submitted\u2010image-url"
})
public class Content {

    /**
     * 
     */
    @JsonProperty("submitted-url")
    private String submittedUrl;
    /**
     * 
     */
    @JsonProperty("title")
    private String title;
    /**
     * 
     */
    @JsonProperty("description")
    private String description;
    /**
     * 
     */
    @JsonProperty("submitted\u2010image-url")
    private String submittedImageUrl;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The submittedUrl
     */
    @JsonProperty("submitted-url")
    public String getSubmittedUrl() {
        return submittedUrl;
    }

    /**
     * 
     * @param submittedUrl
     *     The submitted-url
     */
    @JsonProperty("submitted-url")
    public void setSubmittedUrl(String submittedUrl) {
        this.submittedUrl = submittedUrl;
    }

    public Content withSubmittedUrl(String submittedUrl) {
        this.submittedUrl = submittedUrl;
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

    public Content withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * 
     * @return
     *     The description
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * 
     * @param description
     *     The description
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    public Content withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 
     * @return
     *     The submittedImageUrl
     */
    @JsonProperty("submitted\u2010image-url")
    public String getSubmittedImageUrl() {
        return submittedImageUrl;
    }

    /**
     * 
     * @param submittedImageUrl
     *     The submitted‐image-url
     */
    @JsonProperty("submitted\u2010image-url")
    public void setSubmittedImageUrl(String submittedImageUrl) {
        this.submittedImageUrl = submittedImageUrl;
    }

    public Content withSubmittedImageUrl(String submittedImageUrl) {
        this.submittedImageUrl = submittedImageUrl;
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

    public Content withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
