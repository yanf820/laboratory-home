
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
 * 产品集合schema
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Entity
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "products"
})
public class Products {

    /**
     * 产品集合
     * (Required)
     * 
     */
    @NotNull
    @JsonProperty("products")
    @Reference
    @Valid
    private List<Product> products = new ArrayList<Product>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 产品集合
     * (Required)
     * 
     * @return
     *     The products
     */
    @JsonProperty("products")
    public List<Product> getProducts() {
        return products;
    }

    /**
     * 产品集合
     * (Required)
     * 
     * @param products
     *     The products
     */
    @JsonProperty("products")
    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public Products withProducts(List<Product> products) {
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

    public Products withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
