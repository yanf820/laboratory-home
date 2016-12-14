
package com.linkedin.api.model;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "postId",
    "action",
    "operator",
    "operateTime"
})
public class LikeUpdate {

    /**
     * 
     */
    @JsonProperty("postId")
    private Long postId;
    @JsonProperty("action")
    @Valid
    private Action action;
    /**
     *
     * (Required)
     *
     */
    @NotNull
    @JsonProperty("operator")
    @Valid
    private Like operator;
    /**
     *
     */
    @JsonProperty("operateTime")
    private String operateTime;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *
     * @return
     *     The postId
     */
    @JsonProperty("postId")
    public Long getPostId() {
        return postId;
    }

    /**
     *
     * @param postId
     *     The postId
     */
    @JsonProperty("postId")
    public void setPostId(Long postId) {
        this.postId = postId;
    }

    public LikeUpdate withPostId(Long postId) {
        this.postId = postId;
        return this;
    }

    /**
     *
     * @return
     *     The action
     */
    @JsonProperty("action")
    public Action getAction() {
        return action;
    }

    /**
     *
     * @param action
     *     The action
     */
    @JsonProperty("action")
    public void setAction(Action action) {
        this.action = action;
    }

    public LikeUpdate withAction(Action action) {
        this.action = action;
        return this;
    }

    /**
     *
     * (Required)
     *
     * @return
     *     The operator
     */
    @JsonProperty("operator")
    public Like getOperator() {
        return operator;
    }

    /**
     *
     * (Required)
     *
     * @param operator
     *     The operator
     */
    @JsonProperty("operator")
    public void setOperator(Like operator) {
        this.operator = operator;
    }

    public LikeUpdate withOperator(Like operator) {
        this.operator = operator;
        return this;
    }

    /**
     *
     * @return
     *     The operateTime
     */
    @JsonProperty("operateTime")
    public String getOperateTime() {
        return operateTime;
    }

    /**
     *
     * @param operateTime
     *     The operateTime
     */
    @JsonProperty("operateTime")
    public void setOperateTime(String operateTime) {
        this.operateTime = operateTime;
    }

    public LikeUpdate withOperateTime(String operateTime) {
        this.operateTime = operateTime;
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

    public LikeUpdate withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Generated("org.jsonschema2pojo")
    public static enum Action {

        LIKE("like"),
        UNLIKE("unlike");
        private final String value;
        private final static Map<String, Action> CONSTANTS = new HashMap<String, Action>();

        static {
            for (Action c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private Action(String value) {
            this.value = value;
        }

        @JsonValue
        @Override
        public String toString() {
            return this.value;
        }

        @JsonCreator
        public static Action fromValue(String value) {
            Action constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
