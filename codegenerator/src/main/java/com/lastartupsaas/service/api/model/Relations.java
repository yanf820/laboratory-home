
package com.lastartupsaas.service.api.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Reference;


/**
 * 关系集合schema
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Entity
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "products"
})
public class Relations {

    /**
     * 关系集合
     * (Required)
     * 
     */
    @NotNull
    @JsonProperty("products")
    @Reference
    @Valid
    private List<Relation> products = new ArrayList<Relation>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 关系集合
     * (Required)
     * 
     * @return
     *     The products
     */
    @JsonProperty("products")
    public List<Relation> getProducts() {
        return products;
    }

    /**
     * 关系集合
     * (Required)
     * 
     * @param products
     *     The products
     */
    @JsonProperty("products")
    public void setProducts(List<Relation> products) {
        this.products = products;
    }

    public Relations withProducts(List<Relation> products) {
        this.products = products;
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

    public Relations withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
