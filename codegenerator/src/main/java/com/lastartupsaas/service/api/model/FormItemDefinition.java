
package com.lastartupsaas.service.api.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Reference;


/**
 * 表单项
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Entity
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "id",
    "type",
    "name",
    "title",
    "desc",
    "question",
    "options",
    "status",
    "categoryId",
    "defaultPoint"
})
public class FormItemDefinition {

    /**
     * ID
     * 
     */
    @JsonProperty("id")
    @Id
    private String id;
    /**
     * 类型: 文本,单选,多选
     * 
     */
    @JsonProperty("type")
    private String type;
    /**
     * 名称
     * 
     */
    @JsonProperty("name")
    private String name;
    /**
     * 中文标题
     * 
     */
    @JsonProperty("title")
    private String title;
    /**
     * 描述
     * 
     */
    @JsonProperty("desc")
    private String desc;
    /**
     * 表单项
     * 
     */
    @JsonProperty("question")
    @Reference
    @Valid
    private FormItemValueDefinition question;
    /**
     * 选项列表
     * 
     */
    @JsonProperty("options")
    @Reference
    @Valid
    private List<FormItemValueDefinition> options = new ArrayList<FormItemValueDefinition>();
    /**
     * 状态
     * 
     */
    @JsonProperty("status")
    private String status;
    /**
     * 分类
     * 
     */
    @JsonProperty("categoryId")
    private String categoryId;
    /**
     * 默认得分
     * 
     */
    @JsonProperty("defaultPoint")
    private String defaultPoint;
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

    public FormItemDefinition withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 类型: 文本,单选,多选
     * 
     * @return
     *     The type
     */
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    /**
     * 类型: 文本,单选,多选
     * 
     * @param type
     *     The type
     */
    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    public FormItemDefinition withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 名称
     * 
     * @return
     *     The name
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * 名称
     * 
     * @param name
     *     The name
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public FormItemDefinition withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 中文标题
     * 
     * @return
     *     The title
     */
    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    /**
     * 中文标题
     * 
     * @param title
     *     The title
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    public FormItemDefinition withTitle(String title) {
        this.title = title;
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

    public FormItemDefinition withDesc(String desc) {
        this.desc = desc;
        return this;
    }

    /**
     * 表单项
     * 
     * @return
     *     The question
     */
    @JsonProperty("question")
    public FormItemValueDefinition getQuestion() {
        return question;
    }

    /**
     * 表单项
     * 
     * @param question
     *     The question
     */
    @JsonProperty("question")
    public void setQuestion(FormItemValueDefinition question) {
        this.question = question;
    }

    public FormItemDefinition withQuestion(FormItemValueDefinition question) {
        this.question = question;
        return this;
    }

    /**
     * 选项列表
     * 
     * @return
     *     The options
     */
    @JsonProperty("options")
    public List<FormItemValueDefinition> getOptions() {
        return options;
    }

    /**
     * 选项列表
     * 
     * @param options
     *     The options
     */
    @JsonProperty("options")
    public void setOptions(List<FormItemValueDefinition> options) {
        this.options = options;
    }

    public FormItemDefinition withOptions(List<FormItemValueDefinition> options) {
        this.options = options;
        return this;
    }

    /**
     * 状态
     * 
     * @return
     *     The status
     */
    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    /**
     * 状态
     * 
     * @param status
     *     The status
     */
    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    public FormItemDefinition withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 分类
     * 
     * @return
     *     The categoryId
     */
    @JsonProperty("categoryId")
    public String getCategoryId() {
        return categoryId;
    }

    /**
     * 分类
     * 
     * @param categoryId
     *     The categoryId
     */
    @JsonProperty("categoryId")
    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public FormItemDefinition withCategoryId(String categoryId) {
        this.categoryId = categoryId;
        return this;
    }

    /**
     * 默认得分
     * 
     * @return
     *     The defaultPoint
     */
    @JsonProperty("defaultPoint")
    public String getDefaultPoint() {
        return defaultPoint;
    }

    /**
     * 默认得分
     * 
     * @param defaultPoint
     *     The defaultPoint
     */
    @JsonProperty("defaultPoint")
    public void setDefaultPoint(String defaultPoint) {
        this.defaultPoint = defaultPoint;
    }

    public FormItemDefinition withDefaultPoint(String defaultPoint) {
        this.defaultPoint = defaultPoint;
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

    public FormItemDefinition withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
