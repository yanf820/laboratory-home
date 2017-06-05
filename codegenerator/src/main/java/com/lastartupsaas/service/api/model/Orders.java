
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
 * 订单集合schema
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Entity
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "orders"
})
public class Orders {

    /**
     * 订单集合
     * (Required)
     * 
     */
    @NotNull
    @JsonProperty("orders")
    @Reference
    @Valid
    private List<Order> orders = new ArrayList<Order>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 订单集合
     * (Required)
     * 
     * @return
     *     The orders
     */
    @JsonProperty("orders")
    public List<Order> getOrders() {
        return orders;
    }

    /**
     * 订单集合
     * (Required)
     * 
     * @param orders
     *     The orders
     */
    @JsonProperty("orders")
    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    public Orders withOrders(List<Order> orders) {
        this.orders = orders;
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

    public Orders withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
