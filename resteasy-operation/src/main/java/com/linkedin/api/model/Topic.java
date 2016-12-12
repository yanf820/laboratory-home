
package com.linkedin.api.model;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "address",
    "phoneNumber"
})
public class Topic {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("address")
    @Valid
    @NotNull
    private Address address;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("phoneNumber")
    @Valid
    @NotNull
    private List<PhoneNumber> phoneNumber = new ArrayList<PhoneNumber>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * (Required)
     * 
     * @return
     *     The address
     */
    @JsonProperty("address")
    public Address getAddress() {
        return address;
    }

    /**
     * 
     * (Required)
     * 
     * @param address
     *     The address
     */
    @JsonProperty("address")
    public void setAddress(Address address) {
        this.address = address;
    }

    public Topic withAddress(Address address) {
        this.address = address;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The phoneNumber
     */
    @JsonProperty("phoneNumber")
    public List<PhoneNumber> getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * 
     * (Required)
     * 
     * @param phoneNumber
     *     The phoneNumber
     */
    @JsonProperty("phoneNumber")
    public void setPhoneNumber(List<PhoneNumber> phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Topic withPhoneNumber(List<PhoneNumber> phoneNumber) {
        this.phoneNumber = phoneNumber;
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

    public Topic withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
