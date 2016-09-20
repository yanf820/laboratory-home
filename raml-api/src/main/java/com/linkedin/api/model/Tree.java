
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
    "root",
    "leaf",
    "fruit"
})
public class Tree {

    @JsonProperty("root")
    private String root;
    @JsonProperty("leaf")
    private String leaf;
    @JsonProperty("fruit")
    private String fruit;
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
     *     The fruit
     */
    @JsonProperty("fruit")
    public String getFruit() {
        return fruit;
    }

    /**
     * 
     * @param fruit
     *     The fruit
     */
    @JsonProperty("fruit")
    public void setFruit(String fruit) {
        this.fruit = fruit;
    }

    public Tree withFruit(String fruit) {
        this.fruit = fruit;
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
