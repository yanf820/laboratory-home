
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
 * 个人信息
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Entity
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "headImg",
    "nickName",
    "email",
    "phone"
})
public class UserProfile {

    /**
     * 头像
     * 
     */
    @JsonProperty("headImg")
    private String headImg;
    /**
     * 昵称
     * (Required)
     * 
     */
    @NotNull
    @JsonProperty("nickName")
    private String nickName;
    /**
     * 邮箱
     * 
     */
    @JsonProperty("email")
    private String email;
    /**
     * 手机号
     * 
     */
    @JsonProperty("phone")
    private String phone;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 头像
     * 
     * @return
     *     The headImg
     */
    @JsonProperty("headImg")
    public String getHeadImg() {
        return headImg;
    }

    /**
     * 头像
     * 
     * @param headImg
     *     The headImg
     */
    @JsonProperty("headImg")
    public void setHeadImg(String headImg) {
        this.headImg = headImg;
    }

    public UserProfile withHeadImg(String headImg) {
        this.headImg = headImg;
        return this;
    }

    /**
     * 昵称
     * (Required)
     * 
     * @return
     *     The nickName
     */
    @JsonProperty("nickName")
    public String getNickName() {
        return nickName;
    }

    /**
     * 昵称
     * (Required)
     * 
     * @param nickName
     *     The nickName
     */
    @JsonProperty("nickName")
    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public UserProfile withNickName(String nickName) {
        this.nickName = nickName;
        return this;
    }

    /**
     * 邮箱
     * 
     * @return
     *     The email
     */
    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    /**
     * 邮箱
     * 
     * @param email
     *     The email
     */
    @JsonProperty("email")
    public void setEmail(String email) {
        this.email = email;
    }

    public UserProfile withEmail(String email) {
        this.email = email;
        return this;
    }

    /**
     * 手机号
     * 
     * @return
     *     The phone
     */
    @JsonProperty("phone")
    public String getPhone() {
        return phone;
    }

    /**
     * 手机号
     * 
     * @param phone
     *     The phone
     */
    @JsonProperty("phone")
    public void setPhone(String phone) {
        this.phone = phone;
    }

    public UserProfile withPhone(String phone) {
        this.phone = phone;
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

    public UserProfile withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
