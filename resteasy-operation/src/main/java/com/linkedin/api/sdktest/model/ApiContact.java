
package com.linkedin.api.sdktest.model;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * A single apiContact
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "id",
    "name",
    "emails"
})
public class ApiContact {

    /**
     * 
     * (Required)
     * 
     */
    @NotNull
    @JsonProperty("id")
    private String id;
    /**
     * 
     * (Required)
     * 
     */
    @NotNull
    @JsonProperty("name")
    private String name;
    @JsonProperty("emails")
    @Valid
    private List<Object> emails = new ArrayList<Object>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * (Required)
     * 
     * @return
     *     The id
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * 
     * (Required)
     * 
     * @param id
     *     The id
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public ApiContact withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The name
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * 
     * (Required)
     * 
     * @param name
     *     The name
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public ApiContact withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 
     * @return
     *     The emails
     */
    @JsonProperty("emails")
    public List<Object> getEmails() {
        return emails;
    }

    /**
     * 
     * @param emails
     *     The emails
     */
    @JsonProperty("emails")
    public void setEmails(List<Object> emails) {
        this.emails = emails;
    }

    public ApiContact withEmails(List<Object> emails) {
        this.emails = emails;
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

    public ApiContact withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
