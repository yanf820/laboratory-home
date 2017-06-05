
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
 * 内容
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Entity
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "id",
    "type",
    "contentValue",
    "contributor",
    "creationTime",
    "publishedTime",
    "modifyTime",
    "status",
    "extension"
})
public class Content {

    /**
     * id
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
    @Embedded
    private Content.Type type;
    /**
     * 内容值
     * (Required)
     * 
     */
    @NotNull
    @JsonProperty("contentValue")
    @Embedded
    @Valid
    private ContentValue contentValue;
    /**
     * 创建者
     * (Required)
     * 
     */
    @NotNull
    @JsonProperty("contributor")
    @Embedded
    @Valid
    private Contributor contributor;
    /**
     * 创建时间
     * 
     */
    @JsonProperty("creationTime")
    private String creationTime;
    /**
     * 发布时间
     * 
     */
    @JsonProperty("publishedTime")
    private String publishedTime;
    /**
     * 修改时间
     * 
     */
    @JsonProperty("modifyTime")
    private String modifyTime;
    /**
     * 状态
     * (Required)
     * 
     */
    @NotNull
    @JsonProperty("status")
    @Embedded
    private Content.Status status;
    /**
     * 扩展字段
     * 
     */
    @JsonProperty("extension")
    @Embedded
    @Valid
    private ContentExtension extension;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * id
     * 
     * @return
     *     The id
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * id
     * 
     * @param id
     *     The id
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public Content withId(String id) {
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
    public Content.Type getType() {
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
    public void setType(Content.Type type) {
        this.type = type;
    }

    public Content withType(Content.Type type) {
        this.type = type;
        return this;
    }

    /**
     * 内容值
     * (Required)
     * 
     * @return
     *     The contentValue
     */
    @JsonProperty("contentValue")
    public ContentValue getContentValue() {
        return contentValue;
    }

    /**
     * 内容值
     * (Required)
     * 
     * @param contentValue
     *     The contentValue
     */
    @JsonProperty("contentValue")
    public void setContentValue(ContentValue contentValue) {
        this.contentValue = contentValue;
    }

    public Content withContentValue(ContentValue contentValue) {
        this.contentValue = contentValue;
        return this;
    }

    /**
     * 创建者
     * (Required)
     * 
     * @return
     *     The contributor
     */
    @JsonProperty("contributor")
    public Contributor getContributor() {
        return contributor;
    }

    /**
     * 创建者
     * (Required)
     * 
     * @param contributor
     *     The contributor
     */
    @JsonProperty("contributor")
    public void setContributor(Contributor contributor) {
        this.contributor = contributor;
    }

    public Content withContributor(Contributor contributor) {
        this.contributor = contributor;
        return this;
    }

    /**
     * 创建时间
     * 
     * @return
     *     The creationTime
     */
    @JsonProperty("creationTime")
    public String getCreationTime() {
        return creationTime;
    }

    /**
     * 创建时间
     * 
     * @param creationTime
     *     The creationTime
     */
    @JsonProperty("creationTime")
    public void setCreationTime(String creationTime) {
        this.creationTime = creationTime;
    }

    public Content withCreationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    /**
     * 发布时间
     * 
     * @return
     *     The publishedTime
     */
    @JsonProperty("publishedTime")
    public String getPublishedTime() {
        return publishedTime;
    }

    /**
     * 发布时间
     * 
     * @param publishedTime
     *     The publishedTime
     */
    @JsonProperty("publishedTime")
    public void setPublishedTime(String publishedTime) {
        this.publishedTime = publishedTime;
    }

    public Content withPublishedTime(String publishedTime) {
        this.publishedTime = publishedTime;
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

    public Content withModifyTime(String modifyTime) {
        this.modifyTime = modifyTime;
        return this;
    }

    /**
     * 状态
     * (Required)
     * 
     * @return
     *     The status
     */
    @JsonProperty("status")
    public Content.Status getStatus() {
        return status;
    }

    /**
     * 状态
     * (Required)
     * 
     * @param status
     *     The status
     */
    @JsonProperty("status")
    public void setStatus(Content.Status status) {
        this.status = status;
    }

    public Content withStatus(Content.Status status) {
        this.status = status;
        return this;
    }

    /**
     * 扩展字段
     * 
     * @return
     *     The extension
     */
    @JsonProperty("extension")
    public ContentExtension getExtension() {
        return extension;
    }

    /**
     * 扩展字段
     * 
     * @param extension
     *     The extension
     */
    @JsonProperty("extension")
    public void setExtension(ContentExtension extension) {
        this.extension = extension;
    }

    public Content withExtension(ContentExtension extension) {
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

    public Content withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Generated("org.jsonschema2pojo")
    public static enum Status {

        created("created"),
        published("published"),
        archived("archived"),
        shielded("Shielded"),
        deleted("deleted");
        private final String value;
        private final static Map<String, Content.Status> CONSTANTS = new HashMap<String, Content.Status>();

        static {
            for (Content.Status c: values()) {
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
        public static Content.Status fromValue(String value) {
            Content.Status constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    @Generated("org.jsonschema2pojo")
    public static enum Type {

        comment("comment"),
        article("article"),
        tweet("tweet"),
        message("message");
        private final String value;
        private final static Map<String, Content.Type> CONSTANTS = new HashMap<String, Content.Type>();

        static {
            for (Content.Type c: values()) {
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
        public static Content.Type fromValue(String value) {
            Content.Type constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
