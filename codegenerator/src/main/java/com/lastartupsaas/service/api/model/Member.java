
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
import org.mongodb.morphia.annotations.Embedded;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;


/**
 * 会员
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Entity
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "id",
    "type",
    "profile",
    "authentications",
    "status"
})
public class Member {

    /**
     * ID
     * 
     */
    @JsonProperty("id")
    @Id
    private String id;
    /**
     * 类型
     * (Required)
     * 
     */
    @NotNull
    @JsonProperty("type")
    private String type;
    /**
     * 个人信息
     * (Required)
     * 
     */
    @NotNull
    @JsonProperty("profile")
    @Embedded
    @Valid
    private MemberProfile profile;
    /**
     * 认证信息
     * 
     */
    @JsonProperty("authentications")
    @Embedded
    @Valid
    private List<MemberAuthentication> authentications = new ArrayList<MemberAuthentication>();
    /**
     * 会员状态
     * (Required)
     * 
     */
    @NotNull
    @JsonProperty("status")
    private String status;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * ID
     * 
     * @return
     *     The id
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * ID
     * 
     * @param id
     *     The id
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public Member withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 类型
     * (Required)
     * 
     * @return
     *     The type
     */
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    /**
     * 类型
     * (Required)
     * 
     * @param type
     *     The type
     */
    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    public Member withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 个人信息
     * (Required)
     * 
     * @return
     *     The profile
     */
    @JsonProperty("profile")
    public MemberProfile getProfile() {
        return profile;
    }

    /**
     * 个人信息
     * (Required)
     * 
     * @param profile
     *     The profile
     */
    @JsonProperty("profile")
    public void setProfile(MemberProfile profile) {
        this.profile = profile;
    }

    public Member withProfile(MemberProfile profile) {
        this.profile = profile;
        return this;
    }

    /**
     * 认证信息
     * 
     * @return
     *     The authentications
     */
    @JsonProperty("authentications")
    public List<MemberAuthentication> getAuthentications() {
        return authentications;
    }

    /**
     * 认证信息
     * 
     * @param authentications
     *     The authentications
     */
    @JsonProperty("authentications")
    public void setAuthentications(List<MemberAuthentication> authentications) {
        this.authentications = authentications;
    }

    public Member withAuthentications(List<MemberAuthentication> authentications) {
        this.authentications = authentications;
        return this;
    }

    /**
     * 会员状态
     * (Required)
     * 
     * @return
     *     The status
     */
    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    /**
     * 会员状态
     * (Required)
     * 
     * @param status
     *     The status
     */
    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    public Member withStatus(String status) {
        this.status = status;
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

    public Member withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
