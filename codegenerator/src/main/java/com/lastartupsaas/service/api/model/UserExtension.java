
package com.lastartupsaas.service.api.model;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import org.mongodb.morphia.annotations.Entity;


/**
 * 扩展字段
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Entity
@Generated("org.jsonschema2pojo")
public class UserExtension {

    @JsonIgnore
    private Map<String, String> additionalProperties = new HashMap<String, String>();

    @JsonAnyGetter
    public Map<String, String> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, String value) {
        this.additionalProperties.put(name, value);
    }

    public UserExtension withAdditionalProperty(String name, String value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
