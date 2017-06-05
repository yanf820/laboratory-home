
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
import org.mongodb.morphia.annotations.Id;


/**
 * 流程图中的节点对象
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
    "action",
    "next",
    "previous",
    "executionType"
})
public class GraphNode {

    /**
     * ID
     * 
     */
    @JsonProperty("id")
    @Id
    private String id;
    /**
     * 节点类型
     * (Required)
     * 
     */
    @NotNull
    @JsonProperty("type")
    private String type;
    /**
     * 名称
     * (Required)
     * 
     */
    @NotNull
    @JsonProperty("name")
    private String name;
    /**
     * 中文名称
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
     * 节点动作
     * 
     */
    @JsonProperty("action")
    private String action;
    /**
     * 下一个节点ID
     * (Required)
     * 
     */
    @NotNull
    @JsonProperty("next")
    private String next;
    /**
     * 上一个节点ID
     * (Required)
     * 
     */
    @NotNull
    @JsonProperty("previous")
    private String previous;
    /**
     * 执行类型
     * 
     */
    @JsonProperty("executionType")
    private String executionType;
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

    public GraphNode withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 节点类型
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
     * 节点类型
     * (Required)
     * 
     * @param type
     *     The type
     */
    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    public GraphNode withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 名称
     * (Required)
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
     * (Required)
     * 
     * @param name
     *     The name
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public GraphNode withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 中文名称
     * 
     * @return
     *     The title
     */
    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    /**
     * 中文名称
     * 
     * @param title
     *     The title
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    public GraphNode withTitle(String title) {
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

    public GraphNode withDesc(String desc) {
        this.desc = desc;
        return this;
    }

    /**
     * 节点动作
     * 
     * @return
     *     The action
     */
    @JsonProperty("action")
    public String getAction() {
        return action;
    }

    /**
     * 节点动作
     * 
     * @param action
     *     The action
     */
    @JsonProperty("action")
    public void setAction(String action) {
        this.action = action;
    }

    public GraphNode withAction(String action) {
        this.action = action;
        return this;
    }

    /**
     * 下一个节点ID
     * (Required)
     * 
     * @return
     *     The next
     */
    @JsonProperty("next")
    public String getNext() {
        return next;
    }

    /**
     * 下一个节点ID
     * (Required)
     * 
     * @param next
     *     The next
     */
    @JsonProperty("next")
    public void setNext(String next) {
        this.next = next;
    }

    public GraphNode withNext(String next) {
        this.next = next;
        return this;
    }

    /**
     * 上一个节点ID
     * (Required)
     * 
     * @return
     *     The previous
     */
    @JsonProperty("previous")
    public String getPrevious() {
        return previous;
    }

    /**
     * 上一个节点ID
     * (Required)
     * 
     * @param previous
     *     The previous
     */
    @JsonProperty("previous")
    public void setPrevious(String previous) {
        this.previous = previous;
    }

    public GraphNode withPrevious(String previous) {
        this.previous = previous;
        return this;
    }

    /**
     * 执行类型
     * 
     * @return
     *     The executionType
     */
    @JsonProperty("executionType")
    public String getExecutionType() {
        return executionType;
    }

    /**
     * 执行类型
     * 
     * @param executionType
     *     The executionType
     */
    @JsonProperty("executionType")
    public void setExecutionType(String executionType) {
        this.executionType = executionType;
    }

    public GraphNode withExecutionType(String executionType) {
        this.executionType = executionType;
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

    public GraphNode withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
