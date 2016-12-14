
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
    "title",
    "contentDetail"
})
public class Content {

    /**
     * 
     */
    @JsonProperty("title")
    private String title;
    @JsonProperty("contentDetail")
    @Valid
    private List<ContentDetail> contentDetail = new ArrayList<ContentDetail>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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
     *     The contentDetail
     */
    @JsonProperty("contentDetail")
    public List<ContentDetail> getContentDetail() {
        return contentDetail;
    }

    /**
     * 
     * @param contentDetail
     *     The contentDetail
     */
    @JsonProperty("contentDetail")
    public void setContentDetail(List<ContentDetail> contentDetail) {
        this.contentDetail = contentDetail;
    }

    public Content withContentDetail(List<ContentDetail> contentDetail) {
        this.contentDetail = contentDetail;
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
