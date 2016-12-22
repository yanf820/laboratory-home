
package com.linkedin.api.model;

import com.fasterxml.jackson.annotation.*;
import org.springframework.stereotype.Component;

import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "id",
    "title",
    "image",
    "desc",
    "status",
    "publisher",
    "publishTime",
    "tags",
    "fans",
    "posters",
    "updateTime"
})
public class Topic {

    /**
     * ID
     * 
     */
    @NotNull
    @JsonProperty("id")
    private String id;
    /**
     * 标题
     * 
     */
    @NotNull
    @JsonProperty("title")
    private String title;
    /**
     * 图片
     * 
     */
    @JsonProperty("image")
    private String image;
    /**
     * 描述
     * 
     */
    @JsonProperty("desc")
    private String desc;
    /**
     * 当前状态
     * 
     */
    @JsonProperty("status")
    private String status;
    /**
     * 
     * (Required)
     * 
     */
    @NotNull
    @JsonProperty("publisher")
    @Valid
    private Publisher publisher;
    /**
     * 发布时间
     * 
     */
    @JsonProperty("publishTime")
    private String publishTime;
    /**
     * 标签
     * 
     */
    @JsonProperty("tags")
    private String tags;
    /**
     * 粉丝
     * 
     */
    @JsonProperty("fans")
    @Valid
    private List<Fan> fans = new ArrayList<Fan>();
    /**
     * 帖子集合
     * 
     */
    @JsonProperty("posters")
    @Valid
    private List<Poster> posters = new ArrayList<Poster>();
    /**
     * 更新时间
     * 
     */
    @Size
    @JsonProperty("updateTime")
    private String updateTime;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @Override
    public String toString() {
        return "Topic{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", image='" + image + '\'' +
                ", desc='" + desc + '\'' +
                ", status='" + status + '\'' +
                ", publisher=" + publisher +
                ", publishTime='" + publishTime + '\'' +
                ", tags='" + tags + '\'' +
                ", fans=" + fans +
                ", posters=" + posters +
                ", updateTime='" + updateTime + '\'' +
                ", additionalProperties=" + additionalProperties +
                '}';
    }

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

    public Topic withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 标题
     * 
     * @return
     *     The title
     */
    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    /**
     * 标题
     * 
     * @param title
     *     The title
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    public Topic withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * 图片
     * 
     * @return
     *     The image
     */
    @JsonProperty("image")
    public String getImage() {
        return image;
    }

    /**
     * 图片
     * 
     * @param image
     *     The image
     */
    @JsonProperty("image")
    public void setImage(String image) {
        this.image = image;
    }

    public Topic withImage(String image) {
        this.image = image;
        return this;
    }

    /**
     * 描述
     * 
     * @return
     *     The desc
     */
    @JsonProperty("desc")
    public String getDesc() {
        return desc;
    }

    /**
     * 描述
     * 
     * @param desc
     *     The desc
     */
    @JsonProperty("desc")
    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Topic withDesc(String desc) {
        this.desc = desc;
        return this;
    }

    /**
     * 当前状态
     * 
     * @return
     *     The status
     */
    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    /**
     * 当前状态
     * 
     * @param status
     *     The status
     */
    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    public Topic withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The publisher
     */
    @JsonProperty("publisher")
    public Publisher getPublisher() {
        return publisher;
    }

    /**
     * 
     * (Required)
     * 
     * @param publisher
     *     The publisher
     */
    @JsonProperty("publisher")
    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    public Topic withPublisher(Publisher publisher) {
        this.publisher = publisher;
        return this;
    }

    /**
     * 发布时间
     * 
     * @return
     *     The publishTime
     */
    @JsonProperty("publishTime")
    public String getPublishTime() {
        return publishTime;
    }

    /**
     * 发布时间
     * 
     * @param publishTime
     *     The publishTime
     */
    @JsonProperty("publishTime")
    public void setPublishTime(String publishTime) {
        this.publishTime = publishTime;
    }

    public Topic withPublishTime(String publishTime) {
        this.publishTime = publishTime;
        return this;
    }

    /**
     * 标签
     * 
     * @return
     *     The tags
     */
    @JsonProperty("tags")
    public String getTags() {
        return tags;
    }

    /**
     * 标签
     * 
     * @param tags
     *     The tags
     */
    @JsonProperty("tags")
    public void setTags(String tags) {
        this.tags = tags;
    }

    public Topic withTags(String tags) {
        this.tags = tags;
        return this;
    }

    /**
     * 粉丝
     * 
     * @return
     *     The fans
     */
    @JsonProperty("fans")
    public List<Fan> getFans() {
        return fans;
    }

    /**
     * 粉丝
     * 
     * @param fans
     *     The fans
     */
    @JsonProperty("fans")
    public void setFans(List<Fan> fans) {
        this.fans = fans;
    }

    public Topic withFans(List<Fan> fans) {
        this.fans = fans;
        return this;
    }

    /**
     * 帖子集合
     * 
     * @return
     *     The posters
     */
    @JsonProperty("posters")
    public List<Poster> getPosters() {
        return posters;
    }

    /**
     * 帖子集合
     * 
     * @param posters
     *     The posters
     */
    @JsonProperty("posters")
    public void setPosters(List<Poster> posters) {
        this.posters = posters;
    }

    public Topic withPosters(List<Poster> posters) {
        this.posters = posters;
        return this;
    }

    /**
     * 更新时间
     * 
     * @return
     *     The updateTime
     */
    @JsonProperty("updateTime")
    public String getUpdateTime() {
        return updateTime;
    }

    /**
     * 更新时间
     * 
     * @param updateTime
     *     The updateTime
     */
    @JsonProperty("updateTime")
    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public Topic withUpdateTime(String updateTime) {
        this.updateTime = updateTime;
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

    public Topic withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
