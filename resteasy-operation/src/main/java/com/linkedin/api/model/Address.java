
package com.linkedin.api.model;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import javax.validation.constraints.NotNull;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "streetAddress",
    "city"
})
public class Address {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("streetAddress")
    @NotNull
    private String streetAddress;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("city")
    @NotNull
    private String city;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * (Required)
     * 
     * @return
     *     The streetAddress
     */
    @JsonProperty("streetAddress")
    public String getStreetAddress() {
        return streetAddress;
    }

    /**
     * 
     * (Required)
     * 
     * @param streetAddress
     *     The streetAddress
     */
    @JsonProperty("streetAddress")
    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public Address withStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The city
     */
    @JsonProperty("city")
    public String getCity() {
        return city;
    }

    /**
     * 
     * (Required)
     * 
     * @param city
     *     The city
     */
    @JsonProperty("city")
    public void setCity(String city) {
        this.city = city;
    }

    public Address withCity(String city) {
        this.city = city;
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

    public Address withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
