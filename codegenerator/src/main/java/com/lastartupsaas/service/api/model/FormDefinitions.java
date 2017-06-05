
package com.lastartupsaas.service.api.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Reference;


/**
 * 表单集合对象
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Entity
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "forms"
})
public class FormDefinitions {

    /**
     * 表单集合
     * 
     */
    @JsonProperty("forms")
    @Reference
    @Valid
    private List<FormDefinition> forms = new ArrayList<FormDefinition>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 表单集合
     * 
     * @return
     *     The forms
     */
    @JsonProperty("forms")
    public List<FormDefinition> getForms() {
        return forms;
    }

    /**
     * 表单集合
     * 
     * @param forms
     *     The forms
     */
    @JsonProperty("forms")
    public void setForms(List<FormDefinition> forms) {
        this.forms = forms;
    }

    public FormDefinitions withForms(List<FormDefinition> forms) {
        this.forms = forms;
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

    public FormDefinitions withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
