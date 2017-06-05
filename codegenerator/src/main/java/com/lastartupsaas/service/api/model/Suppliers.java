
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
 * 供应商集合
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Entity
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "suppliers"
})
public class Suppliers {

    /**
     * 供应商集合
     * (Required)
     * 
     */
    @NotNull
    @JsonProperty("suppliers")
    @Reference
    @Valid
    private List<Supplier> suppliers = new ArrayList<Supplier>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 供应商集合
     * (Required)
     * 
     * @return
     *     The suppliers
     */
    @JsonProperty("suppliers")
    public List<Supplier> getSuppliers() {
        return suppliers;
    }

    /**
     * 供应商集合
     * (Required)
     * 
     * @param suppliers
     *     The suppliers
     */
    @JsonProperty("suppliers")
    public void setSuppliers(List<Supplier> suppliers) {
        this.suppliers = suppliers;
    }

    public Suppliers withSuppliers(List<Supplier> suppliers) {
        this.suppliers = suppliers;
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

    public Suppliers withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
