
package com.linkedin.api.model;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "contentText",
    "contentImage"
})
public class ContentDetail {

    /**
     * 
     */
    @JsonProperty("contentText")
    private String contentText;
    /**
     * 
     */
    @JsonProperty("contentImage")
    private String contentImage;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The contentText
     */
    @JsonProperty("contentText")
    public String getContentText() {
        return contentText;
    }

    /**
     * 
     * @param contentText
     *     The contentText
     */
    @JsonProperty("contentText")
    public void setContentText(String contentText) {
        this.contentText = contentText;
    }

    public ContentDetail withContentText(String contentText) {
        this.contentText = contentText;
        return this;
    }

    /**
     * 
     * @return
     *     The contentImage
     */
    @JsonProperty("contentImage")
    public String getContentImage() {
        return contentImage;
    }

    /**
     * 
     * @param contentImage
     *     The contentImage
     */
    @JsonProperty("contentImage")
    public void setContentImage(String contentImage) {
        this.contentImage = contentImage;
    }

    public ContentDetail withContentImage(String contentImage) {
        this.contentImage = contentImage;
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

    public ContentDetail withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
