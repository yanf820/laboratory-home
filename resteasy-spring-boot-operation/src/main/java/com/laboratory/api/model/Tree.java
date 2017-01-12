
package com.laboratory.api.model;

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
    "root",
    "leaf",
    "apiContact"
})
public class Tree {

    @JsonProperty("root")
    private String root;
    @JsonProperty("leaf")
    private String leaf;
    @JsonProperty("apiContact")
    @Valid
    private List<ApiContact> apiContact = new ArrayList<ApiContact>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The root
     */
    @JsonProperty("root")
    public String getRoot() {
        return root;
    }

    /**
     * 
     * @param root
     *     The root
     */
    @JsonProperty("root")
    public void setRoot(String root) {
        this.root = root;
    }

    public Tree withRoot(String root) {
        this.root = root;
        return this;
    }

    /**
     * 
     * @return
     *     The leaf
     */
    @JsonProperty("leaf")
    public String getLeaf() {
        return leaf;
    }

    /**
     * 
     * @param leaf
     *     The leaf
     */
    @JsonProperty("leaf")
    public void setLeaf(String leaf) {
        this.leaf = leaf;
    }

    public Tree withLeaf(String leaf) {
        this.leaf = leaf;
        return this;
    }

    /**
     * 
     * @return
     *     The apiContact
     */
    @JsonProperty("apiContact")
    public List<ApiContact> getApiContact() {
        return apiContact;
    }

    /**
     * 
     * @param apiContact
     *     The apiContact
     */
    @JsonProperty("apiContact")
    public void setApiContact(List<ApiContact> apiContact) {
        this.apiContact = apiContact;
    }

    public Tree withApiContact(List<ApiContact> apiContact) {
        this.apiContact = apiContact;
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

    public Tree withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
