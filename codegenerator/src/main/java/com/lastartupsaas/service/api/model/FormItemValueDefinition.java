
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
 * 表单项
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Entity
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "type",
    "value",
    "label",
    "img",
    "video",
    "weight",
    "isCorrect"
})
public class FormItemValueDefinition {

    /**
     * 类型: 问题or答案
     * (Required)
     * 
     */
    @NotNull
    @JsonProperty("type")
    private String type;
    /**
     * 值
     * (Required)
     * 
     */
    @NotNull
    @JsonProperty("value")
    private String value;
    /**
     * 展示的label
     * (Required)
     * 
     */
    @NotNull
    @JsonProperty("label")
    private String label;
    /**
     * 内容的图片
     * (Required)
     * 
     */
    @NotNull
    @JsonProperty("img")
    private String img;
    /**
     * 展示的视频
     * (Required)
     * 
     */
    @NotNull
    @JsonProperty("video")
    private String video;
    /**
     * 比重
     * (Required)
     * 
     */
    @NotNull
    @JsonProperty("weight")
    private String weight;
    /**
     * 是否为正确答案
     * (Required)
     * 
     */
    @NotNull
    @JsonProperty("isCorrect")
    private Boolean isCorrect;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 类型: 问题or答案
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
     * 类型: 问题or答案
     * (Required)
     * 
     * @param type
     *     The type
     */
    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    public FormItemValueDefinition withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 值
     * (Required)
     * 
     * @return
     *     The value
     */
    @JsonProperty("value")
    public String getValue() {
        return value;
    }

    /**
     * 值
     * (Required)
     * 
     * @param value
     *     The value
     */
    @JsonProperty("value")
    public void setValue(String value) {
        this.value = value;
    }

    public FormItemValueDefinition withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * 展示的label
     * (Required)
     * 
     * @return
     *     The label
     */
    @JsonProperty("label")
    public String getLabel() {
        return label;
    }

    /**
     * 展示的label
     * (Required)
     * 
     * @param label
     *     The label
     */
    @JsonProperty("label")
    public void setLabel(String label) {
        this.label = label;
    }

    public FormItemValueDefinition withLabel(String label) {
        this.label = label;
        return this;
    }

    /**
     * 内容的图片
     * (Required)
     * 
     * @return
     *     The img
     */
    @JsonProperty("img")
    public String getImg() {
        return img;
    }

    /**
     * 内容的图片
     * (Required)
     * 
     * @param img
     *     The img
     */
    @JsonProperty("img")
    public void setImg(String img) {
        this.img = img;
    }

    public FormItemValueDefinition withImg(String img) {
        this.img = img;
        return this;
    }

    /**
     * 展示的视频
     * (Required)
     * 
     * @return
     *     The video
     */
    @JsonProperty("video")
    public String getVideo() {
        return video;
    }

    /**
     * 展示的视频
     * (Required)
     * 
     * @param video
     *     The video
     */
    @JsonProperty("video")
    public void setVideo(String video) {
        this.video = video;
    }

    public FormItemValueDefinition withVideo(String video) {
        this.video = video;
        return this;
    }

    /**
     * 比重
     * (Required)
     * 
     * @return
     *     The weight
     */
    @JsonProperty("weight")
    public String getWeight() {
        return weight;
    }

    /**
     * 比重
     * (Required)
     * 
     * @param weight
     *     The weight
     */
    @JsonProperty("weight")
    public void setWeight(String weight) {
        this.weight = weight;
    }

    public FormItemValueDefinition withWeight(String weight) {
        this.weight = weight;
        return this;
    }

    /**
     * 是否为正确答案
     * (Required)
     * 
     * @return
     *     The isCorrect
     */
    @JsonProperty("isCorrect")
    public Boolean getIsCorrect() {
        return isCorrect;
    }

    /**
     * 是否为正确答案
     * (Required)
     * 
     * @param isCorrect
     *     The isCorrect
     */
    @JsonProperty("isCorrect")
    public void setIsCorrect(Boolean isCorrect) {
        this.isCorrect = isCorrect;
    }

    public FormItemValueDefinition withIsCorrect(Boolean isCorrect) {
        this.isCorrect = isCorrect;
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

    public FormItemValueDefinition withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
