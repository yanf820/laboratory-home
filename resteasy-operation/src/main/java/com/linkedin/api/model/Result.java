
package com.linkedin.api.model;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "updateResultEnum"
})
public class Result {

    @JsonProperty("updateResultEnum")
    private UpdateResultEnum updateResultEnum;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *
     * @return
     *     The updateResultEnum
     */
    @JsonProperty("updateResultEnum")
    public UpdateResultEnum getUpdateResultEnum() {
        return updateResultEnum;
    }

    /**
     *
     * @param updateResultEnum
     *     The updateResultEnum
     */
    @JsonProperty("updateResultEnum")
    public void setUpdateResultEnum(UpdateResultEnum updateResultEnum) {
        this.updateResultEnum = updateResultEnum;
    }

    public Result withUpdateResultEnum(UpdateResultEnum updateResultEnum) {
        this.updateResultEnum = updateResultEnum;
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

    public Result withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Generated("org.jsonschema2pojo")
    public static enum UpdateResultEnum {

        TRUE("true"),
        FALSE("false");
        private final String value;
        private final static Map<String, UpdateResultEnum> CONSTANTS = new HashMap<String, UpdateResultEnum>();

        static {
            for (UpdateResultEnum c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private UpdateResultEnum(String value) {
            this.value = value;
        }

        @JsonValue
        @Override
        public String toString() {
            return this.value;
        }

        @JsonCreator
        public static UpdateResultEnum fromValue(String value) {
            UpdateResultEnum constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
