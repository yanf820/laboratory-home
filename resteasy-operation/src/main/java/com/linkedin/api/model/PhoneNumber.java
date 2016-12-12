
package com.linkedin.api.model;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import javax.validation.constraints.NotNull;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "location",
    "code"
})
public class PhoneNumber {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("location")
    @NotNull
    private String location;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("code")
    @NotNull
    private Long code;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * (Required)
     * 
     * @return
     *     The location
     */
    @JsonProperty("location")
    public String getLocation() {
        return location;
    }

    /**
     * 
     * (Required)
     * 
     * @param location
     *     The location
     */
    @JsonProperty("location")
    public void setLocation(String location) {
        this.location = location;
    }

    public PhoneNumber withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The code
     */
    @JsonProperty("code")
    public Long getCode() {
        return code;
    }

    /**
     * 
     * (Required)
     * 
     * @param code
     *     The code
     */
    @JsonProperty("code")
    public void setCode(Long code) {
        this.code = code;
    }

    public PhoneNumber withCode(Long code) {
        this.code = code;
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

    public PhoneNumber withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
