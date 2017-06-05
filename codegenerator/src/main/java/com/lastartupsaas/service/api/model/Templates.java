
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
 * 模板集合
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Entity
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "templates"
})
public class Templates {

    /**
     * 模板集合
     * (Required)
     * 
     */
    @NotNull
    @JsonProperty("templates")
    @Reference
    @Valid
    private List<Template> templates = new ArrayList<Template>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 模板集合
     * (Required)
     * 
     * @return
     *     The templates
     */
    @JsonProperty("templates")
    public List<Template> getTemplates() {
        return templates;
    }

    /**
     * 模板集合
     * (Required)
     * 
     * @param templates
     *     The templates
     */
    @JsonProperty("templates")
    public void setTemplates(List<Template> templates) {
        this.templates = templates;
    }

    public Templates withTemplates(List<Template> templates) {
        this.templates = templates;
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

    public Templates withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
