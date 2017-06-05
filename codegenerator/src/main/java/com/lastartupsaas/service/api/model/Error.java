
package com.lastartupsaas.service.api.model;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.mongodb.morphia.annotations.Entity;


/**
 * 错误，请求错误时返回
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Entity
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "errorCode",
    "message",
    "status",
    "timestamp"
})
public class Error {

    /**
     * 错误码
     * (Required)
     * 
     */
    @NotNull
    @JsonProperty("errorCode")
    private String errorCode;
    /**
     * 错误信息
     * (Required)
     * 
     */
    @NotNull
    @JsonProperty("message")
    private String message;
    /**
     * 状态码
     * (Required)
     * 
     */
    @NotNull
    @JsonProperty("status")
    private Long status;
    /**
     * 时间戳
     * (Required)
     * 
     */
    @NotNull
    @JsonProperty("timestamp")
    private String timestamp;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 错误码
     * (Required)
     * 
     * @return
     *     The errorCode
     */
    @JsonProperty("errorCode")
    public String getErrorCode() {
        return errorCode;
    }

    /**
     * 错误码
     * (Required)
     * 
     * @param errorCode
     *     The errorCode
     */
    @JsonProperty("errorCode")
    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public Error withErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    /**
     * 错误信息
     * (Required)
     * 
     * @return
     *     The message
     */
    @JsonProperty("message")
    public String getMessage() {
        return message;
    }

    /**
     * 错误信息
     * (Required)
     * 
     * @param message
     *     The message
     */
    @JsonProperty("message")
    public void setMessage(String message) {
        this.message = message;
    }

    public Error withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * 状态码
     * (Required)
     * 
     * @return
     *     The status
     */
    @JsonProperty("status")
    public Long getStatus() {
        return status;
    }

    /**
     * 状态码
     * (Required)
     * 
     * @param status
     *     The status
     */
    @JsonProperty("status")
    public void setStatus(Long status) {
        this.status = status;
    }

    public Error withStatus(Long status) {
        this.status = status;
        return this;
    }

    /**
     * 时间戳
     * (Required)
     * 
     * @return
     *     The timestamp
     */
    @JsonProperty("timestamp")
    public String getTimestamp() {
        return timestamp;
    }

    /**
     * 时间戳
     * (Required)
     * 
     * @param timestamp
     *     The timestamp
     */
    @JsonProperty("timestamp")
    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public Error withTimestamp(String timestamp) {
        this.timestamp = timestamp;
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

    public Error withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
