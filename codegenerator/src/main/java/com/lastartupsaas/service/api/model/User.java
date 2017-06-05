
package com.lastartupsaas.service.api.model;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;
import org.mongodb.morphia.annotations.Embedded;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;


/**
 * 用户schema
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Entity
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "id",
    "type",
    "profile",
    "status",
    "creationTime",
    "modifyTime",
    "cancellationTime",
    "extension"
})
public class User {

    /**
     * 用户ID
     * 
     */
    @JsonProperty("id")
    @Id
    private String id;
    /**
     * 类型（游客、商家、会员、管理员）
     * (Required)
     * 
     */
    @NotNull
    @JsonProperty("type")
    @Embedded
    private User.Type type;
    /**
     * 个人信息
     * (Required)
     * 
     */
    @NotNull
    @JsonProperty("profile")
    @Embedded
    @Valid
    private UserProfile profile;
    /**
     * 用户状态
     * (Required)
     * 
     */
    @NotNull
    @JsonProperty("status")
    @Embedded
    private User.Status status;
    /**
     * 注册时间
     * 
     */
    @JsonProperty("creationTime")
    private String creationTime;
    /**
     * 修改时间
     * 
     */
    @JsonProperty("modifyTime")
    private String modifyTime;
    /**
     * 注销时间
     * 
     */
    @JsonProperty("cancellationTime")
    private String cancellationTime;
    /**
     * 扩展字段
     * 
     */
    @JsonProperty("extension")
    @Embedded
    @Valid
    private UserExtension extension;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 用户ID
     * 
     * @return
     *     The id
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * 用户ID
     * 
     * @param id
     *     The id
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public User withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 类型（游客、商家、会员、管理员）
     * (Required)
     * 
     * @return
     *     The type
     */
    @JsonProperty("type")
    public User.Type getType() {
        return type;
    }

    /**
     * 类型（游客、商家、会员、管理员）
     * (Required)
     * 
     * @param type
     *     The type
     */
    @JsonProperty("type")
    public void setType(User.Type type) {
        this.type = type;
    }

    public User withType(User.Type type) {
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
    public UserProfile getProfile() {
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
    public void setProfile(UserProfile profile) {
        this.profile = profile;
    }

    public User withProfile(UserProfile profile) {
        this.profile = profile;
        return this;
    }

    /**
     * 用户状态
     * (Required)
     * 
     * @return
     *     The status
     */
    @JsonProperty("status")
    public User.Status getStatus() {
        return status;
    }

    /**
     * 用户状态
     * (Required)
     * 
     * @param status
     *     The status
     */
    @JsonProperty("status")
    public void setStatus(User.Status status) {
        this.status = status;
    }

    public User withStatus(User.Status status) {
        this.status = status;
        return this;
    }

    /**
     * 注册时间
     * 
     * @return
     *     The creationTime
     */
    @JsonProperty("creationTime")
    public String getCreationTime() {
        return creationTime;
    }

    /**
     * 注册时间
     * 
     * @param creationTime
     *     The creationTime
     */
    @JsonProperty("creationTime")
    public void setCreationTime(String creationTime) {
        this.creationTime = creationTime;
    }

    public User withCreationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    /**
     * 修改时间
     * 
     * @return
     *     The modifyTime
     */
    @JsonProperty("modifyTime")
    public String getModifyTime() {
        return modifyTime;
    }

    /**
     * 修改时间
     * 
     * @param modifyTime
     *     The modifyTime
     */
    @JsonProperty("modifyTime")
    public void setModifyTime(String modifyTime) {
        this.modifyTime = modifyTime;
    }

    public User withModifyTime(String modifyTime) {
        this.modifyTime = modifyTime;
        return this;
    }

    /**
     * 注销时间
     * 
     * @return
     *     The cancellationTime
     */
    @JsonProperty("cancellationTime")
    public String getCancellationTime() {
        return cancellationTime;
    }

    /**
     * 注销时间
     * 
     * @param cancellationTime
     *     The cancellationTime
     */
    @JsonProperty("cancellationTime")
    public void setCancellationTime(String cancellationTime) {
        this.cancellationTime = cancellationTime;
    }

    public User withCancellationTime(String cancellationTime) {
        this.cancellationTime = cancellationTime;
        return this;
    }

    /**
     * 扩展字段
     * 
     * @return
     *     The extension
     */
    @JsonProperty("extension")
    public UserExtension getExtension() {
        return extension;
    }

    /**
     * 扩展字段
     * 
     * @param extension
     *     The extension
     */
    @JsonProperty("extension")
    public void setExtension(UserExtension extension) {
        this.extension = extension;
    }

    public User withExtension(UserExtension extension) {
        this.extension = extension;
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

    public User withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Generated("org.jsonschema2pojo")
    public static enum Status {

        free("free"),
        registered("registered"),
        cancelled("cancelled"),
        authenticated("authenticated");
        private final String value;
        private final static Map<String, User.Status> CONSTANTS = new HashMap<String, User.Status>();

        static {
            for (User.Status c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private Status(String value) {
            this.value = value;
        }

        @JsonValue
        @Override
        public String toString() {
            return this.value;
        }

        @JsonCreator
        public static User.Status fromValue(String value) {
            User.Status constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    @Generated("org.jsonschema2pojo")
    public static enum Type {

        tourist("tourist"),
        supplier("supplier"),
        member("member"),
        manager("manager");
        private final String value;
        private final static Map<String, User.Type> CONSTANTS = new HashMap<String, User.Type>();

        static {
            for (User.Type c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private Type(String value) {
            this.value = value;
        }

        @JsonValue
        @Override
        public String toString() {
            return this.value;
        }

        @JsonCreator
        public static User.Type fromValue(String value) {
            User.Type constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
