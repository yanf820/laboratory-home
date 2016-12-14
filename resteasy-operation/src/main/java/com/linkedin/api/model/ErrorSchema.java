
package com.linkedin.api.model;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;


/**
 * 错误，请求错误时返回
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "errorCode",
    "message",
    "requestId",
    "status",
    "timestamp"
})
public class ErrorSchema {

    /**
     * 错误码
     * 
     */
    @JsonProperty("errorCode")
    private Double errorCode;
    /**
     * 错误信息
     * 
     */
    @JsonProperty("message")
    private String message;
    /**
     * 请求ID
     * 
     */
    @JsonProperty("requestId")
    private String requestId;
    /**
     * 状态码
     * 
     */
    @JsonProperty("status")
    private Double status;
    /**
     * 时间戳
     * 
     */
    @JsonProperty("timestamp")
    private Double timestamp;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 错误码
     * 
     * @return
     *     The errorCode
     */
    @JsonProperty("errorCode")
    public Double getErrorCode() {
        return errorCode;
    }

    /**
     * 错误码
     * 
     * @param errorCode
     *     The errorCode
     */
    @JsonProperty("errorCode")
    public void setErrorCode(Double errorCode) {
        this.errorCode = errorCode;
    }

    public ErrorSchema withErrorCode(Double errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    /**
     * 错误信息
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
     * 
     * @param message
     *     The message
     */
    @JsonProperty("message")
    public void setMessage(String message) {
        this.message = message;
    }

    public ErrorSchema withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * 请求ID
     * 
     * @return
     *     The requestId
     */
    @JsonProperty("requestId")
    public String getRequestId() {
        return requestId;
    }

    /**
     * 请求ID
     * 
     * @param requestId
     *     The requestId
     */
    @JsonProperty("requestId")
    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public ErrorSchema withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * 状态码
     * 
     * @return
     *     The status
     */
    @JsonProperty("status")
    public Double getStatus() {
        return status;
    }

    /**
     * 状态码
     * 
     * @param status
     *     The status
     */
    @JsonProperty("status")
    public void setStatus(Double status) {
        this.status = status;
    }

    public ErrorSchema withStatus(Double status) {
        this.status = status;
        return this;
    }

    /**
     * 时间戳
     * 
     * @return
     *     The timestamp
     */
    @JsonProperty("timestamp")
    public Double getTimestamp() {
        return timestamp;
    }

    /**
     * 时间戳
     * 
     * @param timestamp
     *     The timestamp
     */
    @JsonProperty("timestamp")
    public void setTimestamp(Double timestamp) {
        this.timestamp = timestamp;
    }

    public ErrorSchema withTimestamp(Double timestamp) {
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

    public ErrorSchema withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
